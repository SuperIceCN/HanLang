package com.han_lang.compiler.analysis;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.exception.TypeNestingException;
import com.han_lang.compiler.analysis.exception.TypeNotFoundException;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.util.MathUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Type 类型
 * 如果一个类型是一个基本量，那么它没有subtype
 * 如果一个类型是一个数组，那么它拥有一个名为{@code <数组类型*长度>}的subtype
 * 如果一个类型是一个结构体，那么它拥有对应子结构的subtype
 * 如果一个类型是一个函数，那么它拥有返回值和参数
 */
public class Type {
    public Global global;
    @Expose
    public String name;
    @Expose
    public String type;
    @Expose
    public List<Type> subtypes = new ArrayList<>();

    protected Type(Global global, String name, String type) {
        this.global = global;
        this.name = name;
        this.type = type;
    }

    /**
     * 获取一个类型，如果此类型在global中不存在就会新建
     * 请注意，新建类型后并不会将其加入全局
     *
     * @param global  全局
     * @param name    类型名称
     * @param typeCtx 类型定义
     * @return 获取的类型
     */
    public static Type get(Global global, String name, HanCompilerParser.TypeExprContext typeCtx) throws TypeNotFoundException, TypeNestingException {
        if (global.hasGlobalType(name)) {
            return global.getGlobalType(name);
        }
        if (typeCtx instanceof HanCompilerParser.BasicTypeExprContext) {
            HanCompilerParser.BasicTypeExprContext ctx = ((HanCompilerParser.BasicTypeExprContext) typeCtx);
            String type = typeBasic2String(ctx.type_basic());
            return global.getGlobalType(type).copy().setName(name);
        } else if (typeCtx instanceof HanCompilerParser.BasicArrayExprContext) {
            HanCompilerParser.BasicArrayExprContext ctx = ((HanCompilerParser.BasicArrayExprContext) typeCtx);
            String basicTypeString = typeBasic2String(ctx.type_basic());
            Type tmp = global.getGlobalType(basicTypeString).copy().toArrayType(MathUtil.autoParse(ctx.INT().getText()));
            return tmp.setName(name);
        } else if (typeCtx instanceof HanCompilerParser.CustomTypeExprContext) {
            HanCompilerParser.CustomTypeExprContext ctx = (HanCompilerParser.CustomTypeExprContext) typeCtx;
            if (global.globalTypeDeclared(ctx.ID().getText())) {
                Type tmp = global.getDeclaredGlobalType(ctx.ID().getText());
                return tmp.copy().setName(name);
            } else {
                throw new TypeNotFoundException(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "<" + ctx.ID().getText() + ">");
            }
        } else if (typeCtx instanceof HanCompilerParser.CustomArrayExprContext) {
            HanCompilerParser.CustomArrayExprContext ctx = ((HanCompilerParser.CustomArrayExprContext) typeCtx);
            if (global.globalTypeDeclared(ctx.ID().getText())) {
                Type tmp = global.getDeclaredGlobalType(ctx.ID().getText()).copy().toArrayType(MathUtil.autoParse(ctx.INT().getText()));
                return tmp.copy().setName(name);
            } else {
                throw new TypeNotFoundException(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), "<" + ctx.ID().getText() + ">");
            }
        } else if (typeCtx instanceof HanCompilerParser.StructExprContext) {
            HanCompilerParser.StructExprContext ctx = ((HanCompilerParser.StructExprContext) typeCtx);
            Type tmp = new Type(global, name, typeId(typeCtx));
            for (HanCompilerParser.TypeEntryPartContext each : ctx.typeEntryPart()) {
                if (each.typeExpr() instanceof HanCompilerParser.StructExprContext) {
                    throw new TypeNestingException(each.typeExpr().getStart().getLine(), each.typeExpr().getStart().getCharPositionInLine(), each.typeExpr().getText());
                } else {
                    tmp.subtype(Type.get(global, each.ID().getText(), each.typeExpr()));
                }
            }
            if (ctx.typeEntryEnd().typeExpr() instanceof HanCompilerParser.StructExprContext) {
                throw new TypeNestingException(ctx.typeEntryEnd().typeExpr().getStart().getLine(), ctx.typeEntryEnd().typeExpr().getStart().getCharPositionInLine(), ctx.typeEntryEnd().typeExpr().getText());
            } else {
                tmp.subtype(Type.get(global, ctx.typeEntryEnd().ID().getText(), ctx.typeEntryEnd().typeExpr()));
            }
            return tmp;
        } else if (typeCtx instanceof HanCompilerParser.FuncTypeExprContext) {
            HanCompilerParser.FuncTypeExprContext ctx = (HanCompilerParser.FuncTypeExprContext) typeCtx;
            if(ctx.typeExpr() != null){
                get(global, name, ctx.typeExpr());
            }
            if(ctx.typeFuncArgExpr() != null){
                List<HanCompilerParser.TypeExprContext> args = ctx.typeFuncArgExpr().typeExpr();
                for(HanCompilerParser.TypeExprContext eachArg : args){
                    get(global, name, eachArg);
                }
            }
            return new Type(global, name, typeId(ctx));
        } else {
            return null;
        }
    }

    public static Type getAbstract(Global global, String name, String type) {
        return new Type(global, name, type);
    }

    public String nameWithBracket(){
        return "<" + this.name + ">";
    }

    public Type toArrayType(int length) {
        return new Type(this.global, this.name, "<" + this.type.substring(1, this.type.length() - 1) + "*" + length + ">");
    }

    public Type toSingleType() {
        return new Type(this.global, this.name, "<" + this.type.split("\\*")[0].substring(1) + ">");
    }

    public int toArrayLength() {
        String tmp = this.type.split("\\*")[1];
        return Integer.parseInt(tmp.substring(0, tmp.length() - 1));
    }

    public Type toReturnType() {
        return new Type(this.global, this.name, this.type.split("\\(")[0].replaceFirst("<", ""));
    }

    public TypeSet toArgTypes() {
        String a = this.type.split("\\(")[1];
        a = a.substring(0, a.length() - 2);
        String[] args = a.split(",");
        Type[] types = new Type[args.length];
        for(int i=0;i<args.length;i++){
            if(args[i].equals("")){
                return new TypeSet();
            }
            types[i] = new Type(this.global, "arg" + i, "<"+args[i].substring(1, args[i].length() - 1)+">");
        }
        return new TypeSet(types);
    }

    public boolean isInteger() {
        if (this.subtypes.size() == 0) {
            switch (this.type) {
                case "<byte>":
                case "<int>":
                case "<sint>":
                case "<lint>":
                case "<llint>":
                    return true;
            }
        }
        return false;
    }

    public boolean isDecimal() {
        if (this.subtypes.size() == 0) {
            switch (this.type) {
                case "<dec>":
                case "<sdec>":
                case "<ldec>":
                case "<lldec>":
                    return true;
            }
        }
        return false;
    }

    public boolean isBool() {
        if (this.subtypes.size() == 0) {
            return this.type.equals("<bool>");
        }
        return false;
    }

    public boolean isString() {
        if (this.subtypes.size() == 0) {
            return this.type.equals("<string>");
        }
        return false;
    }

    public boolean isVoid() {
        if (this.subtypes.size() == 0) {
            return this.type.equals("<null>");
        }
        return false;
    }

    public boolean hasImpl(){
        return global.hasGlobalType(this.name);
    }

    public boolean isBasic(){
        switch (this.type) {
            case "<byte>":
            case "<int>":
            case "<sint>":
            case "<lint>":
            case "<llint>":
            case "<sdec>":
            case "<dec>":
            case "<ldec>":
            case "<lldec>":
            case "<string>":
            case "<null>":
                return true;
            default:
                return false;
        }
    }

    public boolean isArray() {
        if (this.subtypes.size() == 0) {
            return this.type.contains("*") && !this.type.contains(",");
        } else {
            return false;
        }
    }

    public boolean isFunc() {
        return this.type.contains("(") && this.type.contains(")");
    }

    public boolean isStruct() {
        if (this.subtypes.size() >= 1) {
            return !(this.isArray() || this.isFunc());
        } else {
            return false;
        }
    }

    public Type copy() {
        Type tmp = new Type(this.global, this.name, this.type);
        tmp.subtypes = new ArrayList<>(this.subtypes);
        return tmp;
    }

    protected Type subtype(Type type) {
        this.subtypes.add(type);
        return this;
    }

    public Type matchSubtype(String name) {
        for (Type type : subtypes) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        return null;
    }

    public Type expand() {
        Type type = global.getGlobalType(this.type.substring(1, this.type.length() - 1));
        return type == null ? this : type;
    }

    public Type expandIfAlias() {
        return isAlias() ? expand() : this;
    }

    public boolean isAlias() {
        return this.subtypes.size() == 0 && !this.isArray() && !this.isFunc();
    }

    public Type trim() {
        return global.hasGlobalType(this.name) ? Type.getAbstract(this.global, this.name, "<" + this.name + ">") : this;
    }

    @Override
    public String toString() {
        return name+type;
    }

    @Override
    public int hashCode() {
        return name.hashCode()
                + type.hashCode()
                + subtypes.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Type) {
            Type another = (Type) obj;
            if (another.type.replaceAll("\\*[0-9]+", "*n").equals(this.type.replaceAll("\\*[0-9]+", "*n"))
                    && another.subtypes.size() == this.subtypes.size()) {
                for (int i = 0; i < this.subtypes.size(); i++) {
                    if (!another.subtypes.get(i).equals(this.subtypes.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Type setName(String name) {
        this.name = name;
        return this;
    }

    public Type setType(String type) {
        this.type = type;
        return this;
    }

    public static String typeString(HanCompilerParser.TypeExprContext typeCtx) {
        String tmp = typeId(typeCtx);
        return tmp.substring(1, tmp.length() - 1);
    }

    public static String typeId(HanCompilerParser.TypeExprContext typeCtx) {
        if (typeCtx == null) {
            return "<null>";
        } else if (typeCtx instanceof HanCompilerParser.BasicTypeExprContext) {
            HanCompilerParser.BasicTypeExprContext ctx = ((HanCompilerParser.BasicTypeExprContext) typeCtx);
            return typeBasic2Type(ctx.type_basic());
        } else if (typeCtx instanceof HanCompilerParser.BasicArrayExprContext) {
            HanCompilerParser.BasicArrayExprContext ctx = ((HanCompilerParser.BasicArrayExprContext) typeCtx);
            String basicTypeString = typeBasic2Type(ctx.type_basic());
            return basicTypeString.substring(0, basicTypeString.length() - 1) + "*" + MathUtil.autoParse(ctx.INT().getText()) + ">";
        } else if (typeCtx instanceof HanCompilerParser.CustomTypeExprContext) {
            return "<" + ((HanCompilerParser.CustomTypeExprContext) typeCtx).ID().getText() + ">";
        } else if (typeCtx instanceof HanCompilerParser.CustomArrayExprContext) {
            HanCompilerParser.CustomArrayExprContext ctx = ((HanCompilerParser.CustomArrayExprContext) typeCtx);
            return "<" + ctx.ID().getText() + "*" + MathUtil.autoParse(ctx.INT().getText()) + ">";
        } else if (typeCtx instanceof HanCompilerParser.StructExprContext) {
            HanCompilerParser.StructExprContext ctx = ((HanCompilerParser.StructExprContext) typeCtx);
            StringBuilder typeString = new StringBuilder();
            for (HanCompilerParser.TypeEntryPartContext each : ctx.typeEntryPart()) {
                typeString.append(typeId(each.typeExpr())).append(',');
            }
            typeString.append(typeId(ctx.typeEntryEnd().typeExpr()));
            return "<" + typeString.toString() + ">";
        } else if (typeCtx instanceof HanCompilerParser.FuncTypeExprContext) {
            HanCompilerParser.FuncTypeExprContext ctx = (HanCompilerParser.FuncTypeExprContext) typeCtx;
            StringBuilder typeString = new StringBuilder();
            typeString.append(typeId(ctx.typeExpr()))
                    .append("(");
            if(ctx.typeFuncArgExpr() != null){
                List<HanCompilerParser.TypeExprContext> args = ctx.typeFuncArgExpr().typeExpr();
                for (int i = 0; i < args.size(); i++) {
                    if (i != 0) {
                        typeString.append(',');
                    }
                    typeString.append(typeId(args.get(i)));
                }
            }
            typeString.append(")");
            return "<" + typeString.toString() + ">";
        }
        return "<null>";
    }

    public static String typeBasic2String(HanCompilerParser.Type_basicContext basic) {
        String tmp = typeBasic2Type(basic);
        return tmp.substring(1, tmp.length() - 1);
    }

    public static String typeBasic2Type(HanCompilerParser.Type_basicContext basic) {
        if (basic.Type_Boolean() != null) {
            return "<bool>";
        } else if (basic.Type_Byte() != null) {
            return "<byte>";
        } else if (basic.Type_ShortInt() != null) {
            return "<sint>";
        } else if (basic.Type_Int() != null) {
            return "<int>";
        } else if (basic.Type_LongInt() != null) {
            return "<lint>";
        } else if (basic.Type_LongLongInt() != null) {
            return "<llint>";
        } else if (basic.Type_ShortFloat() != null) {
            return "<sdec>";
        } else if (basic.Type_Float() != null) {
            return "<dec>";
        } else if (basic.Type_LongFloat() != null) {
            return "<ldec>";
        } else if (basic.Type_LongLongFloat() != null) {
            return "<lldec>";
        } else if (basic.Type_String() != null) {
            return "<string>";
        } else {
            return "<null>";
        }
    }
}
