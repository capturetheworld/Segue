// Generated from /Users/ian/Documents/GitHub/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

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
		T__9=10, T__10=11, T__11=12, PROGRAM=13, CONST=14, TYPE=15, OF=16, VAR=17, 
		BEGIN=18, END=19, DIV=20, AND=21, OR=22, NOT=23, THEN=24, UNTIL=25, TRUE=26, 
		FALSE=27, DO=28, PROCEDURE=29, FUNCTION=30, WHILE=31, COMMENT=32, IDENTIFIER=33, 
		LETTER=34, INTEGER=35, DOUBLE=36, P=37, R=38, I=39, N=40, T=41, L=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignmentStatement = 2, RULE_ifStatement = 3, 
		RULE_whileStatement = 4, RULE_printStatement = 5, RULE_booleanConstant = 6, 
		RULE_numberConstant = 7, RULE_unsignedNumber = 8, RULE_unsignedintegerConstant = 9, 
		RULE_unsigneddoubleConstant = 10, RULE_boolSymbol = 11, RULE_doubleSymbol = 12, 
		RULE_relOp = 13, RULE_op = 14, RULE_sign = 15, RULE_println = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignmentStatement", "ifStatement", "whileStatement", 
			"printStatement", "booleanConstant", "numberConstant", "unsignedNumber", 
			"unsignedintegerConstant", "unsigneddoubleConstant", "boolSymbol", "doubleSymbol", 
			"relOp", "op", "sign", "println"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'$'", "'#'", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PROGRAM", "CONST", "TYPE", "OF", "VAR", "BEGIN", "END", "DIV", 
			"AND", "OR", "NOT", "THEN", "UNTIL", "TRUE", "FALSE", "DO", "PROCEDURE", 
			"FUNCTION", "WHILE", "COMMENT", "IDENTIFIER", "LETTER", "INTEGER", "DOUBLE", 
			"P", "R", "I", "N", "T", "L"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__2 );
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			assignmentStatement();
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
		public BoolSymbolContext boolSymbol() {
			return getRuleContext(BoolSymbolContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SegfaultParser.IDENTIFIER, 0); }
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public DoubleSymbolContext doubleSymbol() {
			return getRuleContext(DoubleSymbolContext.class,0);
		}
		public NumberConstantContext numberConstant() {
			return getRuleContext(NumberConstantContext.class,0);
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
		enterRule(_localctx, 4, RULE_assignmentStatement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				boolSymbol();
				setState(42);
				match(IDENTIFIER);
				setState(43);
				match(T__0);
				setState(44);
				booleanConstant();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				doubleSymbol();
				setState(47);
				match(IDENTIFIER);
				setState(48);
				match(T__0);
				setState(49);
				numberConstant();
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
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 8, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 12, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		enterRule(_localctx, 14, RULE_numberConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(61);
				sign();
				}
			}

			setState(64);
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
		enterRule(_localctx, 16, RULE_unsignedNumber);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				unsignedintegerConstant();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
		enterRule(_localctx, 18, RULE_unsignedintegerConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
		enterRule(_localctx, 20, RULE_unsigneddoubleConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		enterRule(_localctx, 22, RULE_boolSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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

	public static class DoubleSymbolContext extends ParserRuleContext {
		public DoubleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitDoubleSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleSymbolContext doubleSymbol() throws RecognitionException {
		DoubleSymbolContext _localctx = new DoubleSymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_doubleSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		enterRule(_localctx, 26, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode P() { return getToken(SegfaultParser.P, 0); }
		public TerminalNode R() { return getToken(SegfaultParser.R, 0); }
		public TerminalNode I() { return getToken(SegfaultParser.I, 0); }
		public List<TerminalNode> N() { return getTokens(SegfaultParser.N); }
		public TerminalNode N(int i) {
			return getToken(SegfaultParser.N, i);
		}
		public TerminalNode T() { return getToken(SegfaultParser.T, 0); }
		public TerminalNode L() { return getToken(SegfaultParser.L, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SegfaultVisitor ) return ((SegfaultVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(P);
			setState(85);
			match(R);
			setState(86);
			match(I);
			setState(87);
			match(N);
			setState(88);
			match(T);
			setState(89);
			match(L);
			setState(90);
			match(N);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,_\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\6\2"+
		"&\n\2\r\2\16\2\'\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\tA\n\t\3\t\3\t\3\n\3\n\5\n"+
		"G\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\5\3\2\34\35\4\2\3\3\6\n\3\2\13\16\2Q\2%\3\2"+
		"\2\2\4)\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16=\3"+
		"\2\2\2\20@\3\2\2\2\22F\3\2\2\2\24H\3\2\2\2\26J\3\2\2\2\30L\3\2\2\2\32"+
		"N\3\2\2\2\34P\3\2\2\2\36R\3\2\2\2 T\3\2\2\2\"V\3\2\2\2$&\5\4\3\2%$\3\2"+
		"\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\5\6\4\2*\5\3\2\2\2"+
		"+,\5\30\r\2,-\7#\2\2-.\7\3\2\2./\5\16\b\2/\66\3\2\2\2\60\61\5\32\16\2"+
		"\61\62\7#\2\2\62\63\7\3\2\2\63\64\5\20\t\2\64\66\3\2\2\2\65+\3\2\2\2\65"+
		"\60\3\2\2\2\66\7\3\2\2\2\678\3\2\2\28\t\3\2\2\29:\3\2\2\2:\13\3\2\2\2"+
		";<\3\2\2\2<\r\3\2\2\2=>\t\2\2\2>\17\3\2\2\2?A\5 \21\2@?\3\2\2\2@A\3\2"+
		"\2\2AB\3\2\2\2BC\5\22\n\2C\21\3\2\2\2DG\5\24\13\2EG\5\26\f\2FD\3\2\2\2"+
		"FE\3\2\2\2G\23\3\2\2\2HI\7%\2\2I\25\3\2\2\2JK\7&\2\2K\27\3\2\2\2LM\7\4"+
		"\2\2M\31\3\2\2\2NO\7\5\2\2O\33\3\2\2\2PQ\t\3\2\2Q\35\3\2\2\2RS\t\4\2\2"+
		"S\37\3\2\2\2TU\7\f\2\2U!\3\2\2\2VW\7\'\2\2WX\7(\2\2XY\7)\2\2YZ\7*\2\2"+
		"Z[\7+\2\2[\\\7,\2\2\\]\7*\2\2]#\3\2\2\2\6\'\65@F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}