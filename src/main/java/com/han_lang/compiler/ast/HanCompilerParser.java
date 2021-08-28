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
		OP_EndCall=29, OP_Braket_Left=30, OP_Braket_Right=31, OP_BraketCall_Left=32, 
		OP_BraketCall_Right=33, OP_BraketType_Left=34, OP_BraketType_Right=35, 
		OP_BraketMatch_Left=36, OP_BraketMatch_Right=37, KEY_Null=38, KEY_Var=39, 
		KEY_Const=40, KEY_Type=41, KEY_Function=42, KEY_Return=43, KEY_Break=44, 
		KEY_Continue=45, KEY_Loop=46, KEY_If=47, KEY_Elif=48, KEY_Else=49, KEY_Cast=50, 
		Type_Byte=51, Type_Int=52, Type_LongInt=53, Type_ShortInt=54, Type_LongLongInt=55, 
		Type_Boolean=56, Type_ShortFloat=57, Type_Float=58, Type_LongFloat=59, 
		Type_LongLongFloat=60, Type_String=61, INT=62, INT10=63, INT8=64, INT16=65, 
		INT2=66, DEC=67, BOOL=68, STRING=69, ESCAPE_CHARS=70, ID=71, IDStart=72, 
		IDPart=73;
	public static final int
		RULE_program = 0, RULE_operator1 = 1, RULE_operator2_p1 = 2, RULE_operator2_p2 = 3, 
		RULE_operator2_p3 = 4, RULE_operator2_p4 = 5, RULE_operator2_p5 = 6, RULE_operatorEnd = 7, 
		RULE_operator_all = 8, RULE_flowExpr = 9, RULE_type_basic = 10, RULE_expr = 11, 
		RULE_varExpr = 12, RULE_constAndSetExpr = 13, RULE_newtypeExpr = 14, RULE_typeEntryPart = 15, 
		RULE_typeEntryEnd = 16, RULE_typeExpr = 17, RULE_setExpr = 18, RULE_templePart = 19, 
		RULE_templeEnd = 20, RULE_templeExpr = 21, RULE_decoratorExpr = 22, RULE_calcExpr = 23, 
		RULE_argPartExpr = 24, RULE_argEndExpr = 25, RULE_returnExpr = 26, RULE_functionExpr = 27, 
		RULE_ifbodyExpr = 28, RULE_ifbodyEndExpr = 29, RULE_ifelseExpr = 30, RULE_whileExpr = 31, 
		RULE_literal = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operator1", "operator2_p1", "operator2_p2", "operator2_p3", 
			"operator2_p4", "operator2_p5", "operatorEnd", "operator_all", "flowExpr", 
			"type_basic", "expr", "varExpr", "constAndSetExpr", "newtypeExpr", "typeEntryPart", 
			"typeEntryEnd", "typeExpr", "setExpr", "templePart", "templeEnd", "templeExpr", 
			"decoratorExpr", "calcExpr", "argPartExpr", "argEndExpr", "returnExpr", 
			"functionExpr", "ifbodyExpr", "ifbodyEndExpr", "ifelseExpr", "whileExpr", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<EOF>'", "'|'", null, null, null, null, null, null, null, "'**'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, null, null, null, 
			null, null, null, null, null, "'='", null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
			"WS", "Decorator_Caster", "Decorator_Operator", "OP_Power", "OP_Plus", 
			"OP_Minus", "OP_Mutiply", "OP_Divide", "OP_Remain", "OP_Greater", "OP_GreaterEqual", 
			"OP_Lower", "OP_LowerEqual", "OP_NotEqual", "OP_Equal", "OP_Not", "OP_And", 
			"OP_Or", "OP_Call", "OP_Split", "OP_Set", "OP_End", "OP_EndCall", "OP_Braket_Left", 
			"OP_Braket_Right", "OP_BraketCall_Left", "OP_BraketCall_Right", "OP_BraketType_Left", 
			"OP_BraketType_Right", "OP_BraketMatch_Left", "OP_BraketMatch_Right", 
			"KEY_Null", "KEY_Var", "KEY_Const", "KEY_Type", "KEY_Function", "KEY_Return", 
			"KEY_Break", "KEY_Continue", "KEY_Loop", "KEY_If", "KEY_Elif", "KEY_Else", 
			"KEY_Cast", "Type_Byte", "Type_Int", "Type_LongInt", "Type_ShortInt", 
			"Type_LongLongInt", "Type_Boolean", "Type_ShortFloat", "Type_Float", 
			"Type_LongFloat", "Type_LongLongFloat", "Type_String", "INT", "INT10", 
			"INT8", "INT16", "INT2", "DEC", "BOOL", "STRING", "ESCAPE_CHARS", "ID", 
			"IDStart", "IDPart"
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (Decorator_Caster - 8)) | (1L << (Decorator_Operator - 8)) | (1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Type - 8)) | (1L << (KEY_Function - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_Plus:
				case OP_Minus:
				case OP_Not:
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
					setState(66);
					expr();
					}
					break;
				case Decorator_Caster:
				case Decorator_Operator:
				case KEY_Function:
					{
					setState(67);
					functionExpr();
					}
					break;
				case KEY_Type:
					{
					setState(68);
					newtypeExpr();
					setState(69);
					match(OP_End);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
			setState(78);
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
			setState(80);
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
			setState(82);
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
			setState(84);
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
			setState(86);
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
			setState(88);
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
			setState(90);
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
			setState(97);
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
				setState(92);
				operator2_p1();
				}
				break;
			case OP_Plus:
			case OP_Minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				operator2_p2();
				}
				break;
			case OP_Mutiply:
			case OP_Divide:
			case OP_Remain:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				operator2_p3();
				}
				break;
			case OP_Power:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				operator2_p4();
				}
				break;
			case OP_And:
			case OP_Or:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(KEY_Continue);
				}
				break;
			case KEY_Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(KEY_Break);
				}
				break;
			case KEY_Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(KEY_Return);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(102);
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
			setState(107);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new InnerVarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				varExpr();
				setState(110);
				match(OP_End);
				}
				break;
			case 2:
				_localctx = new InnerConstExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				constAndSetExpr();
				setState(113);
				match(OP_End);
				}
				break;
			case 3:
				_localctx = new InnerSetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				setExpr();
				setState(116);
				match(OP_End);
				}
				break;
			case 4:
				_localctx = new InnerCalcExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				calcExpr(0);
				setState(119);
				match(OP_End);
				}
				break;
			case 5:
				_localctx = new InnerIfElseExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				ifelseExpr();
				}
				break;
			case 6:
				_localctx = new InnerWhileExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				whileExpr();
				}
				break;
			case 7:
				_localctx = new InnerFlowExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				flowExpr();
				setState(124);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(KEY_Var);
			setState(129);
			match(ID);
			setState(130);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(KEY_Const);
			setState(133);
			match(ID);
			setState(134);
			typeExpr();
			setState(135);
			match(OP_Set);
			setState(136);
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
			setState(138);
			match(KEY_Type);
			setState(139);
			match(ID);
			setState(140);
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
			setState(142);
			match(ID);
			setState(143);
			typeExpr();
			setState(144);
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
			setState(146);
			match(ID);
			setState(147);
			typeExpr();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(148);
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
		enterRule(_localctx, 34, RULE_typeExpr);
		try {
			int _alt;
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new BasicTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(OP_BraketType_Left);
				setState(152);
				type_basic();
				setState(153);
				match(OP_BraketType_Right);
				}
				break;
			case 2:
				_localctx = new BasicArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(OP_BraketType_Left);
				setState(156);
				type_basic();
				setState(157);
				match(OP_Mutiply);
				setState(158);
				match(INT);
				setState(159);
				match(OP_BraketType_Right);
				}
				break;
			case 3:
				_localctx = new CustomTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(OP_BraketType_Left);
				setState(162);
				match(ID);
				setState(163);
				match(OP_BraketType_Right);
				}
				break;
			case 4:
				_localctx = new CustomArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(OP_BraketType_Left);
				setState(165);
				match(ID);
				setState(166);
				match(OP_Mutiply);
				setState(167);
				match(INT);
				setState(168);
				match(OP_BraketType_Right);
				}
				break;
			case 5:
				_localctx = new StructExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(OP_BraketType_Left);
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						typeEntryPart();
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(176);
				typeEntryEnd();
				setState(177);
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
		enterRule(_localctx, 36, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(181);
				match(ID);
				}
				break;
			case KEY_Var:
				{
				setState(182);
				varExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			match(OP_Set);
			setState(186);
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
		enterRule(_localctx, 38, RULE_templePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			calcExpr(0);
			setState(189);
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
		enterRule(_localctx, 40, RULE_templeEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			calcExpr(0);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(192);
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
		enterRule(_localctx, 42, RULE_templeExpr);
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StructTempleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(OP_BraketMatch_Left);
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						templePart();
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(202);
				templeEnd();
				setState(203);
				match(OP_BraketMatch_Right);
				}
				break;
			case 2:
				_localctx = new ArrayTempleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(OP_BraketMatch_Left);
				setState(206);
				match(T__1);
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						templePart();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(213);
				templeEnd();
				setState(214);
				match(T__1);
				setState(215);
				match(OP_BraketMatch_Right);
				}
				break;
			case 3:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(OP_BraketMatch_Left);
				setState(218);
				match(OP_BraketMatch_Right);
				}
				break;
			case 4:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(OP_BraketMatch_Left);
				setState(220);
				match(T__1);
				setState(221);
				match(T__1);
				setState(222);
				match(OP_BraketMatch_Right);
				}
				break;
			case 5:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(OP_BraketMatch_Left);
				setState(224);
				match(OP_Or);
				setState(225);
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
		enterRule(_localctx, 44, RULE_decoratorExpr);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DecoratorCastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(Decorator_Caster);
				setState(229);
				match(OP_Braket_Left);
				setState(230);
				typeExpr();
				setState(231);
				match(KEY_Cast);
				setState(232);
				typeExpr();
				setState(233);
				match(OP_Braket_Right);
				}
				break;
			case 2:
				_localctx = new DecoratorOp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(Decorator_Operator);
				setState(236);
				match(OP_Braket_Left);
				setState(237);
				typeExpr();
				setState(238);
				operator_all();
				setState(239);
				typeExpr();
				setState(240);
				match(OP_Set);
				setState(241);
				typeExpr();
				setState(242);
				match(OP_Braket_Right);
				}
				break;
			case 3:
				_localctx = new DecoratorOp1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(Decorator_Operator);
				setState(245);
				match(OP_Braket_Left);
				setState(246);
				operator1();
				setState(247);
				typeExpr();
				setState(248);
				match(OP_Set);
				setState(249);
				typeExpr();
				setState(250);
				match(OP_Braket_Right);
				}
				break;
			case 4:
				_localctx = new DecoratorOpEndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(Decorator_Operator);
				setState(253);
				match(OP_Braket_Left);
				setState(254);
				typeExpr();
				setState(255);
				operatorEnd();
				setState(256);
				match(OP_Set);
				setState(257);
				typeExpr();
				setState(258);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_calcExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new C1ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(263);
				operator1();
				setState(264);
				calcExpr(15);
				}
				break;
			case 2:
				{
				_localctx = new C2ExprBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(OP_Braket_Left);
				setState(267);
				calcExpr(0);
				setState(268);
				operator_all();
				setState(269);
				calcExpr(0);
				setState(270);
				match(OP_Braket_Right);
				}
				break;
			case 3:
				{
				_localctx = new LExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DEC:
				case BOOL:
				case STRING:
					{
					setState(272);
					literal();
					}
					break;
				case ID:
					{
					setState(273);
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
				setState(276);
				templeExpr();
				}
				break;
			case 5:
				{
				_localctx = new LBExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(OP_Braket_Left);
				setState(280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DEC:
				case BOOL:
				case STRING:
					{
					setState(278);
					literal();
					}
					break;
				case ID:
					{
					setState(279);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282);
				match(OP_Braket_Right);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(285);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(286);
						operator2_p5();
						setState(287);
						calcExpr(10);
						}
						break;
					case 2:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(289);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(290);
						operator2_p4();
						setState(291);
						calcExpr(9);
						}
						break;
					case 3:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						operator2_p3();
						setState(295);
						calcExpr(7);
						}
						break;
					case 4:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(297);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(298);
						operator2_p2();
						setState(299);
						calcExpr(7);
						}
						break;
					case 5:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(302);
						operator2_p1();
						setState(303);
						calcExpr(6);
						}
						break;
					case 6:
						{
						_localctx = new CastExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(305);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(306);
						match(KEY_Cast);
						setState(307);
						typeExpr();
						setState(308);
						match(KEY_Type);
						}
						break;
					case 7:
						{
						_localctx = new IExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(310);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(311);
						match(OP_Call);
						setState(312);
						match(OP_Braket_Left);
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
							{
							setState(313);
							calcExpr(0);
							}
						}

						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==OP_Split) {
							{
							{
							setState(316);
							match(OP_Split);
							setState(317);
							calcExpr(0);
							}
							}
							setState(322);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(323);
						match(OP_Braket_Right);
						}
						break;
					case 8:
						{
						_localctx = new GCExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(324);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(325);
						match(OP_Call);
						setState(326);
						match(OP_BraketCall_Left);
						setState(327);
						calcExpr(0);
						setState(328);
						match(OP_BraketCall_Right);
						}
						break;
					case 9:
						{
						_localctx = new GDExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(330);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(331);
						match(OP_Call);
						setState(332);
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
						setState(333);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(334);
						operatorEnd();
						}
						break;
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 48, RULE_argPartExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(341);
			typeExpr();
			setState(342);
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
		enterRule(_localctx, 50, RULE_argEndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ID);
			setState(345);
			typeExpr();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(346);
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
		enterRule(_localctx, 52, RULE_returnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(KEY_Return);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				setState(350);
				calcExpr(0);
				}
			}

			setState(353);
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
		enterRule(_localctx, 54, RULE_functionExpr);
		int _la;
		try {
			int _alt;
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new FunRAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(355);
					decoratorExpr();
					}
				}

				setState(358);
				match(KEY_Function);
				setState(359);
				match(ID);
				setState(360);
				match(OP_BraketType_Left);
				setState(363);
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
					setState(361);
					type_basic();
					}
					break;
				case ID:
					{
					setState(362);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				match(OP_BraketType_Right);
				setState(366);
				match(OP_Braket_Left);
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						argPartExpr();
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(373);
				argEndExpr();
				setState(374);
				match(OP_Braket_Right);
				setState(375);
				match(OP_BraketMatch_Left);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(376);
						expr();
						}
						break;
					case 2:
						{
						setState(377);
						returnExpr();
						}
						break;
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(OP_BraketMatch_Right);
				}
				break;
			case 2:
				_localctx = new FunAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(385);
					decoratorExpr();
					}
				}

				setState(388);
				match(KEY_Function);
				setState(389);
				match(ID);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(390);
					match(OP_BraketType_Left);
					setState(391);
					match(KEY_Null);
					setState(392);
					match(OP_BraketType_Right);
					}
				}

				setState(395);
				match(OP_Braket_Left);
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(396);
						argPartExpr();
						}
						} 
					}
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(402);
				argEndExpr();
				setState(403);
				match(OP_Braket_Right);
				setState(404);
				match(OP_BraketMatch_Left);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(407);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(405);
						expr();
						}
						break;
					case 2:
						{
						setState(406);
						returnExpr();
						}
						break;
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(OP_BraketMatch_Right);
				}
				break;
			case 3:
				_localctx = new FunRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(414);
					decoratorExpr();
					}
				}

				setState(417);
				match(KEY_Function);
				setState(418);
				match(ID);
				setState(419);
				match(OP_BraketType_Left);
				setState(422);
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
					setState(420);
					type_basic();
					}
					break;
				case ID:
					{
					setState(421);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(424);
				match(OP_BraketType_Right);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Braket_Left) {
					{
					setState(425);
					match(OP_Braket_Left);
					setState(426);
					match(OP_Braket_Right);
					}
				}

				setState(429);
				match(OP_BraketMatch_Left);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(430);
						expr();
						}
						break;
					case 2:
						{
						setState(431);
						returnExpr();
						}
						break;
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(OP_BraketMatch_Right);
				}
				break;
			case 4:
				_localctx = new FunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(438);
					decoratorExpr();
					}
				}

				setState(441);
				match(KEY_Function);
				setState(442);
				match(ID);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(443);
					match(OP_BraketType_Left);
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KEY_Null) {
						{
						setState(444);
						match(KEY_Null);
						}
					}

					setState(447);
					match(OP_BraketType_Right);
					}
				}

				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Braket_Left) {
					{
					setState(450);
					match(OP_Braket_Left);
					setState(451);
					match(OP_Braket_Right);
					}
				}

				setState(454);
				match(OP_BraketMatch_Left);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(455);
						expr();
						}
						break;
					case 2:
						{
						setState(456);
						returnExpr();
						}
						break;
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
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
		enterRule(_localctx, 56, RULE_ifbodyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(OP_Braket_Left);
			setState(466);
			calcExpr(0);
			setState(467);
			match(OP_Braket_Right);
			setState(468);
			match(OP_BraketMatch_Left);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				{
				setState(469);
				expr();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		enterRule(_localctx, 58, RULE_ifbodyEndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Braket_Left) {
				{
				setState(477);
				match(OP_Braket_Left);
				setState(478);
				match(OP_Braket_Right);
				}
			}

			setState(481);
			match(OP_BraketMatch_Left);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				{
				setState(482);
				expr();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
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
		enterRule(_localctx, 60, RULE_ifelseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(KEY_If);
			setState(491);
			ifbodyExpr();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY_Elif) {
				{
				{
				setState(492);
				match(KEY_Elif);
				setState(493);
				ifbodyExpr();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_Else) {
				{
				setState(499);
				match(KEY_Else);
				setState(500);
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
		enterRule(_localctx, 62, RULE_whileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(KEY_Loop);
			setState(504);
			match(OP_Braket_Left);
			setState(505);
			calcExpr(0);
			setState(506);
			match(OP_Braket_Right);
			setState(507);
			match(OP_BraketMatch_Left);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (OP_Plus - 11)) | (1L << (OP_Minus - 11)) | (1L << (OP_Not - 11)) | (1L << (OP_Braket_Left - 11)) | (1L << (OP_BraketMatch_Left - 11)) | (1L << (KEY_Var - 11)) | (1L << (KEY_Const - 11)) | (1L << (KEY_Return - 11)) | (1L << (KEY_Break - 11)) | (1L << (KEY_Continue - 11)) | (1L << (KEY_Loop - 11)) | (1L << (KEY_If - 11)) | (1L << (INT - 11)) | (1L << (DEC - 11)) | (1L << (BOOL - 11)) | (1L << (STRING - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				{
				setState(508);
				expr();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
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
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (INT - 62)) | (1L << (DEC - 62)) | (1L << (BOOL - 62)) | (1L << (STRING - 62)))) != 0)) ) {
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
		case 23:
			return calcExpr_sempred((CalcExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean calcExpr_sempred(CalcExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0209\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\nd\n\n\3\13\3\13\3\13\3\13\5\13j\n\13\5\13l\n\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0098\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00ae\n\23\f\23\16\23\u00b1\13\23\3\23\3\23\3\23"+
		"\5\23\u00b6\n\23\3\24\3\24\5\24\u00ba\n\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\5\26\u00c4\n\26\3\27\3\27\7\27\u00c8\n\27\f\27\16\27\u00cb"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00d3\n\27\f\27\16\27\u00d6"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00e5\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0107\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0115\n\31\3\31\3\31\3\31"+
		"\3\31\5\31\u011b\n\31\3\31\5\31\u011e\n\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u013d\n\31\3\31"+
		"\3\31\7\31\u0141\n\31\f\31\16\31\u0144\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0152\n\31\f\31\16\31\u0155\13"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u015e\n\33\3\34\3\34\5\34"+
		"\u0162\n\34\3\34\3\34\3\35\5\35\u0167\n\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u016e\n\35\3\35\3\35\3\35\7\35\u0173\n\35\f\35\16\35\u0176\13\35\3"+
		"\35\3\35\3\35\3\35\3\35\7\35\u017d\n\35\f\35\16\35\u0180\13\35\3\35\3"+
		"\35\3\35\5\35\u0185\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u018c\n\35\3\35"+
		"\3\35\7\35\u0190\n\35\f\35\16\35\u0193\13\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u019a\n\35\f\35\16\35\u019d\13\35\3\35\3\35\3\35\5\35\u01a2\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u01a9\n\35\3\35\3\35\3\35\5\35\u01ae\n"+
		"\35\3\35\3\35\3\35\7\35\u01b3\n\35\f\35\16\35\u01b6\13\35\3\35\3\35\5"+
		"\35\u01ba\n\35\3\35\3\35\3\35\3\35\5\35\u01c0\n\35\3\35\5\35\u01c3\n\35"+
		"\3\35\3\35\5\35\u01c7\n\35\3\35\3\35\3\35\7\35\u01cc\n\35\f\35\16\35\u01cf"+
		"\13\35\3\35\5\35\u01d2\n\35\3\36\3\36\3\36\3\36\3\36\7\36\u01d9\n\36\f"+
		"\36\16\36\u01dc\13\36\3\36\3\36\3\37\3\37\5\37\u01e2\n\37\3\37\3\37\7"+
		"\37\u01e6\n\37\f\37\16\37\u01e9\13\37\3\37\3\37\3 \3 \3 \3 \7 \u01f1\n"+
		" \f \16 \u01f4\13 \3 \3 \5 \u01f8\n \3!\3!\3!\3!\3!\3!\7!\u0200\n!\f!"+
		"\16!\u0203\13!\3!\3!\3\"\3\"\3\"\2\3\60#\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\13\3\3\3\3\4\2\r\16\30\30\3\2\22"+
		"\27\3\2\r\16\3\2\17\21\3\2\31\32\3\2\65?\4\2@@II\4\2@@EG\2\u023a\2K\3"+
		"\2\2\2\4P\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16Z\3\2"+
		"\2\2\20\\\3\2\2\2\22c\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30\u0080\3\2\2\2"+
		"\32\u0082\3\2\2\2\34\u0086\3\2\2\2\36\u008c\3\2\2\2 \u0090\3\2\2\2\"\u0094"+
		"\3\2\2\2$\u00b5\3\2\2\2&\u00b9\3\2\2\2(\u00be\3\2\2\2*\u00c1\3\2\2\2,"+
		"\u00e4\3\2\2\2.\u0106\3\2\2\2\60\u011d\3\2\2\2\62\u0156\3\2\2\2\64\u015a"+
		"\3\2\2\2\66\u015f\3\2\2\28\u01d1\3\2\2\2:\u01d3\3\2\2\2<\u01e1\3\2\2\2"+
		">\u01ec\3\2\2\2@\u01f9\3\2\2\2B\u0206\3\2\2\2DJ\5\30\r\2EJ\58\35\2FG\5"+
		"\36\20\2GH\7\36\2\2HJ\3\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\t\2\2\2O\3\3\2\2\2PQ\t\3\2"+
		"\2Q\5\3\2\2\2RS\t\4\2\2S\7\3\2\2\2TU\t\5\2\2U\t\3\2\2\2VW\t\6\2\2W\13"+
		"\3\2\2\2XY\7\f\2\2Y\r\3\2\2\2Z[\t\7\2\2[\17\3\2\2\2\\]\7\37\2\2]\21\3"+
		"\2\2\2^d\5\6\4\2_d\5\b\5\2`d\5\n\6\2ad\5\f\7\2bd\5\16\b\2c^\3\2\2\2c_"+
		"\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\23\3\2\2\2el\7/\2\2fl\7.\2\2g"+
		"i\7-\2\2hj\5\60\31\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2ke\3\2\2\2kf\3\2\2\2"+
		"kg\3\2\2\2l\25\3\2\2\2mn\t\b\2\2n\27\3\2\2\2op\5\32\16\2pq\7\36\2\2q\u0081"+
		"\3\2\2\2rs\5\34\17\2st\7\36\2\2t\u0081\3\2\2\2uv\5&\24\2vw\7\36\2\2w\u0081"+
		"\3\2\2\2xy\5\60\31\2yz\7\36\2\2z\u0081\3\2\2\2{\u0081\5> \2|\u0081\5@"+
		"!\2}~\5\24\13\2~\177\7\36\2\2\177\u0081\3\2\2\2\u0080o\3\2\2\2\u0080r"+
		"\3\2\2\2\u0080u\3\2\2\2\u0080x\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\31\3\2\2\2\u0082\u0083\7)\2\2\u0083\u0084\7I\2\2\u0084"+
		"\u0085\5$\23\2\u0085\33\3\2\2\2\u0086\u0087\7*\2\2\u0087\u0088\7I\2\2"+
		"\u0088\u0089\5$\23\2\u0089\u008a\7\35\2\2\u008a\u008b\5\60\31\2\u008b"+
		"\35\3\2\2\2\u008c\u008d\7+\2\2\u008d\u008e\7I\2\2\u008e\u008f\5$\23\2"+
		"\u008f\37\3\2\2\2\u0090\u0091\7I\2\2\u0091\u0092\5$\23\2\u0092\u0093\7"+
		"\34\2\2\u0093!\3\2\2\2\u0094\u0095\7I\2\2\u0095\u0097\5$\23\2\u0096\u0098"+
		"\7\34\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098#\3\2\2\2\u0099"+
		"\u009a\7$\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7%\2\2\u009c\u00b6\3\2"+
		"\2\2\u009d\u009e\7$\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\7\17\2\2\u00a0"+
		"\u00a1\7@\2\2\u00a1\u00a2\7%\2\2\u00a2\u00b6\3\2\2\2\u00a3\u00a4\7$\2"+
		"\2\u00a4\u00a5\7I\2\2\u00a5\u00b6\7%\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a8"+
		"\7I\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\7@\2\2\u00aa\u00b6\7%\2\2\u00ab"+
		"\u00af\7$\2\2\u00ac\u00ae\5 \21\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\7%\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u0099\3\2\2\2\u00b5\u009d\3\2\2\2\u00b5\u00a3\3\2\2\2\u00b5"+
		"\u00a6\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00ba\7I\2\2\u00b8"+
		"\u00ba\5\32\16\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\5\60\31\2\u00bd\'\3\2\2\2\u00be"+
		"\u00bf\5\60\31\2\u00bf\u00c0\7\34\2\2\u00c0)\3\2\2\2\u00c1\u00c3\5\60"+
		"\31\2\u00c2\u00c4\7\34\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"+\3\2\2\2\u00c5\u00c9\7&\2\2\u00c6\u00c8\5(\25\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce\7\'\2\2\u00ce"+
		"\u00e5\3\2\2\2\u00cf\u00d0\7&\2\2\u00d0\u00d4\7\4\2\2\u00d1\u00d3\5(\25"+
		"\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5*\26\2\u00d8"+
		"\u00d9\7\4\2\2\u00d9\u00da\7\'\2\2\u00da\u00e5\3\2\2\2\u00db\u00dc\7&"+
		"\2\2\u00dc\u00e5\7\'\2\2\u00dd\u00de\7&\2\2\u00de\u00df\7\4\2\2\u00df"+
		"\u00e0\7\4\2\2\u00e0\u00e5\7\'\2\2\u00e1\u00e2\7&\2\2\u00e2\u00e3\7\32"+
		"\2\2\u00e3\u00e5\7\'\2\2\u00e4\u00c5\3\2\2\2\u00e4\u00cf\3\2\2\2\u00e4"+
		"\u00db\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5-\3\2\2\2"+
		"\u00e6\u00e7\7\n\2\2\u00e7\u00e8\7 \2\2\u00e8\u00e9\5$\23\2\u00e9\u00ea"+
		"\7\64\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7!\2\2\u00ec\u0107\3\2\2\2\u00ed"+
		"\u00ee\7\13\2\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\5$\23\2\u00f0\u00f1\5\22"+
		"\n\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4\5$\23\2\u00f4"+
		"\u00f5\7!\2\2\u00f5\u0107\3\2\2\2\u00f6\u00f7\7\13\2\2\u00f7\u00f8\7 "+
		"\2\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa\5$\23\2\u00fa\u00fb\7\35\2\2\u00fb"+
		"\u00fc\5$\23\2\u00fc\u00fd\7!\2\2\u00fd\u0107\3\2\2\2\u00fe\u00ff\7\13"+
		"\2\2\u00ff\u0100\7 \2\2\u0100\u0101\5$\23\2\u0101\u0102\5\20\t\2\u0102"+
		"\u0103\7\35\2\2\u0103\u0104\5$\23\2\u0104\u0105\7!\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u00e6\3\2\2\2\u0106\u00ed\3\2\2\2\u0106\u00f6\3\2\2\2\u0106"+
		"\u00fe\3\2\2\2\u0107/\3\2\2\2\u0108\u0109\b\31\1\2\u0109\u010a\5\4\3\2"+
		"\u010a\u010b\5\60\31\21\u010b\u011e\3\2\2\2\u010c\u010d\7 \2\2\u010d\u010e"+
		"\5\60\31\2\u010e\u010f\5\22\n\2\u010f\u0110\5\60\31\2\u0110\u0111\7!\2"+
		"\2\u0111\u011e\3\2\2\2\u0112\u0115\5B\"\2\u0113\u0115\7I\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u011e\3\2\2\2\u0116\u011e\5,\27\2\u0117"+
		"\u011a\7 \2\2\u0118\u011b\5B\"\2\u0119\u011b\7I\2\2\u011a\u0118\3\2\2"+
		"\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\7!\2\2\u011d\u0108"+
		"\3\2\2\2\u011d\u010c\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0116\3\2\2\2\u011d"+
		"\u0117\3\2\2\2\u011e\u0153\3\2\2\2\u011f\u0120\f\13\2\2\u0120\u0121\5"+
		"\16\b\2\u0121\u0122\5\60\31\f\u0122\u0152\3\2\2\2\u0123\u0124\f\n\2\2"+
		"\u0124\u0125\5\f\7\2\u0125\u0126\5\60\31\13\u0126\u0152\3\2\2\2\u0127"+
		"\u0128\f\t\2\2\u0128\u0129\5\n\6\2\u0129\u012a\5\60\31\t\u012a\u0152\3"+
		"\2\2\2\u012b\u012c\f\b\2\2\u012c\u012d\5\b\5\2\u012d\u012e\5\60\31\t\u012e"+
		"\u0152\3\2\2\2\u012f\u0130\f\7\2\2\u0130\u0131\5\6\4\2\u0131\u0132\5\60"+
		"\31\b\u0132\u0152\3\2\2\2\u0133\u0134\f\17\2\2\u0134\u0135\7\64\2\2\u0135"+
		"\u0136\5$\23\2\u0136\u0137\7+\2\2\u0137\u0152\3\2\2\2\u0138\u0139\f\16"+
		"\2\2\u0139\u013a\7\33\2\2\u013a\u013c\7 \2\2\u013b\u013d\5\60\31\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142\3\2\2\2\u013e\u013f\7\34"+
		"\2\2\u013f\u0141\5\60\31\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0152\7!\2\2\u0146\u0147\f\r\2\2\u0147\u0148\7\33\2\2\u0148"+
		"\u0149\7\"\2\2\u0149\u014a\5\60\31\2\u014a\u014b\7#\2\2\u014b\u0152\3"+
		"\2\2\2\u014c\u014d\f\f\2\2\u014d\u014e\7\33\2\2\u014e\u0152\t\t\2\2\u014f"+
		"\u0150\f\3\2\2\u0150\u0152\5\20\t\2\u0151\u011f\3\2\2\2\u0151\u0123\3"+
		"\2\2\2\u0151\u0127\3\2\2\2\u0151\u012b\3\2\2\2\u0151\u012f\3\2\2\2\u0151"+
		"\u0133\3\2\2\2\u0151\u0138\3\2\2\2\u0151\u0146\3\2\2\2\u0151\u014c\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\61\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7I\2\2"+
		"\u0157\u0158\5$\23\2\u0158\u0159\7\34\2\2\u0159\63\3\2\2\2\u015a\u015b"+
		"\7I\2\2\u015b\u015d\5$\23\2\u015c\u015e\7\34\2\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\65\3\2\2\2\u015f\u0161\7-\2\2\u0160\u0162\5\60\31"+
		"\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\7\36\2\2\u0164\67\3\2\2\2\u0165\u0167\5.\30\2\u0166\u0165\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7,\2\2\u0169\u016a\7I\2"+
		"\2\u016a\u016d\7$\2\2\u016b\u016e\5\26\f\2\u016c\u016e\7I\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7%\2\2\u0170"+
		"\u0174\7 \2\2\u0171\u0173\5\62\32\2\u0172\u0171\3\2\2\2\u0173\u0176\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\5\64\33\2\u0178\u0179\7!\2\2\u0179\u017e\7"+
		"&\2\2\u017a\u017d\5\30\r\2\u017b\u017d\5\66\34\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\'\2\2\u0182"+
		"\u01d2\3\2\2\2\u0183\u0185\5.\30\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7,\2\2\u0187\u018b\7I\2\2\u0188\u0189"+
		"\7$\2\2\u0189\u018a\7(\2\2\u018a\u018c\7%\2\2\u018b\u0188\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0191\7 \2\2\u018e\u0190\5\62"+
		"\32\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5\64"+
		"\33\2\u0195\u0196\7!\2\2\u0196\u019b\7&\2\2\u0197\u019a\5\30\r\2\u0198"+
		"\u019a\5\66\34\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3"+
		"\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7\'\2\2\u019f\u01d2\3\2\2\2\u01a0\u01a2\5."+
		"\30\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\7,\2\2\u01a4\u01a5\7I\2\2\u01a5\u01a8\7$\2\2\u01a6\u01a9\5\26\f"+
		"\2\u01a7\u01a9\7I\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ad\7%\2\2\u01ab\u01ac\7 \2\2\u01ac\u01ae\7!\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b4\7&"+
		"\2\2\u01b0\u01b3\5\30\r\2\u01b1\u01b3\5\66\34\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01d2\7\'\2\2\u01b8"+
		"\u01ba\5.\30\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\7,\2\2\u01bc\u01c2\7I\2\2\u01bd\u01bf\7$\2\2\u01be\u01c0"+
		"\7(\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\7%\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2"+
		"\2\2\u01c4\u01c5\7 \2\2\u01c5\u01c7\7!\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cd\7&\2\2\u01c9\u01cc\5\30\r\2\u01ca"+
		"\u01cc\5\66\34\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3"+
		"\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d2\7\'\2\2\u01d1\u0166\3\2\2\2\u01d1\u0184\3\2"+
		"\2\2\u01d1\u01a1\3\2\2\2\u01d1\u01b9\3\2\2\2\u01d29\3\2\2\2\u01d3\u01d4"+
		"\7 \2\2\u01d4\u01d5\5\60\31\2\u01d5\u01d6\7!\2\2\u01d6\u01da\7&\2\2\u01d7"+
		"\u01d9\5\30\r\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3"+
		"\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01de\7\'\2\2\u01de;\3\2\2\2\u01df\u01e0\7 \2\2\u01e0\u01e2\7!\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e7\7&"+
		"\2\2\u01e4\u01e6\5\30\r\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01ea\u01eb\7\'\2\2\u01eb=\3\2\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01f2"+
		"\5:\36\2\u01ee\u01ef\7\62\2\2\u01ef\u01f1\5:\36\2\u01f0\u01ee\3\2\2\2"+
		"\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f7"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7\63\2\2\u01f6\u01f8\5<\37\2"+
		"\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8?\3\2\2\2\u01f9\u01fa\7"+
		"\60\2\2\u01fa\u01fb\7 \2\2\u01fb\u01fc\5\60\31\2\u01fc\u01fd\7!\2\2\u01fd"+
		"\u0201\7&\2\2\u01fe\u0200\5\30\r\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0205\7\'\2\2\u0205A\3\2\2\2\u0206\u0207\t\n\2\2"+
		"\u0207C\3\2\2\2\66IKcik\u0080\u0097\u00af\u00b5\u00b9\u00c3\u00c9\u00d4"+
		"\u00e4\u0106\u0114\u011a\u011d\u013c\u0142\u0151\u0153\u015d\u0161\u0166"+
		"\u016d\u0174\u017c\u017e\u0184\u018b\u0191\u0199\u019b\u01a1\u01a8\u01ad"+
		"\u01b2\u01b4\u01b9\u01bf\u01c2\u01c6\u01cb\u01cd\u01d1\u01da\u01e1\u01e7"+
		"\u01f2\u01f7\u0201";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}