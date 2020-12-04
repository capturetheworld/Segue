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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, IF=31, THEN=32, 
		ELSE=33, TRUE=34, FALSE=35, PRINT=36, WHILE=37, SYNTH=38, SET=39, CHANNEL=40, 
		NOTE=41, LERP=42, START=43, COMMENT=44, IDENTIFIER=45, LETTER=46, INTEGER=47, 
		DOUBLE=48, BR=49, WS=50;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_assignmentStatement = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_printStatement = 6, 
		RULE_printArguments = 7, RULE_synthStatement = 8, RULE_synthFunction = 9, 
		RULE_numericalExpression = 10, RULE_term = 11, RULE_factor = 12, RULE_prefixOp = 13, 
		RULE_suffixOp = 14, RULE_numIdentifier = 15, RULE_numSymbol = 16, RULE_booleanExpression = 17, 
		RULE_booleanTerm = 18, RULE_booleanSingleton = 19, RULE_notSymbol = 20, 
		RULE_boolIdentifier = 21, RULE_boolSymbol = 22, RULE_synthSetFunction = 23, 
		RULE_synthChannelFunction = 24, RULE_synthNoteFunction = 25, RULE_synthStartFunction = 26, 
		RULE_synthNoteSet = 27, RULE_synthNoteLerp = 28, RULE_synthPointStatement = 29, 
		RULE_synthMidiPitch = 30, RULE_synthVolume = 31, RULE_synthVibratoAmplitude = 32, 
		RULE_synthVibratoFrequency = 33, RULE_relOp = 34, RULE_boolOp = 35, RULE_addOp = 36, 
		RULE_mulOp = 37, RULE_booleanConstant = 38, RULE_numberConstant = 39, 
		RULE_unsignedNumber = 40, RULE_unsignedintegerConstant = 41, RULE_unsigneddoubleConstant = 42, 
		RULE_sign = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "assignmentStatement", "ifStatement", 
			"whileStatement", "printStatement", "printArguments", "synthStatement", 
			"synthFunction", "numericalExpression", "term", "factor", "prefixOp", 
			"suffixOp", "numIdentifier", "numSymbol", "booleanExpression", "booleanTerm", 
			"booleanSingleton", "notSymbol", "boolIdentifier", "boolSymbol", "synthSetFunction", 
			"synthChannelFunction", "synthNoteFunction", "synthStartFunction", "synthNoteSet", 
			"synthNoteLerp", "synthPointStatement", "synthMidiPitch", "synthVolume", 
			"synthVibratoAmplitude", "synthVibratoFrequency", "relOp", "boolOp", 
			"addOp", "mulOp", "booleanConstant", "numberConstant", "unsignedNumber", 
			"unsignedintegerConstant", "unsigneddoubleConstant", "sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'{'", "'}'", "'.'", "'++'", "'--'", "'#'", 
			"'!'", "'$'", "'['", "']'", "','", "'m'", "'v'", "'a'", "'f'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'&'", "'|'", "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "IF", "THEN", "ELSE", "TRUE", 
			"FALSE", "PRINT", "WHILE", "SYNTH", "SET", "CHANNEL", "NOTE", "LERP", 
			"START", "COMMENT", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", "BR", 
			"WS"
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
		public TerminalNode BR() { return getToken(SegfaultParser.BR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BR) {
				{
				setState(88);
				match(BR);
				}
			}

			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				line();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
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
		public TerminalNode BR() { return getToken(SegfaultParser.BR, 0); }
		public TerminalNode EOF() { return getToken(SegfaultParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			statement();
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==BR) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				synthStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				prefixOp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStatement);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				boolIdentifier();
				setState(109);
				match(T__0);
				setState(110);
				booleanExpression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				numIdentifier();
				setState(113);
				match(T__0);
				setState(114);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			match(T__1);
			setState(120);
			booleanExpression();
			setState(121);
			match(T__2);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(122);
				match(BR);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__3);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(129);
				match(BR);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				line();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(140);
			match(T__4);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(141);
				match(BR);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(ELSE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(148);
				match(BR);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__3);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(155);
				match(BR);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				line();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(166);
			match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			match(T__1);
			setState(170);
			booleanExpression();
			setState(171);
			match(T__2);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(172);
				match(BR);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__3);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BR) {
				{
				{
				setState(179);
				match(BR);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				line();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(190);
			match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PRINT);
			setState(193);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitPrintArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentsContext printArguments() throws RecognitionException {
		PrintArgumentsContext _localctx = new PrintArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__1);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				line();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << SYNTH))) != 0) );
			setState(201);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthStatementContext synthStatement() throws RecognitionException {
		SynthStatementContext _localctx = new SynthStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_synthStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SYNTH);
			setState(204);
			match(T__5);
			setState(205);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthFunctionContext synthFunction() throws RecognitionException {
		SynthFunctionContext _localctx = new SynthFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_synthFunction);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				synthSetFunction();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				synthChannelFunction();
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				synthNoteFunction();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumericalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numericalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			term();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__26) | (1L << T__27) | (1L << INTEGER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(214);
				addOp();
				setState(215);
				term();
				}
				}
				setState(221);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			factor();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					mulOp();
					setState(224);
					factor();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__1);
				setState(232);
				numericalExpression();
				setState(233);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				numberConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				numIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				prefixOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSuffixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixOpContext suffixOp() throws RecognitionException {
		SuffixOpContext _localctx = new SuffixOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_suffixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			numIdentifier();
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumIdentifierContext numIdentifier() throws RecognitionException {
		NumIdentifierContext _localctx = new NumIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			numSymbol();
			setState(248);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumSymbolContext numSymbol() throws RecognitionException {
		NumSymbolContext _localctx = new NumSymbolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__8);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanExpression);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				booleanTerm();
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(253);
					boolOp();
					setState(254);
					booleanTerm();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				numericalExpression();
				setState(259);
				relOp();
				setState(260);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanTerm);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__1);
				setState(265);
				booleanExpression();
				setState(266);
				match(T__2);
				}
				break;
			case T__9:
			case T__10:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanSingleton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSingletonContext booleanSingleton() throws RecognitionException {
		BooleanSingletonContext _localctx = new BooleanSingletonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanSingleton);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				notSymbol();
				setState(272);
				booleanExpression();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				boolIdentifier();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNotSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotSymbolContext notSymbol() throws RecognitionException {
		NotSymbolContext _localctx = new NotSymbolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__9);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolIdentifierContext boolIdentifier() throws RecognitionException {
		BoolIdentifierContext _localctx = new BoolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_boolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			boolSymbol();
			setState(281);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBoolSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSymbolContext boolSymbol() throws RecognitionException {
		BoolSymbolContext _localctx = new BoolSymbolContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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

	public static class SynthSetFunctionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SegfaultParser.SET, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public SynthSetFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthSetFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthSetFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthSetFunctionContext synthSetFunction() throws RecognitionException {
		SynthSetFunctionContext _localctx = new SynthSetFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_synthSetFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(SET);
			setState(286);
			match(T__1);
			setState(287);
			numericalExpression();
			setState(288);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthChannelFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthChannelFunctionContext synthChannelFunction() throws RecognitionException {
		SynthChannelFunctionContext _localctx = new SynthChannelFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_synthChannelFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(CHANNEL);
			setState(291);
			match(T__11);
			setState(292);
			numericalExpression();
			setState(293);
			match(T__12);
			setState(294);
			match(T__5);
			setState(295);
			match(SET);
			setState(296);
			match(T__1);
			setState(297);
			numericalExpression();
			setState(298);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthNoteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteFunctionContext synthNoteFunction() throws RecognitionException {
		SynthNoteFunctionContext _localctx = new SynthNoteFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_synthNoteFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(NOTE);
			setState(301);
			match(T__11);
			setState(302);
			numericalExpression();
			setState(303);
			match(T__12);
			setState(304);
			match(T__5);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(305);
				synthNoteSet();
				}
				break;
			case LERP:
				{
				setState(306);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthStartFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthStartFunctionContext synthStartFunction() throws RecognitionException {
		SynthStartFunctionContext _localctx = new SynthStartFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_synthStartFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(START);
			setState(310);
			match(T__1);
			setState(311);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthNoteSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteSetContext synthNoteSet() throws RecognitionException {
		SynthNoteSetContext _localctx = new SynthNoteSetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_synthNoteSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(SET);
			setState(314);
			match(T__1);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(315);
				numericalExpression();
				setState(316);
				match(T__13);
				}
				break;
			}
			setState(320);
			numericalExpression();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(321);
				match(T__13);
				setState(322);
				synthPointStatement();
				}
			}

			setState(325);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthNoteLerp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthNoteLerpContext synthNoteLerp() throws RecognitionException {
		SynthNoteLerpContext _localctx = new SynthNoteLerpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_synthNoteLerp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(LERP);
			setState(328);
			match(T__1);
			setState(329);
			numericalExpression();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(330);
				match(T__13);
				setState(331);
				synthPointStatement();
				}
			}

			setState(334);
			match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthPointStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthPointStatementContext synthPointStatement() throws RecognitionException {
		SynthPointStatementContext _localctx = new SynthPointStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_synthPointStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__3);
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(337);
				synthMidiPitch();
				}
				break;
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__27:
			case INTEGER:
			case DOUBLE:
				{
				setState(338);
				numericalExpression();
				}
				break;
			case T__4:
			case T__13:
				break;
			default:
				break;
			}
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(341);
				match(T__13);
				setState(342);
				synthVolume();
				}
				break;
			}
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(345);
				match(T__13);
				setState(346);
				synthVibratoAmplitude();
				}
				break;
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(349);
				match(T__13);
				setState(350);
				synthVibratoFrequency();
				}
			}

			setState(353);
			match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthMidiPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthMidiPitchContext synthMidiPitch() throws RecognitionException {
		SynthMidiPitchContext _localctx = new SynthMidiPitchContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_synthMidiPitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__14);
			setState(356);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthVolume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVolumeContext synthVolume() throws RecognitionException {
		SynthVolumeContext _localctx = new SynthVolumeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_synthVolume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__15);
			setState(359);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthVibratoAmplitude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVibratoAmplitudeContext synthVibratoAmplitude() throws RecognitionException {
		SynthVibratoAmplitudeContext _localctx = new SynthVibratoAmplitudeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_synthVibratoAmplitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__16);
			setState(362);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSynthVibratoFrequency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthVibratoFrequencyContext synthVibratoFrequency() throws RecognitionException {
		SynthVibratoFrequencyContext _localctx = new SynthVibratoFrequencyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_synthVibratoFrequency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__17);
			setState(365);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_addOp);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(T__27);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mulOp);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(T__29);
				}
				break;
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__27:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitNumberConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberConstantContext numberConstant() throws RecognitionException {
		NumberConstantContext _localctx = new NumberConstantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_numberConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(383);
				sign();
				}
			}

			setState(386);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unsignedNumber);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				unsignedintegerConstant();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitUnsignedintegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedintegerConstantContext unsignedintegerConstant() throws RecognitionException {
		UnsignedintegerConstantContext _localctx = new UnsignedintegerConstantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unsignedintegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitUnsigneddoubleConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsigneddoubleConstantContext unsigneddoubleConstant() throws RecognitionException {
		UnsigneddoubleConstantContext _localctx = new UnsigneddoubleConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unsigneddoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__27);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0191\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\5\2\\\n\2\3\2\6\2_\n\2\r\2\16\2`\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\6\3\6\7\6\u0085\n\6"+
		"\f\6\16\6\u0088\13\6\3\6\6\6\u008b\n\6\r\6\16\6\u008c\3\6\3\6\7\6\u0091"+
		"\n\6\f\6\16\6\u0094\13\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6"+
		"\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\3\6\6\6\u00a5\n\6\r\6\16\6\u00a6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\7\3\7"+
		"\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\7\6\7\u00bd\n\7\r\7\16\7\u00be\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\6\t\u00c8\n\t\r\t\16\t\u00c9\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\7\f\u00dc"+
		"\n\f\f\f\16\f\u00df\13\f\3\r\3\r\3\r\3\r\7\r\u00e5\n\r\f\r\16\r\u00e8"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f2\n\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23"+
		"\u0103\n\23\3\23\3\23\3\23\3\23\5\23\u0109\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0110\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0136\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0141\n"+
		"\35\3\35\3\35\3\35\5\35\u0146\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u014f\n\36\3\36\3\36\3\37\3\37\3\37\5\37\u0156\n\37\3\37\3\37\5"+
		"\37\u015a\n\37\3\37\3\37\5\37\u015e\n\37\3\37\3\37\5\37\u0162\n\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\5&\u0179"+
		"\n&\3\'\3\'\3\'\5\'\u017e\n\'\3(\3(\3)\5)\u0183\n)\3)\3)\3*\3*\5*\u0189"+
		"\n*\3+\3+\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\7\3\3\63\63\3\2\t\n\3\2\25\32"+
		"\4\2\25\26\33\34\3\2$%\2\u0195\2[\3\2\2\2\4b\3\2\2\2\6l\3\2\2\2\bv\3\2"+
		"\2\2\nx\3\2\2\2\f\u00aa\3\2\2\2\16\u00c2\3\2\2\2\20\u00c5\3\2\2\2\22\u00cd"+
		"\3\2\2\2\24\u00d5\3\2\2\2\26\u00d7\3\2\2\2\30\u00e0\3\2\2\2\32\u00f1\3"+
		"\2\2\2\34\u00f3\3\2\2\2\36\u00f6\3\2\2\2 \u00f9\3\2\2\2\"\u00fc\3\2\2"+
		"\2$\u0108\3\2\2\2&\u010f\3\2\2\2(\u0116\3\2\2\2*\u0118\3\2\2\2,\u011a"+
		"\3\2\2\2.\u011d\3\2\2\2\60\u011f\3\2\2\2\62\u0124\3\2\2\2\64\u012e\3\2"+
		"\2\2\66\u0137\3\2\2\28\u013b\3\2\2\2:\u0149\3\2\2\2<\u0152\3\2\2\2>\u0165"+
		"\3\2\2\2@\u0168\3\2\2\2B\u016b\3\2\2\2D\u016e\3\2\2\2F\u0171\3\2\2\2H"+
		"\u0173\3\2\2\2J\u0178\3\2\2\2L\u017d\3\2\2\2N\u017f\3\2\2\2P\u0182\3\2"+
		"\2\2R\u0188\3\2\2\2T\u018a\3\2\2\2V\u018c\3\2\2\2X\u018e\3\2\2\2Z\\\7"+
		"\63\2\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\4\3\2^]\3\2\2\2_`\3\2\2\2"+
		"`^\3\2\2\2`a\3\2\2\2a\3\3\2\2\2bc\5\6\4\2cd\t\2\2\2d\5\3\2\2\2em\5\b\5"+
		"\2fm\5\n\6\2gm\5\f\7\2hm\5\16\b\2im\5\22\n\2jm\5\34\17\2km\5\36\20\2l"+
		"e\3\2\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2"+
		"m\7\3\2\2\2no\5,\27\2op\7\3\2\2pq\5$\23\2qw\3\2\2\2rs\5 \21\2st\7\3\2"+
		"\2tu\5\26\f\2uw\3\2\2\2vn\3\2\2\2vr\3\2\2\2w\t\3\2\2\2xy\7!\2\2yz\7\4"+
		"\2\2z{\5$\23\2{\177\7\5\2\2|~\7\63\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0086"+
		"\7\6\2\2\u0083\u0085\7\63\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\7\7"+
		"\2\2\u008f\u0091\7\63\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0099\7#\2\2\u0096\u0098\7\63\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\7\6\2\2\u009d\u009f\7\63\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5\4\3\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\13\3\2\2\2\u00aa\u00ab"+
		"\7\'\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\5$\23\2\u00ad\u00b1\7\5\2\2\u00ae"+
		"\u00b0\7\63\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b8\7\6\2\2\u00b5\u00b7\7\63\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bd\5\4\3\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7\7\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\7&\2\2\u00c3\u00c4\5\20\t\2"+
		"\u00c4\17\3\2\2\2\u00c5\u00c7\7\4\2\2\u00c6\u00c8\5\4\3\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7\5\2\2\u00cc\21\3\2\2\2\u00cd\u00ce\7(\2\2"+
		"\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5\24\13\2\u00d0\23\3\2\2\2\u00d1\u00d6"+
		"\5\60\31\2\u00d2\u00d6\5\62\32\2\u00d3\u00d6\5\64\33\2\u00d4\u00d6\5\66"+
		"\34\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00dd\5\30\r\2\u00d8\u00d9\5J&\2"+
		"\u00d9\u00da\5\30\r\2\u00da\u00dc\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\27\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e6\5\32\16\2\u00e1\u00e2\5L\'\2\u00e2\u00e3\5"+
		"\32\16\2\u00e3\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e9\u00ea\7\4\2\2\u00ea\u00eb\5\26\f\2\u00eb\u00ec\7\5\2\2\u00ec"+
		"\u00f2\3\2\2\2\u00ed\u00f2\5P)\2\u00ee\u00f2\5 \21\2\u00ef\u00f2\5\34"+
		"\17\2\u00f0\u00f2\5\36\20\2\u00f1\u00e9\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1"+
		"\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\33\3\2\2"+
		"\2\u00f3\u00f4\t\3\2\2\u00f4\u00f5\5 \21\2\u00f5\35\3\2\2\2\u00f6\u00f7"+
		"\5 \21\2\u00f7\u00f8\t\3\2\2\u00f8\37\3\2\2\2\u00f9\u00fa\5\"\22\2\u00fa"+
		"\u00fb\7/\2\2\u00fb!\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd#\3\2\2\2\u00fe"+
		"\u0102\5&\24\2\u00ff\u0100\5H%\2\u0100\u0101\5&\24\2\u0101\u0103\3\2\2"+
		"\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0109\3\2\2\2\u0104\u0105"+
		"\5\26\f\2\u0105\u0106\5F$\2\u0106\u0107\5\26\f\2\u0107\u0109\3\2\2\2\u0108"+
		"\u00fe\3\2\2\2\u0108\u0104\3\2\2\2\u0109%\3\2\2\2\u010a\u010b\7\4\2\2"+
		"\u010b\u010c\5$\23\2\u010c\u010d\7\5\2\2\u010d\u0110\3\2\2\2\u010e\u0110"+
		"\5(\25\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110\'\3\2\2\2\u0111"+
		"\u0112\5*\26\2\u0112\u0113\5$\23\2\u0113\u0117\3\2\2\2\u0114\u0117\5,"+
		"\27\2\u0115\u0117\5N(\2\u0116\u0111\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117)\3\2\2\2\u0118\u0119\7\f\2\2\u0119+\3\2\2\2\u011a"+
		"\u011b\5.\30\2\u011b\u011c\7/\2\2\u011c-\3\2\2\2\u011d\u011e\7\r\2\2\u011e"+
		"/\3\2\2\2\u011f\u0120\7)\2\2\u0120\u0121\7\4\2\2\u0121\u0122\5\26\f\2"+
		"\u0122\u0123\7\5\2\2\u0123\61\3\2\2\2\u0124\u0125\7*\2\2\u0125\u0126\7"+
		"\16\2\2\u0126\u0127\5\26\f\2\u0127\u0128\7\17\2\2\u0128\u0129\7\b\2\2"+
		"\u0129\u012a\7)\2\2\u012a\u012b\7\4\2\2\u012b\u012c\5\26\f\2\u012c\u012d"+
		"\7\5\2\2\u012d\63\3\2\2\2\u012e\u012f\7+\2\2\u012f\u0130\7\16\2\2\u0130"+
		"\u0131\5\26\f\2\u0131\u0132\7\17\2\2\u0132\u0135\7\b\2\2\u0133\u0136\5"+
		"8\35\2\u0134\u0136\5:\36\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\65\3\2\2\2\u0137\u0138\7-\2\2\u0138\u0139\7\4\2\2\u0139\u013a\7\5\2\2"+
		"\u013a\67\3\2\2\2\u013b\u013c\7)\2\2\u013c\u0140\7\4\2\2\u013d\u013e\5"+
		"\26\f\2\u013e\u013f\7\20\2\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\5\26\f\2\u0143\u0144\7"+
		"\20\2\2\u0144\u0146\5<\37\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\7\5\2\2\u01489\3\2\2\2\u0149\u014a\7,\2\2\u014a"+
		"\u014b\7\4\2\2\u014b\u014e\5\26\f\2\u014c\u014d\7\20\2\2\u014d\u014f\5"+
		"<\37\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\7\5\2\2\u0151;\3\2\2\2\u0152\u0155\7\6\2\2\u0153\u0156\5> \2\u0154"+
		"\u0156\5\26\f\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7\20\2\2\u0158\u015a\5@!\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c\7\20"+
		"\2\2\u015c\u015e\5B\"\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u0160\7\20\2\2\u0160\u0162\5D#\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\7\2\2\u0164"+
		"=\3\2\2\2\u0165\u0166\7\21\2\2\u0166\u0167\5\26\f\2\u0167?\3\2\2\2\u0168"+
		"\u0169\7\22\2\2\u0169\u016a\5\26\f\2\u016aA\3\2\2\2\u016b\u016c\7\23\2"+
		"\2\u016c\u016d\5\26\f\2\u016dC\3\2\2\2\u016e\u016f\7\24\2\2\u016f\u0170"+
		"\5\26\f\2\u0170E\3\2\2\2\u0171\u0172\t\4\2\2\u0172G\3\2\2\2\u0173\u0174"+
		"\t\5\2\2\u0174I\3\2\2\2\u0175\u0179\7\35\2\2\u0176\u0179\7\36\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2"+
		"\2\2\u0179K\3\2\2\2\u017a\u017e\7\37\2\2\u017b\u017e\7 \2\2\u017c\u017e"+
		"\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"M\3\2\2\2\u017f\u0180\t\6\2\2\u0180O\3\2\2\2\u0181\u0183\5X-\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5R*\2\u0185"+
		"Q\3\2\2\2\u0186\u0189\5T+\2\u0187\u0189\5V,\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189S\3\2\2\2\u018a\u018b\7\61\2\2\u018bU\3\2\2\2\u018c"+
		"\u018d\7\62\2\2\u018dW\3\2\2\2\u018e\u018f\7\36\2\2\u018fY\3\2\2\2%[`"+
		"lv\177\u0086\u008c\u0092\u0099\u00a0\u00a6\u00b1\u00b8\u00be\u00c9\u00d5"+
		"\u00dd\u00e6\u00f1\u0102\u0108\u010f\u0116\u0135\u0140\u0145\u014e\u0155"+
		"\u0159\u015d\u0161\u0178\u017d\u0182\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}