package com.han_lang.compiler.symbol;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.symbol.scope.ArrayInnerScope;
import com.han_lang.compiler.symbol.scope.InnerScope;
import com.han_lang.compiler.symbol.symbol.InnerSymbol;
import com.han_lang.util.MathUtil;

import java.util.ArrayList;
import java.util.List;

public class RuntimeType {
    public static InnerScope scope(BaseSymbol symbol, HanCompilerParser.TypeExprContext typeCtx){
        if(typeCtx instanceof HanCompilerParser.BasicTypeExprContext){
            return new InnerScope(symbol);
        }else if(typeCtx instanceof HanCompilerParser.BasicArrayExprContext){
            symbol.format = SymbolFormat.Array;
            HanCompilerParser.BasicArrayExprContext ctx = (HanCompilerParser.BasicArrayExprContext) typeCtx;
            return new ArrayInnerScope(symbol, MathUtil.autoParse(ctx.INT().getText())
                    , InnerSymbol.create(ctx.type_basic().getText(), ctx.type_basic()));
        }else if(typeCtx instanceof HanCompilerParser.StructExprContext){
            symbol.format = SymbolFormat.Struct;
            HanCompilerParser.StructExprContext ctx = (HanCompilerParser.StructExprContext) typeCtx;
            InnerScope innerScope = new InnerScope(symbol);
            for(HanCompilerParser.TypeEntryPartContext each : ctx.typeEntryPart()){
                InnerSymbol tmp = InnerSymbol.create(each.ID().getText(), each.typeExpr());
                tmp.innerScope = scope(tmp, each.typeExpr());
                innerScope.addDirectSymbol(tmp);
            }
            InnerSymbol tmp = InnerSymbol.create(ctx.typeEntryEnd().ID().getText(), ctx.typeEntryEnd().typeExpr());
            tmp.innerScope = scope(tmp, ctx.typeEntryEnd().typeExpr());
            innerScope.addDirectSymbol(tmp);
            return innerScope;
        }else if(typeCtx instanceof HanCompilerParser.CustomTypeExprContext){
            symbol.format = SymbolFormat.Plain;
            HanCompilerParser.CustomTypeExprContext ctx = (HanCompilerParser.CustomTypeExprContext) typeCtx;
            BaseSymbol typeSymbol = symbol.belongsTo.getSymbol(ctx.ID().getText());
            return (InnerScope) typeSymbol.innerScope;
        }else if(typeCtx instanceof HanCompilerParser.CustomArrayExprContext){
            symbol.format = SymbolFormat.Array;
            HanCompilerParser.CustomArrayExprContext ctx = (HanCompilerParser.CustomArrayExprContext) typeCtx;
            BaseSymbol typeSymbol = symbol.belongsTo.getSymbol(ctx.ID().getText());
            InnerSymbol innerSymbol = InnerSymbol.create(ctx.ID().getText(), "<" + ctx.ID().getText() + ">");
            innerSymbol.innerScope = typeSymbol.innerScope;
            return new ArrayInnerScope(symbol, MathUtil.autoParse(ctx.INT().getText()), innerSymbol);
        }
        return null;
    }

    public static boolean typeValid(BaseScope scope, HanCompilerParser.TypeExprContext typeCtx){
        if(typeCtx == null){
            return false;
        }else if(typeCtx instanceof HanCompilerParser.BasicTypeExprContext){
            return true;
        }else if(typeCtx instanceof HanCompilerParser.BasicArrayExprContext){
            return MathUtil.autoParse(((HanCompilerParser.BasicArrayExprContext) typeCtx).INT().getText()) >= 0;
        }else if(typeCtx instanceof HanCompilerParser.CustomTypeExprContext){
            HanCompilerParser.CustomTypeExprContext ctx = (HanCompilerParser.CustomTypeExprContext) typeCtx;
            return scope.isSymbolAvailable(ctx.ID().getText()) && scope.getSymbol(ctx.ID().getText()).type == SymbolType.Type;
        }else if(typeCtx instanceof HanCompilerParser.CustomArrayExprContext){
            HanCompilerParser.CustomArrayExprContext ctx = (HanCompilerParser.CustomArrayExprContext) typeCtx;
            return scope.isSymbolAvailable(ctx.ID().getText()) && scope.getSymbol(ctx.ID().getText()).type == SymbolType.Type
                    && MathUtil.autoParse(ctx.INT().getText()) >= 0;
        }else if(typeCtx instanceof HanCompilerParser.StructExprContext){
            HanCompilerParser.StructExprContext ctx = (HanCompilerParser.StructExprContext) typeCtx;
            for(HanCompilerParser.TypeEntryPartContext each : ctx.typeEntryPart()){
                if(!typeValid(scope, each.typeExpr())){
                    return false;
                }
            }
            return typeValid(scope, ctx.typeEntryEnd().typeExpr());
        }else {
            return false;
        }
    }

    public static boolean newTypeValid(BaseScope scope, String newTypeName , HanCompilerParser.TypeExprContext typeCtx){
        if(typeCtx == null){
            return false;
        }else if(typeCtx instanceof HanCompilerParser.BasicTypeExprContext){
            return true;
        }else if(typeCtx instanceof HanCompilerParser.BasicArrayExprContext){
            return MathUtil.autoParse(((HanCompilerParser.BasicArrayExprContext) typeCtx).INT().getText()) >= 0;
        }else if(typeCtx instanceof HanCompilerParser.CustomTypeExprContext){
            HanCompilerParser.CustomTypeExprContext ctx = (HanCompilerParser.CustomTypeExprContext) typeCtx;
            return (scope.isSymbolAvailable(ctx.ID().getText()) && scope.getSymbol(ctx.ID().getText()).type == SymbolType.Type)
                    || ctx.ID().getText().equals(newTypeName);
        }else if(typeCtx instanceof HanCompilerParser.CustomArrayExprContext){
            HanCompilerParser.CustomArrayExprContext ctx = (HanCompilerParser.CustomArrayExprContext) typeCtx;
            return scope.isSymbolAvailable(ctx.ID().getText()) && scope.getSymbol(ctx.ID().getText()).type == SymbolType.Type
                    && MathUtil.autoParse(ctx.INT().getText()) >= 0;
        }else if(typeCtx instanceof HanCompilerParser.StructExprContext){
            HanCompilerParser.StructExprContext ctx = (HanCompilerParser.StructExprContext) typeCtx;
            for(HanCompilerParser.TypeEntryPartContext each : ctx.typeEntryPart()){
                if(!newTypeValid(scope, newTypeName, each.typeExpr())){
                    return false;
                }
            }
            return newTypeValid(scope, newTypeName, ctx.typeEntryEnd().typeExpr());
        }else {
            return false;
        }
    }

    public static String typeId(HanCompilerParser.TypeExprContext typeCtx){
        if(typeCtx == null){
            return "<null>";
        }else if(typeCtx instanceof HanCompilerParser.BasicTypeExprContext){
            HanCompilerParser.BasicTypeExprContext ctx = ((HanCompilerParser.BasicTypeExprContext) typeCtx);
            return typeBasic2String(ctx.type_basic());
        }else if(typeCtx instanceof HanCompilerParser.BasicArrayExprContext){
            HanCompilerParser.BasicArrayExprContext ctx = ((HanCompilerParser.BasicArrayExprContext) typeCtx);
            String basicTypeString = typeBasic2String(ctx.type_basic());
            return basicTypeString.substring(0, basicTypeString.length()-1) + "*" + MathUtil.autoParse(ctx.INT().getText()) + ">";
        }else if(typeCtx instanceof HanCompilerParser.CustomTypeExprContext){
            return "<" + ((HanCompilerParser.CustomTypeExprContext) typeCtx).ID().getText() + ">";
        }else if(typeCtx instanceof HanCompilerParser.CustomArrayExprContext){
            HanCompilerParser.CustomArrayExprContext ctx = ((HanCompilerParser.CustomArrayExprContext) typeCtx);
            return "<" + ctx.ID().getText() + "*" + MathUtil.autoParse(ctx.INT().getText()) + ">";
        }else if(typeCtx instanceof HanCompilerParser.StructExprContext){
            HanCompilerParser.StructExprContext ctx = ((HanCompilerParser.StructExprContext) typeCtx);
            StringBuilder typeString = new StringBuilder();
            for(HanCompilerParser.TypeEntryPartContext each : ctx.typeEntryPart()){
                typeString.append(typeId(each.typeExpr())).append(',');
            }
            typeString.append(typeId(ctx.typeEntryEnd().typeExpr()));
            return "<" + typeString.toString() + ">";
        }
        return "<null>";
    }

    public static String typeId(HanCompilerParser.Type_basicContext typeCtx){
        return typeBasic2String(typeCtx);
    }

    public static String typeId(){
        return "<null>";
    }

    private static String typeBasic2String(HanCompilerParser.Type_basicContext basic){
        if(basic.Type_Boolean() != null){
            return "<bool>";
        }else if(basic.Type_Byte() != null){
            return "<byte>";
        }else if(basic.Type_ShortInt() != null){
            return "<sint>";
        }else if(basic.Type_Int() != null){
            return "<int>";
        }else if(basic.Type_LongInt() != null){
            return "<lint>";
        }else if(basic.Type_LongLongInt() != null){
            return "<llint>";
        }else if(basic.Type_ShortFloat() != null){
            return "<sdec>";
        }else if(basic.Type_Float() != null){
            return "<dec>";
        }else if(basic.Type_LongFloat() != null){
            return "<ldec>";
        }else if(basic.Type_LongLongFloat() != null){
            return "<lldec>";
        }else if(basic.Type_String() != null){
            return "<string>";
        }else {
            return "<null>";
        }
    }

    /**
     * 比较两个typeId是否可以匹配
     * @param typeA
     * @param typeB
     * @return
     */
//    public static boolean typeMatch(String typeA, String typeB){
//        class Data{
//            List<Data> types = new ArrayList<>();
//            public Data(String typeString){
//                String[] currentTypes = typeString.substring(1, typeString.length()-1).split(",");
//                for(String each : currentTypes){
//                    if(each.startsWith("<")){
//                        types.add()
//                    }
//                }
//            }
//            static
//        }
//    }
}
