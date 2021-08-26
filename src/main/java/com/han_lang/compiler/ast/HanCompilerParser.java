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
		T__0=1, THROWAWAY=2, COMMENT=3, ONELINE_COMMENT=4, MUTILINE_COMMENT=5, 
		WS=6, OP_Power=7, OP_Plus=8, OP_Minus=9, OP_Mutiply=10, OP_Divide=11, 
		OP_Remain=12, OP_Greater=13, OP_GreaterEqual=14, OP_Lower=15, OP_LowerEqual=16, 
		OP_NotEqual=17, OP_Equal=18, OP_Not=19, OP_And=20, OP_Or=21, OP_Call=22, 
		OP_Split=23, OP_Set=24, OP_End=25, OP_Braket_Left=26, OP_Braket_Right=27, 
		OP_BraketCall_Left=28, OP_BraketCall_Right=29, OP_BraketType_Left=30, 
		OP_BraketType_Right=31, OP_BraketMatch_Left=32, OP_BraketMatch_Right=33, 
		KEY_Null=34, KEY_Var=35, KEY_Const=36, KEY_Type=37, KEY_Function=38, KEY_Return=39, 
		KEY_Break=40, KEY_Continue=41, KEY_Loop=42, KEY_If=43, KEY_Elif=44, KEY_Else=45, 
		KEY_Cast=46, Decorator_Caster=47, Decorator_Operator=48, Type_Byte=49, 
		Type_Int=50, Type_LongInt=51, Type_ShortInt=52, Type_LongLongInt=53, Type_Boolean=54, 
		Type_ShortFloat=55, Type_Float=56, Type_LongFloat=57, Type_LongLongFloat=58, 
		Type_String=59, INT=60, INT10=61, INT8=62, INT16=63, INT2=64, DEC=65, 
		BOOL=66, STRING=67, ESCAPE_CHARS=68, ID=69, IDStart=70, IDPart=71;
	public static final int
		RULE_program = 0, RULE_operator1 = 1, RULE_operator2_p1 = 2, RULE_operator2_p2 = 3, 
		RULE_operator2_p3 = 4, RULE_operator2_p4 = 5, RULE_operator2_p5 = 6, RULE_operator_all = 7, 
		RULE_flowExpr = 8, RULE_type_basic = 9, RULE_expr = 10, RULE_varExpr = 11, 
		RULE_constAndSetExpr = 12, RULE_newtypeExpr = 13, RULE_typeEntryPart = 14, 
		RULE_typeEntryEnd = 15, RULE_typeExpr = 16, RULE_setExpr = 17, RULE_templeEntryPart = 18, 
		RULE_templeEntryEnd = 19, RULE_templeArrayPart = 20, RULE_templeArrayEnd = 21, 
		RULE_templeExpr = 22, RULE_calcExpr = 23, RULE_decoratorExpr = 24, RULE_argPartExpr = 25, 
		RULE_argEndExpr = 26, RULE_returnExpr = 27, RULE_functionExpr = 28, RULE_ifbodyExpr = 29, 
		RULE_ifbodyEndExpr = 30, RULE_ifelseExpr = 31, RULE_whileExpr = 32, RULE_literal = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operator1", "operator2_p1", "operator2_p2", "operator2_p3", 
			"operator2_p4", "operator2_p5", "operator_all", "flowExpr", "type_basic", 
			"expr", "varExpr", "constAndSetExpr", "newtypeExpr", "typeEntryPart", 
			"typeEntryEnd", "typeExpr", "setExpr", "templeEntryPart", "templeEntryEnd", 
			"templeArrayPart", "templeArrayEnd", "templeExpr", "calcExpr", "decoratorExpr", 
			"argPartExpr", "argEndExpr", "returnExpr", "functionExpr", "ifbodyExpr", 
			"ifbodyEndExpr", "ifelseExpr", "whileExpr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<EOF>'", null, null, null, null, null, "'**'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", null, null, null, null, null, null, null, null, 
			null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
			"WS", "OP_Power", "OP_Plus", "OP_Minus", "OP_Mutiply", "OP_Divide", "OP_Remain", 
			"OP_Greater", "OP_GreaterEqual", "OP_Lower", "OP_LowerEqual", "OP_NotEqual", 
			"OP_Equal", "OP_Not", "OP_And", "OP_Or", "OP_Call", "OP_Split", "OP_Set", 
			"OP_End", "OP_Braket_Left", "OP_Braket_Right", "OP_BraketCall_Left", 
			"OP_BraketCall_Right", "OP_BraketType_Left", "OP_BraketType_Right", "OP_BraketMatch_Left", 
			"OP_BraketMatch_Right", "KEY_Null", "KEY_Var", "KEY_Const", "KEY_Type", 
			"KEY_Function", "KEY_Return", "KEY_Break", "KEY_Continue", "KEY_Loop", 
			"KEY_If", "KEY_Elif", "KEY_Else", "KEY_Cast", "Decorator_Caster", "Decorator_Operator", 
			"Type_Byte", "Type_Int", "Type_LongInt", "Type_ShortInt", "Type_LongLongInt", 
			"Type_Boolean", "Type_ShortFloat", "Type_Float", "Type_LongFloat", "Type_LongLongFloat", 
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
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Type - 8)) | (1L << (KEY_Function - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (Decorator_Caster - 8)) | (1L << (Decorator_Operator - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				setState(73);
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
					setState(68);
					expr();
					}
					break;
				case KEY_Function:
				case Decorator_Caster:
				case Decorator_Operator:
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
		enterRule(_localctx, 14, RULE_operator_all);
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
		enterRule(_localctx, 16, RULE_flowExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY_Return) | (1L << KEY_Break) | (1L << KEY_Continue))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_type_basic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new InnerVarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				varExpr();
				setState(104);
				match(OP_End);
				}
				break;
			case 2:
				_localctx = new InnerConstExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				constAndSetExpr();
				setState(107);
				match(OP_End);
				}
				break;
			case 3:
				_localctx = new InnerSetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				setExpr();
				setState(110);
				match(OP_End);
				}
				break;
			case 4:
				_localctx = new InnerCalcExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				calcExpr(0);
				setState(113);
				match(OP_End);
				}
				break;
			case 5:
				_localctx = new InnerIfElseExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				ifelseExpr();
				}
				break;
			case 6:
				_localctx = new InnerWhileExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				whileExpr();
				}
				break;
			case 7:
				_localctx = new InnerFlowExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				flowExpr();
				setState(118);
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
		enterRule(_localctx, 22, RULE_varExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(KEY_Var);
			setState(123);
			match(ID);
			setState(124);
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
		enterRule(_localctx, 24, RULE_constAndSetExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(KEY_Const);
			setState(127);
			match(ID);
			setState(128);
			typeExpr();
			setState(129);
			match(OP_Set);
			setState(130);
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
		enterRule(_localctx, 26, RULE_newtypeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(KEY_Type);
			setState(133);
			match(ID);
			setState(134);
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
		enterRule(_localctx, 28, RULE_typeEntryPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(137);
			typeExpr();
			setState(138);
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
		enterRule(_localctx, 30, RULE_typeEntryEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			typeExpr();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(142);
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
		enterRule(_localctx, 32, RULE_typeExpr);
		try {
			int _alt;
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new BasicTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(OP_BraketType_Left);
				setState(146);
				type_basic();
				setState(147);
				match(OP_BraketType_Right);
				}
				break;
			case 2:
				_localctx = new BasicArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(OP_BraketType_Left);
				setState(150);
				type_basic();
				setState(151);
				match(OP_Mutiply);
				setState(152);
				match(INT);
				setState(153);
				match(OP_BraketType_Right);
				}
				break;
			case 3:
				_localctx = new CustomTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(OP_BraketType_Left);
				setState(156);
				match(ID);
				setState(157);
				match(OP_BraketType_Right);
				}
				break;
			case 4:
				_localctx = new CustomArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(OP_BraketType_Left);
				setState(159);
				match(ID);
				setState(160);
				match(OP_Mutiply);
				setState(161);
				match(INT);
				setState(162);
				match(OP_BraketType_Right);
				}
				break;
			case 5:
				_localctx = new StructExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(OP_BraketType_Left);
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						typeEntryPart();
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(170);
				typeEntryEnd();
				setState(171);
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
		enterRule(_localctx, 34, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(175);
				match(ID);
				}
				break;
			case KEY_Var:
				{
				setState(176);
				varExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			match(OP_Set);
			setState(180);
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

	public static class TempleEntryPartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TempleEntryPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templeEntryPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTempleEntryPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTempleEntryPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTempleEntryPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempleEntryPartContext templeEntryPart() throws RecognitionException {
		TempleEntryPartContext _localctx = new TempleEntryPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_templeEntryPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(OP_Set);
			setState(184);
			calcExpr(0);
			setState(185);
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

	public static class TempleEntryEndContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HanCompilerParser.ID, 0); }
		public TerminalNode OP_Set() { return getToken(HanCompilerParser.OP_Set, 0); }
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TempleEntryEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templeEntryEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTempleEntryEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTempleEntryEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTempleEntryEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempleEntryEndContext templeEntryEnd() throws RecognitionException {
		TempleEntryEndContext _localctx = new TempleEntryEndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_templeEntryEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			match(OP_Set);
			setState(189);
			calcExpr(0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(190);
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

	public static class TempleArrayPartContext extends ParserRuleContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TempleArrayPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templeArrayPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTempleArrayPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTempleArrayPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTempleArrayPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempleArrayPartContext templeArrayPart() throws RecognitionException {
		TempleArrayPartContext _localctx = new TempleArrayPartContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_templeArrayPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			calcExpr(0);
			setState(194);
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

	public static class TempleArrayEndContext extends ParserRuleContext {
		public CalcExprContext calcExpr() {
			return getRuleContext(CalcExprContext.class,0);
		}
		public TerminalNode OP_Split() { return getToken(HanCompilerParser.OP_Split, 0); }
		public TempleArrayEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templeArrayEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterTempleArrayEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitTempleArrayEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitTempleArrayEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempleArrayEndContext templeArrayEnd() throws RecognitionException {
		TempleArrayEndContext _localctx = new TempleArrayEndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_templeArrayEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			calcExpr(0);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(197);
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
	public static class EmptyTempleContext extends TempleExprContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
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
	public static class EntryTempleContext extends TempleExprContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TempleEntryEndContext templeEntryEnd() {
			return getRuleContext(TempleEntryEndContext.class,0);
		}
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public List<TempleEntryPartContext> templeEntryPart() {
			return getRuleContexts(TempleEntryPartContext.class);
		}
		public TempleEntryPartContext templeEntryPart(int i) {
			return getRuleContext(TempleEntryPartContext.class,i);
		}
		public EntryTempleContext(TempleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).enterEntryTemple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HanCompilerListener ) ((HanCompilerListener)listener).exitEntryTemple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HanCompilerVisitor ) return ((HanCompilerVisitor<? extends T>)visitor).visitEntryTemple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTempleContext extends TempleExprContext {
		public TerminalNode OP_BraketMatch_Left() { return getToken(HanCompilerParser.OP_BraketMatch_Left, 0); }
		public TempleArrayEndContext templeArrayEnd() {
			return getRuleContext(TempleArrayEndContext.class,0);
		}
		public TerminalNode OP_BraketMatch_Right() { return getToken(HanCompilerParser.OP_BraketMatch_Right, 0); }
		public List<TempleArrayPartContext> templeArrayPart() {
			return getRuleContexts(TempleArrayPartContext.class);
		}
		public TempleArrayPartContext templeArrayPart(int i) {
			return getRuleContext(TempleArrayPartContext.class,i);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new EntryTempleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(OP_BraketMatch_Left);
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(201);
						templeEntryPart();
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(207);
				templeEntryEnd();
				setState(208);
				match(OP_BraketMatch_Right);
				}
				break;
			case 2:
				_localctx = new ArrayTempleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(OP_BraketMatch_Left);
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(211);
						templeArrayPart();
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(217);
				templeArrayEnd();
				setState(218);
				match(OP_BraketMatch_Right);
				}
				break;
			case 3:
				_localctx = new EmptyTempleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(OP_BraketMatch_Left);
				setState(221);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new C1ExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(225);
				operator1();
				setState(226);
				calcExpr(14);
				}
				break;
			case 2:
				{
				_localctx = new C2ExprBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(OP_Braket_Left);
				setState(229);
				calcExpr(0);
				setState(230);
				operator_all();
				setState(231);
				calcExpr(0);
				setState(232);
				match(OP_Braket_Right);
				}
				break;
			case 3:
				{
				_localctx = new LExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DEC:
				case BOOL:
				case STRING:
					{
					setState(234);
					literal();
					}
					break;
				case ID:
					{
					setState(235);
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
				setState(238);
				templeExpr();
				}
				break;
			case 5:
				{
				_localctx = new LBExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(OP_Braket_Left);
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case DEC:
				case BOOL:
				case STRING:
					{
					setState(240);
					literal();
					}
					break;
				case ID:
					{
					setState(241);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244);
				match(OP_Braket_Right);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(247);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(248);
						operator2_p5();
						setState(249);
						calcExpr(9);
						}
						break;
					case 2:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(251);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(252);
						operator2_p4();
						setState(253);
						calcExpr(8);
						}
						break;
					case 3:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(255);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(256);
						operator2_p3();
						setState(257);
						calcExpr(6);
						}
						break;
					case 4:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(259);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(260);
						operator2_p2();
						setState(261);
						calcExpr(6);
						}
						break;
					case 5:
						{
						_localctx = new C2ExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
						operator2_p1();
						setState(265);
						calcExpr(5);
						}
						break;
					case 6:
						{
						_localctx = new CastExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(267);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(268);
						match(KEY_Cast);
						setState(269);
						typeExpr();
						setState(270);
						match(KEY_Type);
						}
						break;
					case 7:
						{
						_localctx = new IExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(272);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(273);
						match(OP_Call);
						setState(274);
						match(OP_Braket_Left);
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
							{
							setState(275);
							calcExpr(0);
							}
						}

						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==OP_Split) {
							{
							{
							setState(278);
							match(OP_Split);
							setState(279);
							calcExpr(0);
							}
							}
							setState(284);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(285);
						match(OP_Braket_Right);
						}
						break;
					case 8:
						{
						_localctx = new GCExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(286);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(287);
						match(OP_Call);
						setState(288);
						match(OP_BraketCall_Left);
						setState(289);
						calcExpr(0);
						setState(290);
						match(OP_BraketCall_Right);
						}
						break;
					case 9:
						{
						_localctx = new GDExprContext(new CalcExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calcExpr);
						setState(292);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(293);
						match(OP_Call);
						setState(294);
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
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public TerminalNode OP_Equal() { return getToken(HanCompilerParser.OP_Equal, 0); }
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
		public TerminalNode OP_Equal() { return getToken(HanCompilerParser.OP_Equal, 0); }
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
		enterRule(_localctx, 48, RULE_decoratorExpr);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new DecoratorCastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(Decorator_Caster);
				setState(301);
				match(OP_Braket_Left);
				setState(302);
				typeExpr();
				setState(303);
				match(KEY_Cast);
				setState(304);
				typeExpr();
				setState(305);
				match(OP_Braket_Right);
				}
				break;
			case 2:
				_localctx = new DecoratorOp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(Decorator_Operator);
				setState(308);
				match(OP_Braket_Left);
				setState(309);
				typeExpr();
				setState(310);
				operator_all();
				setState(311);
				typeExpr();
				setState(312);
				match(OP_Equal);
				setState(313);
				typeExpr();
				setState(314);
				match(OP_Braket_Right);
				}
				break;
			case 3:
				_localctx = new DecoratorOp1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(Decorator_Operator);
				setState(317);
				match(OP_Braket_Left);
				setState(318);
				operator1();
				setState(319);
				typeExpr();
				setState(320);
				match(OP_Equal);
				setState(321);
				typeExpr();
				setState(322);
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
			setState(326);
			match(ID);
			setState(327);
			typeExpr();
			setState(328);
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
			setState(330);
			match(ID);
			setState(331);
			typeExpr();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Split) {
				{
				setState(332);
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
			setState(335);
			match(KEY_Return);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				setState(336);
				calcExpr(0);
				}
			}

			setState(339);
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
		public TerminalNode KEY_Null() { return getToken(HanCompilerParser.KEY_Null, 0); }
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
		public TerminalNode KEY_Null() { return getToken(HanCompilerParser.KEY_Null, 0); }
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
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new FunRAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(341);
					decoratorExpr();
					}
				}

				setState(344);
				match(KEY_Function);
				setState(345);
				match(ID);
				setState(346);
				match(OP_BraketType_Left);
				setState(351);
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
					setState(347);
					type_basic();
					setState(348);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==KEY_Null) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case ID:
					{
					setState(350);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353);
				match(OP_BraketType_Right);
				setState(354);
				match(OP_Braket_Left);
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						argPartExpr();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(361);
				argEndExpr();
				setState(362);
				match(OP_Braket_Right);
				setState(363);
				match(OP_BraketMatch_Left);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(364);
						expr();
						}
						break;
					case 2:
						{
						setState(365);
						returnExpr();
						}
						break;
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(OP_BraketMatch_Right);
				}
				break;
			case 2:
				_localctx = new FunAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(373);
					decoratorExpr();
					}
				}

				setState(376);
				match(KEY_Function);
				setState(377);
				match(ID);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(378);
					match(OP_BraketType_Left);
					setState(379);
					match(KEY_Null);
					setState(380);
					match(OP_BraketType_Right);
					}
				}

				setState(383);
				match(OP_Braket_Left);
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(384);
						argPartExpr();
						}
						} 
					}
					setState(389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(390);
				argEndExpr();
				setState(391);
				match(OP_Braket_Right);
				setState(392);
				match(OP_BraketMatch_Left);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					setState(395);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(393);
						expr();
						}
						break;
					case 2:
						{
						setState(394);
						returnExpr();
						}
						break;
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400);
				match(OP_BraketMatch_Right);
				}
				break;
			case 3:
				_localctx = new FunRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(402);
					decoratorExpr();
					}
				}

				setState(405);
				match(KEY_Function);
				setState(406);
				match(ID);
				setState(407);
				match(OP_BraketType_Left);
				setState(412);
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
					setState(408);
					type_basic();
					setState(409);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==KEY_Null) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case ID:
					{
					setState(411);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(414);
				match(OP_BraketType_Right);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Braket_Left) {
					{
					setState(415);
					match(OP_Braket_Left);
					setState(416);
					match(OP_Braket_Right);
					}
				}

				setState(419);
				match(OP_BraketMatch_Left);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(420);
						expr();
						}
						break;
					case 2:
						{
						setState(421);
						returnExpr();
						}
						break;
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(OP_BraketMatch_Right);
				}
				break;
			case 4:
				_localctx = new FunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decorator_Caster || _la==Decorator_Operator) {
					{
					setState(428);
					decoratorExpr();
					}
				}

				setState(431);
				match(KEY_Function);
				setState(432);
				match(ID);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BraketType_Left) {
					{
					setState(433);
					match(OP_BraketType_Left);
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KEY_Null) {
						{
						setState(434);
						match(KEY_Null);
						}
					}

					setState(437);
					match(OP_BraketType_Right);
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Braket_Left) {
					{
					setState(440);
					match(OP_Braket_Left);
					setState(441);
					match(OP_Braket_Right);
					}
				}

				setState(444);
				match(OP_BraketMatch_Left);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					setState(447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(445);
						expr();
						}
						break;
					case 2:
						{
						setState(446);
						returnExpr();
						}
						break;
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452);
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
			setState(455);
			match(OP_Braket_Left);
			setState(456);
			calcExpr(0);
			setState(457);
			match(OP_Braket_Right);
			setState(458);
			match(OP_BraketMatch_Left);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(459);
				expr();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
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
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_Braket_Left) {
				{
				setState(467);
				match(OP_Braket_Left);
				setState(468);
				match(OP_Braket_Right);
				}
			}

			setState(471);
			match(OP_BraketMatch_Left);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(472);
				expr();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
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
			setState(480);
			match(KEY_If);
			setState(481);
			ifbodyExpr();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY_Elif) {
				{
				{
				setState(482);
				match(KEY_Elif);
				setState(483);
				ifbodyExpr();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY_Else) {
				{
				setState(489);
				match(KEY_Else);
				setState(490);
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
			setState(493);
			match(KEY_Loop);
			setState(494);
			match(OP_Braket_Left);
			setState(495);
			calcExpr(0);
			setState(496);
			match(OP_Braket_Right);
			setState(497);
			match(OP_BraketMatch_Left);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (OP_Plus - 8)) | (1L << (OP_Minus - 8)) | (1L << (OP_Not - 8)) | (1L << (OP_Braket_Left - 8)) | (1L << (OP_BraketMatch_Left - 8)) | (1L << (KEY_Var - 8)) | (1L << (KEY_Const - 8)) | (1L << (KEY_Return - 8)) | (1L << (KEY_Break - 8)) | (1L << (KEY_Continue - 8)) | (1L << (KEY_Loop - 8)) | (1L << (KEY_If - 8)) | (1L << (INT - 8)) | (1L << (DEC - 8)) | (1L << (BOOL - 8)) | (1L << (STRING - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(498);
				expr();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
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
			setState(506);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (INT - 60)) | (1L << (DEC - 60)) | (1L << (BOOL - 60)) | (1L << (STRING - 60)))) != 0)) ) {
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\td\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u0092\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a8\n\22\f\22\16\22\u00ab"+
		"\13\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23\5\23\u00b4\n\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00c2\n\25"+
		"\3\26\3\26\3\26\3\27\3\27\5\27\u00c9\n\27\3\30\3\30\7\30\u00cd\n\30\f"+
		"\30\16\30\u00d0\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u00d7\n\30\f\30\16"+
		"\30\u00da\13\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e1\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ef\n\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00f5\n\31\3\31\5\31\u00f8\n\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0117\n\31"+
		"\3\31\3\31\7\31\u011b\n\31\f\31\16\31\u011e\13\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u012a\n\31\f\31\16\31\u012d\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0147\n\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0150\n\34\3\35\3\35\5\35\u0154\n"+
		"\35\3\35\3\35\3\36\5\36\u0159\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0162\n\36\3\36\3\36\3\36\7\36\u0167\n\36\f\36\16\36\u016a\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0171\n\36\f\36\16\36\u0174\13\36\3\36"+
		"\3\36\3\36\5\36\u0179\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u0180\n\36\3"+
		"\36\3\36\7\36\u0184\n\36\f\36\16\36\u0187\13\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u018e\n\36\f\36\16\36\u0191\13\36\3\36\3\36\3\36\5\36\u0196\n"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019f\n\36\3\36\3\36\3\36"+
		"\5\36\u01a4\n\36\3\36\3\36\3\36\7\36\u01a9\n\36\f\36\16\36\u01ac\13\36"+
		"\3\36\3\36\5\36\u01b0\n\36\3\36\3\36\3\36\3\36\5\36\u01b6\n\36\3\36\5"+
		"\36\u01b9\n\36\3\36\3\36\5\36\u01bd\n\36\3\36\3\36\3\36\7\36\u01c2\n\36"+
		"\f\36\16\36\u01c5\13\36\3\36\5\36\u01c8\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u01cf\n\37\f\37\16\37\u01d2\13\37\3\37\3\37\3 \3 \5 \u01d8\n \3"+
		" \3 \7 \u01dc\n \f \16 \u01df\13 \3 \3 \3!\3!\3!\3!\7!\u01e7\n!\f!\16"+
		"!\u01ea\13!\3!\3!\5!\u01ee\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01f6\n\"\f"+
		"\"\16\"\u01f9\13\"\3\"\3\"\3#\3#\3#\2\3\60$\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\r\3\3\3\3\4\2\n\13\25\25\3"+
		"\2\17\24\3\2\n\13\3\2\f\16\3\2\26\27\3\2)+\3\2\63=\4\2>>GG\3\2$$\4\2>"+
		">CE\2\u0229\2M\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fZ"+
		"\3\2\2\2\16\\\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26z\3\2\2\2"+
		"\30|\3\2\2\2\32\u0080\3\2\2\2\34\u0086\3\2\2\2\36\u008a\3\2\2\2 \u008e"+
		"\3\2\2\2\"\u00af\3\2\2\2$\u00b3\3\2\2\2&\u00b8\3\2\2\2(\u00bd\3\2\2\2"+
		"*\u00c3\3\2\2\2,\u00c6\3\2\2\2.\u00e0\3\2\2\2\60\u00f7\3\2\2\2\62\u0146"+
		"\3\2\2\2\64\u0148\3\2\2\2\66\u014c\3\2\2\28\u0151\3\2\2\2:\u01c7\3\2\2"+
		"\2<\u01c9\3\2\2\2>\u01d7\3\2\2\2@\u01e2\3\2\2\2B\u01ef\3\2\2\2D\u01fc"+
		"\3\2\2\2FL\5\26\f\2GL\5:\36\2HI\5\34\17\2IJ\7\33\2\2JL\3\2\2\2KF\3\2\2"+
		"\2KG\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\t\2\2\2Q\3\3\2\2\2RS\t\3\2\2S\5\3\2\2\2TU\t\4\2\2U\7\3\2\2\2VW\t"+
		"\5\2\2W\t\3\2\2\2XY\t\6\2\2Y\13\3\2\2\2Z[\7\t\2\2[\r\3\2\2\2\\]\t\7\2"+
		"\2]\17\3\2\2\2^d\5\6\4\2_d\5\b\5\2`d\5\n\6\2ad\5\f\7\2bd\5\16\b\2c^\3"+
		"\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\21\3\2\2\2ef\t\b\2\2f"+
		"\23\3\2\2\2gh\t\t\2\2h\25\3\2\2\2ij\5\30\r\2jk\7\33\2\2k{\3\2\2\2lm\5"+
		"\32\16\2mn\7\33\2\2n{\3\2\2\2op\5$\23\2pq\7\33\2\2q{\3\2\2\2rs\5\60\31"+
		"\2st\7\33\2\2t{\3\2\2\2u{\5@!\2v{\5B\"\2wx\5\22\n\2xy\7\33\2\2y{\3\2\2"+
		"\2zi\3\2\2\2zl\3\2\2\2zo\3\2\2\2zr\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2"+
		"\2{\27\3\2\2\2|}\7%\2\2}~\7G\2\2~\177\5\"\22\2\177\31\3\2\2\2\u0080\u0081"+
		"\7&\2\2\u0081\u0082\7G\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0085\5\60\31\2\u0085\33\3\2\2\2\u0086\u0087\7\'\2\2\u0087\u0088\7G\2"+
		"\2\u0088\u0089\5\"\22\2\u0089\35\3\2\2\2\u008a\u008b\7G\2\2\u008b\u008c"+
		"\5\"\22\2\u008c\u008d\7\31\2\2\u008d\37\3\2\2\2\u008e\u008f\7G\2\2\u008f"+
		"\u0091\5\"\22\2\u0090\u0092\7\31\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092!\3\2\2\2\u0093\u0094\7 \2\2\u0094\u0095\5\24\13\2\u0095\u0096"+
		"\7!\2\2\u0096\u00b0\3\2\2\2\u0097\u0098\7 \2\2\u0098\u0099\5\24\13\2\u0099"+
		"\u009a\7\f\2\2\u009a\u009b\7>\2\2\u009b\u009c\7!\2\2\u009c\u00b0\3\2\2"+
		"\2\u009d\u009e\7 \2\2\u009e\u009f\7G\2\2\u009f\u00b0\7!\2\2\u00a0\u00a1"+
		"\7 \2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7>\2\2\u00a4"+
		"\u00b0\7!\2\2\u00a5\u00a9\7 \2\2\u00a6\u00a8\5\36\20\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7!"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u0093\3\2\2\2\u00af\u0097\3\2\2\2\u00af"+
		"\u009d\3\2\2\2\u00af\u00a0\3\2\2\2\u00af\u00a5\3\2\2\2\u00b0#\3\2\2\2"+
		"\u00b1\u00b4\7G\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5\60\31"+
		"\2\u00b7%\3\2\2\2\u00b8\u00b9\7G\2\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb"+
		"\5\60\31\2\u00bb\u00bc\7\31\2\2\u00bc\'\3\2\2\2\u00bd\u00be\7G\2\2\u00be"+
		"\u00bf\7\32\2\2\u00bf\u00c1\5\60\31\2\u00c0\u00c2\7\31\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2)\3\2\2\2\u00c3\u00c4\5\60\31\2\u00c4"+
		"\u00c5\7\31\2\2\u00c5+\3\2\2\2\u00c6\u00c8\5\60\31\2\u00c7\u00c9\7\31"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9-\3\2\2\2\u00ca\u00ce"+
		"\7\"\2\2\u00cb\u00cd\5&\24\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d3\7#\2\2\u00d3\u00e1\3\2\2\2\u00d4"+
		"\u00d8\7\"\2\2\u00d5\u00d7\5*\26\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7#\2\2\u00dd\u00e1\3\2"+
		"\2\2\u00de\u00df\7\"\2\2\u00df\u00e1\7#\2\2\u00e0\u00ca\3\2\2\2\u00e0"+
		"\u00d4\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1/\3\2\2\2\u00e2\u00e3\b\31\1\2"+
		"\u00e3\u00e4\5\4\3\2\u00e4\u00e5\5\60\31\20\u00e5\u00f8\3\2\2\2\u00e6"+
		"\u00e7\7\34\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\5\20\t\2\u00e9\u00ea"+
		"\5\60\31\2\u00ea\u00eb\7\35\2\2\u00eb\u00f8\3\2\2\2\u00ec\u00ef\5D#\2"+
		"\u00ed\u00ef\7G\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f8"+
		"\3\2\2\2\u00f0\u00f8\5.\30\2\u00f1\u00f4\7\34\2\2\u00f2\u00f5\5D#\2\u00f3"+
		"\u00f5\7G\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\7\35\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8\u012b\3\2"+
		"\2\2\u00f9\u00fa\f\n\2\2\u00fa\u00fb\5\16\b\2\u00fb\u00fc\5\60\31\13\u00fc"+
		"\u012a\3\2\2\2\u00fd\u00fe\f\t\2\2\u00fe\u00ff\5\f\7\2\u00ff\u0100\5\60"+
		"\31\n\u0100\u012a\3\2\2\2\u0101\u0102\f\b\2\2\u0102\u0103\5\n\6\2\u0103"+
		"\u0104\5\60\31\b\u0104\u012a\3\2\2\2\u0105\u0106\f\7\2\2\u0106\u0107\5"+
		"\b\5\2\u0107\u0108\5\60\31\b\u0108\u012a\3\2\2\2\u0109\u010a\f\6\2\2\u010a"+
		"\u010b\5\6\4\2\u010b\u010c\5\60\31\7\u010c\u012a\3\2\2\2\u010d\u010e\f"+
		"\16\2\2\u010e\u010f\7\60\2\2\u010f\u0110\5\"\22\2\u0110\u0111\7\'\2\2"+
		"\u0111\u012a\3\2\2\2\u0112\u0113\f\r\2\2\u0113\u0114\7\30\2\2\u0114\u0116"+
		"\7\34\2\2\u0115\u0117\5\60\31\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2"+
		"\2\u0117\u011c\3\2\2\2\u0118\u0119\7\31\2\2\u0119\u011b\5\60\31\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u012a\7\35\2\2\u0120"+
		"\u0121\f\f\2\2\u0121\u0122\7\30\2\2\u0122\u0123\7\36\2\2\u0123\u0124\5"+
		"\60\31\2\u0124\u0125\7\37\2\2\u0125\u012a\3\2\2\2\u0126\u0127\f\13\2\2"+
		"\u0127\u0128\7\30\2\2\u0128\u012a\t\n\2\2\u0129\u00f9\3\2\2\2\u0129\u00fd"+
		"\3\2\2\2\u0129\u0101\3\2\2\2\u0129\u0105\3\2\2\2\u0129\u0109\3\2\2\2\u0129"+
		"\u010d\3\2\2\2\u0129\u0112\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0126\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\61\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7\34"+
		"\2\2\u0130\u0131\5\"\22\2\u0131\u0132\7\60\2\2\u0132\u0133\5\"\22\2\u0133"+
		"\u0134\7\35\2\2\u0134\u0147\3\2\2\2\u0135\u0136\7\62\2\2\u0136\u0137\7"+
		"\34\2\2\u0137\u0138\5\"\22\2\u0138\u0139\5\20\t\2\u0139\u013a\5\"\22\2"+
		"\u013a\u013b\7\24\2\2\u013b\u013c\5\"\22\2\u013c\u013d\7\35\2\2\u013d"+
		"\u0147\3\2\2\2\u013e\u013f\7\62\2\2\u013f\u0140\7\34\2\2\u0140\u0141\5"+
		"\4\3\2\u0141\u0142\5\"\22\2\u0142\u0143\7\24\2\2\u0143\u0144\5\"\22\2"+
		"\u0144\u0145\7\35\2\2\u0145\u0147\3\2\2\2\u0146\u012e\3\2\2\2\u0146\u0135"+
		"\3\2\2\2\u0146\u013e\3\2\2\2\u0147\63\3\2\2\2\u0148\u0149\7G\2\2\u0149"+
		"\u014a\5\"\22\2\u014a\u014b\7\31\2\2\u014b\65\3\2\2\2\u014c\u014d\7G\2"+
		"\2\u014d\u014f\5\"\22\2\u014e\u0150\7\31\2\2\u014f\u014e\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\67\3\2\2\2\u0151\u0153\7)\2\2\u0152\u0154\5\60\31"+
		"\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\7\33\2\2\u01569\3\2\2\2\u0157\u0159\5\62\32\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7(\2\2\u015b\u015c\7G\2"+
		"\2\u015c\u0161\7 \2\2\u015d\u015e\5\24\13\2\u015e\u015f\n\13\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u0162\7G\2\2\u0161\u015d\3\2\2\2\u0161\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7!\2\2\u0164\u0168\7\34\2\2\u0165"+
		"\u0167\5\64\33\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\5\66\34\2\u016c\u016d\7\35\2\2\u016d\u0172\7\"\2\2\u016e\u0171"+
		"\5\26\f\2\u016f\u0171\58\35\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2"+
		"\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7#\2\2\u0176\u01c8\3\2\2\2\u0177"+
		"\u0179\5\62\32\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3"+
		"\2\2\2\u017a\u017b\7(\2\2\u017b\u017f\7G\2\2\u017c\u017d\7 \2\2\u017d"+
		"\u017e\7$\2\2\u017e\u0180\7!\2\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181\u0185\7\34\2\2\u0182\u0184\5\64\33\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\5\66\34\2\u0189"+
		"\u018a\7\35\2\2\u018a\u018f\7\"\2\2\u018b\u018e\5\26\f\2\u018c\u018e\5"+
		"8\35\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0193\7#\2\2\u0193\u01c8\3\2\2\2\u0194\u0196\5\62\32\2\u0195"+
		"\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7("+
		"\2\2\u0198\u0199\7G\2\2\u0199\u019e\7 \2\2\u019a\u019b\5\24\13\2\u019b"+
		"\u019c\n\13\2\2\u019c\u019f\3\2\2\2\u019d\u019f\7G\2\2\u019e\u019a\3\2"+
		"\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\7!\2\2\u01a1"+
		"\u01a2\7\34\2\2\u01a2\u01a4\7\35\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\7\"\2\2\u01a6\u01a9\5\26\f\2\u01a7"+
		"\u01a9\58\35\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01c8\7#\2\2\u01ae\u01b0\5\62\32\2\u01af\u01ae\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7(\2\2\u01b2"+
		"\u01b8\7G\2\2\u01b3\u01b5\7 \2\2\u01b4\u01b6\7$\2\2\u01b5\u01b4\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\7!\2\2\u01b8\u01b3"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\7\34\2\2"+
		"\u01bb\u01bd\7\35\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01c3\7\"\2\2\u01bf\u01c2\5\26\f\2\u01c0\u01c2\58\35\2"+
		"\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c8\7#\2\2\u01c7\u0158\3\2\2\2\u01c7\u0178\3\2\2\2\u01c7\u0195\3\2"+
		"\2\2\u01c7\u01af\3\2\2\2\u01c8;\3\2\2\2\u01c9\u01ca\7\34\2\2\u01ca\u01cb"+
		"\5\60\31\2\u01cb\u01cc\7\35\2\2\u01cc\u01d0\7\"\2\2\u01cd\u01cf\5\26\f"+
		"\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7#\2\2\u01d4"+
		"=\3\2\2\2\u01d5\u01d6\7\34\2\2\u01d6\u01d8\7\35\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd\7\"\2\2\u01da\u01dc"+
		"\5\26\f\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2"+
		"\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1"+
		"\7#\2\2\u01e1?\3\2\2\2\u01e2\u01e3\7-\2\2\u01e3\u01e8\5<\37\2\u01e4\u01e5"+
		"\7.\2\2\u01e5\u01e7\5<\37\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01ec\7/\2\2\u01ec\u01ee\5> \2\u01ed\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01eeA\3\2\2\2\u01ef\u01f0\7,\2\2\u01f0\u01f1\7\34\2\2\u01f1"+
		"\u01f2\5\60\31\2\u01f2\u01f3\7\35\2\2\u01f3\u01f7\7\"\2\2\u01f4\u01f6"+
		"\5\26\f\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2"+
		"\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb"+
		"\7#\2\2\u01fbC\3\2\2\2\u01fc\u01fd\t\f\2\2\u01fdE\3\2\2\2\65KMcz\u0091"+
		"\u00a9\u00af\u00b3\u00c1\u00c8\u00ce\u00d8\u00e0\u00ee\u00f4\u00f7\u0116"+
		"\u011c\u0129\u012b\u0146\u014f\u0153\u0158\u0161\u0168\u0170\u0172\u0178"+
		"\u017f\u0185\u018d\u018f\u0195\u019e\u01a3\u01a8\u01aa\u01af\u01b5\u01b8"+
		"\u01bc\u01c1\u01c3\u01c7\u01d0\u01d7\u01dd\u01e8\u01ed\u01f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}