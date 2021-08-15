// Generated from D:/nukkit/HanLang/src/main/antlr\HanCompiler.g4 by ANTLR 4.9.1
package com.han_lang.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HanCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HanCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HanCompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator1(HanCompilerParser.Operator1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator2_p1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator2_p1(HanCompilerParser.Operator2_p1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator2_p2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator2_p2(HanCompilerParser.Operator2_p2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator2_p3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator2_p3(HanCompilerParser.Operator2_p3Context ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator2_p4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator2_p4(HanCompilerParser.Operator2_p4Context ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator2_p5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator2_p5(HanCompilerParser.Operator2_p5Context ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#operator_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_all(HanCompilerParser.Operator_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#type_basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_basic(HanCompilerParser.Type_basicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HanCompilerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(HanCompilerParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#constAndSetExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstAndSetExpr(HanCompilerParser.ConstAndSetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#newtypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewtypeExpr(HanCompilerParser.NewtypeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#typeEntryPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeEntryPart(HanCompilerParser.TypeEntryPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#typeEntryEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeEntryEnd(HanCompilerParser.TypeEntryEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicTypeExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicTypeExpr(HanCompilerParser.BasicTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicArrayExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicArrayExpr(HanCompilerParser.BasicArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomTypeExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomTypeExpr(HanCompilerParser.CustomTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomArrayExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomArrayExpr(HanCompilerParser.CustomArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructExpr(HanCompilerParser.StructExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(HanCompilerParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#templeEntryPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempleEntryPart(HanCompilerParser.TempleEntryPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#templeEntryEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempleEntryEnd(HanCompilerParser.TempleEntryEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#templeArrayPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempleArrayPart(HanCompilerParser.TempleArrayPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#templeArrayEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempleArrayEnd(HanCompilerParser.TempleArrayEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempleExpr(HanCompilerParser.TempleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLExpr(HanCompilerParser.LExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code C2Expr1}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC2Expr1(HanCompilerParser.C2Expr1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code GDExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGDExpr(HanCompilerParser.GDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code C2ExprB}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC2ExprB(HanCompilerParser.C2ExprBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code C2Expr2}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC2Expr2(HanCompilerParser.C2Expr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code C2Expr3}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC2Expr3(HanCompilerParser.C2Expr3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LBExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLBExpr(HanCompilerParser.LBExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code C2Expr4}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC2Expr4(HanCompilerParser.C2Expr4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code GCExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGCExpr(HanCompilerParser.GCExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code C2Expr5}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC2Expr5(HanCompilerParser.C2Expr5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code C1Expr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC1Expr(HanCompilerParser.C1ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIExpr(HanCompilerParser.IExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#argPartExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgPartExpr(HanCompilerParser.ArgPartExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#argEndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgEndExpr(HanCompilerParser.ArgEndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(HanCompilerParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunRA}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunRA(HanCompilerParser.FunRAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunA}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunA(HanCompilerParser.FunAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunR}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunR(HanCompilerParser.FunRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(HanCompilerParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#ifbodyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfbodyExpr(HanCompilerParser.IfbodyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#ifbodyEndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfbodyEndExpr(HanCompilerParser.IfbodyEndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#ifelseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseExpr(HanCompilerParser.IfelseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#continueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueExpr(HanCompilerParser.ContinueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#breakExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakExpr(HanCompilerParser.BreakExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(HanCompilerParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HanCompilerParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HanCompilerParser.LiteralContext ctx);
}