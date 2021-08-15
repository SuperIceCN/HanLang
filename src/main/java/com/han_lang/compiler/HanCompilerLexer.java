// Generated from D:/nukkit/HanLang/src/main/antlr\HanCompiler.g4 by ANTLR 4.9.1
package com.han_lang.compiler;
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
		THROWAWAY=1, COMMENT=2, ONELINE_COMMENT=3, MUTILINE_COMMENT=4, WS=5, OP_Power=6, 
		OP_Plus=7, OP_Minus=8, OP_Mutiply=9, OP_Devide=10, OP_Greater=11, OP_GreaterEqual=12, 
		OP_Lower=13, OP_LowerEqual=14, OP_NotEqual=15, OP_Equal=16, OP_Not=17, 
		OP_And=18, OP_Or=19, OP_Call=20, OP_Split=21, OP_Set=22, OP_End=23, OP_Braket_Left=24, 
		OP_Braket_Right=25, OP_BraketCall_Left=26, OP_BraketCall_Right=27, OP_BraketType_Left=28, 
		OP_BraketType_Right=29, OP_BraketMatch_Left=30, OP_BraketMatch_Right=31, 
		KEY_Var=32, KEY_Const=33, KEY_Type=34, KEY_Function=35, KEY_Return=36, 
		KEY_Break=37, KEY_Continue=38, KEY_Loop=39, KEY_If=40, KEY_Elif=41, KEY_Else=42, 
		Type_Null=43, Type_Byte=44, Type_Int=45, Type_LongInt=46, Type_ShortInt=47, 
		Type_LongLongInt=48, Type_Boolean=49, Type_ShortFloat=50, Type_Float=51, 
		Type_LongFloat=52, Type_LongLongFloat=53, Type_String=54, INT=55, INT10=56, 
		INT8=57, INT16=58, INT2=59, DEC=60, BOOL=61, STRING=62, ESCAPE_CHARS=63, 
		ID=64, IDStart=65, IDPart=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", "WS", 
			"OP_Power", "OP_Plus", "OP_Minus", "OP_Mutiply", "OP_Devide", "OP_Greater", 
			"OP_GreaterEqual", "OP_Lower", "OP_LowerEqual", "OP_NotEqual", "OP_Equal", 
			"OP_Not", "OP_And", "OP_Or", "OP_Call", "OP_Split", "OP_Set", "OP_End", 
			"OP_Braket_Left", "OP_Braket_Right", "OP_BraketCall_Left", "OP_BraketCall_Right", 
			"OP_BraketType_Left", "OP_BraketType_Right", "OP_BraketMatch_Left", "OP_BraketMatch_Right", 
			"KEY_Var", "KEY_Const", "KEY_Type", "KEY_Function", "KEY_Return", "KEY_Break", 
			"KEY_Continue", "KEY_Loop", "KEY_If", "KEY_Elif", "KEY_Else", "Type_Null", 
			"Type_Byte", "Type_Int", "Type_LongInt", "Type_ShortInt", "Type_LongLongInt", 
			"Type_Boolean", "Type_ShortFloat", "Type_Float", "Type_LongFloat", "Type_LongLongFloat", 
			"Type_String", "INT", "INT10", "INT8", "INT16", "INT2", "DEC", "BOOL", 
			"STRING", "ESCAPE_CHARS", "ID", "IDStart", "IDPart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'**'", "'+'", "'-'", "'*'", "'/'", 
			null, null, null, null, null, null, null, null, null, null, null, "'='", 
			null, null, null, null, null, null, null, null, null, "'\u53D8\u91CF'", 
			"'\u5E38\u91CF'", "'\u7C7B\u578B'", "'\u51FD\u6570'", "'\u8FD4\u56DE'", 
			"'\u4E2D\u65AD\u5F53\u524D\u5FAA\u73AF'", "'\u7565\u8FC7\u5F53\u524D\u5FAA\u73AF'", 
			"'\u5F53'", "'\u5982\u679C'", "'\u5426\u5219\u5982\u679C'", "'\u5426\u5219'", 
			"'\u7A7A'", "'\u5B57\u8282'", "'\u6574\u6570'", "'\u957F\u6574\u6570'", 
			"'\u77ED\u6574\u6570'", "'\u8D85\u957F\u6574\u6570'", "'\u5E03\u5C14'", 
			"'\u4F4E\u7CBE\u5EA6\u5C0F\u6570'", "'\u5C0F\u6570'", "'\u9AD8\u7CBE\u5EA6\u5C0F\u6570'", 
			"'\u8D85\u9AD8\u7CBE\u5EA6\u5C0F\u6570'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "THROWAWAY", "COMMENT", "ONELINE_COMMENT", "MUTILINE_COMMENT", 
			"WS", "OP_Power", "OP_Plus", "OP_Minus", "OP_Mutiply", "OP_Devide", "OP_Greater", 
			"OP_GreaterEqual", "OP_Lower", "OP_LowerEqual", "OP_NotEqual", "OP_Equal", 
			"OP_Not", "OP_And", "OP_Or", "OP_Call", "OP_Split", "OP_Set", "OP_End", 
			"OP_Braket_Left", "OP_Braket_Right", "OP_BraketCall_Left", "OP_BraketCall_Right", 
			"OP_BraketType_Left", "OP_BraketType_Right", "OP_BraketMatch_Left", "OP_BraketMatch_Right", 
			"KEY_Var", "KEY_Const", "KEY_Type", "KEY_Function", "KEY_Return", "KEY_Break", 
			"KEY_Continue", "KEY_Loop", "KEY_If", "KEY_Elif", "KEY_Else", "Type_Null", 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\5\2\u008a\n\2\3\2\3\2\3\3"+
		"\3\3\5\3\u0090\n\3\3\4\3\4\3\4\3\4\7\4\u0096\n\4\f\4\16\4\u0099\13\4\3"+
		"\4\3\4\3\4\3\4\5\4\u009f\n\4\3\5\3\5\3\5\3\5\7\5\u00a5\n\5\f\5\16\5\u00a8"+
		"\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f\u00c1\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\5\16\u00d3\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e0\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\21\3\21\3\21\3\21\5\21\u00ed"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u00f4\n\23\3\24\3\24\3\24\5\24\u00f9"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5"+
		"\67\u0170\n\67\38\38\38\38\58\u0176\n8\39\39\69\u017a\n9\r9\169\u017b"+
		"\39\59\u017f\n9\3:\3:\3:\6:\u0184\n:\r:\16:\u0185\3:\3:\5:\u018a\n:\3"+
		";\3;\3;\3;\5;\u0190\n;\3;\6;\u0193\n;\r;\16;\u0194\3<\3<\3<\3<\5<\u019b"+
		"\n<\3<\6<\u019e\n<\r<\16<\u019f\3=\3=\3=\6=\u01a5\n=\r=\16=\u01a6\3>\3"+
		">\3?\3?\3?\7?\u01ae\n?\f?\16?\u01b1\13?\3?\3?\3?\3?\5?\u01b7\n?\3?\5?"+
		"\u01ba\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\5@\u01d4\n@\3A\3A\7A\u01d8\nA\fA\16A\u01db\13A\3B\3B\3C\3"+
		"C\5\u0097\u00a6\u01af\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\31"+
		"\4\2\f\f\17\17\4\2\u4e0f\u4e0f\u9760\u9760\4\2<<\uff1c\uff1c\4\2..\uff0e"+
		"\uff0e\4\2==\u3004\u3004\4\2**\uff0a\uff0a\4\2++\uff0b\uff0b\4\2]]\u3012"+
		"\u3012\4\2__\u3013\u3013\4\2>>\u300c\u300c\4\2@@\u300d\u300d\4\2}}\uff5d"+
		"\uff5d\4\2\177\177\uff5f\uff5f\3\2\63;\3\2\62;\3\2\63:\3\2\62:\4\2\62"+
		";ch\3\2\62\63\4\2\u5049\u5049\u7721\u7721\5\2\f\f\17\17BB\26\2\f\f\17"+
		"\17\"$\'B]`bb}\u0080\u00b9\u00b9\u201a\u201b\u201e\u201f\u2028\u2028\u3003"+
		"\u3004\u300c\u300d\u3012\u3013\uff03\uff03\uff0a\uff0b\uff0e\uff0e\uff1c"+
		"\uff1d\uff21\uff21\uffe7\uffe7\27\2\f\f\17\17\"$\'\61<B]`bb}\u0080\u00b9"+
		"\u00b9\u201a\u201b\u201e\u201f\u2028\u2028\u3003\u3004\u300c\u300d\u3012"+
		"\u3013\uff03\uff03\uff0a\uff0b\uff0e\uff0e\uff1c\uff1d\uff21\uff21\uffe7"+
		"\uffe7\2\u020e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\3\u0089\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2"+
		"\2\t\u00a0\3\2\2\2\13\u00b0\3\2\2\2\r\u00b2\3\2\2\2\17\u00b5\3\2\2\2\21"+
		"\u00b7\3\2\2\2\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00c0\3\2\2\2\31\u00cd"+
		"\3\2\2\2\33\u00d2\3\2\2\2\35\u00df\3\2\2\2\37\u00e6\3\2\2\2!\u00ec\3\2"+
		"\2\2#\u00ee\3\2\2\2%\u00f3\3\2\2\2\'\u00f8\3\2\2\2)\u00fa\3\2\2\2+\u00fc"+
		"\3\2\2\2-\u00fe\3\2\2\2/\u0100\3\2\2\2\61\u0102\3\2\2\2\63\u0104\3\2\2"+
		"\2\65\u0106\3\2\2\2\67\u0108\3\2\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010e"+
		"\3\2\2\2?\u0110\3\2\2\2A\u0112\3\2\2\2C\u0115\3\2\2\2E\u0118\3\2\2\2G"+
		"\u011b\3\2\2\2I\u011e\3\2\2\2K\u0121\3\2\2\2M\u0128\3\2\2\2O\u012f\3\2"+
		"\2\2Q\u0131\3\2\2\2S\u0134\3\2\2\2U\u0139\3\2\2\2W\u013c\3\2\2\2Y\u013e"+
		"\3\2\2\2[\u0141\3\2\2\2]\u0144\3\2\2\2_\u0148\3\2\2\2a\u014c\3\2\2\2c"+
		"\u0151\3\2\2\2e\u0154\3\2\2\2g\u015a\3\2\2\2i\u015d\3\2\2\2k\u0163\3\2"+
		"\2\2m\u016f\3\2\2\2o\u0175\3\2\2\2q\u017e\3\2\2\2s\u0189\3\2\2\2u\u018f"+
		"\3\2\2\2w\u019a\3\2\2\2y\u01a1\3\2\2\2{\u01a8\3\2\2\2}\u01b9\3\2\2\2\177"+
		"\u01d3\3\2\2\2\u0081\u01d5\3\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01de\3\2"+
		"\2\2\u0087\u008a\5\5\3\2\u0088\u008a\5\13\6\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\2\2\2\u008c\4\3\2\2\2"+
		"\u008d\u0090\5\7\4\2\u008e\u0090\5\t\5\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\6\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0096\n\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009e\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009f\7\f\2\2\u009b\u009c\7\17\2\2\u009c\u009f\7"+
		"\f\2\2\u009d\u009f\7\2\2\3\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\b\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7,\2\2"+
		"\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7\61\2\2\u00ab\n\3\2\2\2"+
		"\u00ac\u00b1\7\"\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b1\7\f\2\2\u00af\u00b1"+
		"\7\f\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\f\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7,\2\2\u00b4\16\3\2\2\2\u00b5"+
		"\u00b6\7-\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\22\3\2\2\2\u00b9"+
		"\u00ba\7,\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\26\3\2\2\2\u00bd"+
		"\u00c1\7@\2\2\u00be\u00bf\7\u5929\2\2\u00bf\u00c1\7\u4e90\2\2\u00c0\u00bd"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3"+
		"\u00ce\7?\2\2\u00c4\u00c5\7\u5929\2\2\u00c5\u00c6\7\u4e90\2\2\u00c6\u00c7"+
		"\7\u7b4b\2\2\u00c7\u00ce\7\u4e90\2\2\u00c8\u00c9\7\u5929\2\2\u00c9\u00ca"+
		"\7\u4e90\2\2\u00ca\u00cb\7\u6218\2\2\u00cb\u00cc\7\u7b4b\2\2\u00cc\u00ce"+
		"\7\u4e90\2\2\u00cd\u00c2\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c8\3\2\2"+
		"\2\u00ce\32\3\2\2\2\u00cf\u00d3\7>\2\2\u00d0\u00d1\7\u5c11\2\2\u00d1\u00d3"+
		"\7\u4e90\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\34\3\2\2\2"+
		"\u00d4\u00d5\7>\2\2\u00d5\u00e0\7?\2\2\u00d6\u00d7\7\u5c11\2\2\u00d7\u00d8"+
		"\7\u4e90\2\2\u00d8\u00d9\7\u7b4b\2\2\u00d9\u00e0\7\u4e90\2\2\u00da\u00db"+
		"\7\u5c11\2\2\u00db\u00dc\7\u4e90\2\2\u00dc\u00dd\7\u6218\2\2\u00dd\u00de"+
		"\7\u7b4b\2\2\u00de\u00e0\7\u4e90\2\2\u00df\u00d4\3\2\2\2\u00df\u00d6\3"+
		"\2\2\2\u00df\u00da\3\2\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e7"+
		"\7?\2\2\u00e3\u00e4\7\u4e0f\2\2\u00e4\u00e5\7\u7b4b\2\2\u00e5\u00e7\7"+
		"\u4e90\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7 \3\2\2\2\u00e8"+
		"\u00e9\7?\2\2\u00e9\u00ed\7?\2\2\u00ea\u00eb\7\u7b4b\2\2\u00eb\u00ed\7"+
		"\u4e90\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\"\3\2\2\2\u00ee"+
		"\u00ef\t\3\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7\u5e78\2\2\u00f1\u00f4\7\u4e16"+
		"\2\2\u00f2\u00f4\7\u5e78\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"&\3\2\2\2\u00f5\u00f6\7\u6218\2\2\u00f6\u00f9\7\u8007\2\2\u00f7\u00f9"+
		"\7\u6218\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9(\3\2\2\2\u00fa"+
		"\u00fb\t\4\2\2\u00fb*\3\2\2\2\u00fc\u00fd\t\5\2\2\u00fd,\3\2\2\2\u00fe"+
		"\u00ff\7?\2\2\u00ff.\3\2\2\2\u0100\u0101\t\6\2\2\u0101\60\3\2\2\2\u0102"+
		"\u0103\t\7\2\2\u0103\62\3\2\2\2\u0104\u0105\t\b\2\2\u0105\64\3\2\2\2\u0106"+
		"\u0107\t\t\2\2\u0107\66\3\2\2\2\u0108\u0109\t\n\2\2\u01098\3\2\2\2\u010a"+
		"\u010b\t\13\2\2\u010b:\3\2\2\2\u010c\u010d\t\f\2\2\u010d<\3\2\2\2\u010e"+
		"\u010f\t\r\2\2\u010f>\3\2\2\2\u0110\u0111\t\16\2\2\u0111@\3\2\2\2\u0112"+
		"\u0113\7\u53da\2\2\u0113\u0114\7\u91d1\2\2\u0114B\3\2\2\2\u0115\u0116"+
		"\7\u5e3a\2\2\u0116\u0117\7\u91d1\2\2\u0117D\3\2\2\2\u0118\u0119\7\u7c7d"+
		"\2\2\u0119\u011a\7\u578d\2\2\u011aF\3\2\2\2\u011b\u011c\7\u51ff\2\2\u011c"+
		"\u011d\7\u6572\2\2\u011dH\3\2\2\2\u011e\u011f\7\u8fd6\2\2\u011f\u0120"+
		"\7\u56e0\2\2\u0120J\3\2\2\2\u0121\u0122\7\u4e2f\2\2\u0122\u0123\7\u65af"+
		"\2\2\u0123\u0124\7\u5f55\2\2\u0124\u0125\7\u524f\2\2\u0125\u0126\7\u5fac"+
		"\2\2\u0126\u0127\7\u73b1\2\2\u0127L\3\2\2\2\u0128\u0129\7\u7567\2\2\u0129"+
		"\u012a\7\u8fc9\2\2\u012a\u012b\7\u5f55\2\2\u012b\u012c\7\u524f\2\2\u012c"+
		"\u012d\7\u5fac\2\2\u012d\u012e\7\u73b1\2\2\u012eN\3\2\2\2\u012f\u0130"+
		"\7\u5f55\2\2\u0130P\3\2\2\2\u0131\u0132\7\u5984\2\2\u0132\u0133\7\u679e"+
		"\2\2\u0133R\3\2\2\2\u0134\u0135\7\u5428\2\2\u0135\u0136\7\u521b\2\2\u0136"+
		"\u0137\7\u5984\2\2\u0137\u0138\7\u679e\2\2\u0138T\3\2\2\2\u0139\u013a"+
		"\7\u5428\2\2\u013a\u013b\7\u521b\2\2\u013bV\3\2\2\2\u013c\u013d\7\u7a7c"+
		"\2\2\u013dX\3\2\2\2\u013e\u013f\7\u5b59\2\2\u013f\u0140\7\u8284\2\2\u0140"+
		"Z\3\2\2\2\u0141\u0142\7\u6576\2\2\u0142\u0143\7\u6572\2\2\u0143\\\3\2"+
		"\2\2\u0144\u0145\7\u9581\2\2\u0145\u0146\7\u6576\2\2\u0146\u0147\7\u6572"+
		"\2\2\u0147^\3\2\2\2\u0148\u0149\7\u77ef\2\2\u0149\u014a\7\u6576\2\2\u014a"+
		"\u014b\7\u6572\2\2\u014b`\3\2\2\2\u014c\u014d\7\u8d87\2\2\u014d\u014e"+
		"\7\u9581\2\2\u014e\u014f\7\u6576\2\2\u014f\u0150\7\u6572\2\2\u0150b\3"+
		"\2\2\2\u0151\u0152\7\u5e05\2\2\u0152\u0153\7\u5c16\2\2\u0153d\3\2\2\2"+
		"\u0154\u0155\7\u4f50\2\2\u0155\u0156\7\u7cc0\2\2\u0156\u0157\7\u5ea8\2"+
		"\2\u0157\u0158\7\u5c11\2\2\u0158\u0159\7\u6572\2\2\u0159f\3\2\2\2\u015a"+
		"\u015b\7\u5c11\2\2\u015b\u015c\7\u6572\2\2\u015ch\3\2\2\2\u015d\u015e"+
		"\7\u9ada\2\2\u015e\u015f\7\u7cc0\2\2\u015f\u0160\7\u5ea8\2\2\u0160\u0161"+
		"\7\u5c11\2\2\u0161\u0162\7\u6572\2\2\u0162j\3\2\2\2\u0163\u0164\7\u8d87"+
		"\2\2\u0164\u0165\7\u9ada\2\2\u0165\u0166\7\u7cc0\2\2\u0166\u0167\7\u5ea8"+
		"\2\2\u0167\u0168\7\u5c11\2\2\u0168\u0169\7\u6572\2\2\u0169l\3\2\2\2\u016a"+
		"\u016b\7\u5b59\2\2\u016b\u016c\7\u7b28\2\2\u016c\u0170\7\u4e34\2\2\u016d"+
		"\u016e\7\u6589\2\2\u016e\u0170\7\u672e\2\2\u016f\u016a\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u0170n\3\2\2\2\u0171\u0176\5q9\2\u0172\u0176\5s:\2\u0173\u0176"+
		"\5u;\2\u0174\u0176\5w<\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176p\3\2\2\2\u0177\u0179\t\17\2\2"+
		"\u0178\u017a\t\20\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017f\t\20\2\2"+
		"\u017e\u0177\3\2\2\2\u017e\u017d\3\2\2\2\u017fr\3\2\2\2\u0180\u0181\7"+
		"\62\2\2\u0181\u0183\t\21\2\2\u0182\u0184\t\22\2\2\u0183\u0182\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u018a"+
		"\3\2\2\2\u0187\u0188\7\62\2\2\u0188\u018a\t\22\2\2\u0189\u0180\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u018at\3\2\2\2\u018b\u018c\7\62\2\2\u018c\u0190\7"+
		"z\2\2\u018d\u018e\7\62\2\2\u018e\u0190\7Z\2\2\u018f\u018b\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\t\23\2\2\u0192\u0191\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"v\3\2\2\2\u0196\u0197\7\62\2\2\u0197\u019b\7d\2\2\u0198\u0199\7\62\2\2"+
		"\u0199\u019b\7D\2\2\u019a\u0196\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d"+
		"\3\2\2\2\u019c\u019e\t\24\2\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0x\3\2\2\2\u01a1\u01a2\5"+
		"q9\2\u01a2\u01a4\7\60\2\2\u01a3\u01a5\t\20\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7z\3\2\2\2"+
		"\u01a8\u01a9\t\25\2\2\u01a9|\3\2\2\2\u01aa\u01af\7\u201e\2\2\u01ab\u01ae"+
		"\5\177@\2\u01ac\u01ae\n\26\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01b1\3\2\2\2\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01ba\7\u201f\2\2\u01b3\u01b6\7\u201a"+
		"\2\2\u01b4\u01b7\5\177@\2\u01b5\u01b7\n\26\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\7\u201b\2\2\u01b9\u01aa"+
		"\3\2\2\2\u01b9\u01b3\3\2\2\2\u01ba~\3\2\2\2\u01bb\u01bc\7B\2\2\u01bc\u01d4"+
		"\7B\2\2\u01bd\u01be\7B\2\2\u01be\u01d4\7\u201e\2\2\u01bf\u01c0\7B\2\2"+
		"\u01c0\u01d4\7\u201f\2\2\u01c1\u01c2\7B\2\2\u01c2\u01d4\7\u201a\2\2\u01c3"+
		"\u01c4\7B\2\2\u01c4\u01d4\7\u201b\2\2\u01c5\u01c6\7B\2\2\u01c6\u01d4\7"+
		"c\2\2\u01c7\u01c8\7B\2\2\u01c8\u01d4\7d\2\2\u01c9\u01ca\7B\2\2\u01ca\u01d4"+
		"\7h\2\2\u01cb\u01cc\7B\2\2\u01cc\u01d4\7p\2\2\u01cd\u01ce\7B\2\2\u01ce"+
		"\u01d4\7t\2\2\u01cf\u01d0\7B\2\2\u01d0\u01d4\7v\2\2\u01d1\u01d2\7B\2\2"+
		"\u01d2\u01d4\7x\2\2\u01d3\u01bb\3\2\2\2\u01d3\u01bd\3\2\2\2\u01d3\u01bf"+
		"\3\2\2\2\u01d3\u01c1\3\2\2\2\u01d3\u01c3\3\2\2\2\u01d3\u01c5\3\2\2\2\u01d3"+
		"\u01c7\3\2\2\2\u01d3\u01c9\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01cd\3\2"+
		"\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u0080\3\2\2\2\u01d5"+
		"\u01d9\5\u0083B\2\u01d6\u01d8\5\u0085C\2\u01d7\u01d6\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u0082\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01dd\n\27\2\2\u01dd\u0084\3\2\2\2\u01de\u01df\n"+
		"\30\2\2\u01df\u0086\3\2\2\2\"\2\u0089\u008f\u0097\u009e\u00a6\u00b0\u00c0"+
		"\u00cd\u00d2\u00df\u00e6\u00ec\u00f3\u00f8\u016f\u0175\u017b\u017e\u0185"+
		"\u0189\u018f\u0194\u019a\u019f\u01a6\u01ad\u01af\u01b6\u01b9\u01d3\u01d9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}