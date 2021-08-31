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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
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
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<EOF>'", "'|'", null, null, null, null, null, null, null, "'**'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", null, 
			"'=='", "'!'", "'&&'", "'||'", null, null, "'='", null, "'#'"
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
		case 7:
			Decorator_Caster_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			Decorator_Operator_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			OP_End_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			OP_BraketMatch_Left_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			OP_BraketMatch_Right_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			KEY_Var_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			KEY_Const_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			KEY_Type_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			KEY_Function_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			KEY_Cast_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Decorator_Caster_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			inType = true;
			break;
		case 1:
			inType = true;
			break;
		}
	}
	private void Decorator_Operator_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			inType = true;
			break;
		case 3:
			inType = true;
			break;
		}
	}
	private void OP_End_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			inType = false;
			break;
		case 5:
			inType = false;
			break;
		}
	}
	private void OP_BraketMatch_Left_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			inType = false;
			break;
		case 7:
			inType = false;
			break;
		}
	}
	private void OP_BraketMatch_Right_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			inType = false;
			break;
		case 9:
			inType = false;
			break;
		}
	}
	private void KEY_Var_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			inType = true;
			break;
		case 11:
			inType = true;
			break;
		}
	}
	private void KEY_Const_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			inType = true;
			break;
		case 13:
			inType = true;
			break;
		}
	}
	private void KEY_Type_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			inType = !inType;
			break;
		case 15:
			inType = !inType;
			break;
		}
	}
	private void KEY_Function_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			inType = true;
			break;
		case 17:
			inType = true;
			break;
		}
	}
	private void KEY_Cast_action(RuleContext _localctx, int actionIndex) {
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
		case 15:
			return OP_Greater_sempred((RuleContext)_localctx, predIndex);
		case 16:
			return OP_GreaterEqual_sempred((RuleContext)_localctx, predIndex);
		case 17:
			return OP_Lower_sempred((RuleContext)_localctx, predIndex);
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u02cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4\u00a0\n\4\3\4\3"+
		"\4\3\5\3\5\5\5\u00a6\n\5\3\6\3\6\3\6\3\6\7\6\u00ac\n\6\f\6\16\6\u00af"+
		"\13\6\3\6\3\6\3\6\3\6\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\7\7\u00bb\n\7\f\7"+
		"\16\7\u00be\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00c7\n\b\3\t\3\t\7\t"+
		"\u00cb\n\t\f\t\16\t\u00ce\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00da\n\t\f\t\16\t\u00dd\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e4\n\t\3"+
		"\n\3\n\7\n\u00e8\n\n\f\n\16\n\u00eb\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00f9\n\n\f\n\16\n\u00fc\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0103\n\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0126\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\6\35\u013a\n\35\r\35\16\35\u013b\3\35\3\35\6\35\u0140\n\35\r\35"+
		"\16\35\u0141\3\35\5\35\u0145\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\5%\u0159\n%\3&\3&\3&\3&\5&\u015f\n&\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0166\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0171\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u017e\n)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u018a\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u019a\n"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01a4\n,\3-\3-\3-\3-\3-\3-\3-\5-\u01ad\n"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01b9\n.\3/\3/\3/\3/\3/\3/\5/\u01c1"+
		"\n/\3\60\3\60\3\60\3\60\5\60\u01c7\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u01d1\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01d9\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01e3\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u01eb\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u01f2"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01fb\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0204\n\67\38\38\38\38\38\38\38\38\38\58\u020f"+
		"\n8\39\39\39\39\39\39\59\u0217\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0222"+
		"\n:\3;\3;\3;\3;\3;\5;\u0229\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0234\n<"+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0241\n=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\5>\u024e\n>\3?\3?\3?\3?\5?\u0254\n?\3@\3@\6@\u0258\n@\r@\16"+
		"@\u0259\3@\5@\u025d\n@\3A\3A\3A\6A\u0262\nA\rA\16A\u0263\3A\3A\5A\u0268"+
		"\nA\3B\3B\3B\3B\5B\u026e\nB\3B\6B\u0271\nB\rB\16B\u0272\3C\3C\3C\3C\5"+
		"C\u0279\nC\3C\6C\u027c\nC\rC\16C\u027d\3D\3D\3D\6D\u0283\nD\rD\16D\u0284"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0291\nE\3F\3F\3F\7F\u0296\nF\fF\16"+
		"F\u0299\13F\3F\3F\3F\3F\7F\u029f\nF\fF\16F\u02a2\13F\3F\5F\u02a5\nF\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\5G\u02c3\nG\3H\3H\7H\u02c7\nH\fH\16H\u02ca\13H\3I\3I\3J"+
		"\3J\6\u00ad\u00bc\u0297\u02a0\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\3\2\31\4\2\f\f\17\17"+
		"\4\2<<\uff1c\uff1c\4\2..\uff0e\uff0e\4\2**\uff0a\uff0a\4\2++\uff0b\uff0b"+
		"\4\2]]\u3012\u3012\4\2__\u3013\u3013\4\2>>\u300c\u300c\4\2@@\u300d\u300d"+
		"\3\2\63;\3\2\62;\3\2\63:\3\2\62:\4\2\62;ch\3\2\62\63\4\2\u5049\u5049\u7721"+
		"\u7721\4\2$$\u201e\u201e\3\2^^\4\2$$\u201f\u201f\4\2))\u201a\u201a\4\2"+
		"))\u201b\u201b\26\2\f\f\17\17\"%\'B]`bb}\u0080\u00b9\u00b9\u201a\u201b"+
		"\u201e\u201f\u2028\u2028\u3003\u3004\u300c\u300d\u3012\u3013\uff03\uff03"+
		"\uff0a\uff0b\uff0e\uff0e\uff1c\uff1d\uff21\uff21\uffe7\uffe7\27\2\f\f"+
		"\17\17\"%\'\61<B]`bb}\u0080\u00b9\u00b9\u201a\u201b\u201e\u201f\u2028"+
		"\u2028\u3003\u3004\u300c\u300d\u3012\u3013\uff03\uff03\uff0a\uff0b\uff0e"+
		"\uff0e\uff1c\uff1d\uff21\uff21\uffe7\uffe7\2\u031c\2\3\3\2\2\2\2\5\3\2"+
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
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u009b\3\2\2\2\7\u009f"+
		"\3\2\2\2\t\u00a5\3\2\2\2\13\u00a7\3\2\2\2\r\u00b6\3\2\2\2\17\u00c6\3\2"+
		"\2\2\21\u00e3\3\2\2\2\23\u0102\3\2\2\2\25\u0104\3\2\2\2\27\u0107\3\2\2"+
		"\2\31\u0109\3\2\2\2\33\u010b\3\2\2\2\35\u010d\3\2\2\2\37\u010f\3\2\2\2"+
		"!\u0111\3\2\2\2#\u0114\3\2\2\2%\u0119\3\2\2\2\'\u011c\3\2\2\2)\u0125\3"+
		"\2\2\2+\u0127\3\2\2\2-\u012a\3\2\2\2/\u012c\3\2\2\2\61\u012f\3\2\2\2\63"+
		"\u0132\3\2\2\2\65\u0134\3\2\2\2\67\u0136\3\2\2\29\u0144\3\2\2\2;\u0146"+
		"\3\2\2\2=\u0148\3\2\2\2?\u014a\3\2\2\2A\u014c\3\2\2\2C\u014e\3\2\2\2E"+
		"\u0150\3\2\2\2G\u0152\3\2\2\2I\u0158\3\2\2\2K\u015e\3\2\2\2M\u0165\3\2"+
		"\2\2O\u0170\3\2\2\2Q\u017d\3\2\2\2S\u0189\3\2\2\2U\u0199\3\2\2\2W\u01a3"+
		"\3\2\2\2Y\u01ac\3\2\2\2[\u01b8\3\2\2\2]\u01c0\3\2\2\2_\u01c6\3\2\2\2a"+
		"\u01d0\3\2\2\2c\u01d8\3\2\2\2e\u01e2\3\2\2\2g\u01ea\3\2\2\2i\u01f1\3\2"+
		"\2\2k\u01fa\3\2\2\2m\u0203\3\2\2\2o\u020e\3\2\2\2q\u0216\3\2\2\2s\u0221"+
		"\3\2\2\2u\u0228\3\2\2\2w\u0233\3\2\2\2y\u0240\3\2\2\2{\u024d\3\2\2\2}"+
		"\u0253\3\2\2\2\177\u025c\3\2\2\2\u0081\u0267\3\2\2\2\u0083\u026d\3\2\2"+
		"\2\u0085\u0278\3\2\2\2\u0087\u027f\3\2\2\2\u0089\u0290\3\2\2\2\u008b\u02a4"+
		"\3\2\2\2\u008d\u02c2\3\2\2\2\u008f\u02c4\3\2\2\2\u0091\u02cb\3\2\2\2\u0093"+
		"\u02cd\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7G\2\2\u0097\u0098\7Q\2"+
		"\2\u0098\u0099\7H\2\2\u0099\u009a\7@\2\2\u009a\4\3\2\2\2\u009b\u009c\7"+
		"~\2\2\u009c\6\3\2\2\2\u009d\u00a0\5\t\5\2\u009e\u00a0\5\17\b\2\u009f\u009d"+
		"\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\4\2\2\u00a2"+
		"\b\3\2\2\2\u00a3\u00a6\5\13\6\2\u00a4\u00a6\5\r\7\2\u00a5\u00a3\3\2\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9"+
		"\7\61\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\n\2\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b4"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\7\f\2\2\u00b1\u00b2\7\17\2\2"+
		"\u00b2\u00b5\7\f\2\2\u00b3\u00b5\7\2\2\3\u00b4\u00b0\3\2\2\2\u00b4\u00b1"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\f\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"\u00b8\7,\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\13\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\7\61"+
		"\2\2\u00c1\16\3\2\2\2\u00c2\u00c7\7\"\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c7"+
		"\7\f\2\2\u00c5\u00c7\7\f\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\20\3\2\2\2\u00c8\u00cc\7%\2\2\u00c9\u00cb\7\"\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00d5\7t\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e4\b\t\3\2\u00d7\u00db"+
		"\7%\2\2\u00d8\u00da\7\"\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7\u8f6e\2\2\u00df\u00e0\7\u6364\2\2\u00e0\u00e1\7\u566a"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\b\t\4\2\u00e3\u00c8\3\2\2\2\u00e3"+
		"\u00d7\3\2\2\2\u00e4\22\3\2\2\2\u00e5\u00e9\7%\2\2\u00e6\u00e8\7\"\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7r\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7c\2\2"+
		"\u00f1\u00f2\7v\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u0103\b\n\5\2\u00f6\u00fa\7%\2\2\u00f7\u00f9\7\"\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\u64cf\2\2\u00fe"+
		"\u00ff\7\u4f5e\2\2\u00ff\u0100\7\u7b28\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\b\n\6\2\u0102\u00e5\3\2\2\2\u0102\u00f6\3\2\2\2\u0103\24\3\2\2\2\u0104"+
		"\u0105\7,\2\2\u0105\u0106\7,\2\2\u0106\26\3\2\2\2\u0107\u0108\7-\2\2\u0108"+
		"\30\3\2\2\2\u0109\u010a\7/\2\2\u010a\32\3\2\2\2\u010b\u010c\7,\2\2\u010c"+
		"\34\3\2\2\2\u010d\u010e\7\61\2\2\u010e\36\3\2\2\2\u010f\u0110\7\'\2\2"+
		"\u0110 \3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\6\21\2\2\u0113\"\3\2\2"+
		"\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\6\22\3\2\u0118$\3\2\2\2\u0119\u011a\7>\2\2\u011a\u011b\6\23\4\2\u011b"+
		"&\3\2\2\2\u011c\u011d\7>\2\2\u011d\u011e\7?\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\6\24\5\2\u0120(\3\2\2\2\u0121\u0122\7#\2\2\u0122\u0126\7?\2\2\u0123"+
		"\u0124\7\uff03\2\2\u0124\u0126\7?\2\2\u0125\u0121\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126*\3\2\2\2\u0127\u0128\7?\2\2\u0128\u0129\7?\2\2\u0129,\3"+
		"\2\2\2\u012a\u012b\7#\2\2\u012b.\3\2\2\2\u012c\u012d\7(\2\2\u012d\u012e"+
		"\7(\2\2\u012e\60\3\2\2\2\u012f\u0130\7~\2\2\u0130\u0131\7~\2\2\u0131\62"+
		"\3\2\2\2\u0132\u0133\t\3\2\2\u0133\64\3\2\2\2\u0134\u0135\t\4\2\2\u0135"+
		"\66\3\2\2\2\u0136\u0137\7?\2\2\u01378\3\2\2\2\u0138\u013a\7\u3004\2\2"+
		"\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0145\b\35\7\2\u013e\u0140\7=\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0145\b\35\b\2\u0144\u0139\3\2\2\2\u0144"+
		"\u013f\3\2\2\2\u0145:\3\2\2\2\u0146\u0147\7%\2\2\u0147<\3\2\2\2\u0148"+
		"\u0149\t\5\2\2\u0149>\3\2\2\2\u014a\u014b\t\6\2\2\u014b@\3\2\2\2\u014c"+
		"\u014d\t\7\2\2\u014dB\3\2\2\2\u014e\u014f\t\b\2\2\u014fD\3\2\2\2\u0150"+
		"\u0151\t\t\2\2\u0151F\3\2\2\2\u0152\u0153\t\n\2\2\u0153H\3\2\2\2\u0154"+
		"\u0155\7\uff5d\2\2\u0155\u0159\b%\t\2\u0156\u0157\7}\2\2\u0157\u0159\b"+
		"%\n\2\u0158\u0154\3\2\2\2\u0158\u0156\3\2\2\2\u0159J\3\2\2\2\u015a\u015b"+
		"\7\uff5f\2\2\u015b\u015f\b&\13\2\u015c\u015d\7\177\2\2\u015d\u015f\b&"+
		"\f\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015fL\3\2\2\2\u0160\u0166"+
		"\7\u7a7c\2\2\u0161\u0162\7p\2\2\u0162\u0163\7w\2\2\u0163\u0164\7n\2\2"+
		"\u0164\u0166\7n\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0166N\3\2"+
		"\2\2\u0167\u0168\7\u53da\2\2\u0168\u0169\7\u91d1\2\2\u0169\u016a\3\2\2"+
		"\2\u016a\u0171\b(\r\2\u016b\u016c\7x\2\2\u016c\u016d\7c\2\2\u016d\u016e"+
		"\7t\2\2\u016e\u016f\3\2\2\2\u016f\u0171\b(\16\2\u0170\u0167\3\2\2\2\u0170"+
		"\u016b\3\2\2\2\u0171P\3\2\2\2\u0172\u0173\7\u5e3a\2\2\u0173\u0174\7\u91d1"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u017e\b)\17\2\u0176\u0177\7e\2\2\u0177"+
		"\u0178\7q\2\2\u0178\u0179\7p\2\2\u0179\u017a\7u\2\2\u017a\u017b\7v\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017e\b)\20\2\u017d\u0172\3\2\2\2\u017d\u0176"+
		"\3\2\2\2\u017eR\3\2\2\2\u017f\u0180\7\u7c7d\2\2\u0180\u0181\7\u578d\2"+
		"\2\u0181\u0182\3\2\2\2\u0182\u018a\b*\21\2\u0183\u0184\7v\2\2\u0184\u0185"+
		"\7{\2\2\u0185\u0186\7r\2\2\u0186\u0187\7g\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\b*\22\2\u0189\u017f\3\2\2\2\u0189\u0183\3\2\2\2\u018aT\3\2\2\2"+
		"\u018b\u018c\7\u51ff\2\2\u018c\u018d\7\u6572\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u019a\b+\23\2\u018f\u0190\7h\2\2\u0190\u0191\7w\2\2\u0191\u0192\7p\2"+
		"\2\u0192\u0193\7e\2\2\u0193\u0194\7v\2\2\u0194\u0195\7k\2\2\u0195\u0196"+
		"\7q\2\2\u0196\u0197\7p\2\2\u0197\u0198\3\2\2\2\u0198\u019a\b+\24\2\u0199"+
		"\u018b\3\2\2\2\u0199\u018f\3\2\2\2\u019aV\3\2\2\2\u019b\u019c\7\u8fd6"+
		"\2\2\u019c\u01a4\7\u56e0\2\2\u019d\u019e\7t\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7v\2\2\u01a0\u01a1\7w\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a4\7p\2\2"+
		"\u01a3\u019b\3\2\2\2\u01a3\u019d\3\2\2\2\u01a4X\3\2\2\2\u01a5\u01a6\7"+
		"\u4e2f\2\2\u01a6\u01ad\7\u65af\2\2\u01a7\u01a8\7d\2\2\u01a8\u01a9\7t\2"+
		"\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ad\7m\2\2\u01ac\u01a5"+
		"\3\2\2\2\u01ac\u01a7\3\2\2\2\u01adZ\3\2\2\2\u01ae\u01af\7\u7567\2\2\u01af"+
		"\u01b9\7\u8fc9\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7"+
		"p\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7"+
		"\7w\2\2\u01b7\u01b9\7g\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b9"+
		"\\\3\2\2\2\u01ba\u01c1\7\u5f55\2\2\u01bb\u01bc\7y\2\2\u01bc\u01bd\7j\2"+
		"\2\u01bd\u01be\7k\2\2\u01be\u01bf\7n\2\2\u01bf\u01c1\7g\2\2\u01c0\u01ba"+
		"\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c1^\3\2\2\2\u01c2\u01c3\7\u5984\2\2\u01c3"+
		"\u01c7\7\u679e\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c7\7h\2\2\u01c6\u01c2\3"+
		"\2\2\2\u01c6\u01c4\3\2\2\2\u01c7`\3\2\2\2\u01c8\u01c9\7\u5428\2\2\u01c9"+
		"\u01ca\7\u521b\2\2\u01ca\u01cb\7\u5984\2\2\u01cb\u01d1\7\u679e\2\2\u01cc"+
		"\u01cd\7g\2\2\u01cd\u01ce\7n\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d1\7h\2\2"+
		"\u01d0\u01c8\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d1b\3\2\2\2\u01d2\u01d3\7"+
		"\u5428\2\2\u01d3\u01d9\7\u521b\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7n\2"+
		"\2\u01d6\u01d7\7u\2\2\u01d7\u01d9\7g\2\2\u01d8\u01d2\3\2\2\2\u01d8\u01d4"+
		"\3\2\2\2\u01d9d\3\2\2\2\u01da\u01db\7\u4f5e\2\2\u01db\u01dc\7\u4e3c\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01e3\b\63\25\2\u01de\u01df\7c\2\2\u01df"+
		"\u01e0\7u\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\b\63\26\2\u01e2\u01da\3"+
		"\2\2\2\u01e2\u01de\3\2\2\2\u01e3f\3\2\2\2\u01e4\u01e5\7\u5b59\2\2\u01e5"+
		"\u01eb\7\u8284\2\2\u01e6\u01e7\7d\2\2\u01e7\u01e8\7{\2\2\u01e8\u01e9\7"+
		"v\2\2\u01e9\u01eb\7g\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb"+
		"h\3\2\2\2\u01ec\u01ed\7\u6576\2\2\u01ed\u01f2\7\u6572\2\2\u01ee\u01ef"+
		"\7k\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f2\7v\2\2\u01f1\u01ec\3\2\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f2j\3\2\2\2\u01f3\u01f4\7\u9581\2\2\u01f4\u01f5\7\u6576"+
		"\2\2\u01f5\u01fb\7\u6572\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7k\2\2\u01f8"+
		"\u01f9\7p\2\2\u01f9\u01fb\7v\2\2\u01fa\u01f3\3\2\2\2\u01fa\u01f6\3\2\2"+
		"\2\u01fbl\3\2\2\2\u01fc\u01fd\7\u77ef\2\2\u01fd\u01fe\7\u6576\2\2\u01fe"+
		"\u0204\7\u6572\2\2\u01ff\u0200\7u\2\2\u0200\u0201\7k\2\2\u0201\u0202\7"+
		"p\2\2\u0202\u0204\7v\2\2\u0203\u01fc\3\2\2\2\u0203\u01ff\3\2\2\2\u0204"+
		"n\3\2\2\2\u0205\u0206\7\u8d87\2\2\u0206\u0207\7\u9581\2\2\u0207\u0208"+
		"\7\u6576\2\2\u0208\u020f\7\u6572\2\2\u0209\u020a\7n\2\2\u020a\u020b\7"+
		"n\2\2\u020b\u020c\7k\2\2\u020c\u020d\7p\2\2\u020d\u020f\7v\2\2\u020e\u0205"+
		"\3\2\2\2\u020e\u0209\3\2\2\2\u020fp\3\2\2\2\u0210\u0211\7\u5e05\2\2\u0211"+
		"\u0217\7\u5c16\2\2\u0212\u0213\7d\2\2\u0213\u0214\7q\2\2\u0214\u0215\7"+
		"q\2\2\u0215\u0217\7n\2\2\u0216\u0210\3\2\2\2\u0216\u0212\3\2\2\2\u0217"+
		"r\3\2\2\2\u0218\u0219\7\u4f50\2\2\u0219\u021a\7\u7cc0\2\2\u021a\u021b"+
		"\7\u5ea8\2\2\u021b\u021c\7\u5c11\2\2\u021c\u0222\7\u6572\2\2\u021d\u021e"+
		"\7u\2\2\u021e\u021f\7f\2\2\u021f\u0220\7g\2\2\u0220\u0222\7e\2\2\u0221"+
		"\u0218\3\2\2\2\u0221\u021d\3\2\2\2\u0222t\3\2\2\2\u0223\u0224\7\u5c11"+
		"\2\2\u0224\u0229\7\u6572\2\2\u0225\u0226\7f\2\2\u0226\u0227\7g\2\2\u0227"+
		"\u0229\7e\2\2\u0228\u0223\3\2\2\2\u0228\u0225\3\2\2\2\u0229v\3\2\2\2\u022a"+
		"\u022b\7\u9ada\2\2\u022b\u022c\7\u7cc0\2\2\u022c\u022d\7\u5ea8\2\2\u022d"+
		"\u022e\7\u5c11\2\2\u022e\u0234\7\u6572\2\2\u022f\u0230\7n\2\2\u0230\u0231"+
		"\7f\2\2\u0231\u0232\7g\2\2\u0232\u0234\7e\2\2\u0233\u022a\3\2\2\2\u0233"+
		"\u022f\3\2\2\2\u0234x\3\2\2\2\u0235\u0236\7\u8d87\2\2\u0236\u0237\7\u9ada"+
		"\2\2\u0237\u0238\7\u7cc0\2\2\u0238\u0239\7\u5ea8\2\2\u0239\u023a\7\u5c11"+
		"\2\2\u023a\u0241\7\u6572\2\2\u023b\u023c\7n\2\2\u023c\u023d\7n\2\2\u023d"+
		"\u023e\7f\2\2\u023e\u023f\7g\2\2\u023f\u0241\7e\2\2\u0240\u0235\3\2\2"+
		"\2\u0240\u023b\3\2\2\2\u0241z\3\2\2\2\u0242\u0243\7\u5b59\2\2\u0243\u0244"+
		"\7\u7b28\2\2\u0244\u024e\7\u4e34\2\2\u0245\u0246\7\u6589\2\2\u0246\u024e"+
		"\7\u672e\2\2\u0247\u0248\7u\2\2\u0248\u0249\7v\2\2\u0249\u024a\7t\2\2"+
		"\u024a\u024b\7k\2\2\u024b\u024c\7p\2\2\u024c\u024e\7i\2\2\u024d\u0242"+
		"\3\2\2\2\u024d\u0245\3\2\2\2\u024d\u0247\3\2\2\2\u024e|\3\2\2\2\u024f"+
		"\u0254\5\177@\2\u0250\u0254\5\u0081A\2\u0251\u0254\5\u0083B\2\u0252\u0254"+
		"\5\u0085C\2\u0253\u024f\3\2\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2\2"+
		"\2\u0253\u0252\3\2\2\2\u0254~\3\2\2\2\u0255\u0257\t\13\2\2\u0256\u0258"+
		"\t\f\2\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u025d\t\f\2\2\u025c\u0255\3\2"+
		"\2\2\u025c\u025b\3\2\2\2\u025d\u0080\3\2\2\2\u025e\u025f\7\62\2\2\u025f"+
		"\u0261\t\r\2\2\u0260\u0262\t\16\2\2\u0261\u0260\3\2\2\2\u0262\u0263\3"+
		"\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0268\3\2\2\2\u0265"+
		"\u0266\7\62\2\2\u0266\u0268\t\16\2\2\u0267\u025e\3\2\2\2\u0267\u0265\3"+
		"\2\2\2\u0268\u0082\3\2\2\2\u0269\u026a\7\62\2\2\u026a\u026e\7z\2\2\u026b"+
		"\u026c\7\62\2\2\u026c\u026e\7Z\2\2\u026d\u0269\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026e\u0270\3\2\2\2\u026f\u0271\t\17\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0084\3\2"+
		"\2\2\u0274\u0275\7\62\2\2\u0275\u0279\7d\2\2\u0276\u0277\7\62\2\2\u0277"+
		"\u0279\7D\2\2\u0278\u0274\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\3\2"+
		"\2\2\u027a\u027c\t\20\2\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0086\3\2\2\2\u027f\u0280\5\177"+
		"@\2\u0280\u0282\7\60\2\2\u0281\u0283\t\f\2\2\u0282\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0088\3\2"+
		"\2\2\u0286\u0291\t\21\2\2\u0287\u0288\7v\2\2\u0288\u0289\7t\2\2\u0289"+
		"\u028a\7w\2\2\u028a\u0291\7g\2\2\u028b\u028c\7h\2\2\u028c\u028d\7c\2\2"+
		"\u028d\u028e\7n\2\2\u028e\u028f\7u\2\2\u028f\u0291\7g\2\2\u0290\u0286"+
		"\3\2\2\2\u0290\u0287\3\2\2\2\u0290\u028b\3\2\2\2\u0291\u008a\3\2\2\2\u0292"+
		"\u0297\t\22\2\2\u0293\u0296\5\u008dG\2\u0294\u0296\n\23\2\2\u0295\u0293"+
		"\3\2\2\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0298\3\2\2\2\u0297"+
		"\u0295\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u02a5\t\24"+
		"\2\2\u029b\u02a0\t\25\2\2\u029c\u029f\5\u008dG\2\u029d\u029f\n\23\2\2"+
		"\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"\u02a5\t\26\2\2\u02a4\u0292\3\2\2\2\u02a4\u029b\3\2\2\2\u02a5\u008c\3"+
		"\2\2\2\u02a6\u02a7\7^\2\2\u02a7\u02c3\7^\2\2\u02a8\u02a9\7^\2\2\u02a9"+
		"\u02c3\7\u201e\2\2\u02aa\u02ab\7^\2\2\u02ab\u02c3\7\u201f\2\2\u02ac\u02ad"+
		"\7^\2\2\u02ad\u02c3\7\u201a\2\2\u02ae\u02af\7^\2\2\u02af\u02c3\7\u201b"+
		"\2\2\u02b0\u02b1\7^\2\2\u02b1\u02c3\7c\2\2\u02b2\u02b3\7^\2\2\u02b3\u02c3"+
		"\7d\2\2\u02b4\u02b5\7^\2\2\u02b5\u02c3\7h\2\2\u02b6\u02b7\7^\2\2\u02b7"+
		"\u02c3\7p\2\2\u02b8\u02b9\7^\2\2\u02b9\u02c3\7t\2\2\u02ba\u02bb\7^\2\2"+
		"\u02bb\u02c3\7v\2\2\u02bc\u02bd\7^\2\2\u02bd\u02c3\7x\2\2\u02be\u02bf"+
		"\7^\2\2\u02bf\u02c3\7$\2\2\u02c0\u02c1\7^\2\2\u02c1\u02c3\7)\2\2\u02c2"+
		"\u02a6\3\2\2\2\u02c2\u02a8\3\2\2\2\u02c2\u02aa\3\2\2\2\u02c2\u02ac\3\2"+
		"\2\2\u02c2\u02ae\3\2\2\2\u02c2\u02b0\3\2\2\2\u02c2\u02b2\3\2\2\2\u02c2"+
		"\u02b4\3\2\2\2\u02c2\u02b6\3\2\2\2\u02c2\u02b8\3\2\2\2\u02c2\u02ba\3\2"+
		"\2\2\u02c2\u02bc\3\2\2\2\u02c2\u02be\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\u008e\3\2\2\2\u02c4\u02c8\5\u0091I\2\u02c5\u02c7\5\u0093J\2\u02c6\u02c5"+
		"\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u0090\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\n\27\2\2\u02cc\u0092\3"+
		"\2\2\2\u02cd\u02ce\n\30\2\2\u02ce\u0094\3\2\2\2?\2\u009f\u00a5\u00ad\u00b4"+
		"\u00bc\u00c6\u00cc\u00db\u00e3\u00e9\u00fa\u0102\u0125\u013b\u0141\u0144"+
		"\u0158\u015e\u0165\u0170\u017d\u0189\u0199\u01a3\u01ac\u01b8\u01c0\u01c6"+
		"\u01d0\u01d8\u01e2\u01ea\u01f1\u01fa\u0203\u020e\u0216\u0221\u0228\u0233"+
		"\u0240\u024d\u0253\u0259\u025c\u0263\u0267\u026d\u0272\u0278\u027d\u0284"+
		"\u0290\u0295\u0297\u029e\u02a0\u02a4\u02c2\u02c8\27\b\2\2\3\t\2\3\t\3"+
		"\3\n\4\3\n\5\3\35\6\3\35\7\3%\b\3%\t\3&\n\3&\13\3(\f\3(\r\3)\16\3)\17"+
		"\3*\20\3*\21\3+\22\3+\23\3\63\24\3\63\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}