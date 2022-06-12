// Generated from PseudoCodeCompiler.g4 by ANTLR 4.10.1
 import java.util.*;import java.util.ArrayList; import java.util.Scanner;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, STRING=26, ID=27, NUM=28, OP_COMP=29, OP_AD=30, ATRIB=31, SC=32, 
		WS=33;
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_whileLoop = 2, RULE_forLoop = 3, 
		RULE_conditional = 4, RULE_atribution = 5, RULE_declaration = 6, RULE_data = 7, 
		RULE_condition = 8, RULE_op = 9, RULE_basicOp = 10, RULE_read = 11, RULE_write = 12, 
		RULE_type = 13, RULE_bool = 14, RULE_if = 15, RULE_else = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "command", "whileLoop", "forLoop", "conditional", "atribution", 
			"declaration", "data", "condition", "op", "basicOp", "read", "write", 
			"type", "bool", "if", "else"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'enquanto'", "'('", "')'", "'{'", "'}'", 
			"'para'", "'/'", "'*'", "'+'", "'-'", "'++'", "'--'", "'ler'", "'imprimir'", 
			"'boleano'", "'texto'", "'real'", "'verdadeiro'", "'falso'", "'Se'", 
			"'se'", "'senao'", "'Senao'", null, null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "ID", "NUM", "OP_COMP", "OP_AD", "ATRIB", "SC", 
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
	public String getGrammarFileName() { return "PseudoCodeCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Print x = new Print();
		VarArray v = new VarArray();
		Scanner s = new Scanner(System.in);
		int scope = 3;
		
		public void finishStruct(){
			v.removeScope(scope);
			scope--;
			x.printData("\n");
			x.printScopeTabs(scope);
			x.printData("}\n ");
		}
		
		public void startStruct(){
			scope++;
			x.printData("{ \n");
		}
		
		public void throwError(String message, int line){
			throw new RuntimeException(" "+message+" na linha: "+line);
		}

	public PseudoCodeCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			x.printStart();
			setState(36);
			command();
			setState(37);
			match(T__1);
			x.printEnd();
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

	public static class CommandContext extends ParserRuleContext {
		public List<AtributionContext> atribution() {
			return getRuleContexts(AtributionContext.class);
		}
		public AtributionContext atribution(int i) {
			return getRuleContext(AtributionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<WhileLoopContext> whileLoop() {
			return getRuleContexts(WhileLoopContext.class);
		}
		public WhileLoopContext whileLoop(int i) {
			return getRuleContext(WhileLoopContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public List<WriteContext> write() {
			return getRuleContexts(WriteContext.class);
		}
		public WriteContext write(int i) {
			return getRuleContext(WriteContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(52);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						x.printScopeTabs(scope);
						setState(41);
						atribution();
						x.printData("\n");
						}
						break;
					case T__16:
					case T__17:
					case T__18:
						{
						x.printScopeTabs(scope);
						setState(45);
						declaration();
						x.printData("\n");
						}
						break;
					case T__21:
					case T__22:
						{
						setState(48);
						conditional();
						}
						break;
					case T__2:
						{
						setState(49);
						whileLoop();
						}
						break;
					case T__7:
						{
						setState(50);
						forLoop();
						}
						break;
					case T__15:
						{
						setState(51);
						write();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__2);
			setState(58);
			match(T__3);
			x.printScopeTabs(scope);x.printData("while(");
			setState(60);
			condition();
			setState(61);
			match(T__4);
			x.printData(")");
			setState(63);
			match(T__5);
			startStruct();
			setState(65);
			command();
			setState(66);
			match(T__6);
			finishStruct();
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

	public static class ForLoopContext extends ParserRuleContext {
		public OpContext op;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SC() { return getToken(PseudoCodeCompilerParser.SC, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__7);
			setState(70);
			match(T__3);
			x.printScopeTabs(scope);x.printData("for(");scope++;
			setState(72);
			declaration();
			setState(73);
			condition();
			setState(74);
			match(SC);
			x.printData(";");
			setState(76);
			((ForLoopContext)_localctx).op = op();
			x.printData((((ForLoopContext)_localctx).op!=null?_input.getText(((ForLoopContext)_localctx).op.start,((ForLoopContext)_localctx).op.stop):null));
			setState(78);
			match(T__4);
			setState(79);
			match(T__5);
			x.printData("){\n");
			setState(81);
			command();
			setState(82);
			match(T__6);
			finishStruct();
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<IfContext> if_() {
			return getRuleContexts(IfContext.class);
		}
		public IfContext if_(int i) {
			return getRuleContext(IfContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			if_();
			x.printScopeTabs(scope);x.printData("if(");
			setState(87);
			match(T__3);
			setState(88);
			condition();
			setState(89);
			match(T__4);
			x.printData(")");
			startStruct();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(92);
				match(T__5);
				}
			}

			setState(95);
			command();
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(96);
				match(T__6);
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(99);
				else_();
				scope--;x.printScopeTabs(scope);x.printData("}else ");
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(101);
					if_();
					x.printData("if(");
					setState(103);
					match(T__3);
					setState(104);
					condition();
					setState(105);
					match(T__4);
					x.printData("(");
					}
					break;
				}
				startStruct();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(111);
					match(T__5);
					}
				}

				setState(114);
				command();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(115);
					match(T__6);
					}
					break;
				}
				}
				break;
			}
			finishStruct();
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

	public static class AtributionContext extends ParserRuleContext {
		public Token ID;
		public DataContext data;
		public ReadContext read;
		public TerminalNode ID() { return getToken(PseudoCodeCompilerParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(PseudoCodeCompilerParser.ATRIB, 0); }
		public TerminalNode SC() { return getToken(PseudoCodeCompilerParser.SC, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public AtributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterAtribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitAtribution(this);
		}
	}

	public final AtributionContext atribution() throws RecognitionException {
		AtributionContext _localctx = new AtributionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((AtributionContext)_localctx).ID = match(ID);
			setState(123);
			match(ATRIB);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__19:
			case T__20:
			case STRING:
			case ID:
			case NUM:
			case SC:
				{
				setState(124);
				((AtributionContext)_localctx).data = data();

								v.atribVar((((AtributionContext)_localctx).ID!=null?((AtributionContext)_localctx).ID.getText():null),(((AtributionContext)_localctx).data!=null?_input.getText(((AtributionContext)_localctx).data.start,((AtributionContext)_localctx).data.stop):null), scope, (((AtributionContext)_localctx).data!=null?(((AtributionContext)_localctx).data.start):null).getLine());
								x.printAttribution((((AtributionContext)_localctx).ID!=null?((AtributionContext)_localctx).ID.getText():null),(((AtributionContext)_localctx).data!=null?_input.getText(((AtributionContext)_localctx).data.start,((AtributionContext)_localctx).data.stop):null));
							
				}
				break;
			case T__14:
				{
				x.printAttribution((((AtributionContext)_localctx).ID!=null?((AtributionContext)_localctx).ID.getText():null),"");
				setState(128);
				((AtributionContext)_localctx).read = read();

								v.atribVar((((AtributionContext)_localctx).ID!=null?((AtributionContext)_localctx).ID.getText():null),(((AtributionContext)_localctx).read!=null?_input.getText(((AtributionContext)_localctx).read.start,((AtributionContext)_localctx).read.stop):null), scope, (((AtributionContext)_localctx).read!=null?(((AtributionContext)_localctx).read.start):null).getLine());
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(SC);
			x.printSC();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public DataContext data;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PseudoCodeCompilerParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(PseudoCodeCompilerParser.ATRIB, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode SC() { return getToken(PseudoCodeCompilerParser.SC, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((DeclarationContext)_localctx).type = type();
			setState(137);
			((DeclarationContext)_localctx).ID = match(ID);
			setState(138);
			match(ATRIB);
			setState(139);
			((DeclarationContext)_localctx).data = data();

									if(v.parseData((((DeclarationContext)_localctx).data!=null?_input.getText(((DeclarationContext)_localctx).data.start,((DeclarationContext)_localctx).data.stop):null)).equals((((DeclarationContext)_localctx).type!=null?_input.getText(((DeclarationContext)_localctx).type.start,((DeclarationContext)_localctx).type.stop):null))){
										v.addVar(new Variable((((DeclarationContext)_localctx).type!=null?_input.getText(((DeclarationContext)_localctx).type.start,((DeclarationContext)_localctx).type.stop):null),(((DeclarationContext)_localctx).data!=null?_input.getText(((DeclarationContext)_localctx).data.start,((DeclarationContext)_localctx).data.stop):null),scope, (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null)), (((DeclarationContext)_localctx).data!=null?(((DeclarationContext)_localctx).data.start):null).getLine());
										x.printDeclare((((DeclarationContext)_localctx).type!=null?_input.getText(((DeclarationContext)_localctx).type.start,((DeclarationContext)_localctx).type.stop):null), (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null), (((DeclarationContext)_localctx).data!=null?_input.getText(((DeclarationContext)_localctx).data.start,((DeclarationContext)_localctx).data.stop):null)); 
									}else{
										throwError("Valor declarado nao corresponde ao tipo da variavel", (((DeclarationContext)_localctx).data!=null?(((DeclarationContext)_localctx).data.start):null).getLine());
									}
								
			setState(141);
			match(SC);
			 x.printSC();
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

	public static class DataContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public BasicOpContext basicOp() {
			return getRuleContext(BasicOpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PseudoCodeCompilerParser.STRING, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				bool();
				}
				break;
			case T__4:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case OP_AD:
			case SC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case T__3:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(146);
					match(T__3);
					}
				}

				setState(149);
				op();
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(150);
					match(T__4);
					}
					break;
				}
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(153);
					basicOp();
					}
					break;
				}
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(STRING);
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

	public static class ConditionContext extends ParserRuleContext {
		public Token ID;
		public Token OP_COMP;
		public DataContext data;
		public Token OP_AD;
		public TerminalNode ID() { return getToken(PseudoCodeCompilerParser.ID, 0); }
		public TerminalNode OP_COMP() { return getToken(PseudoCodeCompilerParser.OP_COMP, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public List<TerminalNode> OP_AD() { return getTokens(PseudoCodeCompilerParser.OP_AD); }
		public TerminalNode OP_AD(int i) {
			return getToken(PseudoCodeCompilerParser.OP_AD, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((ConditionContext)_localctx).ID = match(ID);
			if(!v.varExists((((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null),scope))throwError("Variavel nao existente nesse escopo", ((ConditionContext)_localctx).ID.getLine());
			setState(161);
			((ConditionContext)_localctx).OP_COMP = match(OP_COMP);
			setState(162);
			((ConditionContext)_localctx).data = data();

									if(((((ConditionContext)_localctx).OP_COMP!=null?((ConditionContext)_localctx).OP_COMP.getText():null).contains("<") || (((ConditionContext)_localctx).OP_COMP!=null?((ConditionContext)_localctx).OP_COMP.getText():null).contains(">")) && v.parseData((((ConditionContext)_localctx).data!=null?_input.getText(((ConditionContext)_localctx).data.start,((ConditionContext)_localctx).data.stop):null)).equals("texto")){
										throwError("Texto nao pode ser comparado com '<' ou '>'", (((ConditionContext)_localctx).data!=null?(((ConditionContext)_localctx).data.start):null).getLine());
									}else if(v.parseData((((ConditionContext)_localctx).data!=null?_input.getText(((ConditionContext)_localctx).data.start,((ConditionContext)_localctx).data.stop):null)).equals(v.getVarById((((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null)).type)){
										x.printCondition((((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null),(((ConditionContext)_localctx).OP_COMP!=null?((ConditionContext)_localctx).OP_COMP.getText():null),(((ConditionContext)_localctx).data!=null?_input.getText(((ConditionContext)_localctx).data.start,((ConditionContext)_localctx).data.stop):null));
									}else{
										throwError((((ConditionContext)_localctx).data!=null?_input.getText(((ConditionContext)_localctx).data.start,((ConditionContext)_localctx).data.stop):null)+" nao pode ser comparado com "+v.getVarById((((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null)).type, (((ConditionContext)_localctx).data!=null?(((ConditionContext)_localctx).data.start):null).getLine());
									}						
								
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					((ConditionContext)_localctx).OP_AD = match(OP_AD);
					x.printData((((ConditionContext)_localctx).OP_AD!=null?((ConditionContext)_localctx).OP_AD.getText():null));
					setState(166);
					condition();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public Token ID;
		public TerminalNode NUM() { return getToken(PseudoCodeCompilerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(PseudoCodeCompilerParser.ID, 0); }
		public BasicOpContext basicOp() {
			return getRuleContext(BasicOpContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((OpContext)_localctx).ID = match(ID);

							if(!v.varExists((((OpContext)_localctx).ID!=null?((OpContext)_localctx).ID.getText():null),scope))
								throwError("Variavel"+(((OpContext)_localctx).ID!=null?((OpContext)_localctx).ID.getText():null)+" nao existente no escopo que foi chamada", ((OpContext)_localctx).ID.getLine());
							
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(175);
					basicOp();

								if(!v.getVarById((((OpContext)_localctx).ID!=null?((OpContext)_localctx).ID.getText():null)).type.contains("real")) 
									throwError("variavel "+(((OpContext)_localctx).ID!=null?((OpContext)_localctx).ID.getText():null)+" nao corresponde a numero", ((OpContext)_localctx).ID.getLine());
							
					}
					break;
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

	public static class BasicOpContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public BasicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterBasicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitBasicOp(this);
		}
	}

	public final BasicOpContext basicOp() throws RecognitionException {
		BasicOpContext _localctx = new BasicOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicOp);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(183);
					op();
					}
					break;
				case 2:
					{
					setState(184);
					data();
					}
					break;
				}
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(188);
					op();
					}
					break;
				case 2:
					{
					setState(189);
					data();
					}
					break;
				}
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ReadContext extends ParserRuleContext {
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__14);
			setState(196);
			match(T__3);
			setState(197);
			((ReadContext)_localctx).type = type();

						switch((((ReadContext)_localctx).type!=null?_input.getText(((ReadContext)_localctx).type.start,((ReadContext)_localctx).type.stop):null)){
							case "texto":
								x.printData("s.nextLine()");
								break;
							case "boleano":
								x.printData("s.nextBoolean()");
								break;
							case "real":
								x.printData("s.nextFloat()");
								break;
						}
					
			setState(199);
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

	public static class WriteContext extends ParserRuleContext {
		public Token ID;
		public Token STRING;
		public TerminalNode SC() { return getToken(PseudoCodeCompilerParser.SC, 0); }
		public List<TerminalNode> ID() { return getTokens(PseudoCodeCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseudoCodeCompilerParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PseudoCodeCompilerParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PseudoCodeCompilerParser.STRING, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			x.printScopeTabs(scope);
			setState(202);
			match(T__15);
			setState(203);
			match(T__3);
			System.out.print("System.out.print(");
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(205);
				((WriteContext)_localctx).ID = match(ID);
				x.printData(v.getVarById((((WriteContext)_localctx).ID!=null?((WriteContext)_localctx).ID.getText():null)).id);
				}
				break;
			case STRING:
				{
				setState(207);
				((WriteContext)_localctx).STRING = match(STRING);
				x.printData((((WriteContext)_localctx).STRING!=null?((WriteContext)_localctx).STRING.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(211);
				match(T__10);
				x.printData("+");
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(213);
					((WriteContext)_localctx).ID = match(ID);
					x.printData(v.getVarById((((WriteContext)_localctx).ID!=null?((WriteContext)_localctx).ID.getText():null)).id);
					}
					break;
				case STRING:
					{
					setState(215);
					((WriteContext)_localctx).STRING = match(STRING);
					x.printData((((WriteContext)_localctx).STRING!=null?((WriteContext)_localctx).STRING.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__4);
			setState(225);
			match(SC);
			x.printData(")");x.printSC();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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

	public static class IfContext extends ParserRuleContext {
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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

	public static class ElseContext extends ParserRuleContext {
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeCompilerListener ) ((PseudoCodeCompilerListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
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
		"\u0004\u0001!\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004q\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004u\b\u0004"+
		"\u0003\u0004w\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0084\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0094\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0098\b\u0007\u0001"+
		"\u0007\u0003\u0007\u009b\b\u0007\u0001\u0007\u0003\u0007\u009e\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00a8\b\b\n\b\f\b\u00ab\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00b3\b\t\u0003\t\u00b5\b\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ba\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bf\b\n\u0001\n\u0003\n"+
		"\u00c2\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00d2\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00da\b\f\u0005\f\u00dc\b\f\n\f\f\f\u00df\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0007\u0001\u0000\t\n\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000"+
		"\u0011\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017\u0001\u0000"+
		"\u0018\u0019\u00f8\u0000\"\u0001\u0000\u0000\u0000\u00026\u0001\u0000"+
		"\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000"+
		"\bU\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000"+
		"\u0000\u0000\u000e\u009d\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000"+
		"\u0000\u0000\u0012\u00b4\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000"+
		"\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000"+
		"\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00e6\u0001\u0000"+
		"\u0000\u0000\u001e\u00e8\u0001\u0000\u0000\u0000 \u00ea\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0001\u0000\u0000#$\u0006\u0000\uffff\uffff\u0000$%\u0003"+
		"\u0002\u0001\u0000%&\u0005\u0002\u0000\u0000&\'\u0006\u0000\uffff\uffff"+
		"\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0006\u0001\uffff\uffff\u0000"+
		")*\u0003\n\u0005\u0000*+\u0006\u0001\uffff\uffff\u0000+5\u0001\u0000\u0000"+
		"\u0000,-\u0006\u0001\uffff\uffff\u0000-.\u0003\f\u0006\u0000./\u0006\u0001"+
		"\uffff\uffff\u0000/5\u0001\u0000\u0000\u000005\u0003\b\u0004\u000015\u0003"+
		"\u0004\u0002\u000025\u0003\u0006\u0003\u000035\u0003\u0018\f\u00004(\u0001"+
		"\u0000\u0000\u00004,\u0001\u0000\u0000\u000040\u0001\u0000\u0000\u0000"+
		"41\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u0003\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0003\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0006\u0002\uffff"+
		"\uffff\u0000<=\u0003\u0010\b\u0000=>\u0005\u0005\u0000\u0000>?\u0006\u0002"+
		"\uffff\uffff\u0000?@\u0005\u0006\u0000\u0000@A\u0006\u0002\uffff\uffff"+
		"\u0000AB\u0003\u0002\u0001\u0000BC\u0005\u0007\u0000\u0000CD\u0006\u0002"+
		"\uffff\uffff\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0005\b\u0000\u0000"+
		"FG\u0005\u0004\u0000\u0000GH\u0006\u0003\uffff\uffff\u0000HI\u0003\f\u0006"+
		"\u0000IJ\u0003\u0010\b\u0000JK\u0005 \u0000\u0000KL\u0006\u0003\uffff"+
		"\uffff\u0000LM\u0003\u0012\t\u0000MN\u0006\u0003\uffff\uffff\u0000NO\u0005"+
		"\u0005\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0006\u0003\uffff\uffff"+
		"\u0000QR\u0003\u0002\u0001\u0000RS\u0005\u0007\u0000\u0000ST\u0006\u0003"+
		"\uffff\uffff\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0003\u001e\u000f"+
		"\u0000VW\u0006\u0004\uffff\uffff\u0000WX\u0005\u0004\u0000\u0000XY\u0003"+
		"\u0010\b\u0000YZ\u0005\u0005\u0000\u0000Z[\u0006\u0004\uffff\uffff\u0000"+
		"[]\u0006\u0004\uffff\uffff\u0000\\^\u0005\u0006\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0003"+
		"\u0002\u0001\u0000`b\u0005\u0007\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bv\u0001\u0000\u0000\u0000cd\u0003 \u0010\u0000"+
		"dl\u0006\u0004\uffff\uffff\u0000ef\u0003\u001e\u000f\u0000fg\u0006\u0004"+
		"\uffff\uffff\u0000gh\u0005\u0004\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005"+
		"\u0005\u0000\u0000jk\u0006\u0004\uffff\uffff\u0000km\u0001\u0000\u0000"+
		"\u0000le\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0006\u0004\uffff\uffff\u0000oq\u0005\u0006\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rt\u0003\u0002\u0001\u0000su\u0005\u0007\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vc\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0006\u0004\uffff\uffff\u0000y\t\u0001\u0000\u0000\u0000z{\u0005\u001b"+
		"\u0000\u0000{\u0083\u0005\u001f\u0000\u0000|}\u0003\u000e\u0007\u0000"+
		"}~\u0006\u0005\uffff\uffff\u0000~\u0084\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0006\u0005\uffff\uffff\u0000\u0080\u0081\u0003\u0016\u000b\u0000"+
		"\u0081\u0082\u0006\u0005\uffff\uffff\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005 \u0000\u0000\u0086"+
		"\u0087\u0006\u0005\uffff\uffff\u0000\u0087\u000b\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0003\u001a\r\u0000\u0089\u008a\u0005\u001b\u0000\u0000\u008a"+
		"\u008b\u0005\u001f\u0000\u0000\u008b\u008c\u0003\u000e\u0007\u0000\u008c"+
		"\u008d\u0006\u0006\uffff\uffff\u0000\u008d\u008e\u0005 \u0000\u0000\u008e"+
		"\u008f\u0006\u0006\uffff\uffff\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090"+
		"\u009e\u0003\u001c\u000e\u0000\u0091\u009e\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0005\u0004\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0003\u0012\t\u0000\u0096\u0098\u0005\u0005\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0005\u001a\u0000\u0000\u009d\u0090\u0001"+
		"\u0000\u0000\u0000\u009d\u0091\u0001\u0000\u0000\u0000\u009d\u0093\u0001"+
		"\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u000f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u001b\u0000\u0000\u00a0\u00a1\u0006"+
		"\b\uffff\uffff\u0000\u00a1\u00a2\u0005\u001d\u0000\u0000\u00a2\u00a3\u0003"+
		"\u000e\u0007\u0000\u00a3\u00a9\u0006\b\uffff\uffff\u0000\u00a4\u00a5\u0005"+
		"\u001e\u0000\u0000\u00a5\u00a6\u0006\b\uffff\uffff\u0000\u00a6\u00a8\u0003"+
		"\u0010\b\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b5\u0005\u001c\u0000\u0000\u00ad\u00ae\u0005\u001b"+
		"\u0000\u0000\u00ae\u00b2\u0006\t\uffff\uffff\u0000\u00af\u00b0\u0003\u0014"+
		"\n\u0000\u00b0\u00b1\u0006\t\uffff\uffff\u0000\u00b1\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b5\u0013\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0007\u0000\u0000\u0000\u00b7\u00ba\u0003\u0012"+
		"\t\u0000\u00b8\u00ba\u0003\u000e\u0007\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00c2\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0007\u0001\u0000\u0000\u00bc\u00bf\u0003\u0012\t\u0000"+
		"\u00bd\u00bf\u0003\u000e\u0007\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c2\u0007\u0002\u0000\u0000\u00c1\u00b6\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u000f\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6"+
		"\u00c7\u0006\u000b\uffff\uffff\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000"+
		"\u00c8\u0017\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\f\uffff\uffff\u0000"+
		"\u00ca\u00cb\u0005\u0010\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000"+
		"\u00cc\u00d1\u0006\f\uffff\uffff\u0000\u00cd\u00ce\u0005\u001b\u0000\u0000"+
		"\u00ce\u00d2\u0006\f\uffff\uffff\u0000\u00cf\u00d0\u0005\u001a\u0000\u0000"+
		"\u00d0\u00d2\u0006\f\uffff\uffff\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00dd\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\u000b\u0000\u0000\u00d4\u00d9\u0006\f\uffff\uffff\u0000"+
		"\u00d5\u00d6\u0005\u001b\u0000\u0000\u00d6\u00da\u0006\f\uffff\uffff\u0000"+
		"\u00d7\u00d8\u0005\u001a\u0000\u0000\u00d8\u00da\u0006\f\uffff\uffff\u0000"+
		"\u00d9\u00d5\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000"+
		"\u00e1\u00e2\u0005 \u0000\u0000\u00e2\u00e3\u0006\f\uffff\uffff\u0000"+
		"\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4\u00e5\u0007\u0003\u0000\u0000"+
		"\u00e5\u001b\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0004\u0000\u0000"+
		"\u00e7\u001d\u0001\u0000\u0000\u0000\u00e8\u00e9\u0007\u0005\u0000\u0000"+
		"\u00e9\u001f\u0001\u0000\u0000\u0000\u00ea\u00eb\u0007\u0006\u0000\u0000"+
		"\u00eb!\u0001\u0000\u0000\u0000\u001646]alptv\u0083\u0093\u0097\u009a"+
		"\u009d\u00a9\u00b2\u00b4\u00b9\u00be\u00c1\u00d1\u00d9\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}