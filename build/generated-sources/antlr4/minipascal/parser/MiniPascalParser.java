// Generated from /home/chiarotti/NetBeansProjects/MiniPascal/grammar/minipascal/parser/MiniPascal.g4 by ANTLR 4.6

    package minipascal.parser;
    import minipascal.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, DIV=2, OR=3, AND=4, NOT=5, IF=6, THEN=7, ELSE=8, OF=9, WHILE=10, 
		DO=11, BEGIN=12, END=13, READ=14, WRITE=15, VAR=16, ARRAY=17, PROCEDURE=18, 
		PROGRAM=19, PLUS=20, MINUS=21, MULT=22, EQUALS=23, RT=24, LT=25, LE=26, 
		RE=27, LR=28, OP=29, CP=30, OC=31, CC=32, ATTRIB=33, DOT=34, COMMA=35, 
		SMCOLON=36, COLON=37, DBDOT=38, INTEGER=39, BOOLEAN=40, FLOAT=41, STRING=42, 
		TRUE=43, FALSE=44, ID=45, STR=46, LETTER=47, DIGIT=48, WS=49;
	public static final int
		RULE_myStartingRule = 0, RULE_program = 1, RULE_block = 2, RULE_vardeclpart = 3, 
		RULE_vardecl = 4, RULE_type = 5, RULE_arraytype = 6, RULE_indexrange = 7, 
		RULE_simpletype = 8, RULE_procdeclpart = 9, RULE_procdecl = 10, RULE_statementpart = 11, 
		RULE_cmpstatement = 12, RULE_statement = 13, RULE_smpstatement = 14, RULE_assstatement = 15, 
		RULE_procstatement = 16, RULE_readstatement = 17, RULE_writestatement = 18, 
		RULE_expression = 19, RULE_simpleexpression = 20, RULE_term = 21, RULE_factor = 22, 
		RULE_constant = 23, RULE_addop = 24, RULE_multop = 25, RULE_variable = 26, 
		RULE_stcstatement = 27, RULE_ifstatement = 28, RULE_whilestatement = 29, 
		RULE_forstatement = 30, RULE_letdig = 31, RULE_specsym = 32, RULE_predid = 33;
	public static final String[] ruleNames = {
		"myStartingRule", "program", "block", "vardeclpart", "vardecl", "type", 
		"arraytype", "indexrange", "simpletype", "procdeclpart", "procdecl", "statementpart", 
		"cmpstatement", "statement", "smpstatement", "assstatement", "procstatement", 
		"readstatement", "writestatement", "expression", "simpleexpression", "term", 
		"factor", "constant", "addop", "multop", "variable", "stcstatement", "ifstatement", 
		"whilestatement", "forstatement", "letdig", "specsym", "predid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'='", 
		"'>'", "'<'", "'<='", "'>='", "'<>'", "'('", "')'", "'['", "']'", "':='", 
		"'.'", "','", "';'", "':'", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FOR", "DIV", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "OF", "WHILE", 
		"DO", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", "PROCEDURE", "PROGRAM", 
		"PLUS", "MINUS", "MULT", "EQUALS", "RT", "LT", "LE", "RE", "LR", "OP", 
		"CP", "OC", "CC", "ATTRIB", "DOT", "COMMA", "SMCOLON", "COLON", "DBDOT", 
		"INTEGER", "BOOLEAN", "FLOAT", "STRING", "TRUE", "FALSE", "ID", "STR", 
		"LETTER", "DIGIT", "WS"
	};
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
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MyStartingRuleContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public MyStartingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStartingRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMyStartingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyStartingRuleContext myStartingRule() throws RecognitionException {
		MyStartingRuleContext _localctx = new MyStartingRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStartingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				program();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAM );
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgrmContext extends ProgramContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgrmContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProgrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			_localctx = new ProgrmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PROGRAM);
			setState(74);
			match(STR);
			setState(75);
			match(SMCOLON);
			setState(76);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockProgrmContext extends BlockContext {
		public VardeclpartContext vardeclpart() {
			return getRuleContext(VardeclpartContext.class,0);
		}
		public ProcdeclpartContext procdeclpart() {
			return getRuleContext(ProcdeclpartContext.class,0);
		}
		public StatementpartContext statementpart() {
			return getRuleContext(StatementpartContext.class,0);
		}
		public BlockProgrmContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBlockProgrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			_localctx = new BlockProgrmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(78);
				vardeclpart();
				}
				break;
			}
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(81);
				procdeclpart();
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(84);
				statementpart();
				}
				break;
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

	public static class VardeclpartContext extends ParserRuleContext {
		public VardeclpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclpart; }
	 
		public VardeclpartContext() { }
		public void copyFrom(VardeclpartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockVarContext extends VardeclpartContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(MiniPascalParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(MiniPascalParser.SMCOLON, i);
		}
		public BlockVarContext(VardeclpartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBlockVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclpartContext vardeclpart() throws RecognitionException {
		VardeclpartContext _localctx = new VardeclpartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardeclpart);
		int _la;
		try {
			_localctx = new BlockVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(87);
				match(VAR);
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					vardecl();
					setState(89);
					match(SMCOLON);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationContext extends VardeclContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			variable();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				variable();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(COLON);
			setState(106);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarContext extends TypeContext {
		public SimpletypeContext simpletype() {
			return getRuleContext(SimpletypeContext.class,0);
		}
		public SimpleVarContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSimpleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVarTypeContext extends TypeContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public ArrayVarTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArrayVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
				_localctx = new SimpleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				simpletype();
				}
				break;
			case ARRAY:
				_localctx = new ArrayVarTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				arraytype();
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

	public static class ArraytypeContext extends ParserRuleContext {
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
	 
		public ArraytypeContext() { }
		public void copyFrom(ArraytypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayVarContext extends ArraytypeContext {
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public IndexrangeContext indexrange() {
			return getRuleContext(IndexrangeContext.class,0);
		}
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public SimpletypeContext simpletype() {
			return getRuleContext(SimpletypeContext.class,0);
		}
		public ArrayVarContext(ArraytypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArrayVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arraytype);
		try {
			_localctx = new ArrayVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ARRAY);
			setState(113);
			match(OC);
			setState(114);
			indexrange();
			setState(115);
			match(CC);
			setState(116);
			match(OF);
			setState(117);
			simpletype();
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

	public static class IndexrangeContext extends ParserRuleContext {
		public IndexrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexrange; }
	 
		public IndexrangeContext() { }
		public void copyFrom(IndexrangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeIndexVarContext extends IndexrangeContext {
		public List<TerminalNode> DIGIT() { return getTokens(MiniPascalParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MiniPascalParser.DIGIT, i);
		}
		public RangeIndexVarContext(IndexrangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRangeIndexVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexrangeContext indexrange() throws RecognitionException {
		IndexrangeContext _localctx = new IndexrangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indexrange);
		try {
			_localctx = new RangeIndexVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DIGIT);
			setState(120);
			match(DBDOT);
			setState(121);
			match(DIGIT);
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

	public static class SimpletypeContext extends ParserRuleContext {
		public SimpletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletype; }
	 
		public SimpletypeContext() { }
		public void copyFrom(SimpletypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdVarContext extends SimpletypeContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(MiniPascalParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public IdVarContext(SimpletypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIdVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletypeContext simpletype() throws RecognitionException {
		SimpletypeContext _localctx = new SimpletypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpletype);
		int _la;
		try {
			_localctx = new IdVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class ProcdeclpartContext extends ParserRuleContext {
		public List<ProcdeclContext> procdecl() {
			return getRuleContexts(ProcdeclContext.class);
		}
		public ProcdeclContext procdecl(int i) {
			return getRuleContext(ProcdeclContext.class,i);
		}
		public ProcdeclpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procdeclpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProcdeclpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcdeclpartContext procdeclpart() throws RecognitionException {
		ProcdeclpartContext _localctx = new ProcdeclpartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procdeclpart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(125);
				procdecl();
				setState(126);
				match(SMCOLON);
				}
				}
				setState(132);
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

	public static class ProcdeclContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProcdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcdeclContext procdecl() throws RecognitionException {
		ProcdeclContext _localctx = new ProcdeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PROCEDURE);
			setState(134);
			match(ID);
			setState(135);
			match(SMCOLON);
			setState(136);
			block();
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

	public static class StatementpartContext extends ParserRuleContext {
		public StatementpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementpart; }
	 
		public StatementpartContext() { }
		public void copyFrom(StatementpartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtContext extends StatementpartContext {
		public List<CmpstatementContext> cmpstatement() {
			return getRuleContexts(CmpstatementContext.class);
		}
		public CmpstatementContext cmpstatement(int i) {
			return getRuleContext(CmpstatementContext.class,i);
		}
		public StmtContext(StatementpartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementpartContext statementpart() throws RecognitionException {
		StatementpartContext _localctx = new StatementpartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementpart);
		int _la;
		try {
			_localctx = new StmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN) {
				{
				{
				setState(138);
				cmpstatement();
				}
				}
				setState(143);
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

	public static class CmpstatementContext extends ParserRuleContext {
		public CmpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpstatement; }
	 
		public CmpstatementContext() { }
		public void copyFrom(CmpstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainStmtContext extends CmpstatementContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public MainStmtContext(CmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMainStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpstatementContext cmpstatement() throws RecognitionException {
		CmpstatementContext _localctx = new CmpstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmpstatement);
		int _la;
		try {
			_localctx = new MainStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(BEGIN);
			setState(145);
			statement();
			setState(146);
			match(SMCOLON);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << BEGIN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(147);
				statement();
				setState(148);
				match(SMCOLON);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(END);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SmpStmtContext extends StatementContext {
		public SmpstatementContext smpstatement() {
			return getRuleContext(SmpstatementContext.class,0);
		}
		public SmpStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSmpStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StcStmtContext extends StatementContext {
		public StcstatementContext stcstatement() {
			return getRuleContext(StcstatementContext.class,0);
		}
		public StcStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStcStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case ID:
				_localctx = new SmpStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				smpstatement();
				}
				break;
			case FOR:
			case IF:
			case WHILE:
			case BEGIN:
				_localctx = new StcStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				stcstatement();
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

	public static class SmpstatementContext extends ParserRuleContext {
		public SmpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smpstatement; }
	 
		public SmpstatementContext() { }
		public void copyFrom(SmpstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtIDContext extends SmpstatementContext {
		public ProcstatementContext procstatement() {
			return getRuleContext(ProcstatementContext.class,0);
		}
		public StmtIDContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStmtID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultReadStmtContext extends SmpstatementContext {
		public ReadstatementContext readstatement() {
			return getRuleContext(ReadstatementContext.class,0);
		}
		public ResultReadStmtContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitResultReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultWriteStmtContext extends SmpstatementContext {
		public WritestatementContext writestatement() {
			return getRuleContext(WritestatementContext.class,0);
		}
		public ResultWriteStmtContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitResultWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttribStmtContext extends SmpstatementContext {
		public AssstatementContext assstatement() {
			return getRuleContext(AssstatementContext.class,0);
		}
		public AttribStmtContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAttribStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmpstatementContext smpstatement() throws RecognitionException {
		SmpstatementContext _localctx = new SmpstatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_smpstatement);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AttribStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				assstatement();
				}
				break;
			case 2:
				_localctx = new StmtIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				procstatement();
				}
				break;
			case 3:
				_localctx = new ResultReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				readstatement();
				}
				break;
			case 4:
				_localctx = new ResultWriteStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				writestatement();
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

	public static class AssstatementContext extends ParserRuleContext {
		public AssstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assstatement; }
	 
		public AssstatementContext() { }
		public void copyFrom(AssstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtAttribContext extends AssstatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtAttribContext(AssstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStmtAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssstatementContext assstatement() throws RecognitionException {
		AssstatementContext _localctx = new AssstatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assstatement);
		try {
			_localctx = new StmtAttribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			variable();
			setState(168);
			match(ATTRIB);
			setState(169);
			expression();
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

	public static class ProcstatementContext extends ParserRuleContext {
		public ProcstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procstatement; }
	 
		public ProcstatementContext() { }
		public void copyFrom(ProcstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdStmtContext extends ProcstatementContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public IdStmtContext(ProcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIdStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcstatementContext procstatement() throws RecognitionException {
		ProcstatementContext _localctx = new ProcstatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_procstatement);
		try {
			_localctx = new IdStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
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

	public static class ReadstatementContext extends ParserRuleContext {
		public ReadstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstatement; }
	 
		public ReadstatementContext() { }
		public void copyFrom(ReadstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadStmtContext extends ReadstatementContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ReadStmtContext(ReadstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstatementContext readstatement() throws RecognitionException {
		ReadstatementContext _localctx = new ReadstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_readstatement);
		int _la;
		try {
			_localctx = new ReadStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(READ);
			setState(174);
			match(OP);
			setState(175);
			variable();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(176);
				match(COMMA);
				setState(177);
				variable();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(CP);
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

	public static class WritestatementContext extends ParserRuleContext {
		public WritestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestatement; }
	 
		public WritestatementContext() { }
		public void copyFrom(WritestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStmtContext extends WritestatementContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WriteStmtContext(WritestatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestatementContext writestatement() throws RecognitionException {
		WritestatementContext _localctx = new WritestatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writestatement);
		int _la;
		try {
			_localctx = new WriteStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(WRITE);
			setState(186);
			match(OP);
			setState(187);
			expression();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				expression();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(CP);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResultSimpleExpContext extends ExpressionContext {
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public ResultSimpleExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitResultSimpleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultExpContext extends ExpressionContext {
		public Token relationop;
		public List<SimpleexpressionContext> simpleexpression() {
			return getRuleContexts(SimpleexpressionContext.class);
		}
		public SimpleexpressionContext simpleexpression(int i) {
			return getRuleContext(SimpleexpressionContext.class,i);
		}
		public ResultExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitResultExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ResultSimpleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				simpleexpression();
				}
				break;
			case 2:
				_localctx = new ResultExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				simpleexpression();
				setState(199);
				((ResultExpContext)_localctx).relationop = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR))) != 0)) ) {
					((ResultExpContext)_localctx).relationop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				simpleexpression();
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

	public static class SimpleexpressionContext extends ParserRuleContext {
		public SimpleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleexpression; }
	 
		public SimpleexpressionContext() { }
		public void copyFrom(SimpleexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExpressionContext extends SimpleexpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public SimpleExpressionContext(SimpleexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleexpressionContext simpleexpression() throws RecognitionException {
		SimpleexpressionContext _localctx = new SimpleexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleexpression);
		int _la;
		try {
			_localctx = new SimpleExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(207);
			term();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(208);
				addop();
				setState(209);
				term();
				}
				}
				setState(215);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermExpressionContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultopContext> multop() {
			return getRuleContexts(MultopContext.class);
		}
		public MultopContext multop(int i) {
			return getRuleContext(MultopContext.class,i);
		}
		public TermExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTermExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			_localctx = new TermExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			factor();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << AND) | (1L << MULT))) != 0)) {
				{
				{
				setState(217);
				multop();
				setState(218);
				factor();
				}
				}
				setState(224);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarExprContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends FactorContext {
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NotExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends FactorContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				variable();
				}
				break;
			case 2:
				_localctx = new ConstantExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				constant();
				}
				break;
			case 3:
				_localctx = new MultExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(OP);
				setState(228);
				expression();
				setState(229);
				match(CP);
				}
				break;
			case 4:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(NOT);
				setState(232);
				factor();
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

	public static class ConstantContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MiniPascalParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MiniPascalParser.DIGIT, i);
		}
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(MiniPascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniPascalParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(DIGIT);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(236);
					match(DOT);
					setState(237);
					match(DIGIT);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(ID);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(FALSE);
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class MultopContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(MiniPascalParser.MULT, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public MultopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMultop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultopContext multop() throws RecognitionException {
		MultopContext _localctx = new MultopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << AND) | (1L << MULT))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexedVarContext extends VariableContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexedVarContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIndexedVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIDContext extends VariableContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public VarIDContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new VarIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IndexedVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(ID);
				setState(255);
				match(OC);
				setState(256);
				expression();
				setState(257);
				match(CC);
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

	public static class StcstatementContext extends ParserRuleContext {
		public StcstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stcstatement; }
	 
		public StcstatementContext() { }
		public void copyFrom(StcstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StcstatementContext {
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public WhileStatementContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpStatementContext extends StcstatementContext {
		public CmpstatementContext cmpstatement() {
			return getRuleContext(CmpstatementContext.class,0);
		}
		public CmpStatementContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitCmpStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StcstatementContext {
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ForStatementContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StcstatementContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfStatementContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StcstatementContext stcstatement() throws RecognitionException {
		StcstatementContext _localctx = new StcstatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stcstatement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				_localctx = new CmpStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				cmpstatement();
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				ifstatement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				whilestatement();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				forstatement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	 
		public IfstatementContext() { }
		public void copyFrom(IfstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfstatementContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStmtContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends IfstatementContext {
		public StatementContext b1;
		public StatementContext b2;
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStmtContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifstatement);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(IF);
				setState(268);
				expression();
				setState(269);
				match(THEN);
				setState(270);
				statement();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(IF);
				setState(273);
				expression();
				setState(274);
				match(THEN);
				setState(275);
				((IfElseStmtContext)_localctx).b1 = statement();
				setState(276);
				match(ELSE);
				setState(277);
				((IfElseStmtContext)_localctx).b2 = statement();
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

	public static class WhilestatementContext extends ParserRuleContext {
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
	 
		public WhilestatementContext() { }
		public void copyFrom(WhilestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends WhilestatementContext {
		public CmpstatementContext b1;
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public CmpstatementContext cmpstatement() {
			return getRuleContext(CmpstatementContext.class,0);
		}
		public WhileStmtContext(WhilestatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whilestatement);
		try {
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(WHILE);
			setState(282);
			expression();
			setState(283);
			match(DO);
			setState(284);
			((WhileStmtContext)_localctx).b1 = cmpstatement();
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

	public static class ForstatementContext extends ParserRuleContext {
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
	 
		public ForstatementContext() { }
		public void copyFrom(ForstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStmtContext extends ForstatementContext {
		public AssstatementContext counter;
		public CmpstatementContext b1;
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmpstatementContext cmpstatement() {
			return getRuleContext(CmpstatementContext.class,0);
		}
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public AssstatementContext assstatement() {
			return getRuleContext(AssstatementContext.class,0);
		}
		public ForStmtContext(ForstatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forstatement);
		int _la;
		try {
			_localctx = new ForStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(FOR);
			setState(287);
			match(OP);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << OP) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << STR) | (1L << DIGIT))) != 0)) {
				{
				setState(288);
				simpleexpression();
				}
			}

			setState(291);
			match(SMCOLON);
			setState(292);
			expression();
			setState(293);
			match(SMCOLON);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(294);
				((ForStmtContext)_localctx).counter = assstatement();
				}
			}

			setState(297);
			match(CP);
			setState(298);
			((ForStmtContext)_localctx).b1 = cmpstatement();
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

	public static class LetdigContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(MiniPascalParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(MiniPascalParser.DIGIT, 0); }
		public LetdigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letdig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitLetdig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetdigContext letdig() throws RecognitionException {
		LetdigContext _localctx = new LetdigContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_letdig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==DIGIT) ) {
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

	public static class SpecsymContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public SpecsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specsym; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSpecsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecsymContext specsym() throws RecognitionException {
		SpecsymContext _localctx = new SpecsymContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_specsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << OR) | (1L << AND) | (1L << NOT) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << OF) | (1L << WHILE) | (1L << DO) | (1L << BEGIN) | (1L << END) | (1L << READ) | (1L << WRITE) | (1L << VAR) | (1L << ARRAY) | (1L << PROCEDURE) | (1L << PROGRAM) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << EQUALS) | (1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR) | (1L << OP) | (1L << CP) | (1L << OC) | (1L << CC) | (1L << ATTRIB) | (1L << DOT) | (1L << COMMA) | (1L << SMCOLON) | (1L << COLON) | (1L << DBDOT))) != 0)) ) {
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

	public static class PredidContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public TerminalNode TRUE() { return getToken(MiniPascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniPascalParser.FALSE, 0); }
		public PredidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitPredid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredidContext predid() throws RecognitionException {
		PredidContext _localctx = new PredidContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_predid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0135\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\3\3\3\3\3\3\3\3\3\3\4\5\4R"+
		"\n\4\3\4\5\4U\n\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\6\5^\n\5\r\5\16\5_\5\5"+
		"b\n\5\3\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\6\3\7\3\7\5\7q\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7"+
		"\13\u0083\n\13\f\13\16\13\u0086\13\13\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u008e"+
		"\n\r\f\r\16\r\u0091\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0099\n\16"+
		"\f\16\16\16\u009c\13\16\3\16\3\16\3\17\3\17\5\17\u00a2\n\17\3\20\3\20"+
		"\3\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00b5\n\23\f\23\16\23\u00b8\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00cd\n\25\3\26\5\26\u00d0\n\26\3\26\3\26\3"+
		"\26\3\26\7\26\u00d6\n\26\f\26\16\26\u00d9\13\26\3\27\3\27\3\27\3\27\7"+
		"\27\u00df\n\27\f\27\16\27\u00e2\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u00ec\n\30\3\31\3\31\3\31\7\31\u00f1\n\31\f\31\16\31\u00f4"+
		"\13\31\3\31\3\31\3\31\3\31\5\31\u00fa\n\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0106\n\34\3\35\3\35\3\35\3\35\5\35\u010c"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u011a\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0124\n \3 \3 \3 \3 "+
		"\5 \u012a\n \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\n\3\2),\3\2\31\36\3\2"+
		"\26\27\4\2\5\5\26\27\5\2\4\4\6\6\30\30\3\2\61\62\3\2\4(\4\2)*-.\u0136"+
		"\2G\3\2\2\2\4K\3\2\2\2\6Q\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fp\3\2\2\2\16"+
		"r\3\2\2\2\20y\3\2\2\2\22}\3\2\2\2\24\u0084\3\2\2\2\26\u0087\3\2\2\2\30"+
		"\u008f\3\2\2\2\32\u0092\3\2\2\2\34\u00a1\3\2\2\2\36\u00a7\3\2\2\2 \u00a9"+
		"\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00bb\3\2\2\2(\u00cc\3\2\2\2"+
		"*\u00cf\3\2\2\2,\u00da\3\2\2\2.\u00eb\3\2\2\2\60\u00f9\3\2\2\2\62\u00fb"+
		"\3\2\2\2\64\u00fd\3\2\2\2\66\u0105\3\2\2\28\u010b\3\2\2\2:\u0119\3\2\2"+
		"\2<\u011b\3\2\2\2>\u0120\3\2\2\2@\u012e\3\2\2\2B\u0130\3\2\2\2D\u0132"+
		"\3\2\2\2FH\5\4\3\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2"+
		"KL\7\25\2\2LM\7\60\2\2MN\7&\2\2NO\5\6\4\2O\5\3\2\2\2PR\5\b\5\2QP\3\2\2"+
		"\2QR\3\2\2\2RT\3\2\2\2SU\5\24\13\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5\30"+
		"\r\2WV\3\2\2\2WX\3\2\2\2X\7\3\2\2\2Y]\7\22\2\2Z[\5\n\6\2[\\\7&\2\2\\^"+
		"\3\2\2\2]Z\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2aY\3\2\2\2a"+
		"b\3\2\2\2b\t\3\2\2\2ch\5\66\34\2de\7%\2\2eg\5\66\34\2fd\3\2\2\2gj\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\'\2\2lm\5\f\7\2m\13\3"+
		"\2\2\2nq\5\22\n\2oq\5\16\b\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rs\7\23\2\2"+
		"st\7!\2\2tu\5\20\t\2uv\7\"\2\2vw\7\13\2\2wx\5\22\n\2x\17\3\2\2\2yz\7\62"+
		"\2\2z{\7(\2\2{|\7\62\2\2|\21\3\2\2\2}~\t\2\2\2~\23\3\2\2\2\177\u0080\5"+
		"\26\f\2\u0080\u0081\7&\2\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\25\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087\u0088\7\24\2\2\u0088\u0089\7/\2\2\u0089\u008a"+
		"\7&\2\2\u008a\u008b\5\6\4\2\u008b\27\3\2\2\2\u008c\u008e\5\32\16\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\31\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\16\2\2\u0093\u0094"+
		"\5\34\17\2\u0094\u009a\7&\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7&\2\2"+
		"\u0097\u0099\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\17\2\2\u009e\33\3\2\2\2\u009f\u00a2\5\36\20\2\u00a0\u00a2\58"+
		"\35\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a8"+
		"\5 \21\2\u00a4\u00a8\5\"\22\2\u00a5\u00a8\5$\23\2\u00a6\u00a8\5&\24\2"+
		"\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\5\66\34\2\u00aa\u00ab\7#\2\2\u00ab"+
		"\u00ac\5(\25\2\u00ac!\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae#\3\2\2\2\u00af"+
		"\u00b0\7\20\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b6\5\66\34\2\u00b2\u00b3"+
		"\7%\2\2\u00b3\u00b5\5\66\34\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\7 \2\2\u00ba%\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc"+
		"\u00bd\7\37\2\2\u00bd\u00c2\5(\25\2\u00be\u00bf\7%\2\2\u00bf\u00c1\5("+
		"\25\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7 "+
		"\2\2\u00c6\'\3\2\2\2\u00c7\u00cd\5*\26\2\u00c8\u00c9\5*\26\2\u00c9\u00ca"+
		"\t\3\2\2\u00ca\u00cb\5*\26\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cd)\3\2\2\2\u00ce\u00d0\t\4\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d7\5,\27\2\u00d2\u00d3"+
		"\5\62\32\2\u00d3\u00d4\5,\27\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8+\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e0\5.\30\2\u00db\u00dc\5\64\33\2\u00dc"+
		"\u00dd\5.\30\2\u00dd\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1-\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00ec\5\66\34\2\u00e4\u00ec\5\60\31\2\u00e5\u00e6\7\37"+
		"\2\2\u00e6\u00e7\5(\25\2\u00e7\u00e8\7 \2\2\u00e8\u00ec\3\2\2\2\u00e9"+
		"\u00ea\7\7\2\2\u00ea\u00ec\5.\30\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2"+
		"\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec/\3\2\2\2\u00ed\u00f2"+
		"\7\62\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f1\7\62\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fa"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fa\7\60\2\2\u00f6\u00fa\7/\2\2\u00f7"+
		"\u00fa\7-\2\2\u00f8\u00fa\7.\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f5\3\2\2"+
		"\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\61"+
		"\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fc\63\3\2\2\2\u00fd\u00fe\t\6\2\2\u00fe"+
		"\65\3\2\2\2\u00ff\u0106\7/\2\2\u0100\u0101\7/\2\2\u0101\u0102\7!\2\2\u0102"+
		"\u0103\5(\25\2\u0103\u0104\7\"\2\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2"+
		"\2\2\u0105\u0100\3\2\2\2\u0106\67\3\2\2\2\u0107\u010c\5\32\16\2\u0108"+
		"\u010c\5:\36\2\u0109\u010c\5<\37\2\u010a\u010c\5> \2\u010b\u0107\3\2\2"+
		"\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c9"+
		"\3\2\2\2\u010d\u010e\7\b\2\2\u010e\u010f\5(\25\2\u010f\u0110\7\t\2\2\u0110"+
		"\u0111\5\34\17\2\u0111\u011a\3\2\2\2\u0112\u0113\7\b\2\2\u0113\u0114\5"+
		"(\25\2\u0114\u0115\7\t\2\2\u0115\u0116\5\34\17\2\u0116\u0117\7\n\2\2\u0117"+
		"\u0118\5\34\17\2\u0118\u011a\3\2\2\2\u0119\u010d\3\2\2\2\u0119\u0112\3"+
		"\2\2\2\u011a;\3\2\2\2\u011b\u011c\7\f\2\2\u011c\u011d\5(\25\2\u011d\u011e"+
		"\7\r\2\2\u011e\u011f\5\32\16\2\u011f=\3\2\2\2\u0120\u0121\7\3\2\2\u0121"+
		"\u0123\7\37\2\2\u0122\u0124\5*\26\2\u0123\u0122\3\2\2\2\u0123\u0124\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7&\2\2\u0126\u0127\5(\25\2\u0127"+
		"\u0129\7&\2\2\u0128\u012a\5 \21\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7 \2\2\u012c\u012d\5\32\16\2\u012d"+
		"?\3\2\2\2\u012e\u012f\t\7\2\2\u012fA\3\2\2\2\u0130\u0131\t\b\2\2\u0131"+
		"C\3\2\2\2\u0132\u0133\t\t\2\2\u0133E\3\2\2\2\35IQTW_ahp\u0084\u008f\u009a"+
		"\u00a1\u00a7\u00b6\u00c2\u00cc\u00cf\u00d7\u00e0\u00eb\u00f2\u00f9\u0105"+
		"\u010b\u0119\u0123\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}