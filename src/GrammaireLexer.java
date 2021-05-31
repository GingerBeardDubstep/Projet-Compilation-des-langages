// $ANTLR 3.5.2 Grammaire.g 2021-03-23 23:46:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammaireLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammaireLexer() {} 
	public GrammaireLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammaireLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Grammaire.g"; }

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:7:7: ( '&' )
			// Grammaire.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:8:7: ( '(' )
			// Grammaire.g:8:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:9:7: ( ')' )
			// Grammaire.g:9:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:10:7: ( '*' )
			// Grammaire.g:10:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:11:7: ( '+' )
			// Grammaire.g:11:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:12:7: ( ',' )
			// Grammaire.g:12:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:13:7: ( '-' )
			// Grammaire.g:13:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:14:7: ( '.' )
			// Grammaire.g:14:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:15:7: ( '/' )
			// Grammaire.g:15:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:16:7: ( ':' )
			// Grammaire.g:16:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:17:7: ( ':=' )
			// Grammaire.g:17:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:18:7: ( ';' )
			// Grammaire.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:19:7: ( '<' )
			// Grammaire.g:19:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:20:7: ( '<=' )
			// Grammaire.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:21:7: ( '<>' )
			// Grammaire.g:21:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:22:7: ( '=' )
			// Grammaire.g:22:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:23:7: ( '>' )
			// Grammaire.g:23:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:24:7: ( '>=' )
			// Grammaire.g:24:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:25:7: ( 'as' )
			// Grammaire.g:25:9: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:26:7: ( 'class' )
			// Grammaire.g:26:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:27:7: ( 'def' )
			// Grammaire.g:27:9: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:28:7: ( 'do' )
			// Grammaire.g:28:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:29:7: ( 'else' )
			// Grammaire.g:29:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:30:7: ( 'extends' )
			// Grammaire.g:30:9: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:31:7: ( 'if' )
			// Grammaire.g:31:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:32:7: ( 'is' )
			// Grammaire.g:32:9: 'is'
			{
			match("is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:33:7: ( 'new' )
			// Grammaire.g:33:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:34:7: ( 'override' )
			// Grammaire.g:34:9: 'override'
			{
			match("override"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:35:7: ( 'return' )
			// Grammaire.g:35:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:36:7: ( 'static' )
			// Grammaire.g:36:9: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:37:7: ( 'then' )
			// Grammaire.g:37:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:38:7: ( 'var' )
			// Grammaire.g:38:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:39:7: ( 'while' )
			// Grammaire.g:39:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:40:7: ( '{' )
			// Grammaire.g:40:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:41:7: ( '}' )
			// Grammaire.g:41:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:158:4: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// Grammaire.g:158:6: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Grammaire.g:158:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Grammaire.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "CLASSID"
	public final void mCLASSID() throws RecognitionException {
		try {
			int _type = CLASSID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:160:9: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// Grammaire.g:160:11: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Grammaire.g:160:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Grammaire.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASSID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:162:8: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\t' | '\\r' | ' ' | '-' | '.' | ':' | '#' | '(' | ')' | '=' | '<' | '>' | '\\\\' | '/' | '`' | ',' | ';' | '\\'' )* '\"' )
			// Grammaire.g:162:10: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\t' | '\\r' | ' ' | '-' | '.' | ':' | '#' | '(' | ')' | '=' | '<' | '>' | '\\\\' | '/' | '`' | ',' | ';' | '\\'' )* '\"'
			{
			match('\"'); 
			// Grammaire.g:162:14: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\t' | '\\r' | ' ' | '-' | '.' | ':' | '#' | '(' | ')' | '=' | '<' | '>' | '\\\\' | '/' | '`' | ',' | ';' | '\\'' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' '||LA3_0=='#'||(LA3_0 >= '\'' && LA3_0 <= ')')||(LA3_0 >= ',' && LA3_0 <= '>')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='\\'||(LA3_0 >= '`' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Grammaire.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)=='#'||(input.LA(1) >= '\'' && input.LA(1) <= ')')||(input.LA(1) >= ',' && input.LA(1) <= '>')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '`' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:163:9: ( ( '0' .. '9' )+ )
			// Grammaire.g:163:11: ( '0' .. '9' )+
			{
			// Grammaire.g:163:11: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Grammaire.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "NORMALCOMMENT"
	public final void mNORMALCOMMENT() throws RecognitionException {
		try {
			int _type = NORMALCOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:165:15: ( '/' '/' ( . )* '\\n' )
			// Grammaire.g:165:17: '/' '/' ( . )* '\\n'
			{
			match('/'); 
			match('/'); 
			// Grammaire.g:165:25: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\n') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Grammaire.g:165:25: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match('\n'); 
			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NORMALCOMMENT"

	// $ANTLR start "MULTICOMMENT"
	public final void mMULTICOMMENT() throws RecognitionException {
		try {
			int _type = MULTICOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:167:14: ( '/*' ( . )* '*/' )
			// Grammaire.g:167:16: '/*' ( . )* '*/'
			{
			match("/*"); 

			// Grammaire.g:167:21: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Grammaire.g:167:21: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTICOMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Grammaire.g:169:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// Grammaire.g:169:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// Grammaire.g:169:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Grammaire.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Grammaire.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | ID | CLASSID | STRING | INTEGER | NORMALCOMMENT | MULTICOMMENT | WS )
		int alt8=42;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Grammaire.g:1:10: T__38
				{
				mT__38(); 

				}
				break;
			case 2 :
				// Grammaire.g:1:16: T__39
				{
				mT__39(); 

				}
				break;
			case 3 :
				// Grammaire.g:1:22: T__40
				{
				mT__40(); 

				}
				break;
			case 4 :
				// Grammaire.g:1:28: T__41
				{
				mT__41(); 

				}
				break;
			case 5 :
				// Grammaire.g:1:34: T__42
				{
				mT__42(); 

				}
				break;
			case 6 :
				// Grammaire.g:1:40: T__43
				{
				mT__43(); 

				}
				break;
			case 7 :
				// Grammaire.g:1:46: T__44
				{
				mT__44(); 

				}
				break;
			case 8 :
				// Grammaire.g:1:52: T__45
				{
				mT__45(); 

				}
				break;
			case 9 :
				// Grammaire.g:1:58: T__46
				{
				mT__46(); 

				}
				break;
			case 10 :
				// Grammaire.g:1:64: T__47
				{
				mT__47(); 

				}
				break;
			case 11 :
				// Grammaire.g:1:70: T__48
				{
				mT__48(); 

				}
				break;
			case 12 :
				// Grammaire.g:1:76: T__49
				{
				mT__49(); 

				}
				break;
			case 13 :
				// Grammaire.g:1:82: T__50
				{
				mT__50(); 

				}
				break;
			case 14 :
				// Grammaire.g:1:88: T__51
				{
				mT__51(); 

				}
				break;
			case 15 :
				// Grammaire.g:1:94: T__52
				{
				mT__52(); 

				}
				break;
			case 16 :
				// Grammaire.g:1:100: T__53
				{
				mT__53(); 

				}
				break;
			case 17 :
				// Grammaire.g:1:106: T__54
				{
				mT__54(); 

				}
				break;
			case 18 :
				// Grammaire.g:1:112: T__55
				{
				mT__55(); 

				}
				break;
			case 19 :
				// Grammaire.g:1:118: T__56
				{
				mT__56(); 

				}
				break;
			case 20 :
				// Grammaire.g:1:124: T__57
				{
				mT__57(); 

				}
				break;
			case 21 :
				// Grammaire.g:1:130: T__58
				{
				mT__58(); 

				}
				break;
			case 22 :
				// Grammaire.g:1:136: T__59
				{
				mT__59(); 

				}
				break;
			case 23 :
				// Grammaire.g:1:142: T__60
				{
				mT__60(); 

				}
				break;
			case 24 :
				// Grammaire.g:1:148: T__61
				{
				mT__61(); 

				}
				break;
			case 25 :
				// Grammaire.g:1:154: T__62
				{
				mT__62(); 

				}
				break;
			case 26 :
				// Grammaire.g:1:160: T__63
				{
				mT__63(); 

				}
				break;
			case 27 :
				// Grammaire.g:1:166: T__64
				{
				mT__64(); 

				}
				break;
			case 28 :
				// Grammaire.g:1:172: T__65
				{
				mT__65(); 

				}
				break;
			case 29 :
				// Grammaire.g:1:178: T__66
				{
				mT__66(); 

				}
				break;
			case 30 :
				// Grammaire.g:1:184: T__67
				{
				mT__67(); 

				}
				break;
			case 31 :
				// Grammaire.g:1:190: T__68
				{
				mT__68(); 

				}
				break;
			case 32 :
				// Grammaire.g:1:196: T__69
				{
				mT__69(); 

				}
				break;
			case 33 :
				// Grammaire.g:1:202: T__70
				{
				mT__70(); 

				}
				break;
			case 34 :
				// Grammaire.g:1:208: T__71
				{
				mT__71(); 

				}
				break;
			case 35 :
				// Grammaire.g:1:214: T__72
				{
				mT__72(); 

				}
				break;
			case 36 :
				// Grammaire.g:1:220: ID
				{
				mID(); 

				}
				break;
			case 37 :
				// Grammaire.g:1:223: CLASSID
				{
				mCLASSID(); 

				}
				break;
			case 38 :
				// Grammaire.g:1:231: STRING
				{
				mSTRING(); 

				}
				break;
			case 39 :
				// Grammaire.g:1:238: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 40 :
				// Grammaire.g:1:246: NORMALCOMMENT
				{
				mNORMALCOMMENT(); 

				}
				break;
			case 41 :
				// Grammaire.g:1:260: MULTICOMMENT
				{
				mMULTICOMMENT(); 

				}
				break;
			case 42 :
				// Grammaire.g:1:273: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\11\uffff\1\44\1\46\1\uffff\1\51\1\uffff\1\53\14\35\21\uffff\1\73\2\35"+
		"\1\76\2\35\1\101\1\102\7\35\1\uffff\1\35\1\113\1\uffff\2\35\2\uffff\1"+
		"\116\4\35\1\123\2\35\1\uffff\1\126\1\35\1\uffff\3\35\1\133\1\uffff\1\35"+
		"\1\135\1\uffff\4\35\1\uffff\1\142\1\uffff\2\35\1\145\1\146\1\uffff\1\147"+
		"\1\35\3\uffff\1\151\1\uffff";
	static final String DFA8_eofS =
		"\152\uffff";
	static final String DFA8_minS =
		"\1\11\10\uffff\1\52\1\75\1\uffff\1\75\1\uffff\1\75\1\163\1\154\1\145\1"+
		"\154\1\146\1\145\1\166\1\145\1\164\1\150\1\141\1\150\21\uffff\1\60\1\141"+
		"\1\146\1\60\1\163\1\164\2\60\1\167\1\145\1\164\1\141\1\145\1\162\1\151"+
		"\1\uffff\1\163\1\60\1\uffff\2\145\2\uffff\1\60\1\162\1\165\1\164\1\156"+
		"\1\60\1\154\1\163\1\uffff\1\60\1\156\1\uffff\2\162\1\151\1\60\1\uffff"+
		"\1\145\1\60\1\uffff\1\144\1\151\1\156\1\143\1\uffff\1\60\1\uffff\1\163"+
		"\1\144\2\60\1\uffff\1\60\1\145\3\uffff\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\10\uffff\1\57\1\75\1\uffff\1\76\1\uffff\1\75\1\163\1\154\1\157"+
		"\1\170\1\163\1\145\1\166\1\145\1\164\1\150\1\141\1\150\21\uffff\1\172"+
		"\1\141\1\146\1\172\1\163\1\164\2\172\1\167\1\145\1\164\1\141\1\145\1\162"+
		"\1\151\1\uffff\1\163\1\172\1\uffff\2\145\2\uffff\1\172\1\162\1\165\1\164"+
		"\1\156\1\172\1\154\1\163\1\uffff\1\172\1\156\1\uffff\2\162\1\151\1\172"+
		"\1\uffff\1\145\1\172\1\uffff\1\144\1\151\1\156\1\143\1\uffff\1\172\1\uffff"+
		"\1\163\1\144\2\172\1\uffff\1\172\1\145\3\uffff\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\14\1\uffff\1\20\15"+
		"\uffff\1\42\1\43\1\44\1\45\1\46\1\47\1\52\1\50\1\51\1\11\1\13\1\12\1\16"+
		"\1\17\1\15\1\22\1\21\17\uffff\1\23\2\uffff\1\26\2\uffff\1\31\1\32\10\uffff"+
		"\1\25\2\uffff\1\33\4\uffff\1\40\2\uffff\1\27\4\uffff\1\37\1\uffff\1\24"+
		"\4\uffff\1\41\2\uffff\1\35\1\36\1\30\1\uffff\1\34";
	static final String DFA8_specialS =
		"\152\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\uffff\1\37\3\uffff\1\1\1\uffff\1\2"+
			"\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\40\1\12\1\13\1\14\1\15\1\16\2\uffff"+
			"\32\36\6\uffff\1\17\1\35\1\20\1\21\1\22\3\35\1\23\4\35\1\24\1\25\2\35"+
			"\1\26\1\27\1\30\1\35\1\31\1\32\3\35\1\33\1\uffff\1\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\43\4\uffff\1\42",
			"\1\45",
			"",
			"\1\47\1\50",
			"",
			"\1\52",
			"\1\54",
			"\1\55",
			"\1\56\11\uffff\1\57",
			"\1\60\13\uffff\1\61",
			"\1\62\14\uffff\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\74",
			"\1\75",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\77",
			"\1\100",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"\1\112",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\1\114",
			"\1\115",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\124",
			"\1\125",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\127",
			"",
			"\1\130",
			"\1\131",
			"\1\132",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\1\134",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\1\143",
			"\1\144",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\150",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | ID | CLASSID | STRING | INTEGER | NORMALCOMMENT | MULTICOMMENT | WS );";
		}
	}

}
