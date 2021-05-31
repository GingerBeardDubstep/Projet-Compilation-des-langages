// $ANTLR 3.5.2 Grammaire.g 2021-03-23 23:46:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammaireParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFFECT", "AS", "ATOMID", "BLOCK", 
		"CLASS", "CLASSBLOCK", "CLASSID", "CONSTRUCTOR", "ELSE", "EXPR", "FORMALPARAM", 
		"ID", "IF", "INSTANCIATION", "INSTEXPR", "INSTRUCTION", "INTEGER", "LOCALVARIABLE", 
		"LOCALVARIABLEINIT", "MESSAGE", "METHODE", "METHODEPARAM", "MULTICOMMENT", 
		"NORMALCOMMENT", "RETURN", "ROOT", "SELECTION", "SIGNEDINTEGER", "STRING", 
		"THEN", "VARIABLECLASSE", "VARIABLECLASSEINIT", "WHILE", "WS", "'&'", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "':='", 
		"';'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'as'", "'class'", 
		"'def'", "'do'", "'else'", "'extends'", "'if'", "'is'", "'new'", "'override'", 
		"'return'", "'static'", "'then'", "'var'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int AFFECT=4;
	public static final int AS=5;
	public static final int ATOMID=6;
	public static final int BLOCK=7;
	public static final int CLASS=8;
	public static final int CLASSBLOCK=9;
	public static final int CLASSID=10;
	public static final int CONSTRUCTOR=11;
	public static final int ELSE=12;
	public static final int EXPR=13;
	public static final int FORMALPARAM=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int INSTANCIATION=17;
	public static final int INSTEXPR=18;
	public static final int INSTRUCTION=19;
	public static final int INTEGER=20;
	public static final int LOCALVARIABLE=21;
	public static final int LOCALVARIABLEINIT=22;
	public static final int MESSAGE=23;
	public static final int METHODE=24;
	public static final int METHODEPARAM=25;
	public static final int MULTICOMMENT=26;
	public static final int NORMALCOMMENT=27;
	public static final int RETURN=28;
	public static final int ROOT=29;
	public static final int SELECTION=30;
	public static final int SIGNEDINTEGER=31;
	public static final int STRING=32;
	public static final int THEN=33;
	public static final int VARIABLECLASSE=34;
	public static final int VARIABLECLASSEINIT=35;
	public static final int WHILE=36;
	public static final int WS=37;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammaireParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammaireParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GrammaireParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Grammaire.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Grammaire.g:9:1: program : declaration -> ^( ROOT declaration ) ;
	public final GrammaireParser.program_return program() throws RecognitionException {
		GrammaireParser.program_return retval = new GrammaireParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declaration1 =null;

		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// Grammaire.g:9:9: ( declaration -> ^( ROOT declaration ) )
			// Grammaire.g:9:11: declaration
			{
			pushFollow(FOLLOW_declaration_in_program104);
			declaration1=declaration();
			state._fsp--;

			stream_declaration.add(declaration1.getTree());
			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 9:23: -> ^( ROOT declaration )
			{
				// Grammaire.g:9:26: ^( ROOT declaration )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
				adaptor.addChild(root_1, stream_declaration.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Grammaire.g:11:1: declaration : ( classe )* block -> ( classe )* block ;
	public final GrammaireParser.declaration_return declaration() throws RecognitionException {
		GrammaireParser.declaration_return retval = new GrammaireParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope classe2 =null;
		ParserRuleReturnScope block3 =null;

		RewriteRuleSubtreeStream stream_classe=new RewriteRuleSubtreeStream(adaptor,"rule classe");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Grammaire.g:11:13: ( ( classe )* block -> ( classe )* block )
			// Grammaire.g:11:15: ( classe )* block
			{
			// Grammaire.g:11:15: ( classe )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==57) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammaire.g:11:16: classe
					{
					pushFollow(FOLLOW_classe_in_declaration121);
					classe2=classe();
					state._fsp--;

					stream_classe.add(classe2.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_block_in_declaration125);
			block3=block();
			state._fsp--;

			stream_block.add(block3.getTree());
			// AST REWRITE
			// elements: classe, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 11:31: -> ( classe )* block
			{
				// Grammaire.g:11:34: ( classe )*
				while ( stream_classe.hasNext() ) {
					adaptor.addChild(root_0, stream_classe.nextTree());
				}
				stream_classe.reset();

				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class classe_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classe"
	// Grammaire.g:14:1: classe : 'class' name= CLASSID '(' ( formalParam ( ',' formalParam )* )? ')' ( 'extends' superc= CLASSID )? 'is' classBlock -> ^( CLASS $name ( formalParam )* ( $superc)? classBlock ) ;
	public final GrammaireParser.classe_return classe() throws RecognitionException {
		GrammaireParser.classe_return retval = new GrammaireParser.classe_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name=null;
		Token superc=null;
		Token string_literal4=null;
		Token char_literal5=null;
		Token char_literal7=null;
		Token char_literal9=null;
		Token string_literal10=null;
		Token string_literal11=null;
		ParserRuleReturnScope formalParam6 =null;
		ParserRuleReturnScope formalParam8 =null;
		ParserRuleReturnScope classBlock12 =null;

		Object name_tree=null;
		Object superc_tree=null;
		Object string_literal4_tree=null;
		Object char_literal5_tree=null;
		Object char_literal7_tree=null;
		Object char_literal9_tree=null;
		Object string_literal10_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_formalParam=new RewriteRuleSubtreeStream(adaptor,"rule formalParam");
		RewriteRuleSubtreeStream stream_classBlock=new RewriteRuleSubtreeStream(adaptor,"rule classBlock");

		try {
			// Grammaire.g:14:8: ( 'class' name= CLASSID '(' ( formalParam ( ',' formalParam )* )? ')' ( 'extends' superc= CLASSID )? 'is' classBlock -> ^( CLASS $name ( formalParam )* ( $superc)? classBlock ) )
			// Grammaire.g:14:10: 'class' name= CLASSID '(' ( formalParam ( ',' formalParam )* )? ')' ( 'extends' superc= CLASSID )? 'is' classBlock
			{
			string_literal4=(Token)match(input,57,FOLLOW_57_in_classe142);  
			stream_57.add(string_literal4);

			name=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_classe146);  
			stream_CLASSID.add(name);

			char_literal5=(Token)match(input,39,FOLLOW_39_in_classe148);  
			stream_39.add(char_literal5);

			// Grammaire.g:14:35: ( formalParam ( ',' formalParam )* )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID||LA3_0==69) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Grammaire.g:14:36: formalParam ( ',' formalParam )*
					{
					pushFollow(FOLLOW_formalParam_in_classe151);
					formalParam6=formalParam();
					state._fsp--;

					stream_formalParam.add(formalParam6.getTree());
					// Grammaire.g:14:48: ( ',' formalParam )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==43) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// Grammaire.g:14:49: ',' formalParam
							{
							char_literal7=(Token)match(input,43,FOLLOW_43_in_classe154);  
							stream_43.add(char_literal7);

							pushFollow(FOLLOW_formalParam_in_classe156);
							formalParam8=formalParam();
							state._fsp--;

							stream_formalParam.add(formalParam8.getTree());
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			char_literal9=(Token)match(input,40,FOLLOW_40_in_classe163);  
			stream_40.add(char_literal9);

			// Grammaire.g:14:74: ( 'extends' superc= CLASSID )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==61) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Grammaire.g:14:75: 'extends' superc= CLASSID
					{
					string_literal10=(Token)match(input,61,FOLLOW_61_in_classe166);  
					stream_61.add(string_literal10);

					superc=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_classe170);  
					stream_CLASSID.add(superc);

					}
					break;

			}

			string_literal11=(Token)match(input,63,FOLLOW_63_in_classe174);  
			stream_63.add(string_literal11);

			pushFollow(FOLLOW_classBlock_in_classe176);
			classBlock12=classBlock();
			state._fsp--;

			stream_classBlock.add(classBlock12.getTree());
			// AST REWRITE
			// elements: superc, formalParam, classBlock, name
			// token labels: name, superc
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_superc=new RewriteRuleTokenStream(adaptor,"token superc",superc);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 15:2: -> ^( CLASS $name ( formalParam )* ( $superc)? classBlock )
			{
				// Grammaire.g:15:4: ^( CLASS $name ( formalParam )* ( $superc)? classBlock )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS, "CLASS"), root_1);
				adaptor.addChild(root_1, stream_name.nextNode());
				// Grammaire.g:15:18: ( formalParam )*
				while ( stream_formalParam.hasNext() ) {
					adaptor.addChild(root_1, stream_formalParam.nextTree());
				}
				stream_formalParam.reset();

				// Grammaire.g:15:32: ( $superc)?
				if ( stream_superc.hasNext() ) {
					adaptor.addChild(root_1, stream_superc.nextNode());
				}
				stream_superc.reset();

				adaptor.addChild(root_1, stream_classBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classe"


	public static class classBlock_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classBlock"
	// Grammaire.g:18:1: classBlock : '{' ( variableClasse )* ( affect )* constructor ( methode )* '}' -> ^( CLASSBLOCK constructor ( variableClasse )* ( methode )* ( affect )* ) ;
	public final GrammaireParser.classBlock_return classBlock() throws RecognitionException {
		GrammaireParser.classBlock_return retval = new GrammaireParser.classBlock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		Token char_literal18=null;
		ParserRuleReturnScope variableClasse14 =null;
		ParserRuleReturnScope affect15 =null;
		ParserRuleReturnScope constructor16 =null;
		ParserRuleReturnScope methode17 =null;

		Object char_literal13_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_methode=new RewriteRuleSubtreeStream(adaptor,"rule methode");
		RewriteRuleSubtreeStream stream_variableClasse=new RewriteRuleSubtreeStream(adaptor,"rule variableClasse");
		RewriteRuleSubtreeStream stream_affect=new RewriteRuleSubtreeStream(adaptor,"rule affect");
		RewriteRuleSubtreeStream stream_constructor=new RewriteRuleSubtreeStream(adaptor,"rule constructor");

		try {
			// Grammaire.g:18:12: ( '{' ( variableClasse )* ( affect )* constructor ( methode )* '}' -> ^( CLASSBLOCK constructor ( variableClasse )* ( methode )* ( affect )* ) )
			// Grammaire.g:18:14: '{' ( variableClasse )* ( affect )* constructor ( methode )* '}'
			{
			char_literal13=(Token)match(input,71,FOLLOW_71_in_classBlock205);  
			stream_71.add(char_literal13);

			// Grammaire.g:18:18: ( variableClasse )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==69) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Grammaire.g:18:18: variableClasse
					{
					pushFollow(FOLLOW_variableClasse_in_classBlock207);
					variableClasse14=variableClasse();
					state._fsp--;

					stream_variableClasse.add(variableClasse14.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// Grammaire.g:18:34: ( affect )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CLASSID||LA6_0==ID||LA6_0==INTEGER||LA6_0==STRING||LA6_0==39||LA6_0==42||LA6_0==44||LA6_0==64) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Grammaire.g:18:34: affect
					{
					pushFollow(FOLLOW_affect_in_classBlock210);
					affect15=affect();
					state._fsp--;

					stream_affect.add(affect15.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_constructor_in_classBlock213);
			constructor16=constructor();
			state._fsp--;

			stream_constructor.add(constructor16.getTree());
			// Grammaire.g:18:54: ( methode )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==58) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Grammaire.g:18:54: methode
					{
					pushFollow(FOLLOW_methode_in_classBlock215);
					methode17=methode();
					state._fsp--;

					stream_methode.add(methode17.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			char_literal18=(Token)match(input,72,FOLLOW_72_in_classBlock218);  
			stream_72.add(char_literal18);

			// AST REWRITE
			// elements: constructor, methode, affect, variableClasse
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 18:67: -> ^( CLASSBLOCK constructor ( variableClasse )* ( methode )* ( affect )* )
			{
				// Grammaire.g:18:70: ^( CLASSBLOCK constructor ( variableClasse )* ( methode )* ( affect )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASSBLOCK, "CLASSBLOCK"), root_1);
				adaptor.addChild(root_1, stream_constructor.nextTree());
				// Grammaire.g:18:95: ( variableClasse )*
				while ( stream_variableClasse.hasNext() ) {
					adaptor.addChild(root_1, stream_variableClasse.nextTree());
				}
				stream_variableClasse.reset();

				// Grammaire.g:18:111: ( methode )*
				while ( stream_methode.hasNext() ) {
					adaptor.addChild(root_1, stream_methode.nextTree());
				}
				stream_methode.reset();

				// Grammaire.g:18:120: ( affect )*
				while ( stream_affect.hasNext() ) {
					adaptor.addChild(root_1, stream_affect.nextTree());
				}
				stream_affect.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classBlock"


	public static class constructor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor"
	// Grammaire.g:21:1: constructor : 'def' name= CLASSID '(' ( formalParam ( ',' formalParam )* )? ')' ( ':' superc= CLASSID '(' ( condExpr ( ',' condExpr )* )? ')' )? 'is' block -> ^( CONSTRUCTOR $name ( $superc)? ( formalParam )* ( condExpr )* block ) ;
	public final GrammaireParser.constructor_return constructor() throws RecognitionException {
		GrammaireParser.constructor_return retval = new GrammaireParser.constructor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name=null;
		Token superc=null;
		Token string_literal19=null;
		Token char_literal20=null;
		Token char_literal22=null;
		Token char_literal24=null;
		Token char_literal25=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token char_literal30=null;
		Token string_literal31=null;
		ParserRuleReturnScope formalParam21 =null;
		ParserRuleReturnScope formalParam23 =null;
		ParserRuleReturnScope condExpr27 =null;
		ParserRuleReturnScope condExpr29 =null;
		ParserRuleReturnScope block32 =null;

		Object name_tree=null;
		Object superc_tree=null;
		Object string_literal19_tree=null;
		Object char_literal20_tree=null;
		Object char_literal22_tree=null;
		Object char_literal24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object char_literal30_tree=null;
		Object string_literal31_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_formalParam=new RewriteRuleSubtreeStream(adaptor,"rule formalParam");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// Grammaire.g:21:13: ( 'def' name= CLASSID '(' ( formalParam ( ',' formalParam )* )? ')' ( ':' superc= CLASSID '(' ( condExpr ( ',' condExpr )* )? ')' )? 'is' block -> ^( CONSTRUCTOR $name ( $superc)? ( formalParam )* ( condExpr )* block ) )
			// Grammaire.g:21:15: 'def' name= CLASSID '(' ( formalParam ( ',' formalParam )* )? ')' ( ':' superc= CLASSID '(' ( condExpr ( ',' condExpr )* )? ')' )? 'is' block
			{
			string_literal19=(Token)match(input,58,FOLLOW_58_in_constructor245);  
			stream_58.add(string_literal19);

			name=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_constructor249);  
			stream_CLASSID.add(name);

			char_literal20=(Token)match(input,39,FOLLOW_39_in_constructor251);  
			stream_39.add(char_literal20);

			// Grammaire.g:21:38: ( formalParam ( ',' formalParam )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID||LA9_0==69) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Grammaire.g:21:39: formalParam ( ',' formalParam )*
					{
					pushFollow(FOLLOW_formalParam_in_constructor254);
					formalParam21=formalParam();
					state._fsp--;

					stream_formalParam.add(formalParam21.getTree());
					// Grammaire.g:21:51: ( ',' formalParam )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==43) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// Grammaire.g:21:52: ',' formalParam
							{
							char_literal22=(Token)match(input,43,FOLLOW_43_in_constructor257);  
							stream_43.add(char_literal22);

							pushFollow(FOLLOW_formalParam_in_constructor259);
							formalParam23=formalParam();
							state._fsp--;

							stream_formalParam.add(formalParam23.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			char_literal24=(Token)match(input,40,FOLLOW_40_in_constructor266);  
			stream_40.add(char_literal24);

			// Grammaire.g:21:77: ( ':' superc= CLASSID '(' ( condExpr ( ',' condExpr )* )? ')' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==47) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Grammaire.g:21:78: ':' superc= CLASSID '(' ( condExpr ( ',' condExpr )* )? ')'
					{
					char_literal25=(Token)match(input,47,FOLLOW_47_in_constructor269);  
					stream_47.add(char_literal25);

					superc=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_constructor273);  
					stream_CLASSID.add(superc);

					char_literal26=(Token)match(input,39,FOLLOW_39_in_constructor275);  
					stream_39.add(char_literal26);

					// Grammaire.g:21:100: ( condExpr ( ',' condExpr )* )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==CLASSID||LA11_0==ID||LA11_0==INTEGER||LA11_0==STRING||LA11_0==39||LA11_0==42||LA11_0==44||LA11_0==64) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// Grammaire.g:21:101: condExpr ( ',' condExpr )*
							{
							pushFollow(FOLLOW_condExpr_in_constructor277);
							condExpr27=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr27.getTree());
							// Grammaire.g:21:110: ( ',' condExpr )*
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( (LA10_0==43) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// Grammaire.g:21:111: ',' condExpr
									{
									char_literal28=(Token)match(input,43,FOLLOW_43_in_constructor280);  
									stream_43.add(char_literal28);

									pushFollow(FOLLOW_condExpr_in_constructor282);
									condExpr29=condExpr();
									state._fsp--;

									stream_condExpr.add(condExpr29.getTree());
									}
									break;

								default :
									break loop10;
								}
							}

							}
							break;

					}

					char_literal30=(Token)match(input,40,FOLLOW_40_in_constructor288);  
					stream_40.add(char_literal30);

					}
					break;

			}

			string_literal31=(Token)match(input,63,FOLLOW_63_in_constructor292);  
			stream_63.add(string_literal31);

			pushFollow(FOLLOW_block_in_constructor294);
			block32=block();
			state._fsp--;

			stream_block.add(block32.getTree());
			// AST REWRITE
			// elements: formalParam, condExpr, name, block, superc
			// token labels: name, superc
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_superc=new RewriteRuleTokenStream(adaptor,"token superc",superc);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 22:2: -> ^( CONSTRUCTOR $name ( $superc)? ( formalParam )* ( condExpr )* block )
			{
				// Grammaire.g:22:5: ^( CONSTRUCTOR $name ( $superc)? ( formalParam )* ( condExpr )* block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRUCTOR, "CONSTRUCTOR"), root_1);
				adaptor.addChild(root_1, stream_name.nextNode());
				// Grammaire.g:22:26: ( $superc)?
				if ( stream_superc.hasNext() ) {
					adaptor.addChild(root_1, stream_superc.nextNode());
				}
				stream_superc.reset();

				// Grammaire.g:22:34: ( formalParam )*
				while ( stream_formalParam.hasNext() ) {
					adaptor.addChild(root_1, stream_formalParam.nextTree());
				}
				stream_formalParam.reset();

				// Grammaire.g:22:47: ( condExpr )*
				while ( stream_condExpr.hasNext() ) {
					adaptor.addChild(root_1, stream_condExpr.nextTree());
				}
				stream_condExpr.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor"


	public static class variableClasse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableClasse"
	// Grammaire.g:25:1: variableClasse : 'var' ( 'static' )? ID ':' CLASSID ( ':=' expr ';' -> ^( VARIABLECLASSEINIT ID CLASSID ( 'var' )? ( 'static' )? expr ) | ';' -> ^( VARIABLECLASSE ID CLASSID ( 'var' )? ( 'static' )? ) ) ;
	public final GrammaireParser.variableClasse_return variableClasse() throws RecognitionException {
		GrammaireParser.variableClasse_return retval = new GrammaireParser.variableClasse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token string_literal34=null;
		Token ID35=null;
		Token char_literal36=null;
		Token CLASSID37=null;
		Token string_literal38=null;
		Token char_literal40=null;
		Token char_literal41=null;
		ParserRuleReturnScope expr39 =null;

		Object string_literal33_tree=null;
		Object string_literal34_tree=null;
		Object ID35_tree=null;
		Object char_literal36_tree=null;
		Object CLASSID37_tree=null;
		Object string_literal38_tree=null;
		Object char_literal40_tree=null;
		Object char_literal41_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:25:16: ( 'var' ( 'static' )? ID ':' CLASSID ( ':=' expr ';' -> ^( VARIABLECLASSEINIT ID CLASSID ( 'var' )? ( 'static' )? expr ) | ';' -> ^( VARIABLECLASSE ID CLASSID ( 'var' )? ( 'static' )? ) ) )
			// Grammaire.g:25:18: 'var' ( 'static' )? ID ':' CLASSID ( ':=' expr ';' -> ^( VARIABLECLASSEINIT ID CLASSID ( 'var' )? ( 'static' )? expr ) | ';' -> ^( VARIABLECLASSE ID CLASSID ( 'var' )? ( 'static' )? ) )
			{
			string_literal33=(Token)match(input,69,FOLLOW_69_in_variableClasse329);  
			stream_69.add(string_literal33);

			// Grammaire.g:25:24: ( 'static' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==67) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// Grammaire.g:25:24: 'static'
					{
					string_literal34=(Token)match(input,67,FOLLOW_67_in_variableClasse331);  
					stream_67.add(string_literal34);

					}
					break;

			}

			ID35=(Token)match(input,ID,FOLLOW_ID_in_variableClasse334);  
			stream_ID.add(ID35);

			char_literal36=(Token)match(input,47,FOLLOW_47_in_variableClasse336);  
			stream_47.add(char_literal36);

			CLASSID37=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_variableClasse338);  
			stream_CLASSID.add(CLASSID37);

			// Grammaire.g:25:49: ( ':=' expr ';' -> ^( VARIABLECLASSEINIT ID CLASSID ( 'var' )? ( 'static' )? expr ) | ';' -> ^( VARIABLECLASSE ID CLASSID ( 'var' )? ( 'static' )? ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==48) ) {
				alt14=1;
			}
			else if ( (LA14_0==49) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// Grammaire.g:25:50: ':=' expr ';'
					{
					string_literal38=(Token)match(input,48,FOLLOW_48_in_variableClasse341);  
					stream_48.add(string_literal38);

					pushFollow(FOLLOW_expr_in_variableClasse343);
					expr39=expr();
					state._fsp--;

					stream_expr.add(expr39.getTree());
					char_literal40=(Token)match(input,49,FOLLOW_49_in_variableClasse345);  
					stream_49.add(char_literal40);

					// AST REWRITE
					// elements: expr, ID, 69, CLASSID, 67
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 25:64: -> ^( VARIABLECLASSEINIT ID CLASSID ( 'var' )? ( 'static' )? expr )
					{
						// Grammaire.g:25:67: ^( VARIABLECLASSEINIT ID CLASSID ( 'var' )? ( 'static' )? expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLECLASSEINIT, "VARIABLECLASSEINIT"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_CLASSID.nextNode());
						// Grammaire.g:25:99: ( 'var' )?
						if ( stream_69.hasNext() ) {
							adaptor.addChild(root_1, stream_69.nextNode());
						}
						stream_69.reset();

						// Grammaire.g:25:106: ( 'static' )?
						if ( stream_67.hasNext() ) {
							adaptor.addChild(root_1, stream_67.nextNode());
						}
						stream_67.reset();

						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammaire.g:26:3: ';'
					{
					char_literal41=(Token)match(input,49,FOLLOW_49_in_variableClasse367);  
					stream_49.add(char_literal41);

					// AST REWRITE
					// elements: 67, 69, ID, CLASSID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 26:7: -> ^( VARIABLECLASSE ID CLASSID ( 'var' )? ( 'static' )? )
					{
						// Grammaire.g:26:10: ^( VARIABLECLASSE ID CLASSID ( 'var' )? ( 'static' )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLECLASSE, "VARIABLECLASSE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_CLASSID.nextNode());
						// Grammaire.g:26:38: ( 'var' )?
						if ( stream_69.hasNext() ) {
							adaptor.addChild(root_1, stream_69.nextNode());
						}
						stream_69.reset();

						// Grammaire.g:26:45: ( 'static' )?
						if ( stream_67.hasNext() ) {
							adaptor.addChild(root_1, stream_67.nextNode());
						}
						stream_67.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableClasse"


	public static class localVariable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localVariable"
	// Grammaire.g:29:1: localVariable : ID ':' CLASSID ( ':=' condExpr ';' -> ^( LOCALVARIABLEINIT ID CLASSID condExpr ) | ';' -> ^( LOCALVARIABLE ID CLASSID ) ) ;
	public final GrammaireParser.localVariable_return localVariable() throws RecognitionException {
		GrammaireParser.localVariable_return retval = new GrammaireParser.localVariable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID42=null;
		Token char_literal43=null;
		Token CLASSID44=null;
		Token string_literal45=null;
		Token char_literal47=null;
		Token char_literal48=null;
		ParserRuleReturnScope condExpr46 =null;

		Object ID42_tree=null;
		Object char_literal43_tree=null;
		Object CLASSID44_tree=null;
		Object string_literal45_tree=null;
		Object char_literal47_tree=null;
		Object char_literal48_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");

		try {
			// Grammaire.g:29:15: ( ID ':' CLASSID ( ':=' condExpr ';' -> ^( LOCALVARIABLEINIT ID CLASSID condExpr ) | ';' -> ^( LOCALVARIABLE ID CLASSID ) ) )
			// Grammaire.g:29:17: ID ':' CLASSID ( ':=' condExpr ';' -> ^( LOCALVARIABLEINIT ID CLASSID condExpr ) | ';' -> ^( LOCALVARIABLE ID CLASSID ) )
			{
			ID42=(Token)match(input,ID,FOLLOW_ID_in_localVariable396);  
			stream_ID.add(ID42);

			char_literal43=(Token)match(input,47,FOLLOW_47_in_localVariable398);  
			stream_47.add(char_literal43);

			CLASSID44=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_localVariable400);  
			stream_CLASSID.add(CLASSID44);

			// Grammaire.g:29:32: ( ':=' condExpr ';' -> ^( LOCALVARIABLEINIT ID CLASSID condExpr ) | ';' -> ^( LOCALVARIABLE ID CLASSID ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==48) ) {
				alt15=1;
			}
			else if ( (LA15_0==49) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Grammaire.g:29:33: ':=' condExpr ';'
					{
					string_literal45=(Token)match(input,48,FOLLOW_48_in_localVariable403);  
					stream_48.add(string_literal45);

					pushFollow(FOLLOW_condExpr_in_localVariable405);
					condExpr46=condExpr();
					state._fsp--;

					stream_condExpr.add(condExpr46.getTree());
					char_literal47=(Token)match(input,49,FOLLOW_49_in_localVariable407);  
					stream_49.add(char_literal47);

					// AST REWRITE
					// elements: condExpr, ID, CLASSID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 29:51: -> ^( LOCALVARIABLEINIT ID CLASSID condExpr )
					{
						// Grammaire.g:29:54: ^( LOCALVARIABLEINIT ID CLASSID condExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALVARIABLEINIT, "LOCALVARIABLEINIT"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_CLASSID.nextNode());
						adaptor.addChild(root_1, stream_condExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammaire.g:30:2: ';'
					{
					char_literal48=(Token)match(input,49,FOLLOW_49_in_localVariable423);  
					stream_49.add(char_literal48);

					// AST REWRITE
					// elements: ID, CLASSID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 30:6: -> ^( LOCALVARIABLE ID CLASSID )
					{
						// Grammaire.g:30:9: ^( LOCALVARIABLE ID CLASSID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALVARIABLE, "LOCALVARIABLE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_CLASSID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localVariable"


	public static class methode_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methode"
	// Grammaire.g:33:1: methode : 'def' ( 'static' )? ( 'override' )? ID '(' ( methodeParam ( ',' methodeParam )* )? ')' ( 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* block ) | ':' CLASSID ( ':=' condExpr -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr ) | 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block ) ) ) ;
	public final GrammaireParser.methode_return methode() throws RecognitionException {
		GrammaireParser.methode_return retval = new GrammaireParser.methode_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal49=null;
		Token string_literal50=null;
		Token string_literal51=null;
		Token ID52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		Token char_literal57=null;
		Token string_literal58=null;
		Token char_literal60=null;
		Token CLASSID61=null;
		Token string_literal62=null;
		Token string_literal64=null;
		ParserRuleReturnScope methodeParam54 =null;
		ParserRuleReturnScope methodeParam56 =null;
		ParserRuleReturnScope block59 =null;
		ParserRuleReturnScope condExpr63 =null;
		ParserRuleReturnScope block65 =null;

		Object string_literal49_tree=null;
		Object string_literal50_tree=null;
		Object string_literal51_tree=null;
		Object ID52_tree=null;
		Object char_literal53_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		Object string_literal58_tree=null;
		Object char_literal60_tree=null;
		Object CLASSID61_tree=null;
		Object string_literal62_tree=null;
		Object string_literal64_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_methodeParam=new RewriteRuleSubtreeStream(adaptor,"rule methodeParam");

		try {
			// Grammaire.g:33:9: ( 'def' ( 'static' )? ( 'override' )? ID '(' ( methodeParam ( ',' methodeParam )* )? ')' ( 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* block ) | ':' CLASSID ( ':=' condExpr -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr ) | 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block ) ) ) )
			// Grammaire.g:33:11: 'def' ( 'static' )? ( 'override' )? ID '(' ( methodeParam ( ',' methodeParam )* )? ')' ( 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* block ) | ':' CLASSID ( ':=' condExpr -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr ) | 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block ) ) )
			{
			string_literal49=(Token)match(input,58,FOLLOW_58_in_methode445);  
			stream_58.add(string_literal49);

			// Grammaire.g:33:17: ( 'static' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==67) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Grammaire.g:33:17: 'static'
					{
					string_literal50=(Token)match(input,67,FOLLOW_67_in_methode447);  
					stream_67.add(string_literal50);

					}
					break;

			}

			// Grammaire.g:33:27: ( 'override' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==65) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Grammaire.g:33:27: 'override'
					{
					string_literal51=(Token)match(input,65,FOLLOW_65_in_methode450);  
					stream_65.add(string_literal51);

					}
					break;

			}

			ID52=(Token)match(input,ID,FOLLOW_ID_in_methode453);  
			stream_ID.add(ID52);

			char_literal53=(Token)match(input,39,FOLLOW_39_in_methode455);  
			stream_39.add(char_literal53);

			// Grammaire.g:33:46: ( methodeParam ( ',' methodeParam )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ID) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Grammaire.g:33:47: methodeParam ( ',' methodeParam )*
					{
					pushFollow(FOLLOW_methodeParam_in_methode458);
					methodeParam54=methodeParam();
					state._fsp--;

					stream_methodeParam.add(methodeParam54.getTree());
					// Grammaire.g:33:60: ( ',' methodeParam )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==43) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// Grammaire.g:33:61: ',' methodeParam
							{
							char_literal55=(Token)match(input,43,FOLLOW_43_in_methode461);  
							stream_43.add(char_literal55);

							pushFollow(FOLLOW_methodeParam_in_methode463);
							methodeParam56=methodeParam();
							state._fsp--;

							stream_methodeParam.add(methodeParam56.getTree());
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			char_literal57=(Token)match(input,40,FOLLOW_40_in_methode470);  
			stream_40.add(char_literal57);

			// Grammaire.g:34:2: ( 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* block ) | ':' CLASSID ( ':=' condExpr -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr ) | 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block ) ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==63) ) {
				alt21=1;
			}
			else if ( (LA21_0==47) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Grammaire.g:34:2: 'is' block
					{
					string_literal58=(Token)match(input,63,FOLLOW_63_in_methode474);  
					stream_63.add(string_literal58);

					pushFollow(FOLLOW_block_in_methode476);
					block59=block();
					state._fsp--;

					stream_block.add(block59.getTree());
					// AST REWRITE
					// elements: ID, block, 67, 65, methodeParam
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 34:13: -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* block )
					{
						// Grammaire.g:34:16: ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* block )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODE, "METHODE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// Grammaire.g:34:29: ( 'static' )?
						if ( stream_67.hasNext() ) {
							adaptor.addChild(root_1, stream_67.nextNode());
						}
						stream_67.reset();

						// Grammaire.g:34:39: ( 'override' )?
						if ( stream_65.hasNext() ) {
							adaptor.addChild(root_1, stream_65.nextNode());
						}
						stream_65.reset();

						// Grammaire.g:34:51: ( methodeParam )*
						while ( stream_methodeParam.hasNext() ) {
							adaptor.addChild(root_1, stream_methodeParam.nextTree());
						}
						stream_methodeParam.reset();

						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammaire.g:35:2: ':' CLASSID ( ':=' condExpr -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr ) | 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block ) )
					{
					char_literal60=(Token)match(input,47,FOLLOW_47_in_methode499);  
					stream_47.add(char_literal60);

					CLASSID61=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_methode501);  
					stream_CLASSID.add(CLASSID61);

					// Grammaire.g:36:2: ( ':=' condExpr -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr ) | 'is' block -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==48) ) {
						alt20=1;
					}
					else if ( (LA20_0==63) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// Grammaire.g:36:3: ':=' condExpr
							{
							string_literal62=(Token)match(input,48,FOLLOW_48_in_methode506);  
							stream_48.add(string_literal62);

							pushFollow(FOLLOW_condExpr_in_methode508);
							condExpr63=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr63.getTree());
							// AST REWRITE
							// elements: CLASSID, 67, methodeParam, condExpr, ID, 65
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 36:17: -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr )
							{
								// Grammaire.g:36:20: ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID condExpr )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODE, "METHODE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// Grammaire.g:36:33: ( 'static' )?
								if ( stream_67.hasNext() ) {
									adaptor.addChild(root_1, stream_67.nextNode());
								}
								stream_67.reset();

								// Grammaire.g:36:43: ( 'override' )?
								if ( stream_65.hasNext() ) {
									adaptor.addChild(root_1, stream_65.nextNode());
								}
								stream_65.reset();

								// Grammaire.g:36:55: ( methodeParam )*
								while ( stream_methodeParam.hasNext() ) {
									adaptor.addChild(root_1, stream_methodeParam.nextTree());
								}
								stream_methodeParam.reset();

								adaptor.addChild(root_1, stream_CLASSID.nextNode());
								adaptor.addChild(root_1, stream_condExpr.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:37:1: 'is' block
							{
							string_literal64=(Token)match(input,63,FOLLOW_63_in_methode533);  
							stream_63.add(string_literal64);

							pushFollow(FOLLOW_block_in_methode535);
							block65=block();
							state._fsp--;

							stream_block.add(block65.getTree());
							// AST REWRITE
							// elements: 65, ID, block, methodeParam, 67, CLASSID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 37:12: -> ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block )
							{
								// Grammaire.g:37:15: ^( METHODE ID ( 'static' )? ( 'override' )? ( methodeParam )* CLASSID block )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODE, "METHODE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// Grammaire.g:37:28: ( 'static' )?
								if ( stream_67.hasNext() ) {
									adaptor.addChild(root_1, stream_67.nextNode());
								}
								stream_67.reset();

								// Grammaire.g:37:38: ( 'override' )?
								if ( stream_65.hasNext() ) {
									adaptor.addChild(root_1, stream_65.nextNode());
								}
								stream_65.reset();

								// Grammaire.g:37:50: ( methodeParam )*
								while ( stream_methodeParam.hasNext() ) {
									adaptor.addChild(root_1, stream_methodeParam.nextTree());
								}
								stream_methodeParam.reset();

								adaptor.addChild(root_1, stream_CLASSID.nextNode());
								adaptor.addChild(root_1, stream_block.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methode"


	public static class methodeParam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodeParam"
	// Grammaire.g:40:1: methodeParam : ID ':' CLASSID -> ^( METHODEPARAM ID CLASSID ) ;
	public final GrammaireParser.methodeParam_return methodeParam() throws RecognitionException {
		GrammaireParser.methodeParam_return retval = new GrammaireParser.methodeParam_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID66=null;
		Token char_literal67=null;
		Token CLASSID68=null;

		Object ID66_tree=null;
		Object char_literal67_tree=null;
		Object CLASSID68_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");

		try {
			// Grammaire.g:40:14: ( ID ':' CLASSID -> ^( METHODEPARAM ID CLASSID ) )
			// Grammaire.g:40:16: ID ':' CLASSID
			{
			ID66=(Token)match(input,ID,FOLLOW_ID_in_methodeParam568);  
			stream_ID.add(ID66);

			char_literal67=(Token)match(input,47,FOLLOW_47_in_methodeParam570);  
			stream_47.add(char_literal67);

			CLASSID68=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_methodeParam572);  
			stream_CLASSID.add(CLASSID68);

			// AST REWRITE
			// elements: CLASSID, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 40:31: -> ^( METHODEPARAM ID CLASSID )
			{
				// Grammaire.g:40:34: ^( METHODEPARAM ID CLASSID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODEPARAM, "METHODEPARAM"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_CLASSID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodeParam"


	public static class selection_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selection"
	// Grammaire.g:43:1: selection : '.' ID ( -> ^( SELECTION ID ) | '(' ( condExpr ( ',' condExpr )* )? ')' -> ^( MESSAGE ID ( condExpr )* ) ) ;
	public final GrammaireParser.selection_return selection() throws RecognitionException {
		GrammaireParser.selection_return retval = new GrammaireParser.selection_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal69=null;
		Token ID70=null;
		Token char_literal71=null;
		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope condExpr72 =null;
		ParserRuleReturnScope condExpr74 =null;

		Object char_literal69_tree=null;
		Object ID70_tree=null;
		Object char_literal71_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");

		try {
			// Grammaire.g:43:11: ( '.' ID ( -> ^( SELECTION ID ) | '(' ( condExpr ( ',' condExpr )* )? ')' -> ^( MESSAGE ID ( condExpr )* ) ) )
			// Grammaire.g:43:13: '.' ID ( -> ^( SELECTION ID ) | '(' ( condExpr ( ',' condExpr )* )? ')' -> ^( MESSAGE ID ( condExpr )* ) )
			{
			char_literal69=(Token)match(input,45,FOLLOW_45_in_selection592);  
			stream_45.add(char_literal69);

			ID70=(Token)match(input,ID,FOLLOW_ID_in_selection594);  
			stream_ID.add(ID70);

			// Grammaire.g:43:20: ( -> ^( SELECTION ID ) | '(' ( condExpr ( ',' condExpr )* )? ')' -> ^( MESSAGE ID ( condExpr )* ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==38||(LA24_0 >= 40 && LA24_0 <= 55)||(LA24_0 >= 58 && LA24_0 <= 59)||LA24_0==68||LA24_0==72) ) {
				alt24=1;
			}
			else if ( (LA24_0==39) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// Grammaire.g:43:21: 
					{
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 43:21: -> ^( SELECTION ID )
					{
						// Grammaire.g:43:24: ^( SELECTION ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECTION, "SELECTION"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammaire.g:43:40: '(' ( condExpr ( ',' condExpr )* )? ')'
					{
					char_literal71=(Token)match(input,39,FOLLOW_39_in_selection605);  
					stream_39.add(char_literal71);

					// Grammaire.g:43:44: ( condExpr ( ',' condExpr )* )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==CLASSID||LA23_0==ID||LA23_0==INTEGER||LA23_0==STRING||LA23_0==39||LA23_0==42||LA23_0==44||LA23_0==64) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// Grammaire.g:43:46: condExpr ( ',' condExpr )*
							{
							pushFollow(FOLLOW_condExpr_in_selection609);
							condExpr72=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr72.getTree());
							// Grammaire.g:43:55: ( ',' condExpr )*
							loop22:
							while (true) {
								int alt22=2;
								int LA22_0 = input.LA(1);
								if ( (LA22_0==43) ) {
									alt22=1;
								}

								switch (alt22) {
								case 1 :
									// Grammaire.g:43:56: ',' condExpr
									{
									char_literal73=(Token)match(input,43,FOLLOW_43_in_selection612);  
									stream_43.add(char_literal73);

									pushFollow(FOLLOW_condExpr_in_selection614);
									condExpr74=condExpr();
									state._fsp--;

									stream_condExpr.add(condExpr74.getTree());
									}
									break;

								default :
									break loop22;
								}
							}

							}
							break;

					}

					char_literal75=(Token)match(input,40,FOLLOW_40_in_selection621);  
					stream_40.add(char_literal75);

					// AST REWRITE
					// elements: ID, condExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 43:78: -> ^( MESSAGE ID ( condExpr )* )
					{
						// Grammaire.g:43:81: ^( MESSAGE ID ( condExpr )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MESSAGE, "MESSAGE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// Grammaire.g:43:94: ( condExpr )*
						while ( stream_condExpr.hasNext() ) {
							adaptor.addChild(root_1, stream_condExpr.nextTree());
						}
						stream_condExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selection"


	public static class formalParam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParam"
	// Grammaire.g:46:1: formalParam : ( 'var' )? ID ':' CLASSID -> ^( FORMALPARAM ( 'var' )? ID CLASSID ) ;
	public final GrammaireParser.formalParam_return formalParam() throws RecognitionException {
		GrammaireParser.formalParam_return retval = new GrammaireParser.formalParam_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal76=null;
		Token ID77=null;
		Token char_literal78=null;
		Token CLASSID79=null;

		Object string_literal76_tree=null;
		Object ID77_tree=null;
		Object char_literal78_tree=null;
		Object CLASSID79_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");

		try {
			// Grammaire.g:46:13: ( ( 'var' )? ID ':' CLASSID -> ^( FORMALPARAM ( 'var' )? ID CLASSID ) )
			// Grammaire.g:46:15: ( 'var' )? ID ':' CLASSID
			{
			// Grammaire.g:46:15: ( 'var' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==69) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Grammaire.g:46:15: 'var'
					{
					string_literal76=(Token)match(input,69,FOLLOW_69_in_formalParam647);  
					stream_69.add(string_literal76);

					}
					break;

			}

			ID77=(Token)match(input,ID,FOLLOW_ID_in_formalParam650);  
			stream_ID.add(ID77);

			char_literal78=(Token)match(input,47,FOLLOW_47_in_formalParam652);  
			stream_47.add(char_literal78);

			CLASSID79=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_formalParam654);  
			stream_CLASSID.add(CLASSID79);

			// AST REWRITE
			// elements: 69, ID, CLASSID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:37: -> ^( FORMALPARAM ( 'var' )? ID CLASSID )
			{
				// Grammaire.g:46:40: ^( FORMALPARAM ( 'var' )? ID CLASSID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMALPARAM, "FORMALPARAM"), root_1);
				// Grammaire.g:46:54: ( 'var' )?
				if ( stream_69.hasNext() ) {
					adaptor.addChild(root_1, stream_69.nextNode());
				}
				stream_69.reset();

				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_CLASSID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParam"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Grammaire.g:49:1: block : '{' ( atomID ( affectID ( instruction )* -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* ) | exprID ';' ( instruction )* -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* ) | ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) ) ) | instructionNoID ( instruction )* -> ^( BLOCK instructionNoID ( instruction )* ) | -> ^( BLOCK ) ) '}' ;
	public final GrammaireParser.block_return block() throws RecognitionException {
		GrammaireParser.block_return retval = new GrammaireParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal80=null;
		Token char_literal85=null;
		Token char_literal87=null;
		Token CLASSID88=null;
		Token string_literal89=null;
		Token char_literal91=null;
		Token string_literal93=null;
		Token char_literal95=null;
		Token string_literal97=null;
		Token char_literal101=null;
		ParserRuleReturnScope atomID81 =null;
		ParserRuleReturnScope affectID82 =null;
		ParserRuleReturnScope instruction83 =null;
		ParserRuleReturnScope exprID84 =null;
		ParserRuleReturnScope instruction86 =null;
		ParserRuleReturnScope condExpr90 =null;
		ParserRuleReturnScope localVariable92 =null;
		ParserRuleReturnScope instruction94 =null;
		ParserRuleReturnScope localVariable96 =null;
		ParserRuleReturnScope instruction98 =null;
		ParserRuleReturnScope instructionNoID99 =null;
		ParserRuleReturnScope instruction100 =null;

		Object char_literal80_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;
		Object CLASSID88_tree=null;
		Object string_literal89_tree=null;
		Object char_literal91_tree=null;
		Object string_literal93_tree=null;
		Object char_literal95_tree=null;
		Object string_literal97_tree=null;
		Object char_literal101_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_atomID=new RewriteRuleSubtreeStream(adaptor,"rule atomID");
		RewriteRuleSubtreeStream stream_instructionNoID=new RewriteRuleSubtreeStream(adaptor,"rule instructionNoID");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
		RewriteRuleSubtreeStream stream_localVariable=new RewriteRuleSubtreeStream(adaptor,"rule localVariable");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");
		RewriteRuleSubtreeStream stream_affectID=new RewriteRuleSubtreeStream(adaptor,"rule affectID");
		RewriteRuleSubtreeStream stream_exprID=new RewriteRuleSubtreeStream(adaptor,"rule exprID");

		try {
			// Grammaire.g:49:7: ( '{' ( atomID ( affectID ( instruction )* -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* ) | exprID ';' ( instruction )* -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* ) | ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) ) ) | instructionNoID ( instruction )* -> ^( BLOCK instructionNoID ( instruction )* ) | -> ^( BLOCK ) ) '}' )
			// Grammaire.g:49:10: '{' ( atomID ( affectID ( instruction )* -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* ) | exprID ';' ( instruction )* -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* ) | ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) ) ) | instructionNoID ( instruction )* -> ^( BLOCK instructionNoID ( instruction )* ) | -> ^( BLOCK ) ) '}'
			{
			char_literal80=(Token)match(input,71,FOLLOW_71_in_block678);  
			stream_71.add(char_literal80);

			// Grammaire.g:49:14: ( atomID ( affectID ( instruction )* -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* ) | exprID ';' ( instruction )* -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* ) | ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) ) ) | instructionNoID ( instruction )* -> ^( BLOCK instructionNoID ( instruction )* ) | -> ^( BLOCK ) )
			int alt35=3;
			switch ( input.LA(1) ) {
			case CLASSID:
			case ID:
				{
				alt35=1;
				}
				break;
			case INTEGER:
			case STRING:
			case 39:
			case 42:
			case 44:
			case 62:
			case 64:
			case 66:
			case 70:
			case 71:
				{
				alt35=2;
				}
				break;
			case 72:
				{
				alt35=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Grammaire.g:49:15: atomID ( affectID ( instruction )* -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* ) | exprID ';' ( instruction )* -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* ) | ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) ) )
					{
					pushFollow(FOLLOW_atomID_in_block681);
					atomID81=atomID();
					state._fsp--;

					stream_atomID.add(atomID81.getTree());
					// Grammaire.g:49:22: ( affectID ( instruction )* -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* ) | exprID ';' ( instruction )* -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* ) | ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) ) )
					int alt33=3;
					switch ( input.LA(1) ) {
					case 48:
						{
						alt33=1;
						}
						break;
					case 38:
					case 41:
					case 42:
					case 44:
					case 46:
					case 49:
					case 50:
					case 51:
					case 52:
					case 53:
					case 54:
					case 55:
						{
						alt33=2;
						}
						break;
					case 47:
						{
						alt33=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}
					switch (alt33) {
						case 1 :
							// Grammaire.g:49:23: affectID ( instruction )*
							{
							pushFollow(FOLLOW_affectID_in_block684);
							affectID82=affectID();
							state._fsp--;

							stream_affectID.add(affectID82.getTree());
							// Grammaire.g:49:33: ( instruction )*
							loop26:
							while (true) {
								int alt26=2;
								int LA26_0 = input.LA(1);
								if ( (LA26_0==CLASSID||LA26_0==ID||LA26_0==INTEGER||LA26_0==STRING||LA26_0==39||LA26_0==42||LA26_0==44||LA26_0==62||LA26_0==64||LA26_0==66||(LA26_0 >= 70 && LA26_0 <= 71)) ) {
									alt26=1;
								}

								switch (alt26) {
								case 1 :
									// Grammaire.g:49:33: instruction
									{
									pushFollow(FOLLOW_instruction_in_block687);
									instruction83=instruction();
									state._fsp--;

									stream_instruction.add(instruction83.getTree());
									}
									break;

								default :
									break loop26;
								}
							}

							// AST REWRITE
							// elements: atomID, instruction, affectID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 49:46: -> ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* )
							{
								// Grammaire.g:49:49: ^( BLOCK ^( AFFECT atomID affectID ) ( instruction )* )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
								// Grammaire.g:49:57: ^( AFFECT atomID affectID )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_2);
								adaptor.addChild(root_2, stream_atomID.nextTree());
								adaptor.addChild(root_2, stream_affectID.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// Grammaire.g:49:83: ( instruction )*
								while ( stream_instruction.hasNext() ) {
									adaptor.addChild(root_1, stream_instruction.nextTree());
								}
								stream_instruction.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:50:1: exprID ';' ( instruction )*
							{
							pushFollow(FOLLOW_exprID_in_block708);
							exprID84=exprID();
							state._fsp--;

							stream_exprID.add(exprID84.getTree());
							char_literal85=(Token)match(input,49,FOLLOW_49_in_block710);  
							stream_49.add(char_literal85);

							// Grammaire.g:50:12: ( instruction )*
							loop27:
							while (true) {
								int alt27=2;
								int LA27_0 = input.LA(1);
								if ( (LA27_0==CLASSID||LA27_0==ID||LA27_0==INTEGER||LA27_0==STRING||LA27_0==39||LA27_0==42||LA27_0==44||LA27_0==62||LA27_0==64||LA27_0==66||(LA27_0 >= 70 && LA27_0 <= 71)) ) {
									alt27=1;
								}

								switch (alt27) {
								case 1 :
									// Grammaire.g:50:12: instruction
									{
									pushFollow(FOLLOW_instruction_in_block712);
									instruction86=instruction();
									state._fsp--;

									stream_instruction.add(instruction86.getTree());
									}
									break;

								default :
									break loop27;
								}
							}

							// AST REWRITE
							// elements: atomID, exprID, instruction
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 50:25: -> ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* )
							{
								// Grammaire.g:50:28: ^( BLOCK ^( INSTEXPR atomID ( exprID )? ) ( instruction )* )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
								// Grammaire.g:50:36: ^( INSTEXPR atomID ( exprID )? )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTEXPR, "INSTEXPR"), root_2);
								adaptor.addChild(root_2, stream_atomID.nextTree());
								// Grammaire.g:50:54: ( exprID )?
								if ( stream_exprID.hasNext() ) {
									adaptor.addChild(root_2, stream_exprID.nextTree());
								}
								stream_exprID.reset();

								adaptor.addChild(root_1, root_2);
								}

								// Grammaire.g:50:63: ( instruction )*
								while ( stream_instruction.hasNext() ) {
									adaptor.addChild(root_1, stream_instruction.nextTree());
								}
								stream_instruction.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// Grammaire.g:52:2: ':' CLASSID ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) )
							{
							char_literal87=(Token)match(input,47,FOLLOW_47_in_block736);  
							stream_47.add(char_literal87);

							CLASSID88=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_block738);  
							stream_CLASSID.add(CLASSID88);

							// Grammaire.g:52:14: ( ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ ) | ';' ( localVariable )* 'is' ( instruction )+ -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ ) )
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==48) ) {
								alt32=1;
							}
							else if ( (LA32_0==49) ) {
								alt32=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 32, 0, input);
								throw nvae;
							}

							switch (alt32) {
								case 1 :
									// Grammaire.g:52:15: ':=' condExpr ';' ( localVariable )* 'is' ( instruction )+
									{
									string_literal89=(Token)match(input,48,FOLLOW_48_in_block741);  
									stream_48.add(string_literal89);

									pushFollow(FOLLOW_condExpr_in_block743);
									condExpr90=condExpr();
									state._fsp--;

									stream_condExpr.add(condExpr90.getTree());
									char_literal91=(Token)match(input,49,FOLLOW_49_in_block745);  
									stream_49.add(char_literal91);

									// Grammaire.g:52:33: ( localVariable )*
									loop28:
									while (true) {
										int alt28=2;
										int LA28_0 = input.LA(1);
										if ( (LA28_0==ID) ) {
											alt28=1;
										}

										switch (alt28) {
										case 1 :
											// Grammaire.g:52:33: localVariable
											{
											pushFollow(FOLLOW_localVariable_in_block747);
											localVariable92=localVariable();
											state._fsp--;

											stream_localVariable.add(localVariable92.getTree());
											}
											break;

										default :
											break loop28;
										}
									}

									string_literal93=(Token)match(input,63,FOLLOW_63_in_block750);  
									stream_63.add(string_literal93);

									// Grammaire.g:52:53: ( instruction )+
									int cnt29=0;
									loop29:
									while (true) {
										int alt29=2;
										int LA29_0 = input.LA(1);
										if ( (LA29_0==CLASSID||LA29_0==ID||LA29_0==INTEGER||LA29_0==STRING||LA29_0==39||LA29_0==42||LA29_0==44||LA29_0==62||LA29_0==64||LA29_0==66||(LA29_0 >= 70 && LA29_0 <= 71)) ) {
											alt29=1;
										}

										switch (alt29) {
										case 1 :
											// Grammaire.g:52:53: instruction
											{
											pushFollow(FOLLOW_instruction_in_block752);
											instruction94=instruction();
											state._fsp--;

											stream_instruction.add(instruction94.getTree());
											}
											break;

										default :
											if ( cnt29 >= 1 ) break loop29;
											EarlyExitException eee = new EarlyExitException(29, input);
											throw eee;
										}
										cnt29++;
									}

									// AST REWRITE
									// elements: instruction, condExpr, atomID, CLASSID, localVariable
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 52:66: -> ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ )
									{
										// Grammaire.g:52:69: ^( BLOCK ^( LOCALVARIABLEINIT atomID CLASSID condExpr ) ( localVariable )* ( instruction )+ )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
										// Grammaire.g:52:77: ^( LOCALVARIABLEINIT atomID CLASSID condExpr )
										{
										Object root_2 = (Object)adaptor.nil();
										root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALVARIABLEINIT, "LOCALVARIABLEINIT"), root_2);
										adaptor.addChild(root_2, stream_atomID.nextTree());
										adaptor.addChild(root_2, stream_CLASSID.nextNode());
										adaptor.addChild(root_2, stream_condExpr.nextTree());
										adaptor.addChild(root_1, root_2);
										}

										// Grammaire.g:53:2: ( localVariable )*
										while ( stream_localVariable.hasNext() ) {
											adaptor.addChild(root_1, stream_localVariable.nextTree());
										}
										stream_localVariable.reset();

										if ( !(stream_instruction.hasNext()) ) {
											throw new RewriteEarlyExitException();
										}
										while ( stream_instruction.hasNext() ) {
											adaptor.addChild(root_1, stream_instruction.nextTree());
										}
										stream_instruction.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// Grammaire.g:54:2: ';' ( localVariable )* 'is' ( instruction )+
									{
									char_literal95=(Token)match(input,49,FOLLOW_49_in_block782);  
									stream_49.add(char_literal95);

									// Grammaire.g:54:6: ( localVariable )*
									loop30:
									while (true) {
										int alt30=2;
										int LA30_0 = input.LA(1);
										if ( (LA30_0==ID) ) {
											alt30=1;
										}

										switch (alt30) {
										case 1 :
											// Grammaire.g:54:6: localVariable
											{
											pushFollow(FOLLOW_localVariable_in_block784);
											localVariable96=localVariable();
											state._fsp--;

											stream_localVariable.add(localVariable96.getTree());
											}
											break;

										default :
											break loop30;
										}
									}

									string_literal97=(Token)match(input,63,FOLLOW_63_in_block787);  
									stream_63.add(string_literal97);

									// Grammaire.g:54:26: ( instruction )+
									int cnt31=0;
									loop31:
									while (true) {
										int alt31=2;
										int LA31_0 = input.LA(1);
										if ( (LA31_0==CLASSID||LA31_0==ID||LA31_0==INTEGER||LA31_0==STRING||LA31_0==39||LA31_0==42||LA31_0==44||LA31_0==62||LA31_0==64||LA31_0==66||(LA31_0 >= 70 && LA31_0 <= 71)) ) {
											alt31=1;
										}

										switch (alt31) {
										case 1 :
											// Grammaire.g:54:26: instruction
											{
											pushFollow(FOLLOW_instruction_in_block789);
											instruction98=instruction();
											state._fsp--;

											stream_instruction.add(instruction98.getTree());
											}
											break;

										default :
											if ( cnt31 >= 1 ) break loop31;
											EarlyExitException eee = new EarlyExitException(31, input);
											throw eee;
										}
										cnt31++;
									}

									// AST REWRITE
									// elements: localVariable, CLASSID, instruction, atomID
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 54:39: -> ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ )
									{
										// Grammaire.g:54:42: ^( BLOCK ^( LOCALVARIABLE atomID CLASSID ) ( localVariable )* ( instruction )+ )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
										// Grammaire.g:54:50: ^( LOCALVARIABLE atomID CLASSID )
										{
										Object root_2 = (Object)adaptor.nil();
										root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCALVARIABLE, "LOCALVARIABLE"), root_2);
										adaptor.addChild(root_2, stream_atomID.nextTree());
										adaptor.addChild(root_2, stream_CLASSID.nextNode());
										adaptor.addChild(root_1, root_2);
										}

										// Grammaire.g:54:82: ( localVariable )*
										while ( stream_localVariable.hasNext() ) {
											adaptor.addChild(root_1, stream_localVariable.nextTree());
										}
										stream_localVariable.reset();

										if ( !(stream_instruction.hasNext()) ) {
											throw new RewriteEarlyExitException();
										}
										while ( stream_instruction.hasNext() ) {
											adaptor.addChild(root_1, stream_instruction.nextTree());
										}
										stream_instruction.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Grammaire.g:56:3: instructionNoID ( instruction )*
					{
					pushFollow(FOLLOW_instructionNoID_in_block819);
					instructionNoID99=instructionNoID();
					state._fsp--;

					stream_instructionNoID.add(instructionNoID99.getTree());
					// Grammaire.g:56:19: ( instruction )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==CLASSID||LA34_0==ID||LA34_0==INTEGER||LA34_0==STRING||LA34_0==39||LA34_0==42||LA34_0==44||LA34_0==62||LA34_0==64||LA34_0==66||(LA34_0 >= 70 && LA34_0 <= 71)) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// Grammaire.g:56:19: instruction
							{
							pushFollow(FOLLOW_instruction_in_block821);
							instruction100=instruction();
							state._fsp--;

							stream_instruction.add(instruction100.getTree());
							}
							break;

						default :
							break loop34;
						}
					}

					// AST REWRITE
					// elements: instruction, instructionNoID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 56:32: -> ^( BLOCK instructionNoID ( instruction )* )
					{
						// Grammaire.g:56:35: ^( BLOCK instructionNoID ( instruction )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						adaptor.addChild(root_1, stream_instructionNoID.nextTree());
						// Grammaire.g:56:59: ( instruction )*
						while ( stream_instruction.hasNext() ) {
							adaptor.addChild(root_1, stream_instruction.nextTree());
						}
						stream_instruction.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammaire.g:57:3: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 57:3: -> ^( BLOCK )
					{
						// Grammaire.g:57:6: ^( BLOCK )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			char_literal101=(Token)match(input,72,FOLLOW_72_in_block845);  
			stream_72.add(char_literal101);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class localVariableID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localVariableID"
	// Grammaire.g:59:1: localVariableID : ':' CLASSID ( ':=' condExpr )? ';' -> CLASSID ( condExpr )? ;
	public final GrammaireParser.localVariableID_return localVariableID() throws RecognitionException {
		GrammaireParser.localVariableID_return retval = new GrammaireParser.localVariableID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal102=null;
		Token CLASSID103=null;
		Token string_literal104=null;
		Token char_literal106=null;
		ParserRuleReturnScope condExpr105 =null;

		Object char_literal102_tree=null;
		Object CLASSID103_tree=null;
		Object string_literal104_tree=null;
		Object char_literal106_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");

		try {
			// Grammaire.g:59:17: ( ':' CLASSID ( ':=' condExpr )? ';' -> CLASSID ( condExpr )? )
			// Grammaire.g:59:19: ':' CLASSID ( ':=' condExpr )? ';'
			{
			char_literal102=(Token)match(input,47,FOLLOW_47_in_localVariableID853);  
			stream_47.add(char_literal102);

			CLASSID103=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_localVariableID855);  
			stream_CLASSID.add(CLASSID103);

			// Grammaire.g:59:31: ( ':=' condExpr )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==48) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Grammaire.g:59:32: ':=' condExpr
					{
					string_literal104=(Token)match(input,48,FOLLOW_48_in_localVariableID858);  
					stream_48.add(string_literal104);

					pushFollow(FOLLOW_condExpr_in_localVariableID860);
					condExpr105=condExpr();
					state._fsp--;

					stream_condExpr.add(condExpr105.getTree());
					}
					break;

			}

			char_literal106=(Token)match(input,49,FOLLOW_49_in_localVariableID864);  
			stream_49.add(char_literal106);

			// AST REWRITE
			// elements: CLASSID, condExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:52: -> CLASSID ( condExpr )?
			{
				adaptor.addChild(root_0, stream_CLASSID.nextNode());
				// Grammaire.g:59:63: ( condExpr )?
				if ( stream_condExpr.hasNext() ) {
					adaptor.addChild(root_0, stream_condExpr.nextTree());
				}
				stream_condExpr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localVariableID"


	public static class affect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affect"
	// Grammaire.g:62:1: affect : ( atomID ':=' expr ';' -> ^( AFFECT atomID expr ) | atomNoID ':=' expr ';' -> ^( AFFECT atomNoID expr ) );
	public final GrammaireParser.affect_return affect() throws RecognitionException {
		GrammaireParser.affect_return retval = new GrammaireParser.affect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal108=null;
		Token char_literal110=null;
		Token string_literal112=null;
		Token char_literal114=null;
		ParserRuleReturnScope atomID107 =null;
		ParserRuleReturnScope expr109 =null;
		ParserRuleReturnScope atomNoID111 =null;
		ParserRuleReturnScope expr113 =null;

		Object string_literal108_tree=null;
		Object char_literal110_tree=null;
		Object string_literal112_tree=null;
		Object char_literal114_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_atomID=new RewriteRuleSubtreeStream(adaptor,"rule atomID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_atomNoID=new RewriteRuleSubtreeStream(adaptor,"rule atomNoID");

		try {
			// Grammaire.g:62:8: ( atomID ':=' expr ';' -> ^( AFFECT atomID expr ) | atomNoID ':=' expr ';' -> ^( AFFECT atomNoID expr ) )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CLASSID||LA37_0==ID) ) {
				alt37=1;
			}
			else if ( (LA37_0==INTEGER||LA37_0==STRING||LA37_0==39||LA37_0==42||LA37_0==44||LA37_0==64) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Grammaire.g:62:10: atomID ':=' expr ';'
					{
					pushFollow(FOLLOW_atomID_in_affect882);
					atomID107=atomID();
					state._fsp--;

					stream_atomID.add(atomID107.getTree());
					string_literal108=(Token)match(input,48,FOLLOW_48_in_affect884);  
					stream_48.add(string_literal108);

					pushFollow(FOLLOW_expr_in_affect886);
					expr109=expr();
					state._fsp--;

					stream_expr.add(expr109.getTree());
					char_literal110=(Token)match(input,49,FOLLOW_49_in_affect888);  
					stream_49.add(char_literal110);

					// AST REWRITE
					// elements: expr, atomID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 62:31: -> ^( AFFECT atomID expr )
					{
						// Grammaire.g:62:34: ^( AFFECT atomID expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
						adaptor.addChild(root_1, stream_atomID.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammaire.g:63:4: atomNoID ':=' expr ';'
					{
					pushFollow(FOLLOW_atomNoID_in_affect903);
					atomNoID111=atomNoID();
					state._fsp--;

					stream_atomNoID.add(atomNoID111.getTree());
					string_literal112=(Token)match(input,48,FOLLOW_48_in_affect905);  
					stream_48.add(string_literal112);

					pushFollow(FOLLOW_expr_in_affect907);
					expr113=expr();
					state._fsp--;

					stream_expr.add(expr113.getTree());
					char_literal114=(Token)match(input,49,FOLLOW_49_in_affect909);  
					stream_49.add(char_literal114);

					// AST REWRITE
					// elements: atomNoID, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 63:27: -> ^( AFFECT atomNoID expr )
					{
						// Grammaire.g:63:30: ^( AFFECT atomNoID expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
						adaptor.addChild(root_1, stream_atomNoID.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affect"


	public static class affectNoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affectNoID"
	// Grammaire.g:66:1: affectNoID : ':=' expr ';' -> expr ;
	public final GrammaireParser.affectNoID_return affectNoID() throws RecognitionException {
		GrammaireParser.affectNoID_return retval = new GrammaireParser.affectNoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal115=null;
		Token char_literal117=null;
		ParserRuleReturnScope expr116 =null;

		Object string_literal115_tree=null;
		Object char_literal117_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:66:12: ( ':=' expr ';' -> expr )
			// Grammaire.g:66:14: ':=' expr ';'
			{
			string_literal115=(Token)match(input,48,FOLLOW_48_in_affectNoID932);  
			stream_48.add(string_literal115);

			pushFollow(FOLLOW_expr_in_affectNoID934);
			expr116=expr();
			state._fsp--;

			stream_expr.add(expr116.getTree());
			char_literal117=(Token)match(input,49,FOLLOW_49_in_affectNoID936);  
			stream_49.add(char_literal117);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:28: -> expr
			{
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affectNoID"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Grammaire.g:69:1: expr : condExpr ;
	public final GrammaireParser.expr_return expr() throws RecognitionException {
		GrammaireParser.expr_return retval = new GrammaireParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr118 =null;


		try {
			// Grammaire.g:69:6: ( condExpr )
			// Grammaire.g:69:8: condExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExpr_in_expr949);
			condExpr118=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr118.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class exprID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprID"
	// Grammaire.g:71:1: exprID : condExprID ;
	public final GrammaireParser.exprID_return exprID() throws RecognitionException {
		GrammaireParser.exprID_return retval = new GrammaireParser.exprID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExprID119 =null;


		try {
			// Grammaire.g:71:8: ( condExprID )
			// Grammaire.g:71:11: condExprID
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExprID_in_exprID959);
			condExprID119=condExprID();
			state._fsp--;

			adaptor.addChild(root_0, condExprID119.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprID"


	public static class exprNoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprNoID"
	// Grammaire.g:73:1: exprNoID : condExprNoID ;
	public final GrammaireParser.exprNoID_return exprNoID() throws RecognitionException {
		GrammaireParser.exprNoID_return retval = new GrammaireParser.exprNoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExprNoID120 =null;


		try {
			// Grammaire.g:73:10: ( condExprNoID )
			// Grammaire.g:73:12: condExprNoID
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condExprNoID_in_exprNoID968);
			condExprNoID120=condExprNoID();
			state._fsp--;

			adaptor.addChild(root_0, condExprNoID120.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprNoID"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// Grammaire.g:75:1: condExpr : expr1 ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )? ;
	public final GrammaireParser.condExpr_return condExpr() throws RecognitionException {
		GrammaireParser.condExpr_return retval = new GrammaireParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal122=null;
		Token char_literal123=null;
		Token char_literal124=null;
		Token string_literal125=null;
		Token string_literal126=null;
		Token string_literal127=null;
		ParserRuleReturnScope expr1121 =null;
		ParserRuleReturnScope expr1128 =null;

		Object char_literal122_tree=null;
		Object char_literal123_tree=null;
		Object char_literal124_tree=null;
		Object string_literal125_tree=null;
		Object string_literal126_tree=null;
		Object string_literal127_tree=null;

		try {
			// Grammaire.g:75:10: ( expr1 ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )? )
			// Grammaire.g:75:12: expr1 ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1_in_condExpr976);
			expr1121=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr1121.getTree());

			// Grammaire.g:75:18: ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( ((LA39_0 >= 50 && LA39_0 <= 55)) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Grammaire.g:75:20: ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1
					{
					// Grammaire.g:75:20: ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^)
					int alt38=6;
					switch ( input.LA(1) ) {
					case 53:
						{
						alt38=1;
						}
						break;
					case 54:
						{
						alt38=2;
						}
						break;
					case 50:
						{
						alt38=3;
						}
						break;
					case 51:
						{
						alt38=4;
						}
						break;
					case 55:
						{
						alt38=5;
						}
						break;
					case 52:
						{
						alt38=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}
					switch (alt38) {
						case 1 :
							// Grammaire.g:75:21: '=' ^
							{
							char_literal122=(Token)match(input,53,FOLLOW_53_in_condExpr981); 
							char_literal122_tree = (Object)adaptor.create(char_literal122);
							root_0 = (Object)adaptor.becomeRoot(char_literal122_tree, root_0);

							}
							break;
						case 2 :
							// Grammaire.g:75:28: '>' ^
							{
							char_literal123=(Token)match(input,54,FOLLOW_54_in_condExpr986); 
							char_literal123_tree = (Object)adaptor.create(char_literal123);
							root_0 = (Object)adaptor.becomeRoot(char_literal123_tree, root_0);

							}
							break;
						case 3 :
							// Grammaire.g:75:33: '<' ^
							{
							char_literal124=(Token)match(input,50,FOLLOW_50_in_condExpr989); 
							char_literal124_tree = (Object)adaptor.create(char_literal124);
							root_0 = (Object)adaptor.becomeRoot(char_literal124_tree, root_0);

							}
							break;
						case 4 :
							// Grammaire.g:75:38: '<=' ^
							{
							string_literal125=(Token)match(input,51,FOLLOW_51_in_condExpr992); 
							string_literal125_tree = (Object)adaptor.create(string_literal125);
							root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);

							}
							break;
						case 5 :
							// Grammaire.g:75:44: '>=' ^
							{
							string_literal126=(Token)match(input,55,FOLLOW_55_in_condExpr995); 
							string_literal126_tree = (Object)adaptor.create(string_literal126);
							root_0 = (Object)adaptor.becomeRoot(string_literal126_tree, root_0);

							}
							break;
						case 6 :
							// Grammaire.g:75:50: '<>' ^
							{
							string_literal127=(Token)match(input,52,FOLLOW_52_in_condExpr998); 
							string_literal127_tree = (Object)adaptor.create(string_literal127);
							root_0 = (Object)adaptor.becomeRoot(string_literal127_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr1_in_condExpr1002);
					expr1128=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr1128.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExpr"


	public static class condExprID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExprID"
	// Grammaire.g:77:1: condExprID : expr1ID ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )? ;
	public final GrammaireParser.condExprID_return condExprID() throws RecognitionException {
		GrammaireParser.condExprID_return retval = new GrammaireParser.condExprID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal130=null;
		Token char_literal131=null;
		Token char_literal132=null;
		Token string_literal133=null;
		Token string_literal134=null;
		Token string_literal135=null;
		ParserRuleReturnScope expr1ID129 =null;
		ParserRuleReturnScope expr1136 =null;

		Object char_literal130_tree=null;
		Object char_literal131_tree=null;
		Object char_literal132_tree=null;
		Object string_literal133_tree=null;
		Object string_literal134_tree=null;
		Object string_literal135_tree=null;

		try {
			// Grammaire.g:77:12: ( expr1ID ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )? )
			// Grammaire.g:77:14: expr1ID ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1ID_in_condExprID1014);
			expr1ID129=expr1ID();
			state._fsp--;

			adaptor.addChild(root_0, expr1ID129.getTree());

			// Grammaire.g:77:21: ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( ((LA41_0 >= 50 && LA41_0 <= 55)) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Grammaire.g:77:22: ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1
					{
					// Grammaire.g:77:22: ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^)
					int alt40=6;
					switch ( input.LA(1) ) {
					case 53:
						{
						alt40=1;
						}
						break;
					case 54:
						{
						alt40=2;
						}
						break;
					case 50:
						{
						alt40=3;
						}
						break;
					case 51:
						{
						alt40=4;
						}
						break;
					case 55:
						{
						alt40=5;
						}
						break;
					case 52:
						{
						alt40=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}
					switch (alt40) {
						case 1 :
							// Grammaire.g:77:23: '=' ^
							{
							char_literal130=(Token)match(input,53,FOLLOW_53_in_condExprID1017); 
							char_literal130_tree = (Object)adaptor.create(char_literal130);
							root_0 = (Object)adaptor.becomeRoot(char_literal130_tree, root_0);

							}
							break;
						case 2 :
							// Grammaire.g:77:30: '>' ^
							{
							char_literal131=(Token)match(input,54,FOLLOW_54_in_condExprID1022); 
							char_literal131_tree = (Object)adaptor.create(char_literal131);
							root_0 = (Object)adaptor.becomeRoot(char_literal131_tree, root_0);

							}
							break;
						case 3 :
							// Grammaire.g:77:35: '<' ^
							{
							char_literal132=(Token)match(input,50,FOLLOW_50_in_condExprID1025); 
							char_literal132_tree = (Object)adaptor.create(char_literal132);
							root_0 = (Object)adaptor.becomeRoot(char_literal132_tree, root_0);

							}
							break;
						case 4 :
							// Grammaire.g:77:40: '<=' ^
							{
							string_literal133=(Token)match(input,51,FOLLOW_51_in_condExprID1028); 
							string_literal133_tree = (Object)adaptor.create(string_literal133);
							root_0 = (Object)adaptor.becomeRoot(string_literal133_tree, root_0);

							}
							break;
						case 5 :
							// Grammaire.g:77:46: '>=' ^
							{
							string_literal134=(Token)match(input,55,FOLLOW_55_in_condExprID1031); 
							string_literal134_tree = (Object)adaptor.create(string_literal134);
							root_0 = (Object)adaptor.becomeRoot(string_literal134_tree, root_0);

							}
							break;
						case 6 :
							// Grammaire.g:77:52: '<>' ^
							{
							string_literal135=(Token)match(input,52,FOLLOW_52_in_condExprID1034); 
							string_literal135_tree = (Object)adaptor.create(string_literal135);
							root_0 = (Object)adaptor.becomeRoot(string_literal135_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr1_in_condExprID1038);
					expr1136=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr1136.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExprID"


	public static class condExprNoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExprNoID"
	// Grammaire.g:79:1: condExprNoID : expr1NoID ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )? ;
	public final GrammaireParser.condExprNoID_return condExprNoID() throws RecognitionException {
		GrammaireParser.condExprNoID_return retval = new GrammaireParser.condExprNoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal138=null;
		Token char_literal139=null;
		Token char_literal140=null;
		Token string_literal141=null;
		Token string_literal142=null;
		Token string_literal143=null;
		ParserRuleReturnScope expr1NoID137 =null;
		ParserRuleReturnScope expr1144 =null;

		Object char_literal138_tree=null;
		Object char_literal139_tree=null;
		Object char_literal140_tree=null;
		Object string_literal141_tree=null;
		Object string_literal142_tree=null;
		Object string_literal143_tree=null;

		try {
			// Grammaire.g:79:14: ( expr1NoID ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )? )
			// Grammaire.g:79:16: expr1NoID ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1NoID_in_condExprNoID1048);
			expr1NoID137=expr1NoID();
			state._fsp--;

			adaptor.addChild(root_0, expr1NoID137.getTree());

			// Grammaire.g:79:25: ( ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1 )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( ((LA43_0 >= 50 && LA43_0 <= 55)) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Grammaire.g:79:26: ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^) expr1
					{
					// Grammaire.g:79:26: ( '=' ^| '>' ^| '<' ^| '<=' ^| '>=' ^| '<>' ^)
					int alt42=6;
					switch ( input.LA(1) ) {
					case 53:
						{
						alt42=1;
						}
						break;
					case 54:
						{
						alt42=2;
						}
						break;
					case 50:
						{
						alt42=3;
						}
						break;
					case 51:
						{
						alt42=4;
						}
						break;
					case 55:
						{
						alt42=5;
						}
						break;
					case 52:
						{
						alt42=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}
					switch (alt42) {
						case 1 :
							// Grammaire.g:79:27: '=' ^
							{
							char_literal138=(Token)match(input,53,FOLLOW_53_in_condExprNoID1051); 
							char_literal138_tree = (Object)adaptor.create(char_literal138);
							root_0 = (Object)adaptor.becomeRoot(char_literal138_tree, root_0);

							}
							break;
						case 2 :
							// Grammaire.g:79:34: '>' ^
							{
							char_literal139=(Token)match(input,54,FOLLOW_54_in_condExprNoID1056); 
							char_literal139_tree = (Object)adaptor.create(char_literal139);
							root_0 = (Object)adaptor.becomeRoot(char_literal139_tree, root_0);

							}
							break;
						case 3 :
							// Grammaire.g:79:39: '<' ^
							{
							char_literal140=(Token)match(input,50,FOLLOW_50_in_condExprNoID1059); 
							char_literal140_tree = (Object)adaptor.create(char_literal140);
							root_0 = (Object)adaptor.becomeRoot(char_literal140_tree, root_0);

							}
							break;
						case 4 :
							// Grammaire.g:79:44: '<=' ^
							{
							string_literal141=(Token)match(input,51,FOLLOW_51_in_condExprNoID1062); 
							string_literal141_tree = (Object)adaptor.create(string_literal141);
							root_0 = (Object)adaptor.becomeRoot(string_literal141_tree, root_0);

							}
							break;
						case 5 :
							// Grammaire.g:79:50: '>=' ^
							{
							string_literal142=(Token)match(input,55,FOLLOW_55_in_condExprNoID1065); 
							string_literal142_tree = (Object)adaptor.create(string_literal142);
							root_0 = (Object)adaptor.becomeRoot(string_literal142_tree, root_0);

							}
							break;
						case 6 :
							// Grammaire.g:79:56: '<>' ^
							{
							string_literal143=(Token)match(input,52,FOLLOW_52_in_condExprNoID1068); 
							string_literal143_tree = (Object)adaptor.create(string_literal143);
							root_0 = (Object)adaptor.becomeRoot(string_literal143_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr1_in_condExprNoID1072);
					expr1144=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr1144.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExprNoID"


	public static class expr1NoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1NoID"
	// Grammaire.g:81:1: expr1NoID : expr2NoID ( '+' ^ expr2 )* ;
	public final GrammaireParser.expr1NoID_return expr1NoID() throws RecognitionException {
		GrammaireParser.expr1NoID_return retval = new GrammaireParser.expr1NoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal146=null;
		ParserRuleReturnScope expr2NoID145 =null;
		ParserRuleReturnScope expr2147 =null;

		Object char_literal146_tree=null;

		try {
			// Grammaire.g:81:11: ( expr2NoID ( '+' ^ expr2 )* )
			// Grammaire.g:81:13: expr2NoID ( '+' ^ expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2NoID_in_expr1NoID1082);
			expr2NoID145=expr2NoID();
			state._fsp--;

			adaptor.addChild(root_0, expr2NoID145.getTree());

			// Grammaire.g:81:23: ( '+' ^ expr2 )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==42) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// Grammaire.g:81:24: '+' ^ expr2
					{
					char_literal146=(Token)match(input,42,FOLLOW_42_in_expr1NoID1085); 
					char_literal146_tree = (Object)adaptor.create(char_literal146);
					root_0 = (Object)adaptor.becomeRoot(char_literal146_tree, root_0);

					pushFollow(FOLLOW_expr2_in_expr1NoID1088);
					expr2147=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr2147.getTree());

					}
					break;

				default :
					break loop44;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr1NoID"


	public static class expr2NoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2NoID"
	// Grammaire.g:83:1: expr2NoID : expr3NoID ( '-' ^ expr3 )* ;
	public final GrammaireParser.expr2NoID_return expr2NoID() throws RecognitionException {
		GrammaireParser.expr2NoID_return retval = new GrammaireParser.expr2NoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal149=null;
		ParserRuleReturnScope expr3NoID148 =null;
		ParserRuleReturnScope expr3150 =null;

		Object char_literal149_tree=null;

		try {
			// Grammaire.g:83:11: ( expr3NoID ( '-' ^ expr3 )* )
			// Grammaire.g:83:13: expr3NoID ( '-' ^ expr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3NoID_in_expr2NoID1098);
			expr3NoID148=expr3NoID();
			state._fsp--;

			adaptor.addChild(root_0, expr3NoID148.getTree());

			// Grammaire.g:83:23: ( '-' ^ expr3 )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==44) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// Grammaire.g:83:24: '-' ^ expr3
					{
					char_literal149=(Token)match(input,44,FOLLOW_44_in_expr2NoID1101); 
					char_literal149_tree = (Object)adaptor.create(char_literal149);
					root_0 = (Object)adaptor.becomeRoot(char_literal149_tree, root_0);

					pushFollow(FOLLOW_expr3_in_expr2NoID1104);
					expr3150=expr3();
					state._fsp--;

					adaptor.addChild(root_0, expr3150.getTree());

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr2NoID"


	public static class expr3NoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr3NoID"
	// Grammaire.g:85:1: expr3NoID : expr4NoID ( '*' ^ expr4 )* ;
	public final GrammaireParser.expr3NoID_return expr3NoID() throws RecognitionException {
		GrammaireParser.expr3NoID_return retval = new GrammaireParser.expr3NoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		ParserRuleReturnScope expr4NoID151 =null;
		ParserRuleReturnScope expr4153 =null;

		Object char_literal152_tree=null;

		try {
			// Grammaire.g:85:11: ( expr4NoID ( '*' ^ expr4 )* )
			// Grammaire.g:85:13: expr4NoID ( '*' ^ expr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr4NoID_in_expr3NoID1114);
			expr4NoID151=expr4NoID();
			state._fsp--;

			adaptor.addChild(root_0, expr4NoID151.getTree());

			// Grammaire.g:85:23: ( '*' ^ expr4 )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==41) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// Grammaire.g:85:24: '*' ^ expr4
					{
					char_literal152=(Token)match(input,41,FOLLOW_41_in_expr3NoID1117); 
					char_literal152_tree = (Object)adaptor.create(char_literal152);
					root_0 = (Object)adaptor.becomeRoot(char_literal152_tree, root_0);

					pushFollow(FOLLOW_expr4_in_expr3NoID1120);
					expr4153=expr4();
					state._fsp--;

					adaptor.addChild(root_0, expr4153.getTree());

					}
					break;

				default :
					break loop46;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr3NoID"


	public static class expr4NoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr4NoID"
	// Grammaire.g:87:1: expr4NoID : expr5NoID ( '/' ^ expr5 )* ;
	public final GrammaireParser.expr4NoID_return expr4NoID() throws RecognitionException {
		GrammaireParser.expr4NoID_return retval = new GrammaireParser.expr4NoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal155=null;
		ParserRuleReturnScope expr5NoID154 =null;
		ParserRuleReturnScope expr5156 =null;

		Object char_literal155_tree=null;

		try {
			// Grammaire.g:87:11: ( expr5NoID ( '/' ^ expr5 )* )
			// Grammaire.g:87:13: expr5NoID ( '/' ^ expr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr5NoID_in_expr4NoID1130);
			expr5NoID154=expr5NoID();
			state._fsp--;

			adaptor.addChild(root_0, expr5NoID154.getTree());

			// Grammaire.g:87:23: ( '/' ^ expr5 )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==46) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// Grammaire.g:87:24: '/' ^ expr5
					{
					char_literal155=(Token)match(input,46,FOLLOW_46_in_expr4NoID1133); 
					char_literal155_tree = (Object)adaptor.create(char_literal155);
					root_0 = (Object)adaptor.becomeRoot(char_literal155_tree, root_0);

					pushFollow(FOLLOW_expr5_in_expr4NoID1136);
					expr5156=expr5();
					state._fsp--;

					adaptor.addChild(root_0, expr5156.getTree());

					}
					break;

				default :
					break loop47;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr4NoID"


	public static class expr5NoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr5NoID"
	// Grammaire.g:89:1: expr5NoID : ( '&' ^ atom )* ;
	public final GrammaireParser.expr5NoID_return expr5NoID() throws RecognitionException {
		GrammaireParser.expr5NoID_return retval = new GrammaireParser.expr5NoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal157=null;
		ParserRuleReturnScope atom158 =null;

		Object char_literal157_tree=null;

		try {
			// Grammaire.g:89:11: ( ( '&' ^ atom )* )
			// Grammaire.g:89:13: ( '&' ^ atom )*
			{
			root_0 = (Object)adaptor.nil();


			// Grammaire.g:89:13: ( '&' ^ atom )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==38) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Grammaire.g:89:14: '&' ^ atom
					{
					char_literal157=(Token)match(input,38,FOLLOW_38_in_expr5NoID1147); 
					char_literal157_tree = (Object)adaptor.create(char_literal157);
					root_0 = (Object)adaptor.becomeRoot(char_literal157_tree, root_0);

					pushFollow(FOLLOW_atom_in_expr5NoID1150);
					atom158=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom158.getTree());

					}
					break;

				default :
					break loop48;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr5NoID"


	public static class expr1ID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1ID"
	// Grammaire.g:91:1: expr1ID : expr2ID ( '+' ^ expr2 )* ;
	public final GrammaireParser.expr1ID_return expr1ID() throws RecognitionException {
		GrammaireParser.expr1ID_return retval = new GrammaireParser.expr1ID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal160=null;
		ParserRuleReturnScope expr2ID159 =null;
		ParserRuleReturnScope expr2161 =null;

		Object char_literal160_tree=null;

		try {
			// Grammaire.g:91:9: ( expr2ID ( '+' ^ expr2 )* )
			// Grammaire.g:91:11: expr2ID ( '+' ^ expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2ID_in_expr1ID1160);
			expr2ID159=expr2ID();
			state._fsp--;

			adaptor.addChild(root_0, expr2ID159.getTree());

			// Grammaire.g:91:19: ( '+' ^ expr2 )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==42) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Grammaire.g:91:20: '+' ^ expr2
					{
					char_literal160=(Token)match(input,42,FOLLOW_42_in_expr1ID1163); 
					char_literal160_tree = (Object)adaptor.create(char_literal160);
					root_0 = (Object)adaptor.becomeRoot(char_literal160_tree, root_0);

					pushFollow(FOLLOW_expr2_in_expr1ID1166);
					expr2161=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr2161.getTree());

					}
					break;

				default :
					break loop49;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr1ID"


	public static class expr2ID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2ID"
	// Grammaire.g:93:1: expr2ID : expr3ID ( '-' ^ expr3 )* ;
	public final GrammaireParser.expr2ID_return expr2ID() throws RecognitionException {
		GrammaireParser.expr2ID_return retval = new GrammaireParser.expr2ID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal163=null;
		ParserRuleReturnScope expr3ID162 =null;
		ParserRuleReturnScope expr3164 =null;

		Object char_literal163_tree=null;

		try {
			// Grammaire.g:93:9: ( expr3ID ( '-' ^ expr3 )* )
			// Grammaire.g:93:11: expr3ID ( '-' ^ expr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3ID_in_expr2ID1176);
			expr3ID162=expr3ID();
			state._fsp--;

			adaptor.addChild(root_0, expr3ID162.getTree());

			// Grammaire.g:93:19: ( '-' ^ expr3 )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==44) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// Grammaire.g:93:20: '-' ^ expr3
					{
					char_literal163=(Token)match(input,44,FOLLOW_44_in_expr2ID1179); 
					char_literal163_tree = (Object)adaptor.create(char_literal163);
					root_0 = (Object)adaptor.becomeRoot(char_literal163_tree, root_0);

					pushFollow(FOLLOW_expr3_in_expr2ID1182);
					expr3164=expr3();
					state._fsp--;

					adaptor.addChild(root_0, expr3164.getTree());

					}
					break;

				default :
					break loop50;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr2ID"


	public static class expr3ID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr3ID"
	// Grammaire.g:95:1: expr3ID : expr4ID ( '*' ^ expr4 )* ;
	public final GrammaireParser.expr3ID_return expr3ID() throws RecognitionException {
		GrammaireParser.expr3ID_return retval = new GrammaireParser.expr3ID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal166=null;
		ParserRuleReturnScope expr4ID165 =null;
		ParserRuleReturnScope expr4167 =null;

		Object char_literal166_tree=null;

		try {
			// Grammaire.g:95:9: ( expr4ID ( '*' ^ expr4 )* )
			// Grammaire.g:95:11: expr4ID ( '*' ^ expr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr4ID_in_expr3ID1192);
			expr4ID165=expr4ID();
			state._fsp--;

			adaptor.addChild(root_0, expr4ID165.getTree());

			// Grammaire.g:95:19: ( '*' ^ expr4 )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==41) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// Grammaire.g:95:20: '*' ^ expr4
					{
					char_literal166=(Token)match(input,41,FOLLOW_41_in_expr3ID1195); 
					char_literal166_tree = (Object)adaptor.create(char_literal166);
					root_0 = (Object)adaptor.becomeRoot(char_literal166_tree, root_0);

					pushFollow(FOLLOW_expr4_in_expr3ID1198);
					expr4167=expr4();
					state._fsp--;

					adaptor.addChild(root_0, expr4167.getTree());

					}
					break;

				default :
					break loop51;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr3ID"


	public static class expr4ID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr4ID"
	// Grammaire.g:97:1: expr4ID : expr5ID ( '/' ^ expr5 )* ;
	public final GrammaireParser.expr4ID_return expr4ID() throws RecognitionException {
		GrammaireParser.expr4ID_return retval = new GrammaireParser.expr4ID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal169=null;
		ParserRuleReturnScope expr5ID168 =null;
		ParserRuleReturnScope expr5170 =null;

		Object char_literal169_tree=null;

		try {
			// Grammaire.g:97:9: ( expr5ID ( '/' ^ expr5 )* )
			// Grammaire.g:97:11: expr5ID ( '/' ^ expr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr5ID_in_expr4ID1208);
			expr5ID168=expr5ID();
			state._fsp--;

			adaptor.addChild(root_0, expr5ID168.getTree());

			// Grammaire.g:97:19: ( '/' ^ expr5 )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==46) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Grammaire.g:97:20: '/' ^ expr5
					{
					char_literal169=(Token)match(input,46,FOLLOW_46_in_expr4ID1211); 
					char_literal169_tree = (Object)adaptor.create(char_literal169);
					root_0 = (Object)adaptor.becomeRoot(char_literal169_tree, root_0);

					pushFollow(FOLLOW_expr5_in_expr4ID1214);
					expr5170=expr5();
					state._fsp--;

					adaptor.addChild(root_0, expr5170.getTree());

					}
					break;

				default :
					break loop52;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr4ID"


	public static class expr5ID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr5ID"
	// Grammaire.g:99:1: expr5ID : ( '&' ^ atom )* ;
	public final GrammaireParser.expr5ID_return expr5ID() throws RecognitionException {
		GrammaireParser.expr5ID_return retval = new GrammaireParser.expr5ID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		ParserRuleReturnScope atom172 =null;

		Object char_literal171_tree=null;

		try {
			// Grammaire.g:99:9: ( ( '&' ^ atom )* )
			// Grammaire.g:99:11: ( '&' ^ atom )*
			{
			root_0 = (Object)adaptor.nil();


			// Grammaire.g:99:11: ( '&' ^ atom )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==38) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// Grammaire.g:99:12: '&' ^ atom
					{
					char_literal171=(Token)match(input,38,FOLLOW_38_in_expr5ID1225); 
					char_literal171_tree = (Object)adaptor.create(char_literal171);
					root_0 = (Object)adaptor.becomeRoot(char_literal171_tree, root_0);

					pushFollow(FOLLOW_atom_in_expr5ID1228);
					atom172=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom172.getTree());

					}
					break;

				default :
					break loop53;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr5ID"


	public static class instanciation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanciation"
	// Grammaire.g:101:1: instanciation : 'new' CLASSID '(' ( expr ( ',' expr )* )? ')' -> ^( INSTANCIATION CLASSID ( expr )* ) ;
	public final GrammaireParser.instanciation_return instanciation() throws RecognitionException {
		GrammaireParser.instanciation_return retval = new GrammaireParser.instanciation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal173=null;
		Token CLASSID174=null;
		Token char_literal175=null;
		Token char_literal177=null;
		Token char_literal179=null;
		ParserRuleReturnScope expr176 =null;
		ParserRuleReturnScope expr178 =null;

		Object string_literal173_tree=null;
		Object CLASSID174_tree=null;
		Object char_literal175_tree=null;
		Object char_literal177_tree=null;
		Object char_literal179_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:101:15: ( 'new' CLASSID '(' ( expr ( ',' expr )* )? ')' -> ^( INSTANCIATION CLASSID ( expr )* ) )
			// Grammaire.g:101:17: 'new' CLASSID '(' ( expr ( ',' expr )* )? ')'
			{
			string_literal173=(Token)match(input,64,FOLLOW_64_in_instanciation1239);  
			stream_64.add(string_literal173);

			CLASSID174=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_instanciation1241);  
			stream_CLASSID.add(CLASSID174);

			char_literal175=(Token)match(input,39,FOLLOW_39_in_instanciation1243);  
			stream_39.add(char_literal175);

			// Grammaire.g:101:35: ( expr ( ',' expr )* )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==CLASSID||LA55_0==ID||LA55_0==INTEGER||LA55_0==STRING||LA55_0==39||LA55_0==42||LA55_0==44||LA55_0==64) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// Grammaire.g:101:36: expr ( ',' expr )*
					{
					pushFollow(FOLLOW_expr_in_instanciation1246);
					expr176=expr();
					state._fsp--;

					stream_expr.add(expr176.getTree());
					// Grammaire.g:101:41: ( ',' expr )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==43) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// Grammaire.g:101:42: ',' expr
							{
							char_literal177=(Token)match(input,43,FOLLOW_43_in_instanciation1249);  
							stream_43.add(char_literal177);

							pushFollow(FOLLOW_expr_in_instanciation1251);
							expr178=expr();
							state._fsp--;

							stream_expr.add(expr178.getTree());
							}
							break;

						default :
							break loop54;
						}
					}

					}
					break;

			}

			char_literal179=(Token)match(input,40,FOLLOW_40_in_instanciation1258);  
			stream_40.add(char_literal179);

			// AST REWRITE
			// elements: CLASSID, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 101:60: -> ^( INSTANCIATION CLASSID ( expr )* )
			{
				// Grammaire.g:101:63: ^( INSTANCIATION CLASSID ( expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTANCIATION, "INSTANCIATION"), root_1);
				adaptor.addChild(root_1, stream_CLASSID.nextNode());
				// Grammaire.g:101:87: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instanciation"


	public static class expr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1"
	// Grammaire.g:104:1: expr1 : expr2 ( '+' ^ expr2 )* ;
	public final GrammaireParser.expr1_return expr1() throws RecognitionException {
		GrammaireParser.expr1_return retval = new GrammaireParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal181=null;
		ParserRuleReturnScope expr2180 =null;
		ParserRuleReturnScope expr2182 =null;

		Object char_literal181_tree=null;

		try {
			// Grammaire.g:104:7: ( expr2 ( '+' ^ expr2 )* )
			// Grammaire.g:104:9: expr2 ( '+' ^ expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr11280);
			expr2180=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr2180.getTree());

			// Grammaire.g:104:15: ( '+' ^ expr2 )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==42) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// Grammaire.g:104:16: '+' ^ expr2
					{
					char_literal181=(Token)match(input,42,FOLLOW_42_in_expr11283); 
					char_literal181_tree = (Object)adaptor.create(char_literal181);
					root_0 = (Object)adaptor.becomeRoot(char_literal181_tree, root_0);

					pushFollow(FOLLOW_expr2_in_expr11286);
					expr2182=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr2182.getTree());

					}
					break;

				default :
					break loop56;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr1"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// Grammaire.g:106:1: expr2 : expr3 ( '-' ^ expr3 )* ;
	public final GrammaireParser.expr2_return expr2() throws RecognitionException {
		GrammaireParser.expr2_return retval = new GrammaireParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal184=null;
		ParserRuleReturnScope expr3183 =null;
		ParserRuleReturnScope expr3185 =null;

		Object char_literal184_tree=null;

		try {
			// Grammaire.g:106:7: ( expr3 ( '-' ^ expr3 )* )
			// Grammaire.g:106:9: expr3 ( '-' ^ expr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3_in_expr21297);
			expr3183=expr3();
			state._fsp--;

			adaptor.addChild(root_0, expr3183.getTree());

			// Grammaire.g:106:15: ( '-' ^ expr3 )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==44) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// Grammaire.g:106:16: '-' ^ expr3
					{
					char_literal184=(Token)match(input,44,FOLLOW_44_in_expr21300); 
					char_literal184_tree = (Object)adaptor.create(char_literal184);
					root_0 = (Object)adaptor.becomeRoot(char_literal184_tree, root_0);

					pushFollow(FOLLOW_expr3_in_expr21303);
					expr3185=expr3();
					state._fsp--;

					adaptor.addChild(root_0, expr3185.getTree());

					}
					break;

				default :
					break loop57;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr2"


	public static class expr3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr3"
	// Grammaire.g:108:1: expr3 : expr4 ( '*' ^ expr4 )* ;
	public final GrammaireParser.expr3_return expr3() throws RecognitionException {
		GrammaireParser.expr3_return retval = new GrammaireParser.expr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal187=null;
		ParserRuleReturnScope expr4186 =null;
		ParserRuleReturnScope expr4188 =null;

		Object char_literal187_tree=null;

		try {
			// Grammaire.g:108:7: ( expr4 ( '*' ^ expr4 )* )
			// Grammaire.g:108:9: expr4 ( '*' ^ expr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr4_in_expr31314);
			expr4186=expr4();
			state._fsp--;

			adaptor.addChild(root_0, expr4186.getTree());

			// Grammaire.g:108:15: ( '*' ^ expr4 )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==41) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// Grammaire.g:108:16: '*' ^ expr4
					{
					char_literal187=(Token)match(input,41,FOLLOW_41_in_expr31317); 
					char_literal187_tree = (Object)adaptor.create(char_literal187);
					root_0 = (Object)adaptor.becomeRoot(char_literal187_tree, root_0);

					pushFollow(FOLLOW_expr4_in_expr31320);
					expr4188=expr4();
					state._fsp--;

					adaptor.addChild(root_0, expr4188.getTree());

					}
					break;

				default :
					break loop58;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr3"


	public static class expr4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr4"
	// Grammaire.g:110:1: expr4 : expr5 ( '/' ^ expr5 )* ;
	public final GrammaireParser.expr4_return expr4() throws RecognitionException {
		GrammaireParser.expr4_return retval = new GrammaireParser.expr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal190=null;
		ParserRuleReturnScope expr5189 =null;
		ParserRuleReturnScope expr5191 =null;

		Object char_literal190_tree=null;

		try {
			// Grammaire.g:110:7: ( expr5 ( '/' ^ expr5 )* )
			// Grammaire.g:110:9: expr5 ( '/' ^ expr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr5_in_expr41331);
			expr5189=expr5();
			state._fsp--;

			adaptor.addChild(root_0, expr5189.getTree());

			// Grammaire.g:110:15: ( '/' ^ expr5 )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==46) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// Grammaire.g:110:16: '/' ^ expr5
					{
					char_literal190=(Token)match(input,46,FOLLOW_46_in_expr41334); 
					char_literal190_tree = (Object)adaptor.create(char_literal190);
					root_0 = (Object)adaptor.becomeRoot(char_literal190_tree, root_0);

					pushFollow(FOLLOW_expr5_in_expr41337);
					expr5191=expr5();
					state._fsp--;

					adaptor.addChild(root_0, expr5191.getTree());

					}
					break;

				default :
					break loop59;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr4"


	public static class expr5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr5"
	// Grammaire.g:112:1: expr5 : atom ( '&' ^ atom )* ;
	public final GrammaireParser.expr5_return expr5() throws RecognitionException {
		GrammaireParser.expr5_return retval = new GrammaireParser.expr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal193=null;
		ParserRuleReturnScope atom192 =null;
		ParserRuleReturnScope atom194 =null;

		Object char_literal193_tree=null;

		try {
			// Grammaire.g:112:7: ( atom ( '&' ^ atom )* )
			// Grammaire.g:112:9: atom ( '&' ^ atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_expr51348);
			atom192=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom192.getTree());

			// Grammaire.g:112:14: ( '&' ^ atom )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==38) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// Grammaire.g:112:15: '&' ^ atom
					{
					char_literal193=(Token)match(input,38,FOLLOW_38_in_expr51351); 
					char_literal193_tree = (Object)adaptor.create(char_literal193);
					root_0 = (Object)adaptor.becomeRoot(char_literal193_tree, root_0);

					pushFollow(FOLLOW_atom_in_expr51354);
					atom194=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom194.getTree());

					}
					break;

				default :
					break loop60;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr5"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Grammaire.g:114:1: atom : ( atomID | ( '+' | '-' ) INTEGER ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) ) | INTEGER ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) ) | STRING ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) ) | '(' ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) ) | instanciation );
	public final GrammaireParser.atom_return atom() throws RecognitionException {
		GrammaireParser.atom_return retval = new GrammaireParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal196=null;
		Token char_literal197=null;
		Token INTEGER198=null;
		Token INTEGER200=null;
		Token STRING202=null;
		Token char_literal204=null;
		Token char_literal206=null;
		Token string_literal208=null;
		Token CLASSID209=null;
		Token char_literal210=null;
		Token char_literal212=null;
		ParserRuleReturnScope atomID195 =null;
		ParserRuleReturnScope selection199 =null;
		ParserRuleReturnScope selection201 =null;
		ParserRuleReturnScope selection203 =null;
		ParserRuleReturnScope expr205 =null;
		ParserRuleReturnScope selection207 =null;
		ParserRuleReturnScope expr211 =null;
		ParserRuleReturnScope selection213 =null;
		ParserRuleReturnScope instanciation214 =null;

		Object char_literal196_tree=null;
		Object char_literal197_tree=null;
		Object INTEGER198_tree=null;
		Object INTEGER200_tree=null;
		Object STRING202_tree=null;
		Object char_literal204_tree=null;
		Object char_literal206_tree=null;
		Object string_literal208_tree=null;
		Object CLASSID209_tree=null;
		Object char_literal210_tree=null;
		Object char_literal212_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_selection=new RewriteRuleSubtreeStream(adaptor,"rule selection");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:114:6: ( atomID | ( '+' | '-' ) INTEGER ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) ) | INTEGER ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) ) | STRING ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) ) | '(' ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) ) | instanciation )
			int alt73=6;
			switch ( input.LA(1) ) {
			case CLASSID:
			case ID:
				{
				alt73=1;
				}
				break;
			case 42:
			case 44:
				{
				alt73=2;
				}
				break;
			case INTEGER:
				{
				alt73=3;
				}
				break;
			case STRING:
				{
				alt73=4;
				}
				break;
			case 39:
				{
				alt73=5;
				}
				break;
			case 64:
				{
				alt73=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// Grammaire.g:114:8: atomID
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomID_in_atom1366);
					atomID195=atomID();
					state._fsp--;

					adaptor.addChild(root_0, atomID195.getTree());

					}
					break;
				case 2 :
					// Grammaire.g:115:4: ( '+' | '-' ) INTEGER ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) )
					{
					// Grammaire.g:115:4: ( '+' | '-' )
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==42) ) {
						alt61=1;
					}
					else if ( (LA61_0==44) ) {
						alt61=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 61, 0, input);
						throw nvae;
					}

					switch (alt61) {
						case 1 :
							// Grammaire.g:115:5: '+'
							{
							char_literal196=(Token)match(input,42,FOLLOW_42_in_atom1373);  
							stream_42.add(char_literal196);

							}
							break;
						case 2 :
							// Grammaire.g:115:9: '-'
							{
							char_literal197=(Token)match(input,44,FOLLOW_44_in_atom1375);  
							stream_44.add(char_literal197);

							}
							break;

					}

					INTEGER198=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom1378);  
					stream_INTEGER.add(INTEGER198);

					// Grammaire.g:115:22: ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) )
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==38||(LA63_0 >= 40 && LA63_0 <= 44)||LA63_0==46||(LA63_0 >= 49 && LA63_0 <= 55)||(LA63_0 >= 58 && LA63_0 <= 59)||LA63_0==68||LA63_0==72) ) {
						alt63=1;
					}
					else if ( (LA63_0==45) ) {
						alt63=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						throw nvae;
					}

					switch (alt63) {
						case 1 :
							// Grammaire.g:115:23: 
							{
							// AST REWRITE
							// elements: 44, 42, INTEGER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 115:23: -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER )
							{
								// Grammaire.g:115:26: ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIGNEDINTEGER, "SIGNEDINTEGER"), root_1);
								// Grammaire.g:115:42: ( '+' )?
								if ( stream_42.hasNext() ) {
									adaptor.addChild(root_1, stream_42.nextNode());
								}
								stream_42.reset();

								// Grammaire.g:115:47: ( '-' )?
								if ( stream_44.hasNext() ) {
									adaptor.addChild(root_1, stream_44.nextNode());
								}
								stream_44.reset();

								adaptor.addChild(root_1, stream_INTEGER.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:115:61: ( selection )+
							{
							// Grammaire.g:115:61: ( selection )+
							int cnt62=0;
							loop62:
							while (true) {
								int alt62=2;
								int LA62_0 = input.LA(1);
								if ( (LA62_0==45) ) {
									alt62=1;
								}

								switch (alt62) {
								case 1 :
									// Grammaire.g:115:61: selection
									{
									pushFollow(FOLLOW_selection_in_atom1395);
									selection199=selection();
									state._fsp--;

									stream_selection.add(selection199.getTree());
									}
									break;

								default :
									if ( cnt62 >= 1 ) break loop62;
									EarlyExitException eee = new EarlyExitException(62, input);
									throw eee;
								}
								cnt62++;
							}

							// AST REWRITE
							// elements: 42, selection, 44, INTEGER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 115:72: -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ )
							{
								// Grammaire.g:115:75: ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
								// Grammaire.g:115:84: ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIGNEDINTEGER, "SIGNEDINTEGER"), root_2);
								// Grammaire.g:115:100: ( '+' )?
								if ( stream_42.hasNext() ) {
									adaptor.addChild(root_2, stream_42.nextNode());
								}
								stream_42.reset();

								// Grammaire.g:115:105: ( '-' )?
								if ( stream_44.hasNext() ) {
									adaptor.addChild(root_2, stream_44.nextNode());
								}
								stream_44.reset();

								adaptor.addChild(root_2, stream_INTEGER.nextNode());
								adaptor.addChild(root_1, root_2);
								}

								if ( !(stream_selection.hasNext()) ) {
									throw new RewriteEarlyExitException();
								}
								while ( stream_selection.hasNext() ) {
									adaptor.addChild(root_1, stream_selection.nextTree());
								}
								stream_selection.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 3 :
					// Grammaire.g:116:4: INTEGER ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) )
					{
					INTEGER200=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom1423);  
					stream_INTEGER.add(INTEGER200);

					// Grammaire.g:116:12: ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==38||(LA65_0 >= 40 && LA65_0 <= 44)||LA65_0==46||(LA65_0 >= 49 && LA65_0 <= 55)||(LA65_0 >= 58 && LA65_0 <= 59)||LA65_0==68||LA65_0==72) ) {
						alt65=1;
					}
					else if ( (LA65_0==45) ) {
						alt65=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}

					switch (alt65) {
						case 1 :
							// Grammaire.g:116:13: 
							{
							// AST REWRITE
							// elements: INTEGER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 116:13: -> INTEGER
							{
								adaptor.addChild(root_0, stream_INTEGER.nextNode());
							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:116:24: ( selection )+
							{
							// Grammaire.g:116:24: ( selection )+
							int cnt64=0;
							loop64:
							while (true) {
								int alt64=2;
								int LA64_0 = input.LA(1);
								if ( (LA64_0==45) ) {
									alt64=1;
								}

								switch (alt64) {
								case 1 :
									// Grammaire.g:116:24: selection
									{
									pushFollow(FOLLOW_selection_in_atom1430);
									selection201=selection();
									state._fsp--;

									stream_selection.add(selection201.getTree());
									}
									break;

								default :
									if ( cnt64 >= 1 ) break loop64;
									EarlyExitException eee = new EarlyExitException(64, input);
									throw eee;
								}
								cnt64++;
							}

							// AST REWRITE
							// elements: INTEGER, selection
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 116:35: -> ^( ATOMID INTEGER ( selection )+ )
							{
								// Grammaire.g:116:38: ^( ATOMID INTEGER ( selection )+ )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
								adaptor.addChild(root_1, stream_INTEGER.nextNode());
								if ( !(stream_selection.hasNext()) ) {
									throw new RewriteEarlyExitException();
								}
								while ( stream_selection.hasNext() ) {
									adaptor.addChild(root_1, stream_selection.nextTree());
								}
								stream_selection.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammaire.g:117:4: STRING ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) )
					{
					STRING202=(Token)match(input,STRING,FOLLOW_STRING_in_atom1448);  
					stream_STRING.add(STRING202);

					// Grammaire.g:117:11: ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) )
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==38||(LA67_0 >= 40 && LA67_0 <= 44)||LA67_0==46||(LA67_0 >= 49 && LA67_0 <= 55)||(LA67_0 >= 58 && LA67_0 <= 59)||LA67_0==68||LA67_0==72) ) {
						alt67=1;
					}
					else if ( (LA67_0==45) ) {
						alt67=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 67, 0, input);
						throw nvae;
					}

					switch (alt67) {
						case 1 :
							// Grammaire.g:117:12: 
							{
							// AST REWRITE
							// elements: STRING
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 117:12: -> STRING
							{
								adaptor.addChild(root_0, stream_STRING.nextNode());
							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:117:22: ( selection )+
							{
							// Grammaire.g:117:22: ( selection )+
							int cnt66=0;
							loop66:
							while (true) {
								int alt66=2;
								int LA66_0 = input.LA(1);
								if ( (LA66_0==45) ) {
									alt66=1;
								}

								switch (alt66) {
								case 1 :
									// Grammaire.g:117:22: selection
									{
									pushFollow(FOLLOW_selection_in_atom1455);
									selection203=selection();
									state._fsp--;

									stream_selection.add(selection203.getTree());
									}
									break;

								default :
									if ( cnt66 >= 1 ) break loop66;
									EarlyExitException eee = new EarlyExitException(66, input);
									throw eee;
								}
								cnt66++;
							}

							// AST REWRITE
							// elements: STRING, selection
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 117:33: -> ^( ATOMID STRING ( selection )+ )
							{
								// Grammaire.g:117:36: ^( ATOMID STRING ( selection )+ )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
								adaptor.addChild(root_1, stream_STRING.nextNode());
								if ( !(stream_selection.hasNext()) ) {
									throw new RewriteEarlyExitException();
								}
								while ( stream_selection.hasNext() ) {
									adaptor.addChild(root_1, stream_selection.nextTree());
								}
								stream_selection.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 5 :
					// Grammaire.g:118:4: '(' ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) )
					{
					char_literal204=(Token)match(input,39,FOLLOW_39_in_atom1473);  
					stream_39.add(char_literal204);

					// Grammaire.g:118:8: ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) )
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==CLASSID||LA72_0==ID||LA72_0==INTEGER||LA72_0==STRING||LA72_0==39||LA72_0==42||LA72_0==44||LA72_0==64) ) {
						alt72=1;
					}
					else if ( (LA72_0==56) ) {
						alt72=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 72, 0, input);
						throw nvae;
					}

					switch (alt72) {
						case 1 :
							// Grammaire.g:118:9: expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) )
							{
							pushFollow(FOLLOW_expr_in_atom1476);
							expr205=expr();
							state._fsp--;

							stream_expr.add(expr205.getTree());
							char_literal206=(Token)match(input,40,FOLLOW_40_in_atom1478);  
							stream_40.add(char_literal206);

							// Grammaire.g:118:18: ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) )
							int alt69=2;
							int LA69_0 = input.LA(1);
							if ( (LA69_0==38||(LA69_0 >= 40 && LA69_0 <= 44)||LA69_0==46||(LA69_0 >= 49 && LA69_0 <= 55)||(LA69_0 >= 58 && LA69_0 <= 59)||LA69_0==68||LA69_0==72) ) {
								alt69=1;
							}
							else if ( (LA69_0==45) ) {
								alt69=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 69, 0, input);
								throw nvae;
							}

							switch (alt69) {
								case 1 :
									// Grammaire.g:118:19: 
									{
									// AST REWRITE
									// elements: expr
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 118:19: -> expr
									{
										adaptor.addChild(root_0, stream_expr.nextTree());
									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// Grammaire.g:118:28: ( selection )+
									{
									// Grammaire.g:118:28: ( selection )+
									int cnt68=0;
									loop68:
									while (true) {
										int alt68=2;
										int LA68_0 = input.LA(1);
										if ( (LA68_0==45) ) {
											alt68=1;
										}

										switch (alt68) {
										case 1 :
											// Grammaire.g:118:28: selection
											{
											pushFollow(FOLLOW_selection_in_atom1486);
											selection207=selection();
											state._fsp--;

											stream_selection.add(selection207.getTree());
											}
											break;

										default :
											if ( cnt68 >= 1 ) break loop68;
											EarlyExitException eee = new EarlyExitException(68, input);
											throw eee;
										}
										cnt68++;
									}

									// AST REWRITE
									// elements: selection, expr
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 118:39: -> ^( ATOMID expr ( selection )+ )
									{
										// Grammaire.g:118:42: ^( ATOMID expr ( selection )+ )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
										adaptor.addChild(root_1, stream_expr.nextTree());
										if ( !(stream_selection.hasNext()) ) {
											throw new RewriteEarlyExitException();
										}
										while ( stream_selection.hasNext() ) {
											adaptor.addChild(root_1, stream_selection.nextTree());
										}
										stream_selection.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;
						case 2 :
							// Grammaire.g:118:72: 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) )
							{
							string_literal208=(Token)match(input,56,FOLLOW_56_in_atom1504);  
							stream_56.add(string_literal208);

							CLASSID209=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_atom1506);  
							stream_CLASSID.add(CLASSID209);

							char_literal210=(Token)match(input,47,FOLLOW_47_in_atom1508);  
							stream_47.add(char_literal210);

							pushFollow(FOLLOW_expr_in_atom1510);
							expr211=expr();
							state._fsp--;

							stream_expr.add(expr211.getTree());
							char_literal212=(Token)match(input,40,FOLLOW_40_in_atom1512);  
							stream_40.add(char_literal212);

							// Grammaire.g:118:98: ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) )
							int alt71=2;
							int LA71_0 = input.LA(1);
							if ( (LA71_0==38||(LA71_0 >= 40 && LA71_0 <= 44)||LA71_0==46||(LA71_0 >= 49 && LA71_0 <= 55)||(LA71_0 >= 58 && LA71_0 <= 59)||LA71_0==68||LA71_0==72) ) {
								alt71=1;
							}
							else if ( (LA71_0==45) ) {
								alt71=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 71, 0, input);
								throw nvae;
							}

							switch (alt71) {
								case 1 :
									// Grammaire.g:118:99: 
									{
									// AST REWRITE
									// elements: CLASSID, expr
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 118:99: -> ^( AS CLASSID expr )
									{
										// Grammaire.g:118:102: ^( AS CLASSID expr )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AS, "AS"), root_1);
										adaptor.addChild(root_1, stream_CLASSID.nextNode());
										adaptor.addChild(root_1, stream_expr.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// Grammaire.g:118:123: ( selection )+
									{
									// Grammaire.g:118:123: ( selection )+
									int cnt70=0;
									loop70:
									while (true) {
										int alt70=2;
										int LA70_0 = input.LA(1);
										if ( (LA70_0==45) ) {
											alt70=1;
										}

										switch (alt70) {
										case 1 :
											// Grammaire.g:118:123: selection
											{
											pushFollow(FOLLOW_selection_in_atom1527);
											selection213=selection();
											state._fsp--;

											stream_selection.add(selection213.getTree());
											}
											break;

										default :
											if ( cnt70 >= 1 ) break loop70;
											EarlyExitException eee = new EarlyExitException(70, input);
											throw eee;
										}
										cnt70++;
									}

									// AST REWRITE
									// elements: expr, CLASSID, selection
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 118:134: -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ )
									{
										// Grammaire.g:118:137: ^( ATOMID ^( AS CLASSID expr ) ( selection )+ )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
										// Grammaire.g:118:146: ^( AS CLASSID expr )
										{
										Object root_2 = (Object)adaptor.nil();
										root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AS, "AS"), root_2);
										adaptor.addChild(root_2, stream_CLASSID.nextNode());
										adaptor.addChild(root_2, stream_expr.nextTree());
										adaptor.addChild(root_1, root_2);
										}

										if ( !(stream_selection.hasNext()) ) {
											throw new RewriteEarlyExitException();
										}
										while ( stream_selection.hasNext() ) {
											adaptor.addChild(root_1, stream_selection.nextTree());
										}
										stream_selection.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 6 :
					// Grammaire.g:119:4: instanciation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instanciation_in_atom1552);
					instanciation214=instanciation();
					state._fsp--;

					adaptor.addChild(root_0, instanciation214.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class atomNoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomNoID"
	// Grammaire.g:122:1: atomNoID : ( ( '+' | '-' ) INTEGER ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) ) | INTEGER ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) ) | STRING ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) ) | '(' ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) ) | instanciation );
	public final GrammaireParser.atomNoID_return atomNoID() throws RecognitionException {
		GrammaireParser.atomNoID_return retval = new GrammaireParser.atomNoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal215=null;
		Token char_literal216=null;
		Token INTEGER217=null;
		Token INTEGER219=null;
		Token STRING221=null;
		Token char_literal223=null;
		Token char_literal225=null;
		Token string_literal227=null;
		Token CLASSID228=null;
		Token char_literal229=null;
		Token char_literal231=null;
		ParserRuleReturnScope selection218 =null;
		ParserRuleReturnScope selection220 =null;
		ParserRuleReturnScope selection222 =null;
		ParserRuleReturnScope expr224 =null;
		ParserRuleReturnScope selection226 =null;
		ParserRuleReturnScope expr230 =null;
		ParserRuleReturnScope selection232 =null;
		ParserRuleReturnScope instanciation233 =null;

		Object char_literal215_tree=null;
		Object char_literal216_tree=null;
		Object INTEGER217_tree=null;
		Object INTEGER219_tree=null;
		Object STRING221_tree=null;
		Object char_literal223_tree=null;
		Object char_literal225_tree=null;
		Object string_literal227_tree=null;
		Object CLASSID228_tree=null;
		Object char_literal229_tree=null;
		Object char_literal231_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_selection=new RewriteRuleSubtreeStream(adaptor,"rule selection");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:122:10: ( ( '+' | '-' ) INTEGER ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) ) | INTEGER ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) ) | STRING ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) ) | '(' ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) ) | instanciation )
			int alt86=5;
			switch ( input.LA(1) ) {
			case 42:
			case 44:
				{
				alt86=1;
				}
				break;
			case INTEGER:
				{
				alt86=2;
				}
				break;
			case STRING:
				{
				alt86=3;
				}
				break;
			case 39:
				{
				alt86=4;
				}
				break;
			case 64:
				{
				alt86=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// Grammaire.g:122:12: ( '+' | '-' ) INTEGER ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) )
					{
					// Grammaire.g:122:12: ( '+' | '-' )
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==42) ) {
						alt74=1;
					}
					else if ( (LA74_0==44) ) {
						alt74=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 74, 0, input);
						throw nvae;
					}

					switch (alt74) {
						case 1 :
							// Grammaire.g:122:13: '+'
							{
							char_literal215=(Token)match(input,42,FOLLOW_42_in_atomNoID1564);  
							stream_42.add(char_literal215);

							}
							break;
						case 2 :
							// Grammaire.g:122:17: '-'
							{
							char_literal216=(Token)match(input,44,FOLLOW_44_in_atomNoID1566);  
							stream_44.add(char_literal216);

							}
							break;

					}

					INTEGER217=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomNoID1569);  
					stream_INTEGER.add(INTEGER217);

					// Grammaire.g:122:30: ( -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) | ( selection )+ -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ ) )
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==38||(LA76_0 >= 41 && LA76_0 <= 42)||LA76_0==44||LA76_0==46||(LA76_0 >= 48 && LA76_0 <= 55)) ) {
						alt76=1;
					}
					else if ( (LA76_0==45) ) {
						alt76=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 76, 0, input);
						throw nvae;
					}

					switch (alt76) {
						case 1 :
							// Grammaire.g:122:31: 
							{
							// AST REWRITE
							// elements: 42, INTEGER, 44
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 122:31: -> ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER )
							{
								// Grammaire.g:122:33: ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIGNEDINTEGER, "SIGNEDINTEGER"), root_1);
								// Grammaire.g:122:49: ( '+' )?
								if ( stream_42.hasNext() ) {
									adaptor.addChild(root_1, stream_42.nextNode());
								}
								stream_42.reset();

								// Grammaire.g:122:54: ( '-' )?
								if ( stream_44.hasNext() ) {
									adaptor.addChild(root_1, stream_44.nextNode());
								}
								stream_44.reset();

								adaptor.addChild(root_1, stream_INTEGER.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:122:68: ( selection )+
							{
							// Grammaire.g:122:68: ( selection )+
							int cnt75=0;
							loop75:
							while (true) {
								int alt75=2;
								int LA75_0 = input.LA(1);
								if ( (LA75_0==45) ) {
									alt75=1;
								}

								switch (alt75) {
								case 1 :
									// Grammaire.g:122:68: selection
									{
									pushFollow(FOLLOW_selection_in_atomNoID1585);
									selection218=selection();
									state._fsp--;

									stream_selection.add(selection218.getTree());
									}
									break;

								default :
									if ( cnt75 >= 1 ) break loop75;
									EarlyExitException eee = new EarlyExitException(75, input);
									throw eee;
								}
								cnt75++;
							}

							// AST REWRITE
							// elements: 44, selection, INTEGER, 42
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 122:79: -> ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ )
							{
								// Grammaire.g:122:82: ^( ATOMID ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER ) ( selection )+ )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
								// Grammaire.g:122:91: ^( SIGNEDINTEGER ( '+' )? ( '-' )? INTEGER )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIGNEDINTEGER, "SIGNEDINTEGER"), root_2);
								// Grammaire.g:122:107: ( '+' )?
								if ( stream_42.hasNext() ) {
									adaptor.addChild(root_2, stream_42.nextNode());
								}
								stream_42.reset();

								// Grammaire.g:122:112: ( '-' )?
								if ( stream_44.hasNext() ) {
									adaptor.addChild(root_2, stream_44.nextNode());
								}
								stream_44.reset();

								adaptor.addChild(root_2, stream_INTEGER.nextNode());
								adaptor.addChild(root_1, root_2);
								}

								if ( !(stream_selection.hasNext()) ) {
									throw new RewriteEarlyExitException();
								}
								while ( stream_selection.hasNext() ) {
									adaptor.addChild(root_1, stream_selection.nextTree());
								}
								stream_selection.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// Grammaire.g:123:3: INTEGER ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) )
					{
					INTEGER219=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomNoID1612);  
					stream_INTEGER.add(INTEGER219);

					// Grammaire.g:123:11: ( -> INTEGER | ( selection )+ -> ^( ATOMID INTEGER ( selection )+ ) )
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==38||(LA78_0 >= 41 && LA78_0 <= 42)||LA78_0==44||LA78_0==46||(LA78_0 >= 48 && LA78_0 <= 55)) ) {
						alt78=1;
					}
					else if ( (LA78_0==45) ) {
						alt78=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 78, 0, input);
						throw nvae;
					}

					switch (alt78) {
						case 1 :
							// Grammaire.g:123:12: 
							{
							// AST REWRITE
							// elements: INTEGER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 123:12: -> INTEGER
							{
								adaptor.addChild(root_0, stream_INTEGER.nextNode());
							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:123:23: ( selection )+
							{
							// Grammaire.g:123:23: ( selection )+
							int cnt77=0;
							loop77:
							while (true) {
								int alt77=2;
								int LA77_0 = input.LA(1);
								if ( (LA77_0==45) ) {
									alt77=1;
								}

								switch (alt77) {
								case 1 :
									// Grammaire.g:123:23: selection
									{
									pushFollow(FOLLOW_selection_in_atomNoID1619);
									selection220=selection();
									state._fsp--;

									stream_selection.add(selection220.getTree());
									}
									break;

								default :
									if ( cnt77 >= 1 ) break loop77;
									EarlyExitException eee = new EarlyExitException(77, input);
									throw eee;
								}
								cnt77++;
							}

							// AST REWRITE
							// elements: selection, INTEGER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 123:34: -> ^( ATOMID INTEGER ( selection )+ )
							{
								// Grammaire.g:123:37: ^( ATOMID INTEGER ( selection )+ )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
								adaptor.addChild(root_1, stream_INTEGER.nextNode());
								if ( !(stream_selection.hasNext()) ) {
									throw new RewriteEarlyExitException();
								}
								while ( stream_selection.hasNext() ) {
									adaptor.addChild(root_1, stream_selection.nextTree());
								}
								stream_selection.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 3 :
					// Grammaire.g:124:3: STRING ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) )
					{
					STRING221=(Token)match(input,STRING,FOLLOW_STRING_in_atomNoID1636);  
					stream_STRING.add(STRING221);

					// Grammaire.g:124:10: ( -> STRING | ( selection )+ -> ^( ATOMID STRING ( selection )+ ) )
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==38||(LA80_0 >= 41 && LA80_0 <= 42)||LA80_0==44||LA80_0==46||(LA80_0 >= 48 && LA80_0 <= 55)) ) {
						alt80=1;
					}
					else if ( (LA80_0==45) ) {
						alt80=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 80, 0, input);
						throw nvae;
					}

					switch (alt80) {
						case 1 :
							// Grammaire.g:124:11: 
							{
							// AST REWRITE
							// elements: STRING
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 124:11: -> STRING
							{
								adaptor.addChild(root_0, stream_STRING.nextNode());
							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:124:21: ( selection )+
							{
							// Grammaire.g:124:21: ( selection )+
							int cnt79=0;
							loop79:
							while (true) {
								int alt79=2;
								int LA79_0 = input.LA(1);
								if ( (LA79_0==45) ) {
									alt79=1;
								}

								switch (alt79) {
								case 1 :
									// Grammaire.g:124:21: selection
									{
									pushFollow(FOLLOW_selection_in_atomNoID1643);
									selection222=selection();
									state._fsp--;

									stream_selection.add(selection222.getTree());
									}
									break;

								default :
									if ( cnt79 >= 1 ) break loop79;
									EarlyExitException eee = new EarlyExitException(79, input);
									throw eee;
								}
								cnt79++;
							}

							// AST REWRITE
							// elements: STRING, selection
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 124:32: -> ^( ATOMID STRING ( selection )+ )
							{
								// Grammaire.g:124:35: ^( ATOMID STRING ( selection )+ )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
								adaptor.addChild(root_1, stream_STRING.nextNode());
								if ( !(stream_selection.hasNext()) ) {
									throw new RewriteEarlyExitException();
								}
								while ( stream_selection.hasNext() ) {
									adaptor.addChild(root_1, stream_selection.nextTree());
								}
								stream_selection.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// Grammaire.g:125:4: '(' ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) )
					{
					char_literal223=(Token)match(input,39,FOLLOW_39_in_atomNoID1661);  
					stream_39.add(char_literal223);

					// Grammaire.g:125:8: ( expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) ) | 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) ) )
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==CLASSID||LA85_0==ID||LA85_0==INTEGER||LA85_0==STRING||LA85_0==39||LA85_0==42||LA85_0==44||LA85_0==64) ) {
						alt85=1;
					}
					else if ( (LA85_0==56) ) {
						alt85=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 85, 0, input);
						throw nvae;
					}

					switch (alt85) {
						case 1 :
							// Grammaire.g:125:9: expr ')' ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) )
							{
							pushFollow(FOLLOW_expr_in_atomNoID1664);
							expr224=expr();
							state._fsp--;

							stream_expr.add(expr224.getTree());
							char_literal225=(Token)match(input,40,FOLLOW_40_in_atomNoID1666);  
							stream_40.add(char_literal225);

							// Grammaire.g:125:18: ( -> expr | ( selection )+ -> ^( ATOMID expr ( selection )+ ) )
							int alt82=2;
							int LA82_0 = input.LA(1);
							if ( (LA82_0==38||(LA82_0 >= 41 && LA82_0 <= 42)||LA82_0==44||LA82_0==46||(LA82_0 >= 48 && LA82_0 <= 55)) ) {
								alt82=1;
							}
							else if ( (LA82_0==45) ) {
								alt82=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 82, 0, input);
								throw nvae;
							}

							switch (alt82) {
								case 1 :
									// Grammaire.g:125:19: 
									{
									// AST REWRITE
									// elements: expr
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 125:19: -> expr
									{
										adaptor.addChild(root_0, stream_expr.nextTree());
									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// Grammaire.g:125:28: ( selection )+
									{
									// Grammaire.g:125:28: ( selection )+
									int cnt81=0;
									loop81:
									while (true) {
										int alt81=2;
										int LA81_0 = input.LA(1);
										if ( (LA81_0==45) ) {
											alt81=1;
										}

										switch (alt81) {
										case 1 :
											// Grammaire.g:125:28: selection
											{
											pushFollow(FOLLOW_selection_in_atomNoID1674);
											selection226=selection();
											state._fsp--;

											stream_selection.add(selection226.getTree());
											}
											break;

										default :
											if ( cnt81 >= 1 ) break loop81;
											EarlyExitException eee = new EarlyExitException(81, input);
											throw eee;
										}
										cnt81++;
									}

									// AST REWRITE
									// elements: selection, expr
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 125:39: -> ^( ATOMID expr ( selection )+ )
									{
										// Grammaire.g:125:42: ^( ATOMID expr ( selection )+ )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
										adaptor.addChild(root_1, stream_expr.nextTree());
										if ( !(stream_selection.hasNext()) ) {
											throw new RewriteEarlyExitException();
										}
										while ( stream_selection.hasNext() ) {
											adaptor.addChild(root_1, stream_selection.nextTree());
										}
										stream_selection.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;
						case 2 :
							// Grammaire.g:125:72: 'as' CLASSID ':' expr ')' ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) )
							{
							string_literal227=(Token)match(input,56,FOLLOW_56_in_atomNoID1692);  
							stream_56.add(string_literal227);

							CLASSID228=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_atomNoID1694);  
							stream_CLASSID.add(CLASSID228);

							char_literal229=(Token)match(input,47,FOLLOW_47_in_atomNoID1696);  
							stream_47.add(char_literal229);

							pushFollow(FOLLOW_expr_in_atomNoID1698);
							expr230=expr();
							state._fsp--;

							stream_expr.add(expr230.getTree());
							char_literal231=(Token)match(input,40,FOLLOW_40_in_atomNoID1700);  
							stream_40.add(char_literal231);

							// Grammaire.g:125:98: ( -> ^( AS CLASSID expr ) | ( selection )+ -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ ) )
							int alt84=2;
							int LA84_0 = input.LA(1);
							if ( (LA84_0==38||(LA84_0 >= 41 && LA84_0 <= 42)||LA84_0==44||LA84_0==46||(LA84_0 >= 48 && LA84_0 <= 55)) ) {
								alt84=1;
							}
							else if ( (LA84_0==45) ) {
								alt84=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 84, 0, input);
								throw nvae;
							}

							switch (alt84) {
								case 1 :
									// Grammaire.g:125:99: 
									{
									// AST REWRITE
									// elements: expr, CLASSID
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 125:99: -> ^( AS CLASSID expr )
									{
										// Grammaire.g:125:102: ^( AS CLASSID expr )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AS, "AS"), root_1);
										adaptor.addChild(root_1, stream_CLASSID.nextNode());
										adaptor.addChild(root_1, stream_expr.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// Grammaire.g:125:123: ( selection )+
									{
									// Grammaire.g:125:123: ( selection )+
									int cnt83=0;
									loop83:
									while (true) {
										int alt83=2;
										int LA83_0 = input.LA(1);
										if ( (LA83_0==45) ) {
											alt83=1;
										}

										switch (alt83) {
										case 1 :
											// Grammaire.g:125:123: selection
											{
											pushFollow(FOLLOW_selection_in_atomNoID1715);
											selection232=selection();
											state._fsp--;

											stream_selection.add(selection232.getTree());
											}
											break;

										default :
											if ( cnt83 >= 1 ) break loop83;
											EarlyExitException eee = new EarlyExitException(83, input);
											throw eee;
										}
										cnt83++;
									}

									// AST REWRITE
									// elements: CLASSID, expr, selection
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (Object)adaptor.nil();
									// 125:134: -> ^( ATOMID ^( AS CLASSID expr ) ( selection )+ )
									{
										// Grammaire.g:125:137: ^( ATOMID ^( AS CLASSID expr ) ( selection )+ )
										{
										Object root_1 = (Object)adaptor.nil();
										root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
										// Grammaire.g:125:146: ^( AS CLASSID expr )
										{
										Object root_2 = (Object)adaptor.nil();
										root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AS, "AS"), root_2);
										adaptor.addChild(root_2, stream_CLASSID.nextNode());
										adaptor.addChild(root_2, stream_expr.nextTree());
										adaptor.addChild(root_1, root_2);
										}

										if ( !(stream_selection.hasNext()) ) {
											throw new RewriteEarlyExitException();
										}
										while ( stream_selection.hasNext() ) {
											adaptor.addChild(root_1, stream_selection.nextTree());
										}
										stream_selection.reset();

										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 5 :
					// Grammaire.g:126:4: instanciation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_instanciation_in_atomNoID1740);
					instanciation233=instanciation();
					state._fsp--;

					adaptor.addChild(root_0, instanciation233.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomNoID"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// Grammaire.g:129:1: instruction : ( block | 'return' ';' -> 'return' | ifstmt -> ifstmt | whilestmt -> whilestmt | atomID ( ':=' expr ';' -> ^( AFFECT atomID expr ) | exprID ';' -> ^( INSTEXPR atomID ( exprID )? ) ) | atomNoID ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) ) );
	public final GrammaireParser.instruction_return instruction() throws RecognitionException {
		GrammaireParser.instruction_return retval = new GrammaireParser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal235=null;
		Token char_literal236=null;
		Token string_literal240=null;
		Token char_literal242=null;
		Token char_literal244=null;
		Token char_literal247=null;
		ParserRuleReturnScope block234 =null;
		ParserRuleReturnScope ifstmt237 =null;
		ParserRuleReturnScope whilestmt238 =null;
		ParserRuleReturnScope atomID239 =null;
		ParserRuleReturnScope expr241 =null;
		ParserRuleReturnScope exprID243 =null;
		ParserRuleReturnScope atomNoID245 =null;
		ParserRuleReturnScope exprNoID246 =null;
		ParserRuleReturnScope affectNoID248 =null;

		Object string_literal235_tree=null;
		Object char_literal236_tree=null;
		Object string_literal240_tree=null;
		Object char_literal242_tree=null;
		Object char_literal244_tree=null;
		Object char_literal247_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_atomID=new RewriteRuleSubtreeStream(adaptor,"rule atomID");
		RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
		RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
		RewriteRuleSubtreeStream stream_exprID=new RewriteRuleSubtreeStream(adaptor,"rule exprID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_exprNoID=new RewriteRuleSubtreeStream(adaptor,"rule exprNoID");
		RewriteRuleSubtreeStream stream_affectNoID=new RewriteRuleSubtreeStream(adaptor,"rule affectNoID");
		RewriteRuleSubtreeStream stream_atomNoID=new RewriteRuleSubtreeStream(adaptor,"rule atomNoID");

		try {
			// Grammaire.g:129:13: ( block | 'return' ';' -> 'return' | ifstmt -> ifstmt | whilestmt -> whilestmt | atomID ( ':=' expr ';' -> ^( AFFECT atomID expr ) | exprID ';' -> ^( INSTEXPR atomID ( exprID )? ) ) | atomNoID ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) ) )
			int alt89=6;
			switch ( input.LA(1) ) {
			case 71:
				{
				alt89=1;
				}
				break;
			case 66:
				{
				alt89=2;
				}
				break;
			case 62:
				{
				alt89=3;
				}
				break;
			case 70:
				{
				alt89=4;
				}
				break;
			case CLASSID:
			case ID:
				{
				alt89=5;
				}
				break;
			case INTEGER:
			case STRING:
			case 39:
			case 42:
			case 44:
			case 64:
				{
				alt89=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}
			switch (alt89) {
				case 1 :
					// Grammaire.g:129:15: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_instruction1751);
					block234=block();
					state._fsp--;

					adaptor.addChild(root_0, block234.getTree());

					}
					break;
				case 2 :
					// Grammaire.g:130:3: 'return' ';'
					{
					string_literal235=(Token)match(input,66,FOLLOW_66_in_instruction1755);  
					stream_66.add(string_literal235);

					char_literal236=(Token)match(input,49,FOLLOW_49_in_instruction1757);  
					stream_49.add(char_literal236);

					// AST REWRITE
					// elements: 66
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 130:16: -> 'return'
					{
						adaptor.addChild(root_0, stream_66.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammaire.g:131:4: ifstmt
					{
					pushFollow(FOLLOW_ifstmt_in_instruction1766);
					ifstmt237=ifstmt();
					state._fsp--;

					stream_ifstmt.add(ifstmt237.getTree());
					// AST REWRITE
					// elements: ifstmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 131:11: -> ifstmt
					{
						adaptor.addChild(root_0, stream_ifstmt.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Grammaire.g:132:4: whilestmt
					{
					pushFollow(FOLLOW_whilestmt_in_instruction1775);
					whilestmt238=whilestmt();
					state._fsp--;

					stream_whilestmt.add(whilestmt238.getTree());
					// AST REWRITE
					// elements: whilestmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:14: -> whilestmt
					{
						adaptor.addChild(root_0, stream_whilestmt.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammaire.g:133:4: atomID ( ':=' expr ';' -> ^( AFFECT atomID expr ) | exprID ';' -> ^( INSTEXPR atomID ( exprID )? ) )
					{
					pushFollow(FOLLOW_atomID_in_instruction1784);
					atomID239=atomID();
					state._fsp--;

					stream_atomID.add(atomID239.getTree());
					// Grammaire.g:133:11: ( ':=' expr ';' -> ^( AFFECT atomID expr ) | exprID ';' -> ^( INSTEXPR atomID ( exprID )? ) )
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==48) ) {
						alt87=1;
					}
					else if ( (LA87_0==38||(LA87_0 >= 41 && LA87_0 <= 42)||LA87_0==44||LA87_0==46||(LA87_0 >= 49 && LA87_0 <= 55)) ) {
						alt87=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 87, 0, input);
						throw nvae;
					}

					switch (alt87) {
						case 1 :
							// Grammaire.g:133:12: ':=' expr ';'
							{
							string_literal240=(Token)match(input,48,FOLLOW_48_in_instruction1787);  
							stream_48.add(string_literal240);

							pushFollow(FOLLOW_expr_in_instruction1789);
							expr241=expr();
							state._fsp--;

							stream_expr.add(expr241.getTree());
							char_literal242=(Token)match(input,49,FOLLOW_49_in_instruction1791);  
							stream_49.add(char_literal242);

							// AST REWRITE
							// elements: atomID, expr
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 133:26: -> ^( AFFECT atomID expr )
							{
								// Grammaire.g:133:29: ^( AFFECT atomID expr )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
								adaptor.addChild(root_1, stream_atomID.nextTree());
								adaptor.addChild(root_1, stream_expr.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:133:53: exprID ';'
							{
							pushFollow(FOLLOW_exprID_in_instruction1805);
							exprID243=exprID();
							state._fsp--;

							stream_exprID.add(exprID243.getTree());
							char_literal244=(Token)match(input,49,FOLLOW_49_in_instruction1807);  
							stream_49.add(char_literal244);

							// AST REWRITE
							// elements: atomID, exprID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 133:64: -> ^( INSTEXPR atomID ( exprID )? )
							{
								// Grammaire.g:133:67: ^( INSTEXPR atomID ( exprID )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTEXPR, "INSTEXPR"), root_1);
								adaptor.addChild(root_1, stream_atomID.nextTree());
								// Grammaire.g:133:85: ( exprID )?
								if ( stream_exprID.hasNext() ) {
									adaptor.addChild(root_1, stream_exprID.nextTree());
								}
								stream_exprID.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 6 :
					// Grammaire.g:134:4: atomNoID ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) )
					{
					pushFollow(FOLLOW_atomNoID_in_instruction1824);
					atomNoID245=atomNoID();
					state._fsp--;

					stream_atomNoID.add(atomNoID245.getTree());
					// Grammaire.g:134:13: ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) )
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==38||(LA88_0 >= 41 && LA88_0 <= 42)||LA88_0==44||LA88_0==46||(LA88_0 >= 49 && LA88_0 <= 55)) ) {
						alt88=1;
					}
					else if ( (LA88_0==48) ) {
						alt88=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 88, 0, input);
						throw nvae;
					}

					switch (alt88) {
						case 1 :
							// Grammaire.g:134:14: exprNoID ';'
							{
							pushFollow(FOLLOW_exprNoID_in_instruction1827);
							exprNoID246=exprNoID();
							state._fsp--;

							stream_exprNoID.add(exprNoID246.getTree());
							char_literal247=(Token)match(input,49,FOLLOW_49_in_instruction1829);  
							stream_49.add(char_literal247);

							// AST REWRITE
							// elements: atomNoID, exprNoID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 134:27: -> ^( INSTEXPR atomNoID ( exprNoID )? )
							{
								// Grammaire.g:134:30: ^( INSTEXPR atomNoID ( exprNoID )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTEXPR, "INSTEXPR"), root_1);
								adaptor.addChild(root_1, stream_atomNoID.nextTree());
								// Grammaire.g:134:50: ( exprNoID )?
								if ( stream_exprNoID.hasNext() ) {
									adaptor.addChild(root_1, stream_exprNoID.nextTree());
								}
								stream_exprNoID.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:134:63: affectNoID
							{
							pushFollow(FOLLOW_affectNoID_in_instruction1844);
							affectNoID248=affectNoID();
							state._fsp--;

							stream_affectNoID.add(affectNoID248.getTree());
							// AST REWRITE
							// elements: affectNoID, atomNoID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 134:74: -> ^( AFFECT atomNoID affectNoID )
							{
								// Grammaire.g:134:77: ^( AFFECT atomNoID affectNoID )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
								adaptor.addChild(root_1, stream_atomNoID.nextTree());
								adaptor.addChild(root_1, stream_affectNoID.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class instructionNoID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instructionNoID"
	// Grammaire.g:137:1: instructionNoID : ( block | ifstmt -> ifstmt | whilestmt -> whilestmt | 'return' ';' -> 'return' | atomNoID ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) ) );
	public final GrammaireParser.instructionNoID_return instructionNoID() throws RecognitionException {
		GrammaireParser.instructionNoID_return retval = new GrammaireParser.instructionNoID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal252=null;
		Token char_literal253=null;
		Token char_literal256=null;
		ParserRuleReturnScope block249 =null;
		ParserRuleReturnScope ifstmt250 =null;
		ParserRuleReturnScope whilestmt251 =null;
		ParserRuleReturnScope atomNoID254 =null;
		ParserRuleReturnScope exprNoID255 =null;
		ParserRuleReturnScope affectNoID257 =null;

		Object string_literal252_tree=null;
		Object char_literal253_tree=null;
		Object char_literal256_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
		RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
		RewriteRuleSubtreeStream stream_exprNoID=new RewriteRuleSubtreeStream(adaptor,"rule exprNoID");
		RewriteRuleSubtreeStream stream_affectNoID=new RewriteRuleSubtreeStream(adaptor,"rule affectNoID");
		RewriteRuleSubtreeStream stream_atomNoID=new RewriteRuleSubtreeStream(adaptor,"rule atomNoID");

		try {
			// Grammaire.g:137:17: ( block | ifstmt -> ifstmt | whilestmt -> whilestmt | 'return' ';' -> 'return' | atomNoID ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) ) )
			int alt91=5;
			switch ( input.LA(1) ) {
			case 71:
				{
				alt91=1;
				}
				break;
			case 62:
				{
				alt91=2;
				}
				break;
			case 70:
				{
				alt91=3;
				}
				break;
			case 66:
				{
				alt91=4;
				}
				break;
			case INTEGER:
			case STRING:
			case 39:
			case 42:
			case 44:
			case 64:
				{
				alt91=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// Grammaire.g:137:19: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_instructionNoID1865);
					block249=block();
					state._fsp--;

					adaptor.addChild(root_0, block249.getTree());

					}
					break;
				case 2 :
					// Grammaire.g:138:3: ifstmt
					{
					pushFollow(FOLLOW_ifstmt_in_instructionNoID1869);
					ifstmt250=ifstmt();
					state._fsp--;

					stream_ifstmt.add(ifstmt250.getTree());
					// AST REWRITE
					// elements: ifstmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 138:10: -> ifstmt
					{
						adaptor.addChild(root_0, stream_ifstmt.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Grammaire.g:139:4: whilestmt
					{
					pushFollow(FOLLOW_whilestmt_in_instructionNoID1878);
					whilestmt251=whilestmt();
					state._fsp--;

					stream_whilestmt.add(whilestmt251.getTree());
					// AST REWRITE
					// elements: whilestmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:14: -> whilestmt
					{
						adaptor.addChild(root_0, stream_whilestmt.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Grammaire.g:140:4: 'return' ';'
					{
					string_literal252=(Token)match(input,66,FOLLOW_66_in_instructionNoID1887);  
					stream_66.add(string_literal252);

					char_literal253=(Token)match(input,49,FOLLOW_49_in_instructionNoID1889);  
					stream_49.add(char_literal253);

					// AST REWRITE
					// elements: 66
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:17: -> 'return'
					{
						adaptor.addChild(root_0, stream_66.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Grammaire.g:141:4: atomNoID ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) )
					{
					pushFollow(FOLLOW_atomNoID_in_instructionNoID1898);
					atomNoID254=atomNoID();
					state._fsp--;

					stream_atomNoID.add(atomNoID254.getTree());
					// Grammaire.g:141:13: ( exprNoID ';' -> ^( INSTEXPR atomNoID ( exprNoID )? ) | affectNoID -> ^( AFFECT atomNoID affectNoID ) )
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==38||(LA90_0 >= 41 && LA90_0 <= 42)||LA90_0==44||LA90_0==46||(LA90_0 >= 49 && LA90_0 <= 55)) ) {
						alt90=1;
					}
					else if ( (LA90_0==48) ) {
						alt90=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 90, 0, input);
						throw nvae;
					}

					switch (alt90) {
						case 1 :
							// Grammaire.g:141:14: exprNoID ';'
							{
							pushFollow(FOLLOW_exprNoID_in_instructionNoID1901);
							exprNoID255=exprNoID();
							state._fsp--;

							stream_exprNoID.add(exprNoID255.getTree());
							char_literal256=(Token)match(input,49,FOLLOW_49_in_instructionNoID1903);  
							stream_49.add(char_literal256);

							// AST REWRITE
							// elements: atomNoID, exprNoID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 141:27: -> ^( INSTEXPR atomNoID ( exprNoID )? )
							{
								// Grammaire.g:141:30: ^( INSTEXPR atomNoID ( exprNoID )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTEXPR, "INSTEXPR"), root_1);
								adaptor.addChild(root_1, stream_atomNoID.nextTree());
								// Grammaire.g:141:50: ( exprNoID )?
								if ( stream_exprNoID.hasNext() ) {
									adaptor.addChild(root_1, stream_exprNoID.nextTree());
								}
								stream_exprNoID.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Grammaire.g:141:63: affectNoID
							{
							pushFollow(FOLLOW_affectNoID_in_instructionNoID1918);
							affectNoID257=affectNoID();
							state._fsp--;

							stream_affectNoID.add(affectNoID257.getTree());
							// AST REWRITE
							// elements: atomNoID, affectNoID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 141:74: -> ^( AFFECT atomNoID affectNoID )
							{
								// Grammaire.g:141:77: ^( AFFECT atomNoID affectNoID )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
								adaptor.addChild(root_1, stream_atomNoID.nextTree());
								adaptor.addChild(root_1, stream_affectNoID.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instructionNoID"


	public static class ifstmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifstmt"
	// Grammaire.g:145:1: ifstmt : 'if' expr 'then' thenif= instruction 'else' elseif= instruction -> ^( IF expr ^( THEN $thenif) ^( ELSE $elseif) ) ;
	public final GrammaireParser.ifstmt_return ifstmt() throws RecognitionException {
		GrammaireParser.ifstmt_return retval = new GrammaireParser.ifstmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal258=null;
		Token string_literal260=null;
		Token string_literal261=null;
		ParserRuleReturnScope thenif =null;
		ParserRuleReturnScope elseif =null;
		ParserRuleReturnScope expr259 =null;

		Object string_literal258_tree=null;
		Object string_literal260_tree=null;
		Object string_literal261_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:145:8: ( 'if' expr 'then' thenif= instruction 'else' elseif= instruction -> ^( IF expr ^( THEN $thenif) ^( ELSE $elseif) ) )
			// Grammaire.g:145:10: 'if' expr 'then' thenif= instruction 'else' elseif= instruction
			{
			string_literal258=(Token)match(input,62,FOLLOW_62_in_ifstmt1941);  
			stream_62.add(string_literal258);

			pushFollow(FOLLOW_expr_in_ifstmt1943);
			expr259=expr();
			state._fsp--;

			stream_expr.add(expr259.getTree());
			string_literal260=(Token)match(input,68,FOLLOW_68_in_ifstmt1945);  
			stream_68.add(string_literal260);

			pushFollow(FOLLOW_instruction_in_ifstmt1949);
			thenif=instruction();
			state._fsp--;

			stream_instruction.add(thenif.getTree());
			string_literal261=(Token)match(input,60,FOLLOW_60_in_ifstmt1951);  
			stream_60.add(string_literal261);

			pushFollow(FOLLOW_instruction_in_ifstmt1955);
			elseif=instruction();
			state._fsp--;

			stream_instruction.add(elseif.getTree());
			// AST REWRITE
			// elements: elseif, expr, thenif
			// token labels: 
			// rule labels: thenif, elseif, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_thenif=new RewriteRuleSubtreeStream(adaptor,"rule thenif",thenif!=null?thenif.getTree():null);
			RewriteRuleSubtreeStream stream_elseif=new RewriteRuleSubtreeStream(adaptor,"rule elseif",elseif!=null?elseif.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 145:72: -> ^( IF expr ^( THEN $thenif) ^( ELSE $elseif) )
			{
				// Grammaire.g:145:75: ^( IF expr ^( THEN $thenif) ^( ELSE $elseif) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				// Grammaire.g:145:85: ^( THEN $thenif)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
				adaptor.addChild(root_2, stream_thenif.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// Grammaire.g:145:101: ^( ELSE $elseif)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
				adaptor.addChild(root_2, stream_elseif.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifstmt"


	public static class whilestmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whilestmt"
	// Grammaire.g:148:1: whilestmt : 'while' expr 'do' instruction -> ^( WHILE expr instruction ) ;
	public final GrammaireParser.whilestmt_return whilestmt() throws RecognitionException {
		GrammaireParser.whilestmt_return retval = new GrammaireParser.whilestmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal262=null;
		Token string_literal264=null;
		ParserRuleReturnScope expr263 =null;
		ParserRuleReturnScope instruction265 =null;

		Object string_literal262_tree=null;
		Object string_literal264_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:148:11: ( 'while' expr 'do' instruction -> ^( WHILE expr instruction ) )
			// Grammaire.g:148:13: 'while' expr 'do' instruction
			{
			string_literal262=(Token)match(input,70,FOLLOW_70_in_whilestmt1987);  
			stream_70.add(string_literal262);

			pushFollow(FOLLOW_expr_in_whilestmt1989);
			expr263=expr();
			state._fsp--;

			stream_expr.add(expr263.getTree());
			string_literal264=(Token)match(input,59,FOLLOW_59_in_whilestmt1991);  
			stream_59.add(string_literal264);

			pushFollow(FOLLOW_instruction_in_whilestmt1993);
			instruction265=instruction();
			state._fsp--;

			stream_instruction.add(instruction265.getTree());
			// AST REWRITE
			// elements: expr, instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 148:43: -> ^( WHILE expr instruction )
			{
				// Grammaire.g:148:46: ^( WHILE expr instruction )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_instruction.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestmt"


	public static class affectID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affectID"
	// Grammaire.g:151:1: affectID : ':=' expr ';' -> expr ;
	public final GrammaireParser.affectID_return affectID() throws RecognitionException {
		GrammaireParser.affectID_return retval = new GrammaireParser.affectID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal266=null;
		Token char_literal268=null;
		ParserRuleReturnScope expr267 =null;

		Object string_literal266_tree=null;
		Object char_literal268_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Grammaire.g:151:10: ( ':=' expr ';' -> expr )
			// Grammaire.g:151:12: ':=' expr ';'
			{
			string_literal266=(Token)match(input,48,FOLLOW_48_in_affectID2014);  
			stream_48.add(string_literal266);

			pushFollow(FOLLOW_expr_in_affectID2016);
			expr267=expr();
			state._fsp--;

			stream_expr.add(expr267.getTree());
			char_literal268=(Token)match(input,49,FOLLOW_49_in_affectID2018);  
			stream_49.add(char_literal268);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 151:26: -> expr
			{
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affectID"


	public static class atomID_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomID"
	// Grammaire.g:154:1: atomID : ( ID | CLASSID ) ( -> ( ID )? ( CLASSID )? | ( selection )+ -> ^( ATOMID ( ID )? ( CLASSID )? ( selection )+ ) ) ;
	public final GrammaireParser.atomID_return atomID() throws RecognitionException {
		GrammaireParser.atomID_return retval = new GrammaireParser.atomID_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID269=null;
		Token CLASSID270=null;
		ParserRuleReturnScope selection271 =null;

		Object ID269_tree=null;
		Object CLASSID270_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_CLASSID=new RewriteRuleTokenStream(adaptor,"token CLASSID");
		RewriteRuleSubtreeStream stream_selection=new RewriteRuleSubtreeStream(adaptor,"rule selection");

		try {
			// Grammaire.g:154:8: ( ( ID | CLASSID ) ( -> ( ID )? ( CLASSID )? | ( selection )+ -> ^( ATOMID ( ID )? ( CLASSID )? ( selection )+ ) ) )
			// Grammaire.g:154:10: ( ID | CLASSID ) ( -> ( ID )? ( CLASSID )? | ( selection )+ -> ^( ATOMID ( ID )? ( CLASSID )? ( selection )+ ) )
			{
			// Grammaire.g:154:10: ( ID | CLASSID )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==ID) ) {
				alt92=1;
			}
			else if ( (LA92_0==CLASSID) ) {
				alt92=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// Grammaire.g:154:11: ID
					{
					ID269=(Token)match(input,ID,FOLLOW_ID_in_atomID2034);  
					stream_ID.add(ID269);

					}
					break;
				case 2 :
					// Grammaire.g:154:14: CLASSID
					{
					CLASSID270=(Token)match(input,CLASSID,FOLLOW_CLASSID_in_atomID2036);  
					stream_CLASSID.add(CLASSID270);

					}
					break;

			}

			// Grammaire.g:154:23: ( -> ( ID )? ( CLASSID )? | ( selection )+ -> ^( ATOMID ( ID )? ( CLASSID )? ( selection )+ ) )
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==38||(LA94_0 >= 40 && LA94_0 <= 44)||(LA94_0 >= 46 && LA94_0 <= 55)||(LA94_0 >= 58 && LA94_0 <= 59)||LA94_0==68||LA94_0==72) ) {
				alt94=1;
			}
			else if ( (LA94_0==45) ) {
				alt94=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}

			switch (alt94) {
				case 1 :
					// Grammaire.g:154:24: 
					{
					// AST REWRITE
					// elements: CLASSID, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 154:24: -> ( ID )? ( CLASSID )?
					{
						// Grammaire.g:154:27: ( ID )?
						if ( stream_ID.hasNext() ) {
							adaptor.addChild(root_0, stream_ID.nextNode());
						}
						stream_ID.reset();

						// Grammaire.g:154:31: ( CLASSID )?
						if ( stream_CLASSID.hasNext() ) {
							adaptor.addChild(root_0, stream_CLASSID.nextNode());
						}
						stream_CLASSID.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Grammaire.g:154:40: ( selection )+
					{
					// Grammaire.g:154:40: ( selection )+
					int cnt93=0;
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==45) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// Grammaire.g:154:40: selection
							{
							pushFollow(FOLLOW_selection_in_atomID2048);
							selection271=selection();
							state._fsp--;

							stream_selection.add(selection271.getTree());
							}
							break;

						default :
							if ( cnt93 >= 1 ) break loop93;
							EarlyExitException eee = new EarlyExitException(93, input);
							throw eee;
						}
						cnt93++;
					}

					// AST REWRITE
					// elements: selection, CLASSID, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 154:51: -> ^( ATOMID ( ID )? ( CLASSID )? ( selection )+ )
					{
						// Grammaire.g:154:54: ^( ATOMID ( ID )? ( CLASSID )? ( selection )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMID, "ATOMID"), root_1);
						// Grammaire.g:154:63: ( ID )?
						if ( stream_ID.hasNext() ) {
							adaptor.addChild(root_1, stream_ID.nextNode());
						}
						stream_ID.reset();

						// Grammaire.g:154:67: ( CLASSID )?
						if ( stream_CLASSID.hasNext() ) {
							adaptor.addChild(root_1, stream_CLASSID.nextNode());
						}
						stream_CLASSID.reset();

						if ( !(stream_selection.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_selection.hasNext() ) {
							adaptor.addChild(root_1, stream_selection.nextTree());
						}
						stream_selection.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomID"

	// Delegated rules



	public static final BitSet FOLLOW_declaration_in_program104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classe_in_declaration121 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_block_in_declaration125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_classe142 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_classe146 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_classe148 = new BitSet(new long[]{0x0000010000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParam_in_classe151 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_classe154 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParam_in_classe156 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_classe163 = new BitSet(new long[]{0xA000000000000000L});
	public static final BitSet FOLLOW_61_in_classe166 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_classe170 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_classe174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_classBlock_in_classe176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_classBlock205 = new BitSet(new long[]{0x0400148100108400L,0x0000000000000021L});
	public static final BitSet FOLLOW_variableClasse_in_classBlock207 = new BitSet(new long[]{0x0400148100108400L,0x0000000000000021L});
	public static final BitSet FOLLOW_affect_in_classBlock210 = new BitSet(new long[]{0x0400148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_constructor_in_classBlock213 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_methode_in_classBlock215 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_classBlock218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_constructor245 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_constructor249 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_constructor251 = new BitSet(new long[]{0x0000010000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParam_in_constructor254 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_constructor257 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalParam_in_constructor259 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_constructor266 = new BitSet(new long[]{0x8000800000000000L});
	public static final BitSet FOLLOW_47_in_constructor269 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_constructor273 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_constructor275 = new BitSet(new long[]{0x0000158100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_constructor277 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_constructor280 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_constructor282 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_constructor288 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_constructor292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_block_in_constructor294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_variableClasse329 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_variableClasse331 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_variableClasse334 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_variableClasse336 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_variableClasse338 = new BitSet(new long[]{0x0003000000000000L});
	public static final BitSet FOLLOW_48_in_variableClasse341 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_variableClasse343 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_variableClasse345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_variableClasse367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_localVariable396 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_localVariable398 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_localVariable400 = new BitSet(new long[]{0x0003000000000000L});
	public static final BitSet FOLLOW_48_in_localVariable403 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_localVariable405 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_localVariable407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_localVariable423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_methode445 = new BitSet(new long[]{0x0000000000008000L,0x000000000000000AL});
	public static final BitSet FOLLOW_67_in_methode447 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_methode450 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_methode453 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_methode455 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_methodeParam_in_methode458 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_methode461 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodeParam_in_methode463 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_methode470 = new BitSet(new long[]{0x8000800000000000L});
	public static final BitSet FOLLOW_63_in_methode474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_block_in_methode476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_methode499 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_methode501 = new BitSet(new long[]{0x8001000000000000L});
	public static final BitSet FOLLOW_48_in_methode506 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_methode508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_methode533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_block_in_methode535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodeParam568 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_methodeParam570 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_methodeParam572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_selection592 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_selection594 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_selection605 = new BitSet(new long[]{0x0000158100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_selection609 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_selection612 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_selection614 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_selection621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_formalParam647 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_formalParam650 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_formalParam652 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_formalParam654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_block678 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_atomID_in_block681 = new BitSet(new long[]{0x0001C04000000000L});
	public static final BitSet FOLLOW_affectID_in_block684 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_instruction_in_block687 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_exprID_in_block708 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_block710 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_instruction_in_block712 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_47_in_block736 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_block738 = new BitSet(new long[]{0x0003000000000000L});
	public static final BitSet FOLLOW_48_in_block741 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_block743 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_block745 = new BitSet(new long[]{0x8000000000008000L});
	public static final BitSet FOLLOW_localVariable_in_block747 = new BitSet(new long[]{0x8000000000008000L});
	public static final BitSet FOLLOW_63_in_block750 = new BitSet(new long[]{0x4000148100108400L,0x00000000000000C5L});
	public static final BitSet FOLLOW_instruction_in_block752 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_49_in_block782 = new BitSet(new long[]{0x8000000000008000L});
	public static final BitSet FOLLOW_localVariable_in_block784 = new BitSet(new long[]{0x8000000000008000L});
	public static final BitSet FOLLOW_63_in_block787 = new BitSet(new long[]{0x4000148100108400L,0x00000000000000C5L});
	public static final BitSet FOLLOW_instruction_in_block789 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_instructionNoID_in_block819 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_instruction_in_block821 = new BitSet(new long[]{0x4000148100108400L,0x00000000000001C5L});
	public static final BitSet FOLLOW_72_in_block845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_localVariableID853 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_localVariableID855 = new BitSet(new long[]{0x0003000000000000L});
	public static final BitSet FOLLOW_48_in_localVariableID858 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_condExpr_in_localVariableID860 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_localVariableID864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomID_in_affect882 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_affect884 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_affect886 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_affect888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomNoID_in_affect903 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_affect905 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_affect907 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_affect909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_affectNoID932 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_affectNoID934 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_affectNoID936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExpr_in_expr949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExprID_in_exprID959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExprNoID_in_exprNoID968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_condExpr976 = new BitSet(new long[]{0x00FC000000000002L});
	public static final BitSet FOLLOW_53_in_condExpr981 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_54_in_condExpr986 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_50_in_condExpr989 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_51_in_condExpr992 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_55_in_condExpr995 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_52_in_condExpr998 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr1_in_condExpr1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1ID_in_condExprID1014 = new BitSet(new long[]{0x00FC000000000002L});
	public static final BitSet FOLLOW_53_in_condExprID1017 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_54_in_condExprID1022 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_50_in_condExprID1025 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_51_in_condExprID1028 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_55_in_condExprID1031 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_52_in_condExprID1034 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr1_in_condExprID1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1NoID_in_condExprNoID1048 = new BitSet(new long[]{0x00FC000000000002L});
	public static final BitSet FOLLOW_53_in_condExprNoID1051 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_54_in_condExprNoID1056 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_50_in_condExprNoID1059 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_51_in_condExprNoID1062 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_55_in_condExprNoID1065 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_52_in_condExprNoID1068 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr1_in_condExprNoID1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2NoID_in_expr1NoID1082 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_expr1NoID1085 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr2_in_expr1NoID1088 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_expr3NoID_in_expr2NoID1098 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expr2NoID1101 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr3_in_expr2NoID1104 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_expr4NoID_in_expr3NoID1114 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_expr3NoID1117 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr4_in_expr3NoID1120 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_expr5NoID_in_expr4NoID1130 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expr4NoID1133 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr5_in_expr4NoID1136 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_38_in_expr5NoID1147 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_expr5NoID1150 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_expr2ID_in_expr1ID1160 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_expr1ID1163 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr2_in_expr1ID1166 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_expr3ID_in_expr2ID1176 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expr2ID1179 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr3_in_expr2ID1182 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_expr4ID_in_expr3ID1192 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_expr3ID1195 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr4_in_expr3ID1198 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_expr5ID_in_expr4ID1208 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expr4ID1211 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr5_in_expr4ID1214 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_38_in_expr5ID1225 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_expr5ID1228 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_64_in_instanciation1239 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_instanciation1241 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_instanciation1243 = new BitSet(new long[]{0x0000158100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_instanciation1246 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_instanciation1249 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_instanciation1251 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_instanciation1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr11280 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_expr11283 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr2_in_expr11286 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_expr3_in_expr21297 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expr21300 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr3_in_expr21303 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_expr4_in_expr31314 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_expr31317 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr4_in_expr31320 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_expr5_in_expr41331 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expr41334 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr5_in_expr41337 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_atom_in_expr51348 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_expr51351 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_expr51354 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_atomID_in_atom1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_atom1373 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_44_in_atom1375 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_atom1378 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atom1395 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atom1423 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atom1430 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1448 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atom1455 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_39_in_atom1473 = new BitSet(new long[]{0x0100148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_atom1476 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_atom1478 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atom1486 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_56_in_atom1504 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_atom1506 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_atom1508 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_atom1510 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_atom1512 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atom1527 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_instanciation_in_atom1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_atomNoID1564 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_44_in_atomNoID1566 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTEGER_in_atomNoID1569 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atomNoID1585 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atomNoID1612 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atomNoID1619 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_STRING_in_atomNoID1636 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atomNoID1643 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_39_in_atomNoID1661 = new BitSet(new long[]{0x0100148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_atomNoID1664 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_atomNoID1666 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atomNoID1674 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_56_in_atomNoID1692 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSID_in_atomNoID1694 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_atomNoID1696 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_atomNoID1698 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_atomNoID1700 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atomNoID1715 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_instanciation_in_atomNoID1740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_instruction1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_instruction1755 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instruction1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstmt_in_instruction1766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestmt_in_instruction1775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomID_in_instruction1784 = new BitSet(new long[]{0x0001404000000000L});
	public static final BitSet FOLLOW_48_in_instruction1787 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_instruction1789 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instruction1791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprID_in_instruction1805 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instruction1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomNoID_in_instruction1824 = new BitSet(new long[]{0x0001404000000000L});
	public static final BitSet FOLLOW_exprNoID_in_instruction1827 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instruction1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affectNoID_in_instruction1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_instructionNoID1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstmt_in_instructionNoID1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestmt_in_instructionNoID1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_instructionNoID1887 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instructionNoID1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomNoID_in_instructionNoID1898 = new BitSet(new long[]{0x0001404000000000L});
	public static final BitSet FOLLOW_exprNoID_in_instructionNoID1901 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_instructionNoID1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affectNoID_in_instructionNoID1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ifstmt1941 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_ifstmt1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_ifstmt1945 = new BitSet(new long[]{0x4000148100108400L,0x00000000000000C5L});
	public static final BitSet FOLLOW_instruction_in_ifstmt1949 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifstmt1951 = new BitSet(new long[]{0x4000148100108400L,0x00000000000000C5L});
	public static final BitSet FOLLOW_instruction_in_ifstmt1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_whilestmt1987 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_whilestmt1989 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_whilestmt1991 = new BitSet(new long[]{0x4000148100108400L,0x00000000000000C5L});
	public static final BitSet FOLLOW_instruction_in_whilestmt1993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_affectID2014 = new BitSet(new long[]{0x0000148100108400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_affectID2016 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_affectID2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atomID2034 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_CLASSID_in_atomID2036 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_selection_in_atomID2048 = new BitSet(new long[]{0x0000200000000002L});
}
