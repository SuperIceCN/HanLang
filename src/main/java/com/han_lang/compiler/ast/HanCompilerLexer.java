// Generated from D:/nukkit/HanLang/src/main/antlr\HanCompiler.g4 by ANTLR 4.9.1
package com.han_lang.compiler.ast;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HanCompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, THROWAWAY=2, COMMENT=3, ONELINE_COMMENT=4, MUTILINE_COMMENT=5, 
		WS=6, OP_Power=7, OP_Plus=8, OP_Minus=9, OP_Mutiply=10, OP_Divide=11, 
		OP_Remain=12, OP_Greater=13, OP_GreaterEqual=14, OP_Lower=15, OP_LowerEqual=16, 
		OP_NotEqual=17, OP_Equal=18, OP_Not=19, OP_And=20, OP_Or=21, OP_Call=22, 
		OP_Split=23, OP_Set=24, OP_End=25, OP_EndCall=26, OP_Braket_Left=27, OP_Braket_Right=28, 
		OP_BraketCall_Left=29, OP_BraketCall_Right=30, OP_BraketType_Left=31, 
		OP_BraketType_Right=32, OP_BraketMatch_Left=33, OP_BraketMatch_Right=34, 
		KEY_Null=35, KEY_Var=36, KEY_Const=37, KEY_Type=38, KEY_Function=39, KEY_Return=40, 
		KEY_Break=41, KEY_Continue=42, KEY_Loop=43, KEY_If=44, KEY_Elif=45, KEY_Else=46, 
		KEY_Cast=47, Decorator_Caster=48, Decorator_Operator=49, Type_Byte=50, 
		Type_Int=51, Type_LongInt=52, Type_ShortInt=53, Type_LongLongInt=54, Type_Boolean=55, 
		Type_ShortFloat=56, Type_Float=57, Type_LongFloat=58, Type_LongLongFloat=59, 
		Type_String=60, INT=61, INT10=62, INT8=63, INT16=64, INT2=65, DEC=66, 
		BOOL=67, STRING=68, ESCAPE_CHARS=69, ID=70, IDStart=71, IDPart=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
			"WS", "OP_Power", "OP_Plus", "OP_Minus", "OP_Mutiply", "OP_Divide", "OP_Remain", 
			"OP_Greater", "OP_GreaterEqual", "OP_Lower", "OP_LowerEqual", "OP_NotEqual", 
			"OP_Equal", "OP_Not", "OP_And", "OP_Or", "OP_Call", "OP_Split", "OP_Set", 
			"OP_End", "OP_EndCall", "OP_Braket_Left", "OP_Braket_Right", "OP_BraketCall_Left", 
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
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<EOF>'", null, null, null, null, null, "'**'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", null, null, null, null, null, null, null, null, 
			null, null, null, "'='", null, "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
			"WS", "OP_Power", "OP_Plus", "OP_Minus", "OP_Mutiply", "OP_Divide", "OP_Remain", 
			"OP_Greater", "OP_GreaterEqual", "OP_Lower", "OP_LowerEqual", "OP_NotEqual", 
			"OP_Equal", "OP_Not", "OP_And", "OP_Or", "OP_Call", "OP_Split", "OP_Set", 
			"OP_End", "OP_EndCall", "OP_Braket_Left", "OP_Braket_Right", "OP_BraketCall_Left", 
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


	    public static boolean inType = false;


	public HanCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HanCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24:
			OP_End_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			OP_BraketMatch_Left_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			OP_BraketMatch_Right_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			KEY_Var_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			KEY_Const_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			KEY_Type_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			KEY_Function_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			KEY_Cast_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			Decorator_Caster_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			Decorator_Operator_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OP_End_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			inType = false;
			break;
		case 1:
			inType = false;
			break;
		}
	}
	private void OP_BraketMatch_Left_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			inType = false;
			break;
		case 3:
			inType = false;
			break;
		}
	}
	private void OP_BraketMatch_Right_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			inType = false;
			break;
		case 5:
			inType = false;
			break;
		}
	}
	private void KEY_Var_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			inType = true;
			break;
		case 7:
			inType = true;
			break;
		}
	}
	private void KEY_Const_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			inType = true;
			break;
		case 9:
			inType = true;
			break;
		}
	}
	private void KEY_Type_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			inType = !inType;
			break;
		case 11:
			inType = !inType;
			break;
		}
	}
	private void KEY_Function_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			inType = true;
			break;
		case 13:
			inType = true;
			break;
		}
	}
	private void KEY_Cast_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			inType = true;
			break;
		case 15:
			inType = true;
			break;
		}
	}
	private void Decorator_Caster_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			inType = true;
			break;
		case 17:
			inType = true;
			break;
		}
	}
	private void Decorator_Operator_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			inType = true;
			break;
		case 19:
			inType = true;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return OP_Greater_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return OP_GreaterEqual_sempred((RuleContext)_localctx, predIndex);
		case 14:
			return OP_Lower_sempred((RuleContext)_localctx, predIndex);
		case 15:
			return OP_LowerEqual_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OP_Greater_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !inType;
		}
		return true;
	}
	private boolean OP_GreaterEqual_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !inType;
		}
		return true;
	}
	private boolean OP_Lower_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !inType;
		}
		return true;
	}
	private boolean OP_LowerEqual_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !inType;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u02d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u009c\n\3\3\3\3\3\3\4\3\4\5\4"+
		"\u00a2\n\4\3\5\3\5\3\5\3\5\7\5\u00a8\n\5\f\5\16\5\u00ab\13\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00b1\n\5\3\6\3\6\3\6\3\6\7\6\u00b7\n\6\f\6\16\6\u00ba\13\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00c3\n\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e5"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u00eb\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fa\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0101\n\22\3\23\3\23\3\23\3\23\5\23\u0107\n\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0110\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0117\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0123"+
		"\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3\"\5\"\u0137\n\"\3#\3#\3#\3#\5#\u013d\n#\3$\3$\3$\3$\3$\5"+
		"$\u0144\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u014f\n%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u015c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u0168\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0178\n(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0182\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u018f"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u019f\n+\3,\3,\3,\3,"+
		"\3,\3,\5,\u01a7\n,\3-\3-\3-\3-\5-\u01ad\n-\3.\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u01b7\n.\3/\3/\3/\3/\3/\3/\5/\u01bf\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u01c9\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01da\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01ed"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01f5\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u01fc\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0205\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u020e\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0219\n\67\38\38\38\38\38\38\58\u0221"+
		"\n8\39\39\39\39\39\39\39\39\39\59\u022c\n9\3:\3:\3:\3:\3:\5:\u0233\n:"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u023e\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\5<\u024b\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0258\n=\3>\3>\3>"+
		"\3>\5>\u025e\n>\3?\3?\6?\u0262\n?\r?\16?\u0263\3?\5?\u0267\n?\3@\3@\3"+
		"@\6@\u026c\n@\r@\16@\u026d\3@\3@\5@\u0272\n@\3A\3A\3A\3A\5A\u0278\nA\3"+
		"A\6A\u027b\nA\rA\16A\u027c\3B\3B\3B\3B\5B\u0283\nB\3B\6B\u0286\nB\rB\16"+
		"B\u0287\3C\3C\3C\6C\u028d\nC\rC\16C\u028e\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\5D\u029b\nD\3E\3E\3E\7E\u02a0\nE\fE\16E\u02a3\13E\3E\3E\3E\3E\7E\u02a9"+
		"\nE\fE\16E\u02ac\13E\3E\5E\u02af\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u02cd\nF\3G\3G\7"+
		"G\u02d1\nG\fG\16G\u02d4\13G\3H\3H\3I\3I\6\u00a9\u00b8\u02a1\u02aa\2J\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\3\2\32\4\2\f\f\17\17\5\2##\u4e0f\u4e0f\u9760\u9760\4\2<<\uff1c"+
		"\uff1c\4\2..\uff0e\uff0e\4\2**\uff0a\uff0a\4\2++\uff0b\uff0b\4\2]]\u3012"+
		"\u3012\4\2__\u3013\u3013\4\2>>\u300c\u300c\4\2@@\u300d\u300d\3\2\63;\3"+
		"\2\62;\3\2\63:\3\2\62:\4\2\62;ch\3\2\62\63\4\2\u5049\u5049\u7721\u7721"+
		"\4\2$$\u201e\u201e\5\2\f\f\17\17BB\4\2$$\u201f\u201f\4\2))\u201a\u201a"+
		"\4\2))\u201b\u201b\26\2\f\f\17\17\"$\'B]`bb}\u0080\u00b9\u00b9\u201a\u201b"+
		"\u201e\u201f\u2028\u2028\u3003\u3004\u300c\u300d\u3012\u3013\uff03\uff03"+
		"\uff0a\uff0b\uff0e\uff0e\uff1c\uff1d\uff21\uff21\uffe7\uffe7\27\2\f\f"+
		"\17\17\"$\'\61<B]`bb}\u0080\u00b9\u00b9\u201a\u201b\u201e\u201f\u2028"+
		"\u2028\u3003\u3004\u300c\u300d\u3012\u3013\uff03\uff03\uff0a\uff0b\uff0e"+
		"\uff0e\uff1c\uff1d\uff21\uff21\uffe7\uffe7\2\u032b\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u009b\3\2\2\2\7\u00a1\3\2\2\2\t\u00a3"+
		"\3\2\2\2\13\u00b2\3\2\2\2\r\u00c2\3\2\2\2\17\u00c4\3\2\2\2\21\u00c7\3"+
		"\2\2\2\23\u00c9\3\2\2\2\25\u00cb\3\2\2\2\27\u00cd\3\2\2\2\31\u00cf\3\2"+
		"\2\2\33\u00d5\3\2\2\2\35\u00e4\3\2\2\2\37\u00ea\3\2\2\2!\u00f9\3\2\2\2"+
		"#\u0100\3\2\2\2%\u0106\3\2\2\2\'\u0108\3\2\2\2)\u010f\3\2\2\2+\u0116\3"+
		"\2\2\2-\u0118\3\2\2\2/\u011a\3\2\2\2\61\u011c\3\2\2\2\63\u0122\3\2\2\2"+
		"\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012a\3\2\2\2=\u012c"+
		"\3\2\2\2?\u012e\3\2\2\2A\u0130\3\2\2\2C\u0136\3\2\2\2E\u013c\3\2\2\2G"+
		"\u0143\3\2\2\2I\u014e\3\2\2\2K\u015b\3\2\2\2M\u0167\3\2\2\2O\u0177\3\2"+
		"\2\2Q\u0181\3\2\2\2S\u018e\3\2\2\2U\u019e\3\2\2\2W\u01a6\3\2\2\2Y\u01ac"+
		"\3\2\2\2[\u01b6\3\2\2\2]\u01be\3\2\2\2_\u01c8\3\2\2\2a\u01d9\3\2\2\2c"+
		"\u01ec\3\2\2\2e\u01f4\3\2\2\2g\u01fb\3\2\2\2i\u0204\3\2\2\2k\u020d\3\2"+
		"\2\2m\u0218\3\2\2\2o\u0220\3\2\2\2q\u022b\3\2\2\2s\u0232\3\2\2\2u\u023d"+
		"\3\2\2\2w\u024a\3\2\2\2y\u0257\3\2\2\2{\u025d\3\2\2\2}\u0266\3\2\2\2\177"+
		"\u0271\3\2\2\2\u0081\u0277\3\2\2\2\u0083\u0282\3\2\2\2\u0085\u0289\3\2"+
		"\2\2\u0087\u029a\3\2\2\2\u0089\u02ae\3\2\2\2\u008b\u02cc\3\2\2\2\u008d"+
		"\u02ce\3\2\2\2\u008f\u02d5\3\2\2\2\u0091\u02d7\3\2\2\2\u0093\u0094\7>"+
		"\2\2\u0094\u0095\7G\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7H\2\2\u0097\u0098"+
		"\7@\2\2\u0098\4\3\2\2\2\u0099\u009c\5\7\4\2\u009a\u009c\5\r\7\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\3"+
		"\2\2\u009e\6\3\2\2\2\u009f\u00a2\5\t\5\2\u00a0\u00a2\5\13\6\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		"\u00a5\7\61\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\n\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00b0\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\7\f\2\2\u00ad\u00ae\7\17"+
		"\2\2\u00ae\u00b1\7\f\2\2\u00af\u00b1\7\2\2\3\u00b0\u00ac\3\2\2\2\u00b0"+
		"\u00ad\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\n\3\2\2\2\u00b2\u00b3\7\61\2"+
		"\2\u00b3\u00b4\7,\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\13\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\u00bd\7\61"+
		"\2\2\u00bd\f\3\2\2\2\u00be\u00c3\7\"\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c3"+
		"\7\f\2\2\u00c1\u00c3\7\f\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\7,\2\2"+
		"\u00c6\20\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8\22\3\2\2\2\u00c9\u00ca\7/\2"+
		"\2\u00ca\24\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc\26\3\2\2\2\u00cd\u00ce\7"+
		"\61\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7\'\2\2\u00d0\32\3\2\2\2\u00d1\u00d2"+
		"\7@\2\2\u00d2\u00d6\6\16\2\2\u00d3\u00d4\7\u5929\2\2\u00d4\u00d6\7\u4e90"+
		"\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\34\3\2\2\2\u00d7\u00d8"+
		"\7@\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\3\2\2\2\u00da\u00e5\6\17\3\2\u00db"+
		"\u00dc\7\u5929\2\2\u00dc\u00dd\7\u4e90\2\2\u00dd\u00de\7\u7b4b\2\2\u00de"+
		"\u00e5\7\u4e90\2\2\u00df\u00e0\7\u5929\2\2\u00e0\u00e1\7\u4e90\2\2\u00e1"+
		"\u00e2\7\u6218\2\2\u00e2\u00e3\7\u7b4b\2\2\u00e3\u00e5\7\u4e90\2\2\u00e4"+
		"\u00d7\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00df\3\2\2\2\u00e5\36\3\2\2"+
		"\2\u00e6\u00e7\7>\2\2\u00e7\u00eb\6\20\4\2\u00e8\u00e9\7\u5c11\2\2\u00e9"+
		"\u00eb\7\u4e90\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb \3\2"+
		"\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7?\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00fa"+
		"\6\21\5\2\u00f0\u00f1\7\u5c11\2\2\u00f1\u00f2\7\u4e90\2\2\u00f2\u00f3"+
		"\7\u7b4b\2\2\u00f3\u00fa\7\u4e90\2\2\u00f4\u00f5\7\u5c11\2\2\u00f5\u00f6"+
		"\7\u4e90\2\2\u00f6\u00f7\7\u6218\2\2\u00f7\u00f8\7\u7b4b\2\2\u00f8\u00fa"+
		"\7\u4e90\2\2\u00f9\u00ec\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f4\3\2\2"+
		"\2\u00fa\"\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u0101\7?\2\2\u00fd\u00fe\7"+
		"\u4e0f\2\2\u00fe\u00ff\7\u7b4b\2\2\u00ff\u0101\7\u4e90\2\2\u0100\u00fb"+
		"\3\2\2\2\u0100\u00fd\3\2\2\2\u0101$\3\2\2\2\u0102\u0103\7?\2\2\u0103\u0107"+
		"\7?\2\2\u0104\u0105\7\u7b4b\2\2\u0105\u0107\7\u4e90\2\2\u0106\u0102\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0107&\3\2\2\2\u0108\u0109\t\3\2\2\u0109(\3"+
		"\2\2\2\u010a\u010b\7\u5e78\2\2\u010b\u0110\7\u4e16\2\2\u010c\u0110\7\u5e78"+
		"\2\2\u010d\u010e\7(\2\2\u010e\u0110\7(\2\2\u010f\u010a\3\2\2\2\u010f\u010c"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110*\3\2\2\2\u0111\u0112\7\u6218\2\2\u0112"+
		"\u0117\7\u8007\2\2\u0113\u0117\7\u6218\2\2\u0114\u0115\7~\2\2\u0115\u0117"+
		"\7~\2\2\u0116\u0111\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		",\3\2\2\2\u0118\u0119\t\4\2\2\u0119.\3\2\2\2\u011a\u011b\t\5\2\2\u011b"+
		"\60\3\2\2\2\u011c\u011d\7?\2\2\u011d\62\3\2\2\2\u011e\u011f\7\u3004\2"+
		"\2\u011f\u0123\b\32\3\2\u0120\u0121\7=\2\2\u0121\u0123\b\32\4\2\u0122"+
		"\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123\64\3\2\2\2\u0124\u0125\7~\2\2"+
		"\u0125\66\3\2\2\2\u0126\u0127\t\6\2\2\u01278\3\2\2\2\u0128\u0129\t\7\2"+
		"\2\u0129:\3\2\2\2\u012a\u012b\t\b\2\2\u012b<\3\2\2\2\u012c\u012d\t\t\2"+
		"\2\u012d>\3\2\2\2\u012e\u012f\t\n\2\2\u012f@\3\2\2\2\u0130\u0131\t\13"+
		"\2\2\u0131B\3\2\2\2\u0132\u0133\7\uff5d\2\2\u0133\u0137\b\"\5\2\u0134"+
		"\u0135\7}\2\2\u0135\u0137\b\"\6\2\u0136\u0132\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137D\3\2\2\2\u0138\u0139\7\uff5f\2\2\u0139\u013d\b#\7\2\u013a\u013b"+
		"\7\177\2\2\u013b\u013d\b#\b\2\u013c\u0138\3\2\2\2\u013c\u013a\3\2\2\2"+
		"\u013dF\3\2\2\2\u013e\u0144\7\u7a7c\2\2\u013f\u0140\7p\2\2\u0140\u0141"+
		"\7w\2\2\u0141\u0142\7n\2\2\u0142\u0144\7n\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0144H\3\2\2\2\u0145\u0146\7\u53da\2\2\u0146\u0147\7\u91d1"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014f\b%\t\2\u0149\u014a\7x\2\2\u014a\u014b"+
		"\7c\2\2\u014b\u014c\7t\2\2\u014c\u014d\3\2\2\2\u014d\u014f\b%\n\2\u014e"+
		"\u0145\3\2\2\2\u014e\u0149\3\2\2\2\u014fJ\3\2\2\2\u0150\u0151\7\u5e3a"+
		"\2\2\u0151\u0152\7\u91d1\2\2\u0152\u0153\3\2\2\2\u0153\u015c\b&\13\2\u0154"+
		"\u0155\7e\2\2\u0155\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157\u0158\7u\2\2"+
		"\u0158\u0159\7v\2\2\u0159\u015a\3\2\2\2\u015a\u015c\b&\f\2\u015b\u0150"+
		"\3\2\2\2\u015b\u0154\3\2\2\2\u015cL\3\2\2\2\u015d\u015e\7\u7c7d\2\2\u015e"+
		"\u015f\7\u578d\2\2\u015f\u0160\3\2\2\2\u0160\u0168\b\'\r\2\u0161\u0162"+
		"\7v\2\2\u0162\u0163\7{\2\2\u0163\u0164\7r\2\2\u0164\u0165\7g\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\b\'\16\2\u0167\u015d\3\2\2\2\u0167\u0161\3"+
		"\2\2\2\u0168N\3\2\2\2\u0169\u016a\7\u51ff\2\2\u016a\u016b\7\u6572\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\u0178\b(\17\2\u016d\u016e\7h\2\2\u016e\u016f"+
		"\7w\2\2\u016f\u0170\7p\2\2\u0170\u0171\7e\2\2\u0171\u0172\7v\2\2\u0172"+
		"\u0173\7k\2\2\u0173\u0174\7q\2\2\u0174\u0175\7p\2\2\u0175\u0176\3\2\2"+
		"\2\u0176\u0178\b(\20\2\u0177\u0169\3\2\2\2\u0177\u016d\3\2\2\2\u0178P"+
		"\3\2\2\2\u0179\u017a\7\u8fd6\2\2\u017a\u0182\7\u56e0\2\2\u017b\u017c\7"+
		"t\2\2\u017c\u017d\7g\2\2\u017d\u017e\7v\2\2\u017e\u017f\7w\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0182\7p\2\2\u0181\u0179\3\2\2\2\u0181\u017b\3\2\2\2\u0182"+
		"R\3\2\2\2\u0183\u0184\7\u4e2f\2\2\u0184\u0185\7\u65af\2\2\u0185\u0186"+
		"\7\u5f55\2\2\u0186\u0187\7\u524f\2\2\u0187\u0188\7\u5fac\2\2\u0188\u018f"+
		"\7\u73b1\2\2\u0189\u018a\7d\2\2\u018a\u018b\7t\2\2\u018b\u018c\7g\2\2"+
		"\u018c\u018d\7c\2\2\u018d\u018f\7m\2\2\u018e\u0183\3\2\2\2\u018e\u0189"+
		"\3\2\2\2\u018fT\3\2\2\2\u0190\u0191\7\u7567\2\2\u0191\u0192\7\u8fc9\2"+
		"\2\u0192\u0193\7\u5f55\2\2\u0193\u0194\7\u524f\2\2\u0194\u0195\7\u5fac"+
		"\2\2\u0195\u019f\7\u73b1\2\2\u0196\u0197\7e\2\2\u0197\u0198\7q\2\2\u0198"+
		"\u0199\7p\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2\u019b\u019c\7p\2\2"+
		"\u019c\u019d\7w\2\2\u019d\u019f\7g\2\2\u019e\u0190\3\2\2\2\u019e\u0196"+
		"\3\2\2\2\u019fV\3\2\2\2\u01a0\u01a7\7\u5f55\2\2\u01a1\u01a2\7y\2\2\u01a2"+
		"\u01a3\7j\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a7\7g\2\2"+
		"\u01a6\u01a0\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a7X\3\2\2\2\u01a8\u01a9\7"+
		"\u5984\2\2\u01a9\u01ad\7\u679e\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ad\7h\2"+
		"\2\u01ac\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01adZ\3\2\2\2\u01ae\u01af"+
		"\7\u5428\2\2\u01af\u01b0\7\u521b\2\2\u01b0\u01b1\7\u5984\2\2\u01b1\u01b7"+
		"\7\u679e\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7n\2\2\u01b4\u01b5\7k\2\2"+
		"\u01b5\u01b7\7h\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b7\\\3"+
		"\2\2\2\u01b8\u01b9\7\u5428\2\2\u01b9\u01bf\7\u521b\2\2\u01ba\u01bb\7g"+
		"\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7u\2\2\u01bd\u01bf\7g\2\2\u01be\u01b8"+
		"\3\2\2\2\u01be\u01ba\3\2\2\2\u01bf^\3\2\2\2\u01c0\u01c1\7\u4f5e\2\2\u01c1"+
		"\u01c2\7\u4e3c\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c9\b\60\21\2\u01c4\u01c5"+
		"\7c\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\b\60\22\2\u01c8"+
		"\u01c0\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9`\3\2\2\2\u01ca\u01cb\7%\2\2\u01cb"+
		"\u01cc\7e\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf\7v\2\2"+
		"\u01cf\u01d0\7g\2\2\u01d0\u01d1\7t\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01da"+
		"\b\61\23\2\u01d3\u01d4\7%\2\2\u01d4\u01d5\7\u8f6e\2\2\u01d5\u01d6\7\u6364"+
		"\2\2\u01d6\u01d7\7\u566a\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\b\61\24\2"+
		"\u01d9\u01ca\3\2\2\2\u01d9\u01d3\3\2\2\2\u01dab\3\2\2\2\u01db\u01dc\7"+
		"%\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7r\2\2\u01de\u01df\7g\2\2\u01df\u01e0"+
		"\7t\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7q\2\2\u01e3"+
		"\u01e4\7t\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01ed\b\62\25\2\u01e6\u01e7\7"+
		"%\2\2\u01e7\u01e8\7\u64cf\2\2\u01e8\u01e9\7\u4f5e\2\2\u01e9\u01ea\7\u7b28"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\b\62\26\2\u01ec\u01db\3\2\2\2\u01ec"+
		"\u01e6\3\2\2\2\u01edd\3\2\2\2\u01ee\u01ef\7\u5b59\2\2\u01ef\u01f5\7\u8284"+
		"\2\2\u01f0\u01f1\7d\2\2\u01f1\u01f2\7{\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f5"+
		"\7g\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5f\3\2\2\2\u01f6\u01f7"+
		"\7\u6576\2\2\u01f7\u01fc\7\u6572\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7"+
		"p\2\2\u01fa\u01fc\7v\2\2\u01fb\u01f6\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc"+
		"h\3\2\2\2\u01fd\u01fe\7\u9581\2\2\u01fe\u01ff\7\u6576\2\2\u01ff\u0205"+
		"\7\u6572\2\2\u0200\u0201\7n\2\2\u0201\u0202\7k\2\2\u0202\u0203\7p\2\2"+
		"\u0203\u0205\7v\2\2\u0204\u01fd\3\2\2\2\u0204\u0200\3\2\2\2\u0205j\3\2"+
		"\2\2\u0206\u0207\7\u77ef\2\2\u0207\u0208\7\u6576\2\2\u0208\u020e\7\u6572"+
		"\2\2\u0209\u020a\7u\2\2\u020a\u020b\7k\2\2\u020b\u020c\7p\2\2\u020c\u020e"+
		"\7v\2\2\u020d\u0206\3\2\2\2\u020d\u0209\3\2\2\2\u020el\3\2\2\2\u020f\u0210"+
		"\7\u8d87\2\2\u0210\u0211\7\u9581\2\2\u0211\u0212\7\u6576\2\2\u0212\u0219"+
		"\7\u6572\2\2\u0213\u0214\7n\2\2\u0214\u0215\7n\2\2\u0215\u0216\7k\2\2"+
		"\u0216\u0217\7p\2\2\u0217\u0219\7v\2\2\u0218\u020f\3\2\2\2\u0218\u0213"+
		"\3\2\2\2\u0219n\3\2\2\2\u021a\u021b\7\u5e05\2\2\u021b\u0221\7\u5c16\2"+
		"\2\u021c\u021d\7d\2\2\u021d\u021e\7q\2\2\u021e\u021f\7q\2\2\u021f\u0221"+
		"\7n\2\2\u0220\u021a\3\2\2\2\u0220\u021c\3\2\2\2\u0221p\3\2\2\2\u0222\u0223"+
		"\7\u4f50\2\2\u0223\u0224\7\u7cc0\2\2\u0224\u0225\7\u5ea8\2\2\u0225\u0226"+
		"\7\u5c11\2\2\u0226\u022c\7\u6572\2\2\u0227\u0228\7u\2\2\u0228\u0229\7"+
		"f\2\2\u0229\u022a\7g\2\2\u022a\u022c\7e\2\2\u022b\u0222\3\2\2\2\u022b"+
		"\u0227\3\2\2\2\u022cr\3\2\2\2\u022d\u022e\7\u5c11\2\2\u022e\u0233\7\u6572"+
		"\2\2\u022f\u0230\7f\2\2\u0230\u0231\7g\2\2\u0231\u0233\7e\2\2\u0232\u022d"+
		"\3\2\2\2\u0232\u022f\3\2\2\2\u0233t\3\2\2\2\u0234\u0235\7\u9ada\2\2\u0235"+
		"\u0236\7\u7cc0\2\2\u0236\u0237\7\u5ea8\2\2\u0237\u0238\7\u5c11\2\2\u0238"+
		"\u023e\7\u6572\2\2\u0239\u023a\7n\2\2\u023a\u023b\7f\2\2\u023b\u023c\7"+
		"g\2\2\u023c\u023e\7e\2\2\u023d\u0234\3\2\2\2\u023d\u0239\3\2\2\2\u023e"+
		"v\3\2\2\2\u023f\u0240\7\u8d87\2\2\u0240\u0241\7\u9ada\2\2\u0241\u0242"+
		"\7\u7cc0\2\2\u0242\u0243\7\u5ea8\2\2\u0243\u0244\7\u5c11\2\2\u0244\u024b"+
		"\7\u6572\2\2\u0245\u0246\7n\2\2\u0246\u0247\7n\2\2\u0247\u0248\7f\2\2"+
		"\u0248\u0249\7g\2\2\u0249\u024b\7e\2\2\u024a\u023f\3\2\2\2\u024a\u0245"+
		"\3\2\2\2\u024bx\3\2\2\2\u024c\u024d\7\u5b59\2\2\u024d\u024e\7\u7b28\2"+
		"\2\u024e\u0258\7\u4e34\2\2\u024f\u0250\7\u6589\2\2\u0250\u0258\7\u672e"+
		"\2\2\u0251\u0252\7u\2\2\u0252\u0253\7v\2\2\u0253\u0254\7t\2\2\u0254\u0255"+
		"\7k\2\2\u0255\u0256\7p\2\2\u0256\u0258\7i\2\2\u0257\u024c\3\2\2\2\u0257"+
		"\u024f\3\2\2\2\u0257\u0251\3\2\2\2\u0258z\3\2\2\2\u0259\u025e\5}?\2\u025a"+
		"\u025e\5\177@\2\u025b\u025e\5\u0081A\2\u025c\u025e\5\u0083B\2\u025d\u0259"+
		"\3\2\2\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025e"+
		"|\3\2\2\2\u025f\u0261\t\f\2\2\u0260\u0262\t\r\2\2\u0261\u0260\3\2\2\2"+
		"\u0262\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0267"+
		"\3\2\2\2\u0265\u0267\t\r\2\2\u0266\u025f\3\2\2\2\u0266\u0265\3\2\2\2\u0267"+
		"~\3\2\2\2\u0268\u0269\7\62\2\2\u0269\u026b\t\16\2\2\u026a\u026c\t\17\2"+
		"\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u0272\3\2\2\2\u026f\u0270\7\62\2\2\u0270\u0272\t\17\2\2"+
		"\u0271\u0268\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0080\3\2\2\2\u0273\u0274"+
		"\7\62\2\2\u0274\u0278\7z\2\2\u0275\u0276\7\62\2\2\u0276\u0278\7Z\2\2\u0277"+
		"\u0273\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\t\20"+
		"\2\2\u027a\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u0082\3\2\2\2\u027e\u027f\7\62\2\2\u027f\u0283\7"+
		"d\2\2\u0280\u0281\7\62\2\2\u0281\u0283\7D\2\2\u0282\u027e\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0286\t\21\2\2\u0285\u0284\3"+
		"\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u0084\3\2\2\2\u0289\u028a\5}?\2\u028a\u028c\7\60\2\2\u028b\u028d\t\r"+
		"\2\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0086\3\2\2\2\u0290\u029b\t\22\2\2\u0291\u0292\7"+
		"v\2\2\u0292\u0293\7t\2\2\u0293\u0294\7w\2\2\u0294\u029b\7g\2\2\u0295\u0296"+
		"\7h\2\2\u0296\u0297\7c\2\2\u0297\u0298\7n\2\2\u0298\u0299\7u\2\2\u0299"+
		"\u029b\7g\2\2\u029a\u0290\3\2\2\2\u029a\u0291\3\2\2\2\u029a\u0295\3\2"+
		"\2\2\u029b\u0088\3\2\2\2\u029c\u02a1\t\23\2\2\u029d\u02a0\5\u008bF\2\u029e"+
		"\u02a0\n\24\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0\u02a3\3"+
		"\2\2\2\u02a1\u02a2\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a4\u02af\t\25\2\2\u02a5\u02aa\t\26\2\2\u02a6\u02a9\5"+
		"\u008bF\2\u02a7\u02a9\n\24\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2"+
		"\u02a9\u02ac\3\2\2\2\u02aa\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad"+
		"\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\t\27\2\2\u02ae\u029c\3\2\2\2"+
		"\u02ae\u02a5\3\2\2\2\u02af\u008a\3\2\2\2\u02b0\u02b1\7B\2\2\u02b1\u02cd"+
		"\7B\2\2\u02b2\u02b3\7B\2\2\u02b3\u02cd\7\u201e\2\2\u02b4\u02b5\7B\2\2"+
		"\u02b5\u02cd\7\u201f\2\2\u02b6\u02b7\7B\2\2\u02b7\u02cd\7\u201a\2\2\u02b8"+
		"\u02b9\7B\2\2\u02b9\u02cd\7\u201b\2\2\u02ba\u02bb\7B\2\2\u02bb\u02cd\7"+
		"c\2\2\u02bc\u02bd\7B\2\2\u02bd\u02cd\7d\2\2\u02be\u02bf\7B\2\2\u02bf\u02cd"+
		"\7h\2\2\u02c0\u02c1\7B\2\2\u02c1\u02cd\7p\2\2\u02c2\u02c3\7B\2\2\u02c3"+
		"\u02cd\7t\2\2\u02c4\u02c5\7B\2\2\u02c5\u02cd\7v\2\2\u02c6\u02c7\7B\2\2"+
		"\u02c7\u02cd\7x\2\2\u02c8\u02c9\7B\2\2\u02c9\u02cd\7$\2\2\u02ca\u02cb"+
		"\7B\2\2\u02cb\u02cd\7)\2\2\u02cc\u02b0\3\2\2\2\u02cc\u02b2\3\2\2\2\u02cc"+
		"\u02b4\3\2\2\2\u02cc\u02b6\3\2\2\2\u02cc\u02b8\3\2\2\2\u02cc\u02ba\3\2"+
		"\2\2\u02cc\u02bc\3\2\2\2\u02cc\u02be\3\2\2\2\u02cc\u02c0\3\2\2\2\u02cc"+
		"\u02c2\3\2\2\2\u02cc\u02c4\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c8\3\2"+
		"\2\2\u02cc\u02ca\3\2\2\2\u02cd\u008c\3\2\2\2\u02ce\u02d2\5\u008fH\2\u02cf"+
		"\u02d1\5\u0091I\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u008e\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02d6\n\30\2\2\u02d6\u0090\3\2\2\2\u02d7\u02d8\n\31\2\2\u02d8\u0092\3"+
		"\2\2\2@\2\u009b\u00a1\u00a9\u00b0\u00b8\u00c2\u00d5\u00e4\u00ea\u00f9"+
		"\u0100\u0106\u010f\u0116\u0122\u0136\u013c\u0143\u014e\u015b\u0167\u0177"+
		"\u0181\u018e\u019e\u01a6\u01ac\u01b6\u01be\u01c8\u01d9\u01ec\u01f4\u01fb"+
		"\u0204\u020d\u0218\u0220\u022b\u0232\u023d\u024a\u0257\u025d\u0263\u0266"+
		"\u026d\u0271\u0277\u027c\u0282\u0287\u028e\u029a\u029f\u02a1\u02a8\u02aa"+
		"\u02ae\u02cc\u02d2\27\b\2\2\3\32\2\3\32\3\3\"\4\3\"\5\3#\6\3#\7\3%\b\3"+
		"%\t\3&\n\3&\13\3\'\f\3\'\r\3(\16\3(\17\3\60\20\3\60\21\3\61\22\3\61\23"+
		"\3\62\24\3\62\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}