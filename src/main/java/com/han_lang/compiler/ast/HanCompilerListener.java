// Generated from D:/nukkit/HanLang/src/main/antlr\HanCompiler.g4 by ANTLR 4.9.1
package com.han_lang.compiler.ast;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HanCompilerParser}.
 */
public interface HanCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HanCompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HanCompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator1}.
	 * @param ctx the parse tree
	 */
	void enterOperator1(HanCompilerParser.Operator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator1}.
	 * @param ctx the parse tree
	 */
	void exitOperator1(HanCompilerParser.Operator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator2_p1}.
	 * @param ctx the parse tree
	 */
	void enterOperator2_p1(HanCompilerParser.Operator2_p1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator2_p1}.
	 * @param ctx the parse tree
	 */
	void exitOperator2_p1(HanCompilerParser.Operator2_p1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator2_p2}.
	 * @param ctx the parse tree
	 */
	void enterOperator2_p2(HanCompilerParser.Operator2_p2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator2_p2}.
	 * @param ctx the parse tree
	 */
	void exitOperator2_p2(HanCompilerParser.Operator2_p2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator2_p3}.
	 * @param ctx the parse tree
	 */
	void enterOperator2_p3(HanCompilerParser.Operator2_p3Context ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator2_p3}.
	 * @param ctx the parse tree
	 */
	void exitOperator2_p3(HanCompilerParser.Operator2_p3Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator2_p4}.
	 * @param ctx the parse tree
	 */
	void enterOperator2_p4(HanCompilerParser.Operator2_p4Context ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator2_p4}.
	 * @param ctx the parse tree
	 */
	void exitOperator2_p4(HanCompilerParser.Operator2_p4Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator2_p5}.
	 * @param ctx the parse tree
	 */
	void enterOperator2_p5(HanCompilerParser.Operator2_p5Context ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator2_p5}.
	 * @param ctx the parse tree
	 */
	void exitOperator2_p5(HanCompilerParser.Operator2_p5Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operatorEnd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorEnd(HanCompilerParser.OperatorEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operatorEnd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorEnd(HanCompilerParser.OperatorEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#operator_all}.
	 * @param ctx the parse tree
	 */
	void enterOperator_all(HanCompilerParser.Operator_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#operator_all}.
	 * @param ctx the parse tree
	 */
	void exitOperator_all(HanCompilerParser.Operator_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#flowExpr}.
	 * @param ctx the parse tree
	 */
	void enterFlowExpr(HanCompilerParser.FlowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#flowExpr}.
	 * @param ctx the parse tree
	 */
	void exitFlowExpr(HanCompilerParser.FlowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#type_basic}.
	 * @param ctx the parse tree
	 */
	void enterType_basic(HanCompilerParser.Type_basicContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#type_basic}.
	 * @param ctx the parse tree
	 */
	void exitType_basic(HanCompilerParser.Type_basicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerVarExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerVarExpr(HanCompilerParser.InnerVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerVarExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerVarExpr(HanCompilerParser.InnerVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerConstExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerConstExpr(HanCompilerParser.InnerConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerConstExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerConstExpr(HanCompilerParser.InnerConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerSetExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerSetExpr(HanCompilerParser.InnerSetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerSetExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerSetExpr(HanCompilerParser.InnerSetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerCalcExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerCalcExpr(HanCompilerParser.InnerCalcExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerCalcExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerCalcExpr(HanCompilerParser.InnerCalcExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerIfElseExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerIfElseExpr(HanCompilerParser.InnerIfElseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerIfElseExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerIfElseExpr(HanCompilerParser.InnerIfElseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerWhileExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerWhileExpr(HanCompilerParser.InnerWhileExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerWhileExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerWhileExpr(HanCompilerParser.InnerWhileExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InnerFlowExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerFlowExpr(HanCompilerParser.InnerFlowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InnerFlowExpr}
	 * labeled alternative in {@link HanCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerFlowExpr(HanCompilerParser.InnerFlowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(HanCompilerParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(HanCompilerParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#constAndSetExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstAndSetExpr(HanCompilerParser.ConstAndSetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#constAndSetExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstAndSetExpr(HanCompilerParser.ConstAndSetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#newtypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewtypeExpr(HanCompilerParser.NewtypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#newtypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewtypeExpr(HanCompilerParser.NewtypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#typeEntryPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeEntryPart(HanCompilerParser.TypeEntryPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#typeEntryPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeEntryPart(HanCompilerParser.TypeEntryPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#typeEntryEnd}.
	 * @param ctx the parse tree
	 */
	void enterTypeEntryEnd(HanCompilerParser.TypeEntryEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#typeEntryEnd}.
	 * @param ctx the parse tree
	 */
	void exitTypeEntryEnd(HanCompilerParser.TypeEntryEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicTypeExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterBasicTypeExpr(HanCompilerParser.BasicTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicTypeExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitBasicTypeExpr(HanCompilerParser.BasicTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicArrayExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterBasicArrayExpr(HanCompilerParser.BasicArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicArrayExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitBasicArrayExpr(HanCompilerParser.BasicArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomTypeExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterCustomTypeExpr(HanCompilerParser.CustomTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomTypeExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitCustomTypeExpr(HanCompilerParser.CustomTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomArrayExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterCustomArrayExpr(HanCompilerParser.CustomArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomArrayExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitCustomArrayExpr(HanCompilerParser.CustomArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterStructExpr(HanCompilerParser.StructExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructExpr}
	 * labeled alternative in {@link HanCompilerParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitStructExpr(HanCompilerParser.StructExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(HanCompilerParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(HanCompilerParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#templeEntryPart}.
	 * @param ctx the parse tree
	 */
	void enterTempleEntryPart(HanCompilerParser.TempleEntryPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#templeEntryPart}.
	 * @param ctx the parse tree
	 */
	void exitTempleEntryPart(HanCompilerParser.TempleEntryPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#templeEntryEnd}.
	 * @param ctx the parse tree
	 */
	void enterTempleEntryEnd(HanCompilerParser.TempleEntryEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#templeEntryEnd}.
	 * @param ctx the parse tree
	 */
	void exitTempleEntryEnd(HanCompilerParser.TempleEntryEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#templeArrayPart}.
	 * @param ctx the parse tree
	 */
	void enterTempleArrayPart(HanCompilerParser.TempleArrayPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#templeArrayPart}.
	 * @param ctx the parse tree
	 */
	void exitTempleArrayPart(HanCompilerParser.TempleArrayPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#templeArrayEnd}.
	 * @param ctx the parse tree
	 */
	void enterTempleArrayEnd(HanCompilerParser.TempleArrayEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#templeArrayEnd}.
	 * @param ctx the parse tree
	 */
	void exitTempleArrayEnd(HanCompilerParser.TempleArrayEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EntryTemple}
	 * labeled alternative in {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 */
	void enterEntryTemple(HanCompilerParser.EntryTempleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EntryTemple}
	 * labeled alternative in {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 */
	void exitEntryTemple(HanCompilerParser.EntryTempleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayTemple}
	 * labeled alternative in {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayTemple(HanCompilerParser.ArrayTempleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayTemple}
	 * labeled alternative in {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayTemple(HanCompilerParser.ArrayTempleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyTemple}
	 * labeled alternative in {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTemple(HanCompilerParser.EmptyTempleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyTemple}
	 * labeled alternative in {@link HanCompilerParser#templeExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTemple(HanCompilerParser.EmptyTempleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterLExpr(HanCompilerParser.LExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitLExpr(HanCompilerParser.LExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code C2Expr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterC2Expr(HanCompilerParser.C2ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code C2Expr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitC2Expr(HanCompilerParser.C2ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GDExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterGDExpr(HanCompilerParser.GDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GDExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitGDExpr(HanCompilerParser.GDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code C2ExprB}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterC2ExprB(HanCompilerParser.C2ExprBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code C2ExprB}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitC2ExprB(HanCompilerParser.C2ExprBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LBExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterLBExpr(HanCompilerParser.LBExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LBExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitLBExpr(HanCompilerParser.LBExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(HanCompilerParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(HanCompilerParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GCExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterGCExpr(HanCompilerParser.GCExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GCExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitGCExpr(HanCompilerParser.GCExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterTExpr(HanCompilerParser.TExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitTExpr(HanCompilerParser.TExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code C1Expr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterC1Expr(HanCompilerParser.C1ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code C1Expr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitC1Expr(HanCompilerParser.C1ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterIExpr(HanCompilerParser.IExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitIExpr(HanCompilerParser.IExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ECExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterECExpr(HanCompilerParser.ECExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ECExpr}
	 * labeled alternative in {@link HanCompilerParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitECExpr(HanCompilerParser.ECExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorCast}
	 * labeled alternative in {@link HanCompilerParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorCast(HanCompilerParser.DecoratorCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorCast}
	 * labeled alternative in {@link HanCompilerParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorCast(HanCompilerParser.DecoratorCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorOp2}
	 * labeled alternative in {@link HanCompilerParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorOp2(HanCompilerParser.DecoratorOp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorOp2}
	 * labeled alternative in {@link HanCompilerParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorOp2(HanCompilerParser.DecoratorOp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorOp1}
	 * labeled alternative in {@link HanCompilerParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorOp1(HanCompilerParser.DecoratorOp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorOp1}
	 * labeled alternative in {@link HanCompilerParser#decoratorExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorOp1(HanCompilerParser.DecoratorOp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#argPartExpr}.
	 * @param ctx the parse tree
	 */
	void enterArgPartExpr(HanCompilerParser.ArgPartExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#argPartExpr}.
	 * @param ctx the parse tree
	 */
	void exitArgPartExpr(HanCompilerParser.ArgPartExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#argEndExpr}.
	 * @param ctx the parse tree
	 */
	void enterArgEndExpr(HanCompilerParser.ArgEndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#argEndExpr}.
	 * @param ctx the parse tree
	 */
	void exitArgEndExpr(HanCompilerParser.ArgEndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(HanCompilerParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(HanCompilerParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunRA}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunRA(HanCompilerParser.FunRAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunRA}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunRA(HanCompilerParser.FunRAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunA}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunA(HanCompilerParser.FunAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunA}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunA(HanCompilerParser.FunAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunR}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunR(HanCompilerParser.FunRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunR}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunR(HanCompilerParser.FunRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFun(HanCompilerParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link HanCompilerParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFun(HanCompilerParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#ifbodyExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfbodyExpr(HanCompilerParser.IfbodyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#ifbodyExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfbodyExpr(HanCompilerParser.IfbodyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#ifbodyEndExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfbodyEndExpr(HanCompilerParser.IfbodyEndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#ifbodyEndExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfbodyEndExpr(HanCompilerParser.IfbodyEndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#ifelseExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfelseExpr(HanCompilerParser.IfelseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#ifelseExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfelseExpr(HanCompilerParser.IfelseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(HanCompilerParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(HanCompilerParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HanCompilerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HanCompilerParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HanCompilerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HanCompilerParser.LiteralContext ctx);
}