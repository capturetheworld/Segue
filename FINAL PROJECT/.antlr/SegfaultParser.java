// Generated from /Users/ian/Documents/Github/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SegfaultParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IF=32, THEN=33, ELSE=34, TRUE=35, FALSE=36, PRINT=37, WHILE=38, SYNTH=39, 
		SET=40, CHANNEL=41, NOTE=42, LERP=43, START=44, COMMENT=45, IDENTIFIER=46, 
		LETTER=47, INTEGER=48, DOUBLE=49, BR=50, WS=51;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_function = 3, 
		RULE_assignmentStatement = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, 
		RULE_printStatement = 7, RULE_printArguments = 8, RULE_synthStatement = 9, 
		RULE_synthFunction = 10, RULE_functionID = 11, RULE_functionSymbol = 12, 
		RULE_argumentList = 13, RULE_argument = 14, RULE_numericalExpression = 15, 
		RULE_term = 16, RULE_factor = 17, RULE_prefixOp = 18, RULE_suffixOp = 19, 
		RULE_numIdentifier = 20, RULE_numSymbol = 21, RULE_booleanExpression = 22, 
		RULE_booleanTerm = 23, RULE_booleanSingleton = 24, RULE_notSymbol = 25, 
		RULE_boolIdentifier = 26, RULE_boolSymbol = 27, RULE_synthSetFunction = 28, 
		RULE_synthChannelFunction = 29, RULE_synthNoteFunction = 30, RULE_synthStartFunction = 31, 
		RULE_synthNoteSet = 32, RULE_synthNoteLerp = 33, RULE_synthPointStatement = 34, 
		RULE_synthMidiPitch = 35, RULE_synthVolume = 36, RULE_synthVibratoAmplitude = 37, 
		RULE_synthVibratoFrequency = 38, RULE_relOp = 39, RULE_boolOp = 40, RULE_addOp = 41, 
		RULE_mulOp = 42, RULE_booleanConstant = 43, RULE_numberConstant = 44, 
		RULE_unsignedNumber = 45, RULE_unsignedintegerConstant = 46, RULE_unsigneddoubleConstant = 47, 
		RULE_sign = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "function", "assignmentStatement", "ifStatement", 
			"whileStatement", "printStatement", "printArguments", "synthStatement", 
			"synthFunction", "functionID", "functionSymbol", "argumentList", "argument", 
			"numericalExpression", "term", "factor", "prefixOp", "suffixOp", "numIdentifier", 
			"numSymbol", "booleanExpression", "booleanTerm", "booleanSingleton", 
			"notSymbol", "boolIdentifier", "boolSymbol", "synthSetFunction", "synthChannelFunction", 
			"synthNoteFunction", "synthStartFunction", "synthNoteSet", "synthNoteLerp", 
			"synthPointStatement", "synthMidiPitch", "synthVolume", "synthVibratoAmplitude", 
			"synthVibratoFrequency", "relOp", "boolOp", "addOp", "mulOp", "booleanConstant", 
			"numberConstant", "unsignedNumber", "unsignedintegerConstant", "unsigneddoubleConstant", 
			"sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'.'", "'@'", "','", "'++'", 
			"'--'", "'#'", "'!'", "'$'", "'['", "']'", "'m'", "'v'", "'a'", "'f'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&'", "'|'", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IF", "THEN", "ELSE", 
			"TRUE", "FALSE", "PRINT", "WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", 
			"LERP", "START", "COMMENT", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", 
			"BR", "WS"
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
	public String getGrammarFileName() { return "Segfault.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SegfaultParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SegfaultParser.EOF, 0); }
		public List<TerminalNode> BR() { return getTokens(SegfaultParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegfaultParser.BR, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(98);
				match(BR);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					line();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(110);
			statement();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(111);
				match(BR);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> BR() { return getTokens(SegfaultParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegfaultParser.BR, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			statement();
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(120);
					match(BR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public SynthStatementContext synthStatement() {
			return getRuleContext(SynthStatementContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public SuffixOpContext suffixOp() {
			return getRuleContext(SuffixOpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				synthStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				prefixOp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				suffixOp();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionIDContext functionID() {
			return getRuleContext(FunctionIDContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<TerminalNode> BR() { return getTokens(SegfaultParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegfaultParser.BR, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			functionID();
			setState(135);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__12) {
				{
				setState(136);
				argumentList();
				}
			}

			setState(139);
			match(T__1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(140);
				match(BR);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(146);
			match(T__2);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(147);
				match(BR);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				line();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(158);
				match(BR);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__3);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public BoolIdentifierContext boolIdentifier() {
			return getRuleContext(BoolIdentifierContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentStatement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				boolIdentifier();
				setState(167);
				match(T__4);
				setState(168);
				booleanExpression();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				numIdentifier();
				setState(171);
				match(T__4);
				setState(172);
				numericalExpression();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SegfaultParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SegfaultParser.ELSE, 0); }
		public List<TerminalNode> BR() { return getTokens(SegfaultParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegfaultParser.BR, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IF);
			setState(177);
			match(T__0);
			setState(178);
			booleanExpression();
			setState(179);
			match(T__1);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(180);
				match(BR);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__2);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(187);
				match(BR);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				line();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(198);
			match(T__3);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(199);
				match(BR);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(ELSE);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(206);
				match(BR);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(T__2);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(213);
				match(BR);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				line();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(224);
			match(T__3);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SegfaultParser.WHILE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<TerminalNode> BR() { return getTokens(SegfaultParser.BR); }
		public TerminalNode BR(int i) {
			return getToken(SegfaultParser.BR, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(WHILE);
			setState(227);
			match(T__0);
			setState(228);
			booleanExpression();
			setState(229);
			match(T__1);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(230);
				match(BR);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__2);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(237);
				match(BR);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				line();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(248);
			match(T__3);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SegfaultParser.PRINT, 0); }
		public PrintArgumentsContext printArguments() {
			return getRuleContext(PrintArgumentsContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PRINT);
			setState(251);
			printArguments();
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

	public static class PrintArgumentsContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public PrintArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArguments; }
	}

	public final PrintArgumentsContext printArguments() throws RecognitionException {
		PrintArgumentsContext _localctx = new PrintArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__0);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				line();
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(259);
			match(T__1);
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

	public static class SynthStatementContext extends ParserRuleContext {
		public TerminalNode SYNTH() { return getToken(SegfaultParser.SYNTH, 0); }
		public SynthFunctionContext synthFunction() {
			return getRuleContext(SynthFunctionContext.class,0);
		}
		public SynthStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthStatement; }
	}

	public final SynthStatementContext synthStatement() throws RecognitionException {
		SynthStatementContext _localctx = new SynthStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_synthStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(SYNTH);
			setState(262);
			match(T__5);
			setState(263);
			synthFunction();
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

	public static class SynthFunctionContext extends ParserRuleContext {
		public SynthSetFunctionContext synthSetFunction() {
			return getRuleContext(SynthSetFunctionContext.class,0);
		}
		public SynthChannelFunctionContext synthChannelFunction() {
			return getRuleContext(SynthChannelFunctionContext.class,0);
		}
		public SynthNoteFunctionContext synthNoteFunction() {
			return getRuleContext(SynthNoteFunctionContext.class,0);
		}
		public SynthStartFunctionContext synthStartFunction() {
			return getRuleContext(SynthStartFunctionContext.class,0);
		}
		public SynthFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthFunction; }
	}

	public final SynthFunctionContext synthFunction() throws RecognitionException {
		SynthFunctionContext _localctx = new SynthFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_synthFunction);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				synthSetFunction();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				synthChannelFunction();
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				synthNoteFunction();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				synthStartFunction();
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

	public static class FunctionIDContext extends ParserRuleContext {
		public FunctionSymbolContext functionSymbol() {
			return getRuleContext(FunctionSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegfaultParser.IDENTIFIER, 0); }
		public FunctionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionID; }
	}

	public final FunctionIDContext functionID() throws RecognitionException {
		FunctionIDContext _localctx = new FunctionIDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			functionSymbol();
			setState(272);
			match(IDENTIFIER);
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

	public static class FunctionSymbolContext extends ParserRuleContext {
		public FunctionSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSymbol; }
	}

	public final FunctionSymbolContext functionSymbol() throws RecognitionException {
		FunctionSymbolContext _localctx = new FunctionSymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__6);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public Typespec type = null;
		public SymtabEntry entry = null;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			argument();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(277);
				match(T__7);
				setState(278);
				argument();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgumentContext extends ParserRuleContext {
		public BoolIdentifierContext boolIdentifier() {
			return getRuleContext(BoolIdentifierContext.class,0);
		}
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argument);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				boolIdentifier();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				numIdentifier();
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

	public static class NumericalExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public NumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalExpression; }
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numericalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			term();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__27) | (1L << T__28) | (1L << INTEGER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(289);
				addOp();
				setState(290);
				term();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			factor();
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					mulOp();
					setState(299);
					factor();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public NumberConstantContext numberConstant() {
			return getRuleContext(NumberConstantContext.class,0);
		}
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public SuffixOpContext suffixOp() {
			return getRuleContext(SuffixOpContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(T__0);
				setState(307);
				numericalExpression();
				setState(308);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				numberConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				numIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				prefixOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				suffixOp();
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

	public static class PrefixOpContext extends ParserRuleContext {
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			numIdentifier();
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

	public static class SuffixOpContext extends ParserRuleContext {
		public NumIdentifierContext numIdentifier() {
			return getRuleContext(NumIdentifierContext.class,0);
		}
		public SuffixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffixOp; }
	}

	public final SuffixOpContext suffixOp() throws RecognitionException {
		SuffixOpContext _localctx = new SuffixOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_suffixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			numIdentifier();
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class NumIdentifierContext extends ParserRuleContext {
		public NumSymbolContext numSymbol() {
			return getRuleContext(NumSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegfaultParser.IDENTIFIER, 0); }
		public NumIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numIdentifier; }
	}

	public final NumIdentifierContext numIdentifier() throws RecognitionException {
		NumIdentifierContext _localctx = new NumIdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			numSymbol();
			setState(323);
			match(IDENTIFIER);
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

	public static class NumSymbolContext extends ParserRuleContext {
		public NumSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numSymbol; }
	}

	public final NumSymbolContext numSymbol() throws RecognitionException {
		NumSymbolContext _localctx = new NumSymbolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__10);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<BooleanTermContext> booleanTerm() {
			return getRuleContexts(BooleanTermContext.class);
		}
		public BooleanTermContext booleanTerm(int i) {
			return getRuleContext(BooleanTermContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanExpression);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				booleanTerm();
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(328);
					boolOp();
					setState(329);
					booleanTerm();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				numericalExpression();
				setState(334);
				relOp();
				setState(335);
				numericalExpression();
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

	public static class BooleanTermContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BooleanSingletonContext booleanSingleton() {
			return getRuleContext(BooleanSingletonContext.class,0);
		}
		public BooleanTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTerm; }
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanTerm);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(T__0);
				setState(340);
				booleanExpression();
				setState(341);
				match(T__1);
				}
				break;
			case T__11:
			case T__12:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				booleanSingleton();
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

	public static class BooleanSingletonContext extends ParserRuleContext {
		public NotSymbolContext notSymbol() {
			return getRuleContext(NotSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BoolIdentifierContext boolIdentifier() {
			return getRuleContext(BoolIdentifierContext.class,0);
		}
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public BooleanSingletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSingleton; }
	}

	public final BooleanSingletonContext booleanSingleton() throws RecognitionException {
		BooleanSingletonContext _localctx = new BooleanSingletonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanSingleton);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				notSymbol();
				setState(347);
				booleanExpression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				boolIdentifier();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				booleanConstant();
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

	public static class NotSymbolContext extends ParserRuleContext {
		public NotSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSymbol; }
	}

	public final NotSymbolContext notSymbol() throws RecognitionException {
		NotSymbolContext _localctx = new NotSymbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_notSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__11);
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

	public static class BoolIdentifierContext extends ParserRuleContext {
		public BoolSymbolContext boolSymbol() {
			return getRuleContext(BoolSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegfaultParser.IDENTIFIER, 0); }
		public BoolIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolIdentifier; }
	}

	public final BoolIdentifierContext boolIdentifier() throws RecognitionException {
		BoolIdentifierContext _localctx = new BoolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			boolSymbol();
			setState(356);
			match(IDENTIFIER);
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

	public static class BoolSymbolContext extends ParserRuleContext {
		public BoolSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolSymbol; }
	}

	public final BoolSymbolContext boolSymbol() throws RecognitionException {
		BoolSymbolContext _localctx = new BoolSymbolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__12);
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

	public static class SynthSetFunctionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthSetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthSetFunction; }
	}

	public final SynthSetFunctionContext synthSetFunction() throws RecognitionException {
		SynthSetFunctionContext _localctx = new SynthSetFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_synthSetFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(SET);
			setState(361);
			match(T__0);
			setState(362);
			numericalExpression();
			setState(363);
			match(T__1);
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

	public static class SynthChannelFunctionContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(SegfaultParser.CHANNEL, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
		public SynthChannelFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthChannelFunction; }
	}

	public final SynthChannelFunctionContext synthChannelFunction() throws RecognitionException {
		SynthChannelFunctionContext _localctx = new SynthChannelFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_synthChannelFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(CHANNEL);
			setState(366);
			match(T__13);
			setState(367);
			numericalExpression();
			setState(368);
			match(T__14);
			setState(369);
			match(T__5);
			setState(370);
			match(SET);
			setState(371);
			match(T__0);
			setState(372);
			numericalExpression();
			setState(373);
			match(T__1);
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

	public static class SynthNoteFunctionContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(SegfaultParser.NOTE, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthNoteSetContext synthNoteSet() {
			return getRuleContext(SynthNoteSetContext.class,0);
		}
		public SynthNoteLerpContext synthNoteLerp() {
			return getRuleContext(SynthNoteLerpContext.class,0);
		}
		public SynthNoteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthNoteFunction; }
	}

	public final SynthNoteFunctionContext synthNoteFunction() throws RecognitionException {
		SynthNoteFunctionContext _localctx = new SynthNoteFunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_synthNoteFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(NOTE);
			setState(376);
			match(T__13);
			setState(377);
			numericalExpression();
			setState(378);
			match(T__14);
			setState(379);
			match(T__5);
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(380);
				synthNoteSet();
				}
				break;
			case LERP:
				{
				setState(381);
				synthNoteLerp();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SynthStartFunctionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SegfaultParser.START, 0); }
		public SynthStartFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthStartFunction; }
	}

	public final SynthStartFunctionContext synthStartFunction() throws RecognitionException {
		SynthStartFunctionContext _localctx = new SynthStartFunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_synthStartFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(START);
			setState(385);
			match(T__0);
			setState(386);
			match(T__1);
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

	public static class SynthNoteSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public SynthPointStatementContext synthPointStatement() {
			return getRuleContext(SynthPointStatementContext.class,0);
		}
		public SynthNoteSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthNoteSet; }
	}

	public final SynthNoteSetContext synthNoteSet() throws RecognitionException {
		SynthNoteSetContext _localctx = new SynthNoteSetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_synthNoteSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(SET);
			setState(389);
			match(T__0);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(390);
				numericalExpression();
				setState(391);
				match(T__7);
				}
				break;
			}
			setState(395);
			numericalExpression();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(396);
				match(T__7);
				setState(397);
				synthPointStatement();
				}
			}

			setState(400);
			match(T__1);
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

	public static class SynthNoteLerpContext extends ParserRuleContext {
		public TerminalNode LERP() { return getToken(SegfaultParser.LERP, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthPointStatementContext synthPointStatement() {
			return getRuleContext(SynthPointStatementContext.class,0);
		}
		public SynthNoteLerpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthNoteLerp; }
	}

	public final SynthNoteLerpContext synthNoteLerp() throws RecognitionException {
		SynthNoteLerpContext _localctx = new SynthNoteLerpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_synthNoteLerp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(LERP);
			setState(403);
			match(T__0);
			setState(404);
			numericalExpression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(405);
				match(T__7);
				setState(406);
				synthPointStatement();
				}
			}

			setState(409);
			match(T__1);
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

	public static class SynthPointStatementContext extends ParserRuleContext {
		public SynthMidiPitchContext synthMidiPitch() {
			return getRuleContext(SynthMidiPitchContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVolumeContext synthVolume() {
			return getRuleContext(SynthVolumeContext.class,0);
		}
		public SynthVibratoAmplitudeContext synthVibratoAmplitude() {
			return getRuleContext(SynthVibratoAmplitudeContext.class,0);
		}
		public SynthVibratoFrequencyContext synthVibratoFrequency() {
			return getRuleContext(SynthVibratoFrequencyContext.class,0);
		}
		public SynthPointStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthPointStatement; }
	}

	public final SynthPointStatementContext synthPointStatement() throws RecognitionException {
		SynthPointStatementContext _localctx = new SynthPointStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_synthPointStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__2);
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(412);
				synthMidiPitch();
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__10:
			case T__28:
			case INTEGER:
			case DOUBLE:
				{
				setState(413);
				numericalExpression();
				}
				break;
			case T__3:
			case T__7:
				break;
			default:
				break;
			}
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(416);
				match(T__7);
				setState(417);
				synthVolume();
				}
				break;
			}
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(420);
				match(T__7);
				setState(421);
				synthVibratoAmplitude();
				}
				break;
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(424);
				match(T__7);
				setState(425);
				synthVibratoFrequency();
				}
			}

			setState(428);
			match(T__3);
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

	public static class SynthMidiPitchContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthMidiPitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthMidiPitch; }
	}

	public final SynthMidiPitchContext synthMidiPitch() throws RecognitionException {
		SynthMidiPitchContext _localctx = new SynthMidiPitchContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_synthMidiPitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__15);
			setState(431);
			numericalExpression();
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

	public static class SynthVolumeContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVolumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthVolume; }
	}

	public final SynthVolumeContext synthVolume() throws RecognitionException {
		SynthVolumeContext _localctx = new SynthVolumeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_synthVolume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__16);
			setState(434);
			numericalExpression();
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

	public static class SynthVibratoAmplitudeContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVibratoAmplitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthVibratoAmplitude; }
	}

	public final SynthVibratoAmplitudeContext synthVibratoAmplitude() throws RecognitionException {
		SynthVibratoAmplitudeContext _localctx = new SynthVibratoAmplitudeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_synthVibratoAmplitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__17);
			setState(437);
			numericalExpression();
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

	public static class SynthVibratoFrequencyContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthVibratoFrequencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthVibratoFrequency; }
	}

	public final SynthVibratoFrequencyContext synthVibratoFrequency() throws RecognitionException {
		SynthVibratoFrequencyContext _localctx = new SynthVibratoFrequencyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_synthVibratoFrequency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__18);
			setState(440);
			numericalExpression();
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

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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

	public static class BoolOpContext extends ParserRuleContext {
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_addOp);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mulOp);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(T__30);
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__10:
			case T__28:
			case INTEGER:
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SegfaultParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SegfaultParser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class NumberConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberConstant; }
	}

	public final NumberConstantContext numberConstant() throws RecognitionException {
		NumberConstantContext _localctx = new NumberConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numberConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(458);
				sign();
				}
			}

			setState(461);
			unsignedNumber();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedintegerConstantContext unsignedintegerConstant() {
			return getRuleContext(UnsignedintegerConstantContext.class,0);
		}
		public UnsigneddoubleConstantContext unsigneddoubleConstant() {
			return getRuleContext(UnsigneddoubleConstantContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unsignedNumber);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				unsignedintegerConstant();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				unsigneddoubleConstant();
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

	public static class UnsignedintegerConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SegfaultParser.INTEGER, 0); }
		public UnsignedintegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedintegerConstant; }
	}

	public final UnsignedintegerConstantContext unsignedintegerConstant() throws RecognitionException {
		UnsignedintegerConstantContext _localctx = new UnsignedintegerConstantContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unsignedintegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(INTEGER);
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

	public static class UnsigneddoubleConstantContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(SegfaultParser.DOUBLE, 0); }
		public UnsigneddoubleConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigneddoubleConstant; }
	}

	public final UnsigneddoubleConstantContext unsigneddoubleConstant() throws RecognitionException {
		UnsigneddoubleConstantContext _localctx = new UnsigneddoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unsigneddoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(DOUBLE);
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__28);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\3\3\3\6\3|\n\3\r\3\16\3}\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0087\n\4\3\5\3\5\3\5\5\5\u008c\n\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5\u0093"+
		"\13\5\3\5\3\5\7\5\u0097\n\5\f\5\16\5\u009a\13\5\3\5\6\5\u009d\n\5\r\5"+
		"\16\5\u009e\3\5\7\5\u00a2\n\5\f\5\16\5\u00a5\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u00b8\n\7\f"+
		"\7\16\7\u00bb\13\7\3\7\3\7\7\7\u00bf\n\7\f\7\16\7\u00c2\13\7\3\7\6\7\u00c5"+
		"\n\7\r\7\16\7\u00c6\3\7\3\7\7\7\u00cb\n\7\f\7\16\7\u00ce\13\7\3\7\3\7"+
		"\7\7\u00d2\n\7\f\7\16\7\u00d5\13\7\3\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc"+
		"\13\7\3\7\6\7\u00df\n\7\r\7\16\7\u00e0\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00ea\n\b\f\b\16\b\u00ed\13\b\3\b\3\b\7\b\u00f1\n\b\f\b\16\b\u00f4\13"+
		"\b\3\b\6\b\u00f7\n\b\r\b\16\b\u00f8\3\b\3\b\3\t\3\t\3\t\3\n\3\n\6\n\u0102"+
		"\n\n\r\n\16\n\u0103\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0110"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17\u011a\n\17\f\17\16\17\u011d"+
		"\13\17\3\20\3\20\5\20\u0121\n\20\3\21\3\21\3\21\3\21\7\21\u0127\n\21\f"+
		"\21\16\21\u012a\13\21\3\22\3\22\3\22\3\22\7\22\u0130\n\22\f\22\16\22\u0133"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d\n\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5"+
		"\30\u014e\n\30\3\30\3\30\3\30\3\30\5\30\u0154\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u015b\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0162\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u0181\n \3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u018c\n\"\3\"\3\"\3\"\5\"\u0191\n\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\5#\u019a\n#\3#\3#\3$\3$\3$\5$\u01a1\n$\3$\3$\5"+
		"$\u01a5\n$\3$\3$\5$\u01a9\n$\3$\3$\5$\u01ad\n$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\5+\u01c4\n+\3,\3,\3,\5,\u01c9"+
		"\n,\3-\3-\3.\5.\u01ce\n.\3.\3.\3/\3/\5/\u01d4\n/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\6\3\2\13\f\3\2\26\33\4\2\26\27\34\35"+
		"\3\2%&\2\u01e4\2g\3\2\2\2\4y\3\2\2\2\6\u0086\3\2\2\2\b\u0088\3\2\2\2\n"+
		"\u00b0\3\2\2\2\f\u00b2\3\2\2\2\16\u00e4\3\2\2\2\20\u00fc\3\2\2\2\22\u00ff"+
		"\3\2\2\2\24\u0107\3\2\2\2\26\u010f\3\2\2\2\30\u0111\3\2\2\2\32\u0114\3"+
		"\2\2\2\34\u0116\3\2\2\2\36\u0120\3\2\2\2 \u0122\3\2\2\2\"\u012b\3\2\2"+
		"\2$\u013c\3\2\2\2&\u013e\3\2\2\2(\u0141\3\2\2\2*\u0144\3\2\2\2,\u0147"+
		"\3\2\2\2.\u0153\3\2\2\2\60\u015a\3\2\2\2\62\u0161\3\2\2\2\64\u0163\3\2"+
		"\2\2\66\u0165\3\2\2\28\u0168\3\2\2\2:\u016a\3\2\2\2<\u016f\3\2\2\2>\u0179"+
		"\3\2\2\2@\u0182\3\2\2\2B\u0186\3\2\2\2D\u0194\3\2\2\2F\u019d\3\2\2\2H"+
		"\u01b0\3\2\2\2J\u01b3\3\2\2\2L\u01b6\3\2\2\2N\u01b9\3\2\2\2P\u01bc\3\2"+
		"\2\2R\u01be\3\2\2\2T\u01c3\3\2\2\2V\u01c8\3\2\2\2X\u01ca\3\2\2\2Z\u01cd"+
		"\3\2\2\2\\\u01d3\3\2\2\2^\u01d5\3\2\2\2`\u01d7\3\2\2\2b\u01d9\3\2\2\2"+
		"df\7\64\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3\2\2\2ig\3\2\2"+
		"\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2"+
		"\2pt\5\6\4\2qs\7\64\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2"+
		"\2\2vt\3\2\2\2wx\7\2\2\3x\3\3\2\2\2y{\5\6\4\2z|\7\64\2\2{z\3\2\2\2|}\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\5\3\2\2\2\177\u0087\5\n\6\2\u0080\u0087\5"+
		"\f\7\2\u0081\u0087\5\16\b\2\u0082\u0087\5\20\t\2\u0083\u0087\5\24\13\2"+
		"\u0084\u0087\5&\24\2\u0085\u0087\5(\25\2\u0086\177\3\2\2\2\u0086\u0080"+
		"\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\7\3\2\2\2\u0088\u0089\5\30\r"+
		"\2\u0089\u008b\7\3\2\2\u008a\u008c\5\34\17\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\7\4\2\2\u008e\u0090\7\64"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7\5"+
		"\2\2\u0095\u0097\7\64\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\7\64"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\6"+
		"\2\2\u00a7\t\3\2\2\2\u00a8\u00a9\5\66\34\2\u00a9\u00aa\7\7\2\2\u00aa\u00ab"+
		"\5.\30\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\u00af\5 \21\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2"+
		"\2\2\u00b1\13\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5"+
		"\5.\30\2\u00b5\u00b9\7\4\2\2\u00b6\u00b8\7\64\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\7\5\2\2\u00bd\u00bf\7\64\2\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\4\3\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\7\6\2\2\u00c9\u00cb\7\64\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\7$\2\2\u00d0"+
		"\u00d2\7\64\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00da\7\5\2\2\u00d7\u00d9\7\64\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00df\5\4\3\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\6\2\2\u00e3\r\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7\3\2\2"+
		"\u00e6\u00e7\5.\30\2\u00e7\u00eb\7\4\2\2\u00e8\u00ea\7\64\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\7\5\2\2\u00ef\u00f1\7\64"+
		"\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\5\4"+
		"\3\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\6\2\2\u00fb\17\3\2\2"+
		"\2\u00fc\u00fd\7\'\2\2\u00fd\u00fe\5\22\n\2\u00fe\21\3\2\2\2\u00ff\u0101"+
		"\7\3\2\2\u0100\u0102\5\4\3\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\4"+
		"\2\2\u0106\23\3\2\2\2\u0107\u0108\7)\2\2\u0108\u0109\7\b\2\2\u0109\u010a"+
		"\5\26\f\2\u010a\25\3\2\2\2\u010b\u0110\5:\36\2\u010c\u0110\5<\37\2\u010d"+
		"\u0110\5> \2\u010e\u0110\5@!\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\27\3\2\2\2\u0111\u0112"+
		"\5\32\16\2\u0112\u0113\7\60\2\2\u0113\31\3\2\2\2\u0114\u0115\7\t\2\2\u0115"+
		"\33\3\2\2\2\u0116\u011b\5\36\20\2\u0117\u0118\7\n\2\2\u0118\u011a\5\36"+
		"\20\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\35\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0121\5\66\34"+
		"\2\u011f\u0121\5*\26\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\37"+
		"\3\2\2\2\u0122\u0128\5\"\22\2\u0123\u0124\5T+\2\u0124\u0125\5\"\22\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129!\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0131"+
		"\5$\23\2\u012c\u012d\5V,\2\u012d\u012e\5$\23\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132#\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\3\2\2\u0135\u0136"+
		"\5 \21\2\u0136\u0137\7\4\2\2\u0137\u013d\3\2\2\2\u0138\u013d\5Z.\2\u0139"+
		"\u013d\5*\26\2\u013a\u013d\5&\24\2\u013b\u013d\5(\25\2\u013c\u0134\3\2"+
		"\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d%\3\2\2\2\u013e\u013f\t\2\2\2\u013f\u0140\5*\26\2"+
		"\u0140\'\3\2\2\2\u0141\u0142\5*\26\2\u0142\u0143\t\2\2\2\u0143)\3\2\2"+
		"\2\u0144\u0145\5,\27\2\u0145\u0146\7\60\2\2\u0146+\3\2\2\2\u0147\u0148"+
		"\7\r\2\2\u0148-\3\2\2\2\u0149\u014d\5\60\31\2\u014a\u014b\5R*\2\u014b"+
		"\u014c\5\60\31\2\u014c\u014e\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u0154\3\2\2\2\u014f\u0150\5 \21\2\u0150\u0151\5P)\2\u0151"+
		"\u0152\5 \21\2\u0152\u0154\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014f\3\2"+
		"\2\2\u0154/\3\2\2\2\u0155\u0156\7\3\2\2\u0156\u0157\5.\30\2\u0157\u0158"+
		"\7\4\2\2\u0158\u015b\3\2\2\2\u0159\u015b\5\62\32\2\u015a\u0155\3\2\2\2"+
		"\u015a\u0159\3\2\2\2\u015b\61\3\2\2\2\u015c\u015d\5\64\33\2\u015d\u015e"+
		"\5.\30\2\u015e\u0162\3\2\2\2\u015f\u0162\5\66\34\2\u0160\u0162\5X-\2\u0161"+
		"\u015c\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\63\3\2\2"+
		"\2\u0163\u0164\7\16\2\2\u0164\65\3\2\2\2\u0165\u0166\58\35\2\u0166\u0167"+
		"\7\60\2\2\u0167\67\3\2\2\2\u0168\u0169\7\17\2\2\u01699\3\2\2\2\u016a\u016b"+
		"\7*\2\2\u016b\u016c\7\3\2\2\u016c\u016d\5 \21\2\u016d\u016e\7\4\2\2\u016e"+
		";\3\2\2\2\u016f\u0170\7+\2\2\u0170\u0171\7\20\2\2\u0171\u0172\5 \21\2"+
		"\u0172\u0173\7\21\2\2\u0173\u0174\7\b\2\2\u0174\u0175\7*\2\2\u0175\u0176"+
		"\7\3\2\2\u0176\u0177\5 \21\2\u0177\u0178\7\4\2\2\u0178=\3\2\2\2\u0179"+
		"\u017a\7,\2\2\u017a\u017b\7\20\2\2\u017b\u017c\5 \21\2\u017c\u017d\7\21"+
		"\2\2\u017d\u0180\7\b\2\2\u017e\u0181\5B\"\2\u017f\u0181\5D#\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181?\3\2\2\2\u0182\u0183\7.\2\2\u0183\u0184"+
		"\7\3\2\2\u0184\u0185\7\4\2\2\u0185A\3\2\2\2\u0186\u0187\7*\2\2\u0187\u018b"+
		"\7\3\2\2\u0188\u0189\5 \21\2\u0189\u018a\7\n\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\5 "+
		"\21\2\u018e\u018f\7\n\2\2\u018f\u0191\5F$\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\4\2\2\u0193C\3\2\2\2"+
		"\u0194\u0195\7-\2\2\u0195\u0196\7\3\2\2\u0196\u0199\5 \21\2\u0197\u0198"+
		"\7\n\2\2\u0198\u019a\5F$\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\7\4\2\2\u019cE\3\2\2\2\u019d\u01a0\7\5\2\2"+
		"\u019e\u01a1\5H%\2\u019f\u01a1\5 \21\2\u01a0\u019e\3\2\2\2\u01a0\u019f"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a3\7\n\2\2\u01a3"+
		"\u01a5\5J&\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2"+
		"\2\u01a6\u01a7\7\n\2\2\u01a7\u01a9\5L\'\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ab\7\n\2\2\u01ab\u01ad\5N(\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\6"+
		"\2\2\u01afG\3\2\2\2\u01b0\u01b1\7\22\2\2\u01b1\u01b2\5 \21\2\u01b2I\3"+
		"\2\2\2\u01b3\u01b4\7\23\2\2\u01b4\u01b5\5 \21\2\u01b5K\3\2\2\2\u01b6\u01b7"+
		"\7\24\2\2\u01b7\u01b8\5 \21\2\u01b8M\3\2\2\2\u01b9\u01ba\7\25\2\2\u01ba"+
		"\u01bb\5 \21\2\u01bbO\3\2\2\2\u01bc\u01bd\t\3\2\2\u01bdQ\3\2\2\2\u01be"+
		"\u01bf\t\4\2\2\u01bfS\3\2\2\2\u01c0\u01c4\7\36\2\2\u01c1\u01c4\7\37\2"+
		"\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2"+
		"\3\2\2\2\u01c4U\3\2\2\2\u01c5\u01c9\7 \2\2\u01c6\u01c9\7!\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"W\3\2\2\2\u01ca\u01cb\t\5\2\2\u01cbY\3\2\2\2\u01cc\u01ce\5b\62\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\5\\"+
		"/\2\u01d0[\3\2\2\2\u01d1\u01d4\5^\60\2\u01d2\u01d4\5`\61\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4]\3\2\2\2\u01d5\u01d6\7\62\2\2\u01d6"+
		"_\3\2\2\2\u01d7\u01d8\7\63\2\2\u01d8a\3\2\2\2\u01d9\u01da\7\37\2\2\u01da"+
		"c\3\2\2\2.gmt}\u0086\u008b\u0091\u0098\u009e\u00a3\u00b0\u00b9\u00c0\u00c6"+
		"\u00cc\u00d3\u00da\u00e0\u00eb\u00f2\u00f8\u0103\u010f\u011b\u0120\u0128"+
		"\u0131\u013c\u014d\u0153\u015a\u0161\u0180\u018b\u0190\u0199\u01a0\u01a4"+
		"\u01a8\u01ac\u01c3\u01c8\u01cd\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}