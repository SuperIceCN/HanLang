package com.han_lang.compiler;

import com.han_lang.compiler.symbol.BaseScope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Arrays;

public class CompileErrorUtil {
    public static int errors = 0;
    private static void newErr(){
        if(errors == 0){
            System.err.println("错误列表：");
        }
        errors++;
        System.err.print(errors);
        if(errors >= 100){
            System.err.print(".");
        }else if(errors >= 10){
            System.err.print(". ");
        }else {
            System.err.print(".  ");
        }
    }
    public static void printErrNode(ParserRuleContext ctx){
        newErr();
        System.err.println("Error in "
                + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + "~"
                + ctx.getStop().getLine() + ":" + ctx.getStop().getCharPositionInLine()
        );
    }
    public static void symbolNotFound(BaseScope scope, String name){
        newErr();
        System.err.println("在"+scope+"中找不到符号："+name+"。");
    }
    public static void typeNotFound(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处存在不合法的类型 %s。%n", line, column, name);
    }
    public static void symbolConflict(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处的符号 %s 已经被使用。%n", line, column, name);
    }
    public static void typeNotMatch(int line, int column, String target, String source){
        newErr();
        System.err.printf("在 %d行%d列 处的 %s 类型无法与 %s 类型匹配。%n", line, column, source, target);
    }
    public static void conditionTypeNotMatch(int line, int column, String expr, String target, String source){
        newErr();
        System.err.printf("在 %d行%d列 处的 %s 语句需要 %s 类型而非 %s 类型。%n", line, column, expr, source, target);
    }
    public static void symbolNotFound(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处存在未声明的标识符 %s。%n",line, column, name);
    }
    public static void illegalCast(int line, int column, String target, String source){
        newErr();
        if(target.equals(source)){
            System.err.printf("在 %d行%d列 处的 %s 类型无需没有必要的转换。%n", line, column, source);
        }else {
            System.err.printf("在 %d行%d列 处的 %s 类型无法转换为 %s 类型。%n", line, column, source, target);
        }
    }
    public static void typeAlreadyDefined(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处定义的类型 %s 已经被定义，不允许重复定义。%n", line, column, name);
    }
    public static void valueAlreadyDefined(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处定义的变量或常量 %s 已经被定义，不允许重复定义。%n", line, column, name);
    }
    public static void funcAlreadyDefined(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处定义的函数 %s 已经被定义，不允许重复定义。%n", line, column, name);
    }
    public static void casterAlreadyDefined(int line, int column, String from, String to){
        newErr();
        System.err.printf("在 %d行%d列 处定义的从 %s 到 %s 的转换器已经被定义，不允许重复定义。%n", line, column, from, to);
    }
    public static void operatorNotFound(int line, int column, String op, String[] types){
        newErr();
        System.err.printf("在 %d行%d列 处找不到能操作 %s 类型的 %s 操作符。%n", line, column, Arrays.toString(types), op);
    }
    public static void illegalControlExpr(int line, int column, String expr){
        newErr();
        System.err.printf("在 %d行%d列 处不允许使用控制语句 %s 。%n", line, column, expr);
    }
    public static void illegalExprAfterControl(int line, int column, String expr){
        newErr();
        System.err.printf("在 %d行%d列 处不允许在作用域被控制语句终止后继续执行 %s 。%n", line, column, expr);
    }
    public static void typeNestingNotAllowed(int line, int column, String type){
        newErr();
        System.err.printf("在 %d行%d列 处不允许类型嵌套 %s 。%n", line, column, type);
    }
    public static void emptyTempleNotAllowed(int line, int column){
        newErr();
        System.err.printf("在 %d行%d列 处不允许空元组。%n", line, column);
    }
    public static void funcIllegalReturn(int line, int column, String ret){
        newErr();
        System.err.printf("在 %d行%d列 处无返回值函数中不允许返回 %s。%n", line, column, ret);
    }
    public static void funcReturnTypeNotMatch(int line, int column, String target, String source){
        newErr();
        System.err.printf("在 %d行%d列 处的 %s 类型无法与函数返回值 %s 类型匹配。%n", line, column, source, target);
    }
    public static void funcNotFound(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处找不到函数 %s。%n", line, column, name);
    }
    public static void funcArgsNotMatch(int line, int column, String target, String source){
        newErr();
        System.err.printf("在 %d行%d列 处的函数传入参数不应为 %s 类型，应当为 %s 类型。%n", line, column, source, target);
    }
    public static void constCannotSet(int line, int column, String name){
        newErr();
        System.err.printf("在 %d行%d列 处的常量 %s 不允许修改。%n", line, column, name);
    }
}
