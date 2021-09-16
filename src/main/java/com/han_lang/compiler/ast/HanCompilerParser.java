// Generated from D:/nukkit/HanLang/src/main/antlr\HanCompiler.g4 by ANTLR 4.9.1
package com.han_lang.compiler.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HanCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, THROWAWAY=3, COMMENT=4, ONELINE_COMMENT=5, MUTILINE_COMMENT=6, 
		WS=7, Decorator_Caster=8, Decorator_Operator=9, OP_Power=10, OP_Plus=11, 
		OP_Minus=12, OP_Mutiply=13, OP_Divide=14, OP_Remain=15, OP_Greater=16, 
		OP_GreaterEqual=17, OP_Lower=18, OP_LowerEqual=19, OP_NotEqual=20, OP_Equal=21, 
		OP_Not=22, OP_And=23, OP_Or=24, OP_Call=25, OP_Split=26, OP_Set=27, OP_End=28, 
		OP_EndCall=29, OP_At=30, OP_Init=31, OP_Braket_Left=32, OP_Braket_Right=33, 
		OP_BraketCall_Left=34, OP_BraketCall_Right=35, OP_BraketType_Left=36, 
		OP_BraketType_Right=37, OP_BraketMatch_Left=38, OP_BraketMatch_Right=39, 
		KEY_Null=40, KEY_Var=41, KEY_Const=42, KEY_Type=43, KEY_Function=44, KEY_Return=45, 
		KEY_Break=46, KEY_Continue=47, KEY_Loop=48, KEY_If=49, KEY_Elif=50, KEY_Else=51, 
		KEY_Cast=52, Type_Byte=53, Type_Int=54, Type_LongInt=55, Type_ShortInt=56, 
		Type_LongLongInt=57, Type_Boolean=58, Type_ShortFloat=59, Type_Float=60, 
		Type_LongFloat=61, Type_LongLongFloat=62, Type_String=63, INT=64, INT10=65, 
		INT8=66, INT16=67, INT2=68, DEC=69, BOOL=70, STRING=71, ESCAPE_CHARS=72, 
		ID=73, IDStart=74, IDPart=75;
	public static final int
		RULE_program = 0, RULE_operator1 = 1, RULE_operator2_p1 = 2, RULE_operator2_p2 = 3, 
		RULE_operator2_p3 = 4, RULE_operator2_p4 = 5, RULE_operator2_p5 = 6, RULE_operatorEnd = 7, 
		RULE_operator_all = 8, RULE_flowExpr = 9, RULE_type_basic = 10, RULE_expr = 11, 
		RULE_varExpr = 12, RULE_constAndSetExpr = 13, RULE_newtypeExpr = 14, RULE_typeEntryPart = 15, 
		RULE_typeEntryEnd = 16, RULE_typeFuncArgExpr = 17, RULE_typeExpr = 18, 
		RULE_setExpr = 19, RULE_templePart = 20, RULE_templeEnd = 21, RULE_templeExpr = 22, 
		RULE_decoratorExpr = 23, RULE_calcExpr = 24, RULE_argPartExpr = 25, RULE_argEndExpr = 26, 
		RULE_returnExpr = 27, RULE_functionExpr = 28, RULE_ifbodyExpr = 29, RULE_ifbodyEndExpr = 30, 
		RULE_ifelseExpr = 31, RULE_whileExpr = 32, RULE_literal = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operator1", "operator2_p1", "operator2_p2", "operator2_p3", 
			"operator2_p4", "operator2_p5", "operatorEnd", "operator_all", "flowExpr", 
			"type_basic", "expr", "varExpr", "constAndSetExpr", "newtypeExpr", "typeEntryPart", 
			"typeEntryEnd", "typeFuncArgExpr", "typeExpr", "setExpr", "templePart", 
			"templeEnd", "templeExpr", "decoratorExpr", "calcExpr", "argPartExpr", 
			"argEndExpr", "returnExpr", "functionExpr", "ifbodyExpr", "ifbodyEndExpr", 
			"ifelseExpr", "whileExpr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<EOF>'", "'|'", null, null, null, null, null, null, null, "'**'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", null, 
			"'=='", "'!'", "'&&'", "'||'", null, null, "'='", null, "'#'", "'@'", 
			"'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
			"WS", "Decorator_Caster", "Decorator_Operator", "OP_Power", "OP_Plus", 
			"OP_Minus", "OP_Mutiply", "OP_Divide", "OP_Remain", "OP_Greater", "OP_GreaterEqual", 
			"OP_Lower", "OP_LowerEqual", "OP_NotEqual", "OP_Equal", "OP_Not", "OP_And", 
			"OP_Or", "OP_Call", "OP_Split", "OP_Set", "OP_End", "OP_EndCall", "OP_At", 
			"OP_Init", "OP_Braket_Left", "OP_Braket_Right", "OP_BraketCall_Left", 
			"OP_BraketCall_Right", "OP_BraketType_Left", "OP_BraketType_Right", "OP_BraketMatch_Left", 
			"OP_BraketMatch_Right", "KEY_Null", "KEY_Var", "KEY_Const", "KEY_Type", 
			"KEY_Function", "KEY_Return", "KEY_Break", "KEY_Continue", "KEY_Loop", 
			"KEY_If", "KEY_Elif", "KEY_Else", "KEY_Cast", "Type_Byte", "Type_Int", 
			"Type_LongInt", "Type_ShortInt", "Type_LongLongInt", "Type_Boolean", 
			"Type_ShortFloat", "Type_Float", "Type_LongFloat", "Type_LongLongFloat", 
			"Type_String", "INT", "INT10", "INT8", "INT16", "INT2", "DEC", "BOOL", 
			"STRING", "ESCAPE_CHARS", "ID", "IDStart", "IDPart"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HanCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HanCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HanCompilerParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FunctionExprContext> functionExpr() {
			return getRuleContexts(FunctionExprContext.class);
		}
		public FunctionExprContext functionExpr(int i) {
			return getRuleContext(FunctionExprContext.class,i);
		}
		public List<NewtypeExprContext> newtypeExpr() {
			return getRuleContexts(NewtypeExprContext.class);
		}
		public NewtypeExprContext newtypeExpr(int i) {
			return getRuleContext(NewtypeExprContext.class,i);
		}
		public List<TerminalNode> OP_End() { return getTokens(HanCompilerParser.OP_End); }
		public TerminalNode OP_End(int i) {
			return getToken(HanCompilerParser.OP_End, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Decorator_Caster) | (1L << Decorator_Operator) | (1L << OP_Plus) | (1L << OP_Minus) | (1L << OP_Not) | (1L << OP_At) | (1L << OP_Braket_Left) | (1L << OP_BraketMatch_Left) | (1L << KEY_Var) | (1L << KEY_Const) | (1L << KEY_Type) | (1L << KEY_Function) | (1L << KEY_Return) | (1L << KEY_Break) | (1L << KEY_Continue) | (1L << KEY_Loop) | (1L << KEY_If))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (BOOL - 64)) | (1L << (STRING - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_Plus:
				case OP_Minus:
				case OP_Not:
				case OP_At:
				case OP_Braket_Left:
				case OP_BraketMatch_Left:
				case KEY_Var:
				case KEY_Const:
				case KEY_Return:
				case KEY_Break:
				case KEY_Continue:
				case KEY_Loop:
				case KEY_If:
				case INT:
				case DEC:
				case BOOL:
				case STRING:
				case ID:
					{
					setState(68);
					expr();
					}
					break;
				case Decorator_Caster:
				case Decorator_Operator:
				case KEY_Function:
					{
					setState(69);
					functionExpr();
					}
					break;
				case KEY_Type:
					{
					setState(70);
					newtypeExpr();
					setState(71);
					match(OP_End);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==T__0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator1Context extends ParserRuleContext {
		public TerminalNode OP_Not() { return getToken(HanCompilerParser.OP_Not, 0); }
		public TerminalNode OP_Plus() { return getToken(HanCompilerParser.OP_Plus, 0); }
		public TerminalNode OP_Minus() { return getToken(HanCompilerParser.OP_Minus, 0); }
		public Operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator1Context operator1() throws RecognitionException {
		Operator1Context _localctx = new Operator1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_Plus) | (1L << OP_Minus) | (1L << OP_Not))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator2_p1Context extends ParserRuleContext {
		public TerminalNode OP_Equal() { return getToken(HanCompilerParser.OP_Equal, 0); }
		public TerminalNode OP_NotEqual() { return getToken(HanCompilerParser.OP_NotEqual, 0); }
		public TerminalNode OP_Greater() { return getToken(HanCompilerParser.OP_Greater, 0); }
		public TerminalNode OP_GreaterEqual() { return getToken(HanCompilerParser.OP_GreaterEqual, 0); }
		public TerminalNode OP_Lower() { return getToken(HanCompilerParser.OP_Lower, 0); }
		public TerminalNode OP_LowerEqual() { return getToken(HanCompilerParser.OP_LowerEqual, 0); }
		public Operator2_p1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2_p1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator2_p1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator2_p1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator2_p1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2_p1Context operator2_p1() throws RecognitionException {
		Operator2_p1Context _localctx = new Operator2_p1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator2_p1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_Greater) | (1L << OP_GreaterEqual) | (1L << OP_Lower) | (1L << OP_LowerEqual) | (1L << OP_NotEqual) | (1L << OP_Equal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator2_p2Context extends ParserRuleContext {
		public TerminalNode OP_Plus() { return getToken(HanCompilerParser.OP_Plus, 0); }
		public TerminalNode OP_Minus() { return getToken(HanCompilerParser.OP_Minus, 0); }
		public Operator2_p2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2_p2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator2_p2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator2_p2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator2_p2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2_p2Context operator2_p2() throws RecognitionException {
		Operator2_p2Context _localctx = new Operator2_p2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator2_p2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==OP_Plus || _la==OP_Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator2_p3Context extends ParserRuleContext {
		public TerminalNode OP_Mutiply() { return getToken(HanCompilerParser.OP_Mutiply, 0); }
		public TerminalNode OP_Divide() { return getToken(HanCompilerParser.OP_Divide, 0); }
		public TerminalNode OP_Remain() { return getToken(HanCompilerParser.OP_Remain, 0); }
		public Operator2_p3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2_p3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator2_p3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator2_p3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator2_p3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2_p3Context operator2_p3() throws RecognitionException {
		Operator2_p3Context _localctx = new Operator2_p3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator2_p3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_Mutiply) | (1L << OP_Divide) | (1L << OP_Remain))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator2_p4Context extends ParserRuleContext {
		public TerminalNode OP_Power() { return getToken(HanCompilerParser.OP_Power, 0); }
		public Operator2_p4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2_p4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator2_p4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator2_p4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator2_p4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2_p4Context operator2_p4() throws RecognitionException {
		Operator2_p4Context _localctx = new Operator2_p4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator2_p4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(OP_Power);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator2_p5Context extends ParserRuleContext {
		public TerminalNode OP_And() { return getToken(HanCompilerParser.OP_And, 0); }
		public TerminalNode OP_Or() { return getToken(HanCompilerParser.OP_Or, 0); }
		public Operator2_p5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2_p5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator2_p5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator2_p5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator2_p5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator2_p5Context operator2_p5() throws RecognitionException {
		Operator2_p5Context _localctx = new Operator2_p5Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator2_p5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==OP_And || _la==OP_Or) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorEndContext extends ParserRuleContext {
		public TerminalNode OP_EndCall() { return getToken(HanCompilerParser.OP_EndCall, 0); }
		public OperatorEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperatorEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperatorEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperatorEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorEndContext operatorEnd() throws RecognitionException {
		OperatorEndContext _localctx = new OperatorEndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operatorEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OP_EndCall);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_allContext extends ParserRuleContext {
		public Operator2_p1Context operator2_p1() {
			return getRuleContext(Operator2_p1Context.class,0);
		}
		public Operator2_p2Context operator2_p2() {
			return getRuleContext(Operator2_p2Context.class,0);
		}
		public Operator2_p3Context operator2_p3() {
			return getRuleContext(Operator2_p3Context.class,0);
		}
		public Operator2_p4Context operator2_p4() {
			return getRuleContext(Operator2_p4Context.class,0);
		}
		public Operator2_p5Context operator2_p5() {
			return getRuleContext(Operator2_p5Context.class,0);
		}
		public Operator_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterOperator_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitOperator_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitOperator_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_allContext operator_all() throws RecognitionException {
		Operator_allContext _localctx = new Operator_allContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator_all);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_Greater:
			case OP_GreaterEqual:
			case OP_Lower:
			case OP_LowerEqual:
			case OP_NotEqual:
			case OP_Equal:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				operator2_p1();
				}
				break;
			case OP_Plus:
			case OP_Minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				operator2_p2();
				}
				break;
			case OP_Mutiply:
			case OP_Divide:
			case OP_Remain:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				operator2_p3();
				}
				break;
			case OP_Power:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				operator2_p4();
				}
				break;
			case OP_And:
			case OP_Or:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				operator2_p5();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlowExprContext extends ParserRuleContext {
		public TerminalNode KEY_Continue() { return getToken(HanCompilerParser.KEY_Continue, 0); }
		public TerminalNode KEY_Break() { return getToken(HanCompilerParser.KEY_Break, 0); }
		public TerminalNode KEY_Return() { return getToken(HanCompilerParser.KEY_Return, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public FlowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFlowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFlowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFlowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowExprContext flowExpr() throws RecognitionException {
		FlowExprContext _localctx = new FlowExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flowExpr);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(KEY_Continue);
				}
				break;
			case KEY_Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(KEY_Break);
				}
				break;
			case KEY_Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(KEY_Return);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(104);
					calcExpr(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_basicContext extends ParserRuleContext {
		public TerminalNode Type_Boolean() { return getToken(HanCompilerParser.Type_Boolean, 0); }
		public TerminalNode Type_Byte() { return getToken(HanCompilerParser.Type_Byte, 0); }
		public TerminalNode Type_Float() { return getToken(HanCompilerParser.Type_Float, 0); }
		public TerminalNode Type_Int() { return getToken(HanCompilerParser.Type_Int, 0); }
		public TerminalNode Type_LongFloat() { return getToken(HanCompilerParser.Type_LongFloat, 0); }
		public TerminalNode Type_LongInt() { return getToken(HanCompilerParser.Type_LongInt, 0); }
		public TerminalNode Type_LongLongFloat() { return getToken(HanCompilerParser.Type_LongLongFloat, 0); }
		public TerminalNode Type_LongLongInt() { return getToken(HanCompilerParser.Type_LongLongInt, 0); }
		public TerminalNode Type_ShortFloat() { return getToken(HanCompilerParser.Type_ShortFloat, 0); }
		public TerminalNode Type_ShortInt() { return getToken(HanCompilerParser.Type_ShortInt, 0); }
		public TerminalNode Type_String() { return getToken(HanCompilerParser.Type_String, 0); }
		public Type_basicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterType_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitType_basic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitType_basic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_basicContext type_basic() throws RecognitionException {
		Type_basicContext _localctx = new Type_basicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_basic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type_Byte) | (1L << Type_Int) | (1L << Type_LongInt) | (1L << Type_ShortInt) | (1L << Type_LongLongInt) | (1L << Type_Boolean) | (1L << Type_ShortFloat) | (1L << Type_Float) | (1L << Type_LongFloat) | (1L << Type_LongLongFloat) | (1L << Type_String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InnerVarExprContext extends ExprContext {
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public TerminalNode OP_End() { return getToken(HanCompilerParser.OP_End, 0); }
		public InnerVarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerSetExprContext extends ExprContext {
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public TerminalNode OP_End() { return getToken(HanCompilerParser.OP_End, 0); }
		public InnerSetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerCalcExprContext extends ExprContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_End() { return getToken(HanCompilerParser.OP_End, 0); }
		public InnerCalcExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerCalcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerCalcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerCalcExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerWhileExprContext extends ExprContext {
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public InnerWhileExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerConstExprContext extends ExprContext {
		public ConstAndSetExprContext constAndSetExpr() {
			return getRuleContext(ConstAndSetExprContext.class,0);
		}
		public TerminalNode OP_End() { return getToken(HanCompilerParser.OP_End, 0); }
		public InnerConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerIfElseExprContext extends ExprContext {
		public IfelseExprContext ifelseExpr() {
			return getRuleContext(IfelseExprContext.class,0);
		}
		public InnerIfElseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerIfElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerIfElseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerIfElseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerFlowExprContext extends ExprContext {
		public FlowExprContext flowExpr() {
			return getRuleContext(FlowExprContext.class,0);
		}
		public TerminalNode OP_End() { return getToken(HanCompilerParser.OP_End, 0); }
		public InnerFlowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterInnerFlowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitInnerFlowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitInnerFlowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new InnerVarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				varExpr();
				setState(112);
				match(OP_End);
				}
				break;
			case 2:
				_localctx = new InnerConstExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				constAndSetExpr();
				setState(115);
				match(OP_End);
				}
				break;
			case 3:
				_localctx = new InnerSetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				setExpr();
				setState(118);
				match(OP_End);
				}
				break;
			case 4:
				_localctx = new InnerCalcExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				calcExpr(0);
				setState(121);
				match(OP_End);
				}
				break;
			case 5:
				_localctx = new InnerIfElseExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				ifelseExpr();
				}
				break;
			case 6:
				_localctx = new InnerWhileExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				whileExpr();
				}
				break;
			case 7:
				_localctx = new InnerFlowExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				flowExpr();
				setState(126);
				match(OP_End);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarExprContext extends ParserRuleContext {
		public TerminalNode KEY_Var() { return getToken(HanCompilerParser.KEY_Var, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode OP_Init() { return getToken(HanCompilerParser.OP_Init, 0); }
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(KEY_Var);
			setState(131);
			match(ID);
			setState(132);
			typeExpr();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Init) {
				{
				setState(133);
				match(OP_Init);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstAndSetExprContext extends ParserRuleContext {
		public TerminalNode KEY_Const() { return getToken(HanCompilerParser.KEY_Const, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Init() { return getToken(HanCompilerParser.OP_Init, 0); }
		public ConstAndSetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constAndSetExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterConstAndSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitConstAndSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitConstAndSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstAndSetExprContext constAndSetExpr() throws RecognitionException {
		ConstAndSetExprContext _localctx = new ConstAndSetExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constAndSetExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(KEY_Const);
			setState(137);
			match(ID);
			setState(138);
			typeExpr();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Init) {
				{
				setState(139);
				match(OP_Init);
				}
			}

			setState(142);
			match(OP_Set);
			setState(143);
			calcExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeExprContext extends ParserRuleContext {
		public TerminalNode KEY_Type() { return getToken(HanCompilerParser.KEY_Type, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public NewtypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterNewtypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitNewtypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitNewtypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewtypeExprContext newtypeExpr() throws RecognitionException {
		NewtypeExprContext _localctx = new NewtypeExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newtypeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(KEY_Type);
			setState(146);
			match(ID);
			setState(147);
			typeExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeEntryPartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TypeEntryPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeEntryPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTypeEntryPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTypeEntryPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTypeEntryPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeEntryPartContext typeEntryPart() throws RecognitionException {
		TypeEntryPartContext _localctx = new TypeEntryPartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeEntryPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			typeExpr();
			setState(151);
			match(OP_Split);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeEntryEndContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TypeEntryEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeEntryEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTypeEntryEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTypeEntryEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTypeEntryEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeEntryEndContext typeEntryEnd() throws RecognitionException {
		TypeEntryEndContext _localctx = new TypeEntryEndContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeEntryEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			typeExpr();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(155);
				match(OP_Split);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFuncArgExprContext extends ParserRuleContext {
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public List<TerminalNode> OP_Split() { return getTokens(HanCompilerParser.OP_Split); }
		public TerminalNode OP_Split(int i) {
			return getToken(HanCompilerParser.OP_Split, i);
		}
		public TypeFuncArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFuncArgExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTypeFuncArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTypeFuncArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTypeFuncArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFuncArgExprContext typeFuncArgExpr() throws RecognitionException {
		TypeFuncArgExprContext _localctx = new TypeFuncArgExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeFuncArgExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					typeExpr();
					setState(159);
					match(OP_Split);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			{
			setState(166);
			typeExpr();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(167);
				match(OP_Split);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeExprContext extends ParserRuleContext {
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
	 
		public TypeExprContext() { }
		public void copyFrom(TypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicTypeExprContext extends TypeExprContext {
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public Type_basicContext type_basic() {
			return getRuleContext(Type_basicContext.class,0);
		}
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public BasicTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterBasicTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitBasicTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitBasicTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicArrayExprContext extends TypeExprContext {
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public Type_basicContext type_basic() {
			return getRuleContext(Type_basicContext.class,0);
		}
		public TerminalNode OP_Mutiply() { return getToken(HanCompilerParser.OP_Mutiply, 0); }
		public TerminalNode INT() { return getToken(HanCompilerParser.INT, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public BasicArrayExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterBasicArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitBasicArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitBasicArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncTypeExprContext extends TypeExprContext {
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeFuncArgExprContext typeFuncArgExpr() {
			return getRuleContext(TypeFuncArgExprContext.class,0);
		}
		public FuncTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFuncTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFuncTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFuncTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CustomTypeExprContext extends TypeExprContext {
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public CustomTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterCustomTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitCustomTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitCustomTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CustomArrayExprContext extends TypeExprContext {
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TerminalNode OP_Mutiply() { return getToken(HanCompilerParser.OP_Mutiply, 0); }
		public TerminalNode INT() { return getToken(HanCompilerParser.INT, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public CustomArrayExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterCustomArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitCustomArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitCustomArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructExprContext extends TypeExprContext {
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TypeEntryEndContext typeEntryEnd() {
			return getRuleContext(TypeEntryEndContext.class,0);
		}
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public List<TypeEntryPartContext> typeEntryPart() {
			return getRuleContexts(TypeEntryPartContext.class);
		}
		public TypeEntryPartContext typeEntryPart(int i) {
			return getRuleContext(TypeEntryPartContext.class,i);
		}
		public StructExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterStructExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitStructExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitStructExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeExpr);
		int _la;
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BasicTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(OP_BraketType_Left);
				setState(171);
				type_basic();
				setState(172);
				match(OP_BraketType_Right);
				}
				break;
			case 2:
				_localctx = new BasicArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(OP_BraketType_Left);
				setState(175);
				type_basic();
				setState(176);
				match(OP_Mutiply);
				setState(177);
				match(INT);
				setState(178);
				match(OP_BraketType_Right);
				}
				break;
			case 3:
				_localctx = new CustomTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(OP_BraketType_Left);
				setState(181);
				match(ID);
				setState(182);
				match(OP_BraketType_Right);
				}
				break;
			case 4:
				_localctx = new CustomArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(OP_BraketType_Left);
				setState(184);
				match(ID);
				setState(185);
				match(OP_Mutiply);
				setState(186);
				match(INT);
				setState(187);
				match(OP_BraketType_Right);
				}
				break;
			case 5:
				_localctx = new StructExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(OP_BraketType_Left);
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						typeEntryPart();
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(195);
				typeEntryEnd();
				setState(196);
				match(OP_BraketType_Right);
				}
				break;
			case 6:
				_localctx = new FuncTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(OP_BraketType_Left);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(199);
					typeExpr();
					}
				}

				setState(202);
				match(OP_Braket_Left);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(203);
					typeFuncArgExpr();
					}
				}

				setState(206);
				match(OP_Braket_Right);
				setState(207);
				match(OP_BraketType_Right);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExprContext extends ParserRuleContext {
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(210);
				match(ID);
				}
				break;
			case KEY_Var:
				{
				setState(211);
				varExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
			match(OP_Set);
			setState(215);
			calcExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplePartContext extends ParserRuleContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TemplePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTemplePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTemplePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTemplePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplePartContext templePart() throws RecognitionException {
		TemplePartContext _localctx = new TemplePartContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_templePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			calcExpr(0);
			setState(218);
			match(OP_Split);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempleEndContext extends ParserRuleContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TempleEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templeEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTempleEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTempleEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTempleEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempleEndContext templeEnd() throws RecognitionException {
		TempleEndContext _localctx = new TempleEndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_templeEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			calcExpr(0);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(221);
				match(OP_Split);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempleExprContext extends ParserRuleContext {
		public TempleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templeExpr; }
	 
		public TempleExprContext() { }
		public void copyFrom(TempleExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructTempleContext extends TempleExprContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TempleEndContext templeEnd() {
			return getRuleContext(TempleEndContext.class,0);
		}
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public List<TemplePartContext> templePart() {
			return getRuleContexts(TemplePartContext.class);
		}
		public TemplePartContext templePart(int i) {
			return getRuleContext(TemplePartContext.class,i);
		}
		public StructTempleContext(TempleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterStructTemple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitStructTemple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitStructTemple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyTempleContext extends TempleExprContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public TerminalNode OP_Or() { return getToken(HanCompilerParser.OP_Or, 0); }
		public EmptyTempleContext(TempleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterEmptyTemple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitEmptyTemple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitEmptyTemple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTempleContext extends TempleExprContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TempleEndContext templeEnd() {
			return getRuleContext(TempleEndContext.class,0);
		}
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public List<TemplePartContext> templePart() {
			return getRuleContexts(TemplePartContext.class);
		}
		public TemplePartContext templePart(int i) {
			return getRuleContext(TemplePartContext.class,i);
		}
		public ArrayTempleContext(TempleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterArrayTemple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitArrayTemple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitArrayTemple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempleExprContext templeExpr() throws RecognitionException {
		TempleExprContext _localctx = new TempleExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_templeExpr);
		try {
			int _alt;
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new StructTempleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(OP_BraketMatch_Left);
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225);
						templePart();
						}
						} 
					}
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(231);
				templeEnd();
				setState(232);
				match(OP_BraketMatch_Right);
				}
				break;
			case 2:
				_localctx = new ArrayTempleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(OP_BraketMatch_Left);
				setState(235);
				match(T__1);
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(236);
						templePart();
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(242);
				templeEnd();
				setState(243);
				match(T__1);
				setState(244);
				match(OP_BraketMatch_Right);
				}
				break;
			case 3:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(OP_BraketMatch_Left);
				setState(247);
				match(OP_BraketMatch_Right);
				}
				break;
			case 4:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(OP_BraketMatch_Left);
				setState(249);
				match(T__1);
				setState(250);
				match(T__1);
				setState(251);
				match(OP_BraketMatch_Right);
				}
				break;
			case 5:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(OP_BraketMatch_Left);
				setState(253);
				match(OP_Or);
				setState(254);
				match(OP_BraketMatch_Right);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorExprContext extends ParserRuleContext {
		public DecoratorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorExpr; }
	 
		public DecoratorExprContext() { }
		public void copyFrom(DecoratorExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecoratorCastContext extends DecoratorExprContext {
		public TerminalNode Decorator_Caster() { return getToken(HanCompilerParser.Decorator_Caster, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode KEY_Cast() { return getToken(HanCompilerParser.KEY_Cast, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public DecoratorCastContext(DecoratorExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterDecoratorCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitDecoratorCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitDecoratorCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecoratorOpEndContext extends DecoratorExprContext {
		public TerminalNode Decorator_Operator() { return getToken(HanCompilerParser.Decorator_Operator, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public OperatorEndContext operatorEnd() {
			return getRuleContext(OperatorEndContext.class,0);
		}
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public DecoratorOpEndContext(DecoratorExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterDecoratorOpEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitDecoratorOpEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitDecoratorOpEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecoratorOp2Context extends DecoratorExprContext {
		public TerminalNode Decorator_Operator() { return getToken(HanCompilerParser.Decorator_Operator, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public Operator_allContext operator_all() {
			return getRuleContext(Operator_allContext.class,0);
		}
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public DecoratorOp2Context(DecoratorExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterDecoratorOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitDecoratorOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitDecoratorOp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecoratorOp1Context extends DecoratorExprContext {
		public TerminalNode Decorator_Operator() { return getToken(HanCompilerParser.Decorator_Operator, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public DecoratorOp1Context(DecoratorExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterDecoratorOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitDecoratorOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitDecoratorOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorExprContext decoratorExpr() throws RecognitionException {
		DecoratorExprContext _localctx = new DecoratorExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decoratorExpr);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new DecoratorCastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(Decorator_Caster);
				setState(258);
				match(OP_Braket_Left);
				setState(259);
				typeExpr();
				setState(260);
				match(KEY_Cast);
				setState(261);
				typeExpr();
				setState(262);
				match(OP_Braket_Right);
				}
				break;
			case 2:
				_localctx = new DecoratorOp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(Decorator_Operator);
				setState(265);
				match(OP_Braket_Left);
				setState(266);
				typeExpr();
				setState(267);
				operator_all();
				setState(268);
				typeExpr();
				setState(269);
				match(OP_Set);
				setState(270);
				typeExpr();
				setState(271);
				match(OP_Braket_Right);
				}
				break;
			case 3:
				_localctx = new DecoratorOp1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(Decorator_Operator);
				setState(274);
				match(OP_Braket_Left);
				setState(275);
				operator1();
				setState(276);
				typeExpr();
				setState(277);
				match(OP_Set);
				setState(278);
				typeExpr();
				setState(279);
				match(OP_Braket_Right);
				}
				break;
			case 4:
				_localctx = new DecoratorOpEndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(Decorator_Operator);
				setState(282);
				match(OP_Braket_Left);
				setState(283);
				typeExpr();
				setState(284);
				operatorEnd();
				setState(285);
				match(OP_Set);
				setState(286);
				typeExpr();
				setState(287);
				match(OP_Braket_Right);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcExprContext extends ParserRuleContext {
		public CalcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcExpr; }
	 
		public CalcExprContext() { }
		public void copyFrom(CalcExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LExprContext extends CalcExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public LExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterLExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitLExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitLExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C2ExprContext extends CalcExprContext {
		public List<CalcExprContext> calcExpr() {
			return getRuleContexts(CalcExprContext.class);
		}
		public CalcExprContext calcExpr(int i) {
			return getRuleContext(CalcExprContext.class,i);
		}
		public Operator2_p5Context operator2_p5() {
			return getRuleContext(Operator2_p5Context.class,0);
		}
		public Operator2_p4Context operator2_p4() {
			return getRuleContext(Operator2_p4Context.class,0);
		}
		public Operator2_p3Context operator2_p3() {
			return getRuleContext(Operator2_p3Context.class,0);
		}
		public Operator2_p2Context operator2_p2() {
			return getRuleContext(Operator2_p2Context.class,0);
		}
		public Operator2_p1Context operator2_p1() {
			return getRuleContext(Operator2_p1Context.class,0);
		}
		public C2ExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterC2Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitC2Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitC2Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FPtrExprContext extends CalcExprContext {
		public TerminalNode OP_At() { return getToken(HanCompilerParser.OP_At, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public FPtrExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFPtrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFPtrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFPtrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GDExprContext extends CalcExprContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Call() { return getToken(HanCompilerParser.OP_Call, 0); }
		public TerminalNode INT() { return getToken(HanCompilerParser.INT, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public GDExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterGDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitGDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitGDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C2ExprBContext extends CalcExprContext {
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public List<CalcExprContext> calcExpr() {
			return getRuleContexts(CalcExprContext.class);
		}
		public CalcExprContext calcExpr(int i) {
			return getRuleContext(CalcExprContext.class,i);
		}
		public Operator_allContext operator_all() {
			return getRuleContext(Operator_allContext.class,0);
		}
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public C2ExprBContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterC2ExprB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitC2ExprB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitC2ExprB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LBExprContext extends CalcExprContext {
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public LBExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterLBExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitLBExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitLBExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprContext extends CalcExprContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode KEY_Cast() { return getToken(HanCompilerParser.KEY_Cast, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode KEY_Type() { return getToken(HanCompilerParser.KEY_Type, 0); }
		public CastExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GCExprContext extends CalcExprContext {
		public List<CalcExprContext> calcExpr() {
			return getRuleContexts(CalcExprContext.class);
		}
		public CalcExprContext calcExpr(int i) {
			return getRuleContext(CalcExprContext.class,i);
		}
		public TerminalNode OP_Call() { return getToken(HanCompilerParser.OP_Call, 0); }
		public TerminalNode OP_BraketCall_Left() { return getToken(HanCompilerParser.OP_BraketCall_Left, 0); }
		public TerminalNode OP_BraketCall_Right() { return getToken(HanCompilerParser.OP_BraketCall_Right, 0); }
		public GCExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterGCExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitGCExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitGCExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TExprContext extends CalcExprContext {
		public TempleExprContext templeExpr() {
			return getRuleContext(TempleExprContext.class,0);
		}
		public TExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class C1ExprContext extends CalcExprContext {
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public C1ExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterC1Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitC1Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitC1Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IExprContext extends CalcExprContext {
		public List<CalcExprContext> calcExpr() {
			return getRuleContexts(CalcExprContext.class);
		}
		public CalcExprContext calcExpr(int i) {
			return getRuleContext(CalcExprContext.class,i);
		}
		public TerminalNode OP_Call() { return getToken(HanCompilerParser.OP_Call, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public List<TerminalNode> OP_Split() { return getTokens(HanCompilerParser.OP_Split); }
		public TerminalNode OP_Split(int i) {
			return getToken(HanCompilerParser.OP_Split, i);
		}
		public IExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterIExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitIExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitIExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ECExprContext extends CalcExprContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public OperatorEndContext operatorEnd() {
			return getRuleContext(OperatorEndContext.class,0);
		}
		public ECExprContext(CalcExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterECExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitECExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitECExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcExprContext calcExpr() throws RecognitionException {
		return calcExpr(0);
	}

	private CalcExprContext calcExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcExprContext _localctx = new CalcExprContext(_ctx, _parentState);
		CalcExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_calcExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new C1ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(292);
				operator1();
				setState(293);
				calcExpr(16);
				}
				break;
			case 2:
				{
				_localctx = new C2ExprBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(OP_Braket_Left);
				setState(296);
				calcExpr(0);
				setState(297);
				operator_all();
				setState(298);
				calcExpr(0);
				setState(299);
				match(OP_Braket_Right);
				}
				break;
			case 3:
				{
				_localctx = new LExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DEC:
				case BOOL:
				case STRING:
					{
					setState(301);
					literal();
					}
					break;
				case ID:
					{
					setState(302);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				_localctx = new TExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				templeExpr();
				}
				break;
			case 5:
				{
				_localctx = new FPtrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(OP_At);
				setState(307);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new LBExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(OP_Braket_Left);
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DEC:
				case BOOL:
				case STRING:
					{
					setState(309);
					literal();
					}
					break;
				case ID:
					{
					setState(310);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313);
				match(OP_Braket_Right);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(316);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(317);
						operator2_p5();
						setState(318);
						calcExpr(11);
						}
						break;
					case 2:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(320);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(321);
						operator2_p4();
						setState(322);
						calcExpr(10);
						}
						break;
					case 3:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(324);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(325);
						operator2_p3();
						setState(326);
						calcExpr(8);
						}
						break;
					case 4:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(329);
						operator2_p2();
						setState(330);
						calcExpr(8);
						}
						break;
					case 5:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(332);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(333);
						operator2_p1();
						setState(334);
						calcExpr(7);
						}
						break;
					case 6:
						{
						_localctx = new CastExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(336);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(337);
						match(KEY_Cast);
						setState(338);
						typeExpr();
						setState(339);
						match(KEY_Type);
						}
						break;
					case 7:
						{
						_localctx = new IExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(341);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(342);
						match(OP_Call);
						setState(343);
						match(OP_Braket_Left);
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
							{
							setState(344);
							calcExpr(0);
							}
						}

						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==OP_Split) {
							{
							{
							setState(347);
							match(OP_Split);
							setState(348);
							calcExpr(0);
							}
							}
							setState(353);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(354);
						match(OP_Braket_Right);
						}
						break;
					case 8:
						{
						_localctx = new GCExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(355);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(356);
						match(OP_Call);
						setState(357);
						match(OP_BraketCall_Left);
						setState(358);
						calcExpr(0);
						setState(359);
						match(OP_BraketCall_Right);
						}
						break;
					case 9:
						{
						_localctx = new GDExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(361);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(362);
						match(OP_Call);
						setState(363);
						_la = _input.LA(1);
						if ( !(_la==INT || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 10:
						{
						_localctx = new ECExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(364);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(365);
						operatorEnd();
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgPartExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public ArgPartExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argPartExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterArgPartExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitArgPartExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitArgPartExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgPartExprContext argPartExpr() throws RecognitionException {
		ArgPartExprContext _localctx = new ArgPartExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argPartExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(ID);
			setState(372);
			typeExpr();
			setState(373);
			match(OP_Split);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgEndExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public ArgEndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argEndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterArgEndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitArgEndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitArgEndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgEndExprContext argEndExpr() throws RecognitionException {
		ArgEndExprContext _localctx = new ArgEndExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argEndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ID);
			setState(376);
			typeExpr();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(377);
				match(OP_Split);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnExprContext extends ParserRuleContext {
		public TerminalNode KEY_Return() { return getToken(HanCompilerParser.KEY_Return, 0); }
		public TerminalNode OP_End() { return getToken(HanCompilerParser.OP_End, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(KEY_Return);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				setState(381);
				calcExpr(0);
				}
			}

			setState(384);
			match(OP_End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExprContext extends ParserRuleContext {
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
	 
		public FunctionExprContext() { }
		public void copyFrom(FunctionExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunRContext extends FunctionExprContext {
		public TerminalNode KEY_Function() { return getToken(HanCompilerParser.KEY_Function, 0); }
		public List<TerminalNode> ID() { return getTokens(HanCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HanCompilerParser.ID, i);
		}
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public Type_basicContext type_basic() {
			return getRuleContext(Type_basicContext.class,0);
		}
		public DecoratorExprContext decoratorExpr() {
			return getRuleContext(DecoratorExprContext.class,0);
		}
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ReturnExprContext> returnExpr() {
			return getRuleContexts(ReturnExprContext.class);
		}
		public ReturnExprContext returnExpr(int i) {
			return getRuleContext(ReturnExprContext.class,i);
		}
		public FunRContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFunR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFunR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFunR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunAContext extends FunctionExprContext {
		public TerminalNode KEY_Function() { return getToken(HanCompilerParser.KEY_Function, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public ArgEndExprContext argEndExpr() {
			return getRuleContext(ArgEndExprContext.class,0);
		}
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public DecoratorExprContext decoratorExpr() {
			return getRuleContext(DecoratorExprContext.class,0);
		}
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode KEY_Null() { return getToken(HanCompilerParser.KEY_Null, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public List<ArgPartExprContext> argPartExpr() {
			return getRuleContexts(ArgPartExprContext.class);
		}
		public ArgPartExprContext argPartExpr(int i) {
			return getRuleContext(ArgPartExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ReturnExprContext> returnExpr() {
			return getRuleContexts(ReturnExprContext.class);
		}
		public ReturnExprContext returnExpr(int i) {
			return getRuleContext(ReturnExprContext.class,i);
		}
		public FunAContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFunA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFunA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFunA(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunContext extends FunctionExprContext {
		public TerminalNode KEY_Function() { return getToken(HanCompilerParser.KEY_Function, 0); }
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public DecoratorExprContext decoratorExpr() {
			return getRuleContext(DecoratorExprContext.class,0);
		}
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ReturnExprContext> returnExpr() {
			return getRuleContexts(ReturnExprContext.class);
		}
		public ReturnExprContext returnExpr(int i) {
			return getRuleContext(ReturnExprContext.class,i);
		}
		public TerminalNode KEY_Null() { return getToken(HanCompilerParser.KEY_Null, 0); }
		public FunContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunRAContext extends FunctionExprContext {
		public TerminalNode KEY_Function() { return getToken(HanCompilerParser.KEY_Function, 0); }
		public List<TerminalNode> ID() { return getTokens(HanCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HanCompilerParser.ID, i);
		}
		public TerminalNode OP_BraketType_Left() { return getToken(HanCompilerParser.OP_BraketType_Left, 0); }
		public TerminalNode OP_BraketType_Right() { return getToken(HanCompilerParser.OP_BraketType_Right, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public ArgEndExprContext argEndExpr() {
			return getRuleContext(ArgEndExprContext.class,0);
		}
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public Type_basicContext type_basic() {
			return getRuleContext(Type_basicContext.class,0);
		}
		public DecoratorExprContext decoratorExpr() {
			return getRuleContext(DecoratorExprContext.class,0);
		}
		public List<ArgPartExprContext> argPartExpr() {
			return getRuleContexts(ArgPartExprContext.class);
		}
		public ArgPartExprContext argPartExpr(int i) {
			return getRuleContext(ArgPartExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ReturnExprContext> returnExpr() {
			return getRuleContexts(ReturnExprContext.class);
		}
		public ReturnExprContext returnExpr(int i) {
			return getRuleContext(ReturnExprContext.class,i);
		}
		public FunRAContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterFunRA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitFunRA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitFunRA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExprContext functionExpr() throws RecognitionException {
		FunctionExprContext _localctx = new FunctionExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionExpr);
		int _la;
		try {
			int _alt;
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new FunRAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(386);
					decoratorExpr();
					}
				}

				setState(389);
				match(KEY_Function);
				setState(390);
				match(ID);
				setState(391);
				match(OP_BraketType_Left);
				setState(394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type_Byte:
				case Type_Int:
				case Type_LongInt:
				case Type_ShortInt:
				case Type_LongLongInt:
				case Type_Boolean:
				case Type_ShortFloat:
				case Type_Float:
				case Type_LongFloat:
				case Type_LongLongFloat:
				case Type_String:
					{
					setState(392);
					type_basic();
					}
					break;
				case ID:
					{
					setState(393);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(396);
				match(OP_BraketType_Right);
				setState(397);
				match(OP_Braket_Left);
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						argPartExpr();
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(404);
				argEndExpr();
				setState(405);
				match(OP_Braket_Right);
				setState(406);
				match(OP_BraketMatch_Left);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(407);
						expr();
						}
						break;
					case 2:
						{
						setState(408);
						returnExpr();
						}
						break;
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(OP_BraketMatch_Right);
				}
				break;
			case 2:
				_localctx = new FunAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(416);
					decoratorExpr();
					}
				}

				setState(419);
				match(KEY_Function);
				setState(420);
				match(ID);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(421);
					match(OP_BraketType_Left);
					setState(422);
					match(KEY_Null);
					setState(423);
					match(OP_BraketType_Right);
					}
				}

				setState(426);
				match(OP_Braket_Left);
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						argPartExpr();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(433);
				argEndExpr();
				setState(434);
				match(OP_Braket_Right);
				setState(435);
				match(OP_BraketMatch_Left);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(438);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(436);
						expr();
						}
						break;
					case 2:
						{
						setState(437);
						returnExpr();
						}
						break;
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				match(OP_BraketMatch_Right);
				}
				break;
			case 3:
				_localctx = new FunRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(445);
					decoratorExpr();
					}
				}

				setState(448);
				match(KEY_Function);
				setState(449);
				match(ID);
				setState(450);
				match(OP_BraketType_Left);
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type_Byte:
				case Type_Int:
				case Type_LongInt:
				case Type_ShortInt:
				case Type_LongLongInt:
				case Type_Boolean:
				case Type_ShortFloat:
				case Type_Float:
				case Type_LongFloat:
				case Type_LongLongFloat:
				case Type_String:
					{
					setState(451);
					type_basic();
					}
					break;
				case ID:
					{
					setState(452);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(455);
				match(OP_BraketType_Right);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Braket_Left) {
					{
					setState(456);
					match(OP_Braket_Left);
					setState(457);
					match(OP_Braket_Right);
					}
				}

				setState(460);
				match(OP_BraketMatch_Left);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(461);
						expr();
						}
						break;
					case 2:
						{
						setState(462);
						returnExpr();
						}
						break;
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(468);
				match(OP_BraketMatch_Right);
				}
				break;
			case 4:
				_localctx = new FunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(469);
					decoratorExpr();
					}
				}

				setState(472);
				match(KEY_Function);
				setState(473);
				match(ID);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(474);
					match(OP_BraketType_Left);
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KEY_Null) {
						{
						setState(475);
						match(KEY_Null);
						}
					}

					setState(478);
					match(OP_BraketType_Right);
					}
				}

				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Braket_Left) {
					{
					setState(481);
					match(OP_Braket_Left);
					setState(482);
					match(OP_Braket_Right);
					}
				}

				setState(485);
				match(OP_BraketMatch_Left);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(486);
						expr();
						}
						break;
					case 2:
						{
						setState(487);
						returnExpr();
						}
						break;
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				match(OP_BraketMatch_Right);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfbodyExprContext extends ParserRuleContext {
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfbodyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifbodyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterIfbodyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitIfbodyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitIfbodyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfbodyExprContext ifbodyExpr() throws RecognitionException {
		IfbodyExprContext _localctx = new IfbodyExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifbodyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(OP_Braket_Left);
			setState(497);
			calcExpr(0);
			setState(498);
			match(OP_Braket_Right);
			setState(499);
			match(OP_BraketMatch_Left);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				{
				setState(500);
				expr();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(OP_BraketMatch_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfbodyEndExprContext extends ParserRuleContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfbodyEndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifbodyEndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterIfbodyEndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitIfbodyEndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitIfbodyEndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfbodyEndExprContext ifbodyEndExpr() throws RecognitionException {
		IfbodyEndExprContext _localctx = new IfbodyEndExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifbodyEndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Braket_Left) {
				{
				setState(508);
				match(OP_Braket_Left);
				setState(509);
				match(OP_Braket_Right);
				}
			}

			setState(512);
			match(OP_BraketMatch_Left);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				{
				setState(513);
				expr();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(OP_BraketMatch_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfelseExprContext extends ParserRuleContext {
		public TerminalNode KEY_If() { return getToken(HanCompilerParser.KEY_If, 0); }
		public List<IfbodyExprContext> ifbodyExpr() {
			return getRuleContexts(IfbodyExprContext.class);
		}
		public IfbodyExprContext ifbodyExpr(int i) {
			return getRuleContext(IfbodyExprContext.class,i);
		}
		public List<TerminalNode> KEY_Elif() { return getTokens(HanCompilerParser.KEY_Elif); }
		public TerminalNode KEY_Elif(int i) {
			return getToken(HanCompilerParser.KEY_Elif, i);
		}
		public TerminalNode KEY_Else() { return getToken(HanCompilerParser.KEY_Else, 0); }
		public IfbodyEndExprContext ifbodyEndExpr() {
			return getRuleContext(IfbodyEndExprContext.class,0);
		}
		public IfelseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterIfelseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitIfelseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitIfelseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseExprContext ifelseExpr() throws RecognitionException {
		IfelseExprContext _localctx = new IfelseExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifelseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(KEY_If);
			setState(522);
			ifbodyExpr();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY_Elif) {
				{
				{
				setState(523);
				match(KEY_Elif);
				setState(524);
				ifbodyExpr();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_Else) {
				{
				setState(530);
				match(KEY_Else);
				setState(531);
				ifbodyEndExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileExprContext extends ParserRuleContext {
		public TerminalNode KEY_Loop() { return getToken(HanCompilerParser.KEY_Loop, 0); }
		public TerminalNode OP_Braket_Left() { return getToken(HanCompilerParser.OP_Braket_Left, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Braket_Right() { return getToken(HanCompilerParser.OP_Braket_Right, 0); }
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(KEY_Loop);
			setState(535);
			match(OP_Braket_Left);
			setState(536);
			calcExpr(0);
			setState(537);
			match(OP_Braket_Right);
			setState(538);
			match(OP_BraketMatch_Left);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_At - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				{
				setState(539);
				expr();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(OP_BraketMatch_Right);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HanCompilerParser.INT, 0); }
		public TerminalNode DEC() { return getToken(HanCompilerParser.DEC, 0); }
		public TerminalNode BOOL() { return getToken(HanCompilerParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(HanCompilerParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (BOOL - 64)) | (1L << (STRING - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return calcExpr_sempred((CalcExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean calcExpr_sempred(CalcExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u0228\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\5\nf\n\n\3\13\3\13\3\13\3\13\5\13l\n\13\5\13n\n\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\5\17\u008f"+
		"\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u009f\n\22\3\23\3\23\3\23\7\23\u00a4\n\23\f\23\16\23\u00a7"+
		"\13\23\3\23\3\23\5\23\u00ab\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00c1"+
		"\n\24\f\24\16\24\u00c4\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cb\n\24"+
		"\3\24\3\24\5\24\u00cf\n\24\3\24\3\24\5\24\u00d3\n\24\3\25\3\25\5\25\u00d7"+
		"\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\5\27\u00e1\n\27\3\30\3\30"+
		"\7\30\u00e5\n\30\f\30\16\30\u00e8\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u00f0\n\30\f\30\16\30\u00f3\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0102\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0124\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0132\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013a\n\32\3"+
		"\32\5\32\u013d\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u015c\n\32\3\32\3\32\7\32\u0160\n\32\f"+
		"\32\16\32\u0163\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0171\n\32\f\32\16\32\u0174\13\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u017d\n\34\3\35\3\35\5\35\u0181\n\35\3\35\3\35\3"+
		"\36\5\36\u0186\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u018d\n\36\3\36\3\36"+
		"\3\36\7\36\u0192\n\36\f\36\16\36\u0195\13\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u019c\n\36\f\36\16\36\u019f\13\36\3\36\3\36\3\36\5\36\u01a4\n\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01ab\n\36\3\36\3\36\7\36\u01af\n\36\f"+
		"\36\16\36\u01b2\13\36\3\36\3\36\3\36\3\36\3\36\7\36\u01b9\n\36\f\36\16"+
		"\36\u01bc\13\36\3\36\3\36\3\36\5\36\u01c1\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u01c8\n\36\3\36\3\36\3\36\5\36\u01cd\n\36\3\36\3\36\3\36\7\36\u01d2"+
		"\n\36\f\36\16\36\u01d5\13\36\3\36\3\36\5\36\u01d9\n\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01df\n\36\3\36\5\36\u01e2\n\36\3\36\3\36\5\36\u01e6\n\36\3"+
		"\36\3\36\3\36\7\36\u01eb\n\36\f\36\16\36\u01ee\13\36\3\36\5\36\u01f1\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\7\37\u01f8\n\37\f\37\16\37\u01fb\13\37\3"+
		"\37\3\37\3 \3 \5 \u0201\n \3 \3 \7 \u0205\n \f \16 \u0208\13 \3 \3 \3"+
		"!\3!\3!\3!\7!\u0210\n!\f!\16!\u0213\13!\3!\3!\5!\u0217\n!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u021f\n\"\f\"\16\"\u0222\13\"\3\"\3\"\3#\3#\3#\2\3\62"+
		"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\13\3\3\3\3\4\2\r\16\30\30\3\2\22\27\3\2\r\16\3\2\17\21\3\2\31\32\3\2"+
		"\67A\4\2BBKK\4\2BBGI\2\u0260\2M\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\bV\3\2\2"+
		"\2\nX\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22e\3\2\2\2\24m\3\2"+
		"\2\2\26o\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u008a\3\2\2\2\36"+
		"\u0093\3\2\2\2 \u0097\3\2\2\2\"\u009b\3\2\2\2$\u00a5\3\2\2\2&\u00d2\3"+
		"\2\2\2(\u00d6\3\2\2\2*\u00db\3\2\2\2,\u00de\3\2\2\2.\u0101\3\2\2\2\60"+
		"\u0123\3\2\2\2\62\u013c\3\2\2\2\64\u0175\3\2\2\2\66\u0179\3\2\2\28\u017e"+
		"\3\2\2\2:\u01f0\3\2\2\2<\u01f2\3\2\2\2>\u0200\3\2\2\2@\u020b\3\2\2\2B"+
		"\u0218\3\2\2\2D\u0225\3\2\2\2FL\5\30\r\2GL\5:\36\2HI\5\36\20\2IJ\7\36"+
		"\2\2JL\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2OM\3\2\2\2PQ\t\2\2\2Q\3\3\2\2\2RS\t\3\2\2S\5\3\2\2\2TU\t"+
		"\4\2\2U\7\3\2\2\2VW\t\5\2\2W\t\3\2\2\2XY\t\6\2\2Y\13\3\2\2\2Z[\7\f\2\2"+
		"[\r\3\2\2\2\\]\t\7\2\2]\17\3\2\2\2^_\7\37\2\2_\21\3\2\2\2`f\5\6\4\2af"+
		"\5\b\5\2bf\5\n\6\2cf\5\f\7\2df\5\16\b\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2"+
		"ec\3\2\2\2ed\3\2\2\2f\23\3\2\2\2gn\7\61\2\2hn\7\60\2\2ik\7/\2\2jl\5\62"+
		"\32\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2n\25"+
		"\3\2\2\2op\t\b\2\2p\27\3\2\2\2qr\5\32\16\2rs\7\36\2\2s\u0083\3\2\2\2t"+
		"u\5\34\17\2uv\7\36\2\2v\u0083\3\2\2\2wx\5(\25\2xy\7\36\2\2y\u0083\3\2"+
		"\2\2z{\5\62\32\2{|\7\36\2\2|\u0083\3\2\2\2}\u0083\5@!\2~\u0083\5B\"\2"+
		"\177\u0080\5\24\13\2\u0080\u0081\7\36\2\2\u0081\u0083\3\2\2\2\u0082q\3"+
		"\2\2\2\u0082t\3\2\2\2\u0082w\3\2\2\2\u0082z\3\2\2\2\u0082}\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\177\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\7+\2\2\u0085"+
		"\u0086\7K\2\2\u0086\u0088\5&\24\2\u0087\u0089\7!\2\2\u0088\u0087\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c"+
		"\7K\2\2\u008c\u008e\5&\24\2\u008d\u008f\7!\2\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092\5"+
		"\62\32\2\u0092\35\3\2\2\2\u0093\u0094\7-\2\2\u0094\u0095\7K\2\2\u0095"+
		"\u0096\5&\24\2\u0096\37\3\2\2\2\u0097\u0098\7K\2\2\u0098\u0099\5&\24\2"+
		"\u0099\u009a\7\34\2\2\u009a!\3\2\2\2\u009b\u009c\7K\2\2\u009c\u009e\5"+
		"&\24\2\u009d\u009f\7\34\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"#\3\2\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a2\7\34\2\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5&\24\2\u00a9"+
		"\u00ab\7\34\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab%\3\2\2\2"+
		"\u00ac\u00ad\7&\2\2\u00ad\u00ae\5\26\f\2\u00ae\u00af\7\'\2\2\u00af\u00d3"+
		"\3\2\2\2\u00b0\u00b1\7&\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\17\2\2"+
		"\u00b3\u00b4\7B\2\2\u00b4\u00b5\7\'\2\2\u00b5\u00d3\3\2\2\2\u00b6\u00b7"+
		"\7&\2\2\u00b7\u00b8\7K\2\2\u00b8\u00d3\7\'\2\2\u00b9\u00ba\7&\2\2\u00ba"+
		"\u00bb\7K\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\7B\2\2\u00bd\u00d3\7\'"+
		"\2\2\u00be\u00c2\7&\2\2\u00bf\u00c1\5 \21\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7\7\'\2\2\u00c7"+
		"\u00d3\3\2\2\2\u00c8\u00ca\7&\2\2\u00c9\u00cb\5&\24\2\u00ca\u00c9\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\7\"\2\2\u00cd"+
		"\u00cf\5$\23\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d3\7\'\2\2\u00d2\u00ac\3\2\2\2\u00d2"+
		"\u00b0\3\2\2\2\u00d2\u00b6\3\2\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00be\3\2"+
		"\2\2\u00d2\u00c8\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d7\7K\2\2\u00d5\u00d7"+
		"\5\32\16\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d9\7\35\2\2\u00d9\u00da\5\62\32\2\u00da)\3\2\2\2\u00db\u00dc"+
		"\5\62\32\2\u00dc\u00dd\7\34\2\2\u00dd+\3\2\2\2\u00de\u00e0\5\62\32\2\u00df"+
		"\u00e1\7\34\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1-\3\2\2\2"+
		"\u00e2\u00e6\7(\2\2\u00e3\u00e5\5*\26\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\5,\27\2\u00ea\u00eb\7)\2\2\u00eb\u0102\3\2"+
		"\2\2\u00ec\u00ed\7(\2\2\u00ed\u00f1\7\4\2\2\u00ee\u00f0\5*\26\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5,\27\2\u00f5"+
		"\u00f6\7\4\2\2\u00f6\u00f7\7)\2\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\7(\2"+
		"\2\u00f9\u0102\7)\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00fd"+
		"\7\4\2\2\u00fd\u0102\7)\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100\7\32\2\2\u0100"+
		"\u0102\7)\2\2\u0101\u00e2\3\2\2\2\u0101\u00ec\3\2\2\2\u0101\u00f8\3\2"+
		"\2\2\u0101\u00fa\3\2\2\2\u0101\u00fe\3\2\2\2\u0102/\3\2\2\2\u0103\u0104"+
		"\7\n\2\2\u0104\u0105\7\"\2\2\u0105\u0106\5&\24\2\u0106\u0107\7\66\2\2"+
		"\u0107\u0108\5&\24\2\u0108\u0109\7#\2\2\u0109\u0124\3\2\2\2\u010a\u010b"+
		"\7\13\2\2\u010b\u010c\7\"\2\2\u010c\u010d\5&\24\2\u010d\u010e\5\22\n\2"+
		"\u010e\u010f\5&\24\2\u010f\u0110\7\35\2\2\u0110\u0111\5&\24\2\u0111\u0112"+
		"\7#\2\2\u0112\u0124\3\2\2\2\u0113\u0114\7\13\2\2\u0114\u0115\7\"\2\2\u0115"+
		"\u0116\5\4\3\2\u0116\u0117\5&\24\2\u0117\u0118\7\35\2\2\u0118\u0119\5"+
		"&\24\2\u0119\u011a\7#\2\2\u011a\u0124\3\2\2\2\u011b\u011c\7\13\2\2\u011c"+
		"\u011d\7\"\2\2\u011d\u011e\5&\24\2\u011e\u011f\5\20\t\2\u011f\u0120\7"+
		"\35\2\2\u0120\u0121\5&\24\2\u0121\u0122\7#\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0103\3\2\2\2\u0123\u010a\3\2\2\2\u0123\u0113\3\2\2\2\u0123\u011b\3\2"+
		"\2\2\u0124\61\3\2\2\2\u0125\u0126\b\32\1\2\u0126\u0127\5\4\3\2\u0127\u0128"+
		"\5\62\32\22\u0128\u013d\3\2\2\2\u0129\u012a\7\"\2\2\u012a\u012b\5\62\32"+
		"\2\u012b\u012c\5\22\n\2\u012c\u012d\5\62\32\2\u012d\u012e\7#\2\2\u012e"+
		"\u013d\3\2\2\2\u012f\u0132\5D#\2\u0130\u0132\7K\2\2\u0131\u012f\3\2\2"+
		"\2\u0131\u0130\3\2\2\2\u0132\u013d\3\2\2\2\u0133\u013d\5.\30\2\u0134\u0135"+
		"\7 \2\2\u0135\u013d\7K\2\2\u0136\u0139\7\"\2\2\u0137\u013a\5D#\2\u0138"+
		"\u013a\7K\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013d\7#\2\2\u013c\u0125\3\2\2\2\u013c\u0129\3\2\2\2\u013c"+
		"\u0131\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0136\3\2"+
		"\2\2\u013d\u0172\3\2\2\2\u013e\u013f\f\f\2\2\u013f\u0140\5\16\b\2\u0140"+
		"\u0141\5\62\32\r\u0141\u0171\3\2\2\2\u0142\u0143\f\13\2\2\u0143\u0144"+
		"\5\f\7\2\u0144\u0145\5\62\32\f\u0145\u0171\3\2\2\2\u0146\u0147\f\n\2\2"+
		"\u0147\u0148\5\n\6\2\u0148\u0149\5\62\32\n\u0149\u0171\3\2\2\2\u014a\u014b"+
		"\f\t\2\2\u014b\u014c\5\b\5\2\u014c\u014d\5\62\32\n\u014d\u0171\3\2\2\2"+
		"\u014e\u014f\f\b\2\2\u014f\u0150\5\6\4\2\u0150\u0151\5\62\32\t\u0151\u0171"+
		"\3\2\2\2\u0152\u0153\f\20\2\2\u0153\u0154\7\66\2\2\u0154\u0155\5&\24\2"+
		"\u0155\u0156\7-\2\2\u0156\u0171\3\2\2\2\u0157\u0158\f\17\2\2\u0158\u0159"+
		"\7\33\2\2\u0159\u015b\7\"\2\2\u015a\u015c\5\62\32\2\u015b\u015a\3\2\2"+
		"\2\u015b\u015c\3\2\2\2\u015c\u0161\3\2\2\2\u015d\u015e\7\34\2\2\u015e"+
		"\u0160\5\62\32\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0171\7#\2\2\u0165\u0166\f\16\2\2\u0166\u0167\7\33\2\2\u0167\u0168\7"+
		"$\2\2\u0168\u0169\5\62\32\2\u0169\u016a\7%\2\2\u016a\u0171\3\2\2\2\u016b"+
		"\u016c\f\r\2\2\u016c\u016d\7\33\2\2\u016d\u0171\t\t\2\2\u016e\u016f\f"+
		"\3\2\2\u016f\u0171\5\20\t\2\u0170\u013e\3\2\2\2\u0170\u0142\3\2\2\2\u0170"+
		"\u0146\3\2\2\2\u0170\u014a\3\2\2\2\u0170\u014e\3\2\2\2\u0170\u0152\3\2"+
		"\2\2\u0170\u0157\3\2\2\2\u0170\u0165\3\2\2\2\u0170\u016b\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\63\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7K\2\2\u0176\u0177"+
		"\5&\24\2\u0177\u0178\7\34\2\2\u0178\65\3\2\2\2\u0179\u017a\7K\2\2\u017a"+
		"\u017c\5&\24\2\u017b\u017d\7\34\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017d\67\3\2\2\2\u017e\u0180\7/\2\2\u017f\u0181\5\62\32\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\36"+
		"\2\2\u01839\3\2\2\2\u0184\u0186\5\60\31\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7.\2\2\u0188\u0189\7K\2\2\u0189"+
		"\u018c\7&\2\2\u018a\u018d\5\26\f\2\u018b\u018d\7K\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7\'\2\2\u018f"+
		"\u0193\7\"\2\2\u0190\u0192\5\64\33\2\u0191\u0190\3\2\2\2\u0192\u0195\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0197\5\66\34\2\u0197\u0198\7#\2\2\u0198\u019d\7"+
		"(\2\2\u0199\u019c\5\30\r\2\u019a\u019c\58\35\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7)\2\2\u01a1"+
		"\u01f1\3\2\2\2\u01a2\u01a4\5\60\31\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7.\2\2\u01a6\u01aa\7K\2\2\u01a7"+
		"\u01a8\7&\2\2\u01a8\u01a9\7*\2\2\u01a9\u01ab\7\'\2\2\u01aa\u01a7\3\2\2"+
		"\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b0\7\"\2\2\u01ad\u01af"+
		"\5\64\33\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2"+
		"\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4"+
		"\5\66\34\2\u01b4\u01b5\7#\2\2\u01b5\u01ba\7(\2\2\u01b6\u01b9\5\30\r\2"+
		"\u01b7\u01b9\58\35\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01be\7)\2\2\u01be\u01f1\3\2\2\2\u01bf\u01c1\5\60"+
		"\31\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\7.\2\2\u01c3\u01c4\7K\2\2\u01c4\u01c7\7&\2\2\u01c5\u01c8\5\26\f"+
		"\2\u01c6\u01c8\7K\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\u01cc\7\'\2\2\u01ca\u01cb\7\"\2\2\u01cb\u01cd\7#\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d3\7("+
		"\2\2\u01cf\u01d2\5\30\r\2\u01d0\u01d2\58\35\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01f1\7)\2\2\u01d7"+
		"\u01d9\5\60\31\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3"+
		"\2\2\2\u01da\u01db\7.\2\2\u01db\u01e1\7K\2\2\u01dc\u01de\7&\2\2\u01dd"+
		"\u01df\7*\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e2\7\'\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e4\7\"\2\2\u01e4\u01e6\7#\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ec\7(\2\2\u01e8"+
		"\u01eb\5\30\r\2\u01e9\u01eb\58\35\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3"+
		"\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\7)\2\2\u01f0\u0185\3\2"+
		"\2\2\u01f0\u01a3\3\2\2\2\u01f0\u01c0\3\2\2\2\u01f0\u01d8\3\2\2\2\u01f1"+
		";\3\2\2\2\u01f2\u01f3\7\"\2\2\u01f3\u01f4\5\62\32\2\u01f4\u01f5\7#\2\2"+
		"\u01f5\u01f9\7(\2\2\u01f6\u01f8\5\30\r\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fd\7)\2\2\u01fd=\3\2\2\2\u01fe\u01ff\7\"\2\2\u01ff"+
		"\u0201\7#\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0206\7(\2\2\u0203\u0205\5\30\r\2\u0204\u0203\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2"+
		"\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7)\2\2\u020a?\3\2\2\2\u020b\u020c"+
		"\7\63\2\2\u020c\u0211\5<\37\2\u020d\u020e\7\64\2\2\u020e\u0210\5<\37\2"+
		"\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0216\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7\65\2\2"+
		"\u0215\u0217\5> \2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217A\3\2"+
		"\2\2\u0218\u0219\7\62\2\2\u0219\u021a\7\"\2\2\u021a\u021b\5\62\32\2\u021b"+
		"\u021c\7#\2\2\u021c\u0220\7(\2\2\u021d\u021f\5\30\r\2\u021e\u021d\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7)\2\2\u0224C\3\2\2\2\u0225"+
		"\u0226\t\n\2\2\u0226E\3\2\2\2<KMekm\u0082\u0088\u008e\u009e\u00a5\u00aa"+
		"\u00c2\u00ca\u00ce\u00d2\u00d6\u00e0\u00e6\u00f1\u0101\u0123\u0131\u0139"+
		"\u013c\u015b\u0161\u0170\u0172\u017c\u0180\u0185\u018c\u0193\u019b\u019d"+
		"\u01a3\u01aa\u01b0\u01b8\u01ba\u01c0\u01c7\u01cc\u01d1\u01d3\u01d8\u01de"+
		"\u01e1\u01e5\u01ea\u01ec\u01f0\u01f9\u0200\u0206\u0211\u0216\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}