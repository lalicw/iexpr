// $ANTLR 3.5.1 F:\\Framework\\antlr\\IArithmeticExpr.g 2016-04-04 18:25:53
package net.sf.iexpr.arithmetic.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class IArithmeticExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int CALL=4;
	public static final int DIGIT=5;
	public static final int DIV=6;
	public static final int DoubleStringCharacter=7;
	public static final int EscapeSequence=8;
	public static final int FUNC=9;
	public static final int LT=10;
	public static final int MINUS=11;
	public static final int MOD=12;
	public static final int MULT=13;
	public static final int NEGATE=14;
	public static final int NEWLINE=15;
	public static final int NUM=16;
	public static final int NUMBER=17;
	public static final int PLUS=18;
	public static final int PROG=19;
	public static final int REF=20;
	public static final int STAT=21;
	public static final int SingleStringCharacter=22;
	public static final int VAR=23;
	public static final int VARIABLE=24;
	public static final int WS=25;

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	        String header = getErrorHeader(e);
	        String message = getErrorMessage(e, tokenNames);
	        throw new RuntimeException(header + ":" + message);
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public IArithmeticExprLexer() {} 
	public IArithmeticExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public IArithmeticExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "F:\\Framework\\antlr\\IArithmeticExpr.g"; }

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:16:7: ( '(' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:16:9: '('
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:17:7: ( ')' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:17:9: ')'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:18:7: ( ',' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:18:9: ','
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
	// $ANTLR end "T__28"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:71:7: ( '+' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:71:9: '+'
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
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:72:7: ( '-' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:72:9: '-'
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
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:73:6: ( '*' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:73:8: '*'
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
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:74:5: ( '/' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:74:7: '/'
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
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:75:5: ( '%' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:75:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:78:3: ( ( DIGIT )+ '.' ( DIGIT )* | ( '.' )? DIGIT )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='.'||(LA4_1 >= '0' && LA4_1 <= '9')) ) {
					alt4=1;
				}

				else {
					alt4=2;
				}

			}
			else if ( (LA4_0=='.') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:78:3: ( DIGIT )+ '.' ( DIGIT )*
					{
					// F:\\Framework\\antlr\\IArithmeticExpr.g:78:3: ( DIGIT )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:
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
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					match('.'); 
					// F:\\Framework\\antlr\\IArithmeticExpr.g:78:14: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:
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
							break loop2;
						}
					}

					}
					break;
				case 2 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:79:3: ( '.' )? DIGIT
					{
					// F:\\Framework\\antlr\\IArithmeticExpr.g:79:3: ( '.' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='.') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:79:3: '.'
							{
							match('.'); 
							}
							break;

					}

					mDIGIT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:83:3: ( ( '0' .. '9' ) )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:87:3: ( '\"' ( DoubleStringCharacter )* '\"' | '\\'' ( SingleStringCharacter )* '\\'' | REF '.\"' ( DoubleStringCharacter )* '\"' | REF '.\\'' SingleStringCharacter '.\\'' )
			int alt8=4;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:87:3: '\"' ( DoubleStringCharacter )* '\"'
					{
					match('\"'); 
					// F:\\Framework\\antlr\\IArithmeticExpr.g:87:7: ( DoubleStringCharacter )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\u2027')||(LA5_0 >= '\u202A' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:87:7: DoubleStringCharacter
							{
							mDoubleStringCharacter(); 

							}
							break;

						default :
							break loop5;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:88:3: '\\'' ( SingleStringCharacter )* '\\''
					{
					match('\''); 
					// F:\\Framework\\antlr\\IArithmeticExpr.g:88:8: ( SingleStringCharacter )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '\u2027')||(LA6_0 >= '\u202A' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:88:8: SingleStringCharacter
							{
							mSingleStringCharacter(); 

							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}
					break;
				case 3 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:89:3: REF '.\"' ( DoubleStringCharacter )* '\"'
					{
					mREF(); 

					match(".\""); 

					// F:\\Framework\\antlr\\IArithmeticExpr.g:89:12: ( DoubleStringCharacter )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\u2027')||(LA7_0 >= '\u202A' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:89:12: DoubleStringCharacter
							{
							mDoubleStringCharacter(); 

							}
							break;

						default :
							break loop7;
						}
					}

					match('\"'); 
					}
					break;
				case 4 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:90:3: REF '.\\'' SingleStringCharacter '.\\''
					{
					mREF(); 

					match(".'"); 

					mSingleStringCharacter(); 

					match(".'"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "DoubleStringCharacter"
	public final void mDoubleStringCharacter() throws RecognitionException {
		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:94:3: (~ ( '\"' | '\\\\' | LT ) | '\\\\' EscapeSequence )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\u2027')||(LA9_0 >= '\u202A' && LA9_0 <= '\uFFFF')) ) {
				alt9=1;
			}
			else if ( (LA9_0=='\\') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:94:3: ~ ( '\"' | '\\\\' | LT )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:95:3: '\\\\' EscapeSequence
					{
					match('\\'); 
					mEscapeSequence(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DoubleStringCharacter"

	// $ANTLR start "SingleStringCharacter"
	public final void mSingleStringCharacter() throws RecognitionException {
		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:99:3: (~ ( '\\'' | '\\\\' | LT ) | '\\\\' EscapeSequence )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\u2027')||(LA10_0 >= '\u202A' && LA10_0 <= '\uFFFF')) ) {
				alt10=1;
			}
			else if ( (LA10_0=='\\') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:99:3: ~ ( '\\'' | '\\\\' | LT )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:100:3: '\\\\' EscapeSequence
					{
					match('\\'); 
					mEscapeSequence(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SingleStringCharacter"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:104:3: ( '\\'' | '\"' | '\\\\' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:108:3: ( '\\n' | '\\r' | '\\u2028' | '\\u2029' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:
			{
			if ( input.LA(1)=='\n'||input.LA(1)=='\r'||(input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "FUNC"
	public final void mFUNC() throws RecognitionException {
		try {
			int _type = FUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:114:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:114:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// F:\\Framework\\antlr\\IArithmeticExpr.g:114:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||LA11_0=='_'||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop11;
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
	// $ANTLR end "FUNC"

	// $ANTLR start "REF"
	public final void mREF() throws RecognitionException {
		try {
			int _type = REF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:115:5: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:115:7: '$' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			match('$'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// F:\\Framework\\antlr\\IArithmeticExpr.g:115:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop12;
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
	// $ANTLR end "REF"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:116:9: ( ( '\\r' )? '\\n' )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:116:11: ( '\\r' )? '\\n'
			{
			// F:\\Framework\\antlr\\IArithmeticExpr.g:116:11: ( '\\r' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\r') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:116:11: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Framework\\antlr\\IArithmeticExpr.g:117:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:117:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// F:\\Framework\\antlr\\IArithmeticExpr.g:117:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			skip();
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
		// F:\\Framework\\antlr\\IArithmeticExpr.g:1:8: ( T__26 | T__27 | T__28 | PLUS | MINUS | MULT | DIV | MOD | NUM | VAR | LT | FUNC | REF | NEWLINE | WS )
		int alt15=15;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:10: T__26
				{
				mT__26(); 

				}
				break;
			case 2 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:16: T__27
				{
				mT__27(); 

				}
				break;
			case 3 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:22: T__28
				{
				mT__28(); 

				}
				break;
			case 4 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:28: PLUS
				{
				mPLUS(); 

				}
				break;
			case 5 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:33: MINUS
				{
				mMINUS(); 

				}
				break;
			case 6 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:39: MULT
				{
				mMULT(); 

				}
				break;
			case 7 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:44: DIV
				{
				mDIV(); 

				}
				break;
			case 8 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:48: MOD
				{
				mMOD(); 

				}
				break;
			case 9 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:52: NUM
				{
				mNUM(); 

				}
				break;
			case 10 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:56: VAR
				{
				mVAR(); 

				}
				break;
			case 11 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:60: LT
				{
				mLT(); 

				}
				break;
			case 12 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:63: FUNC
				{
				mFUNC(); 

				}
				break;
			case 13 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:68: REF
				{
				mREF(); 

				}
				break;
			case 14 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:72: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 15 :
				// F:\\Framework\\antlr\\IArithmeticExpr.g:1:80: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA8_eotS =
		"\11\uffff";
	static final String DFA8_eofS =
		"\11\uffff";
	static final String DFA8_minS =
		"\1\42\2\uffff\1\101\2\56\1\42\2\uffff";
	static final String DFA8_maxS =
		"\1\47\2\uffff\3\172\1\47\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\4\uffff\1\3\1\4";
	static final String DFA8_specialS =
		"\11\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\1\1\uffff\1\3\2\uffff\1\2",
			"",
			"",
			"\32\4\6\uffff\32\4",
			"\1\6\1\uffff\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
			"\1\6\1\uffff\12\5\7\uffff\32\5\4\uffff\1\5\1\uffff\32\5",
			"\1\7\4\uffff\1\10",
			"",
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
			return "86:1: VAR : ( '\"' ( DoubleStringCharacter )* '\"' | '\\'' ( SingleStringCharacter )* '\\'' | REF '.\"' ( DoubleStringCharacter )* '\"' | REF '.\\'' SingleStringCharacter '.\\'' );";
		}
	}

	static final String DFA15_eotS =
		"\14\uffff\1\17\1\uffff\1\17\2\uffff\1\24\1\25\1\24\2\uffff";
	static final String DFA15_eofS =
		"\26\uffff";
	static final String DFA15_minS =
		"\1\11\12\uffff\1\101\1\11\1\uffff\1\11\2\uffff\1\56\1\11\1\56\2\uffff";
	static final String DFA15_maxS =
		"\1\u2029\12\uffff\1\172\1\40\1\uffff\1\40\2\uffff\1\172\1\40\1\172\2\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\14\1\uffff"+
		"\1\13\1\17\3\uffff\1\15\1\16";
	static final String DFA15_specialS =
		"\26\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\20\1\16\2\uffff\1\14\22\uffff\1\20\1\uffff\1\12\1\uffff\1\13\1\10"+
			"\1\uffff\1\12\1\1\1\2\1\6\1\4\1\3\1\5\1\11\1\7\12\11\7\uffff\32\15\6"+
			"\uffff\32\15\u1fad\uffff\2\17",
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
			"\32\21\6\uffff\32\21",
			"\1\20\1\22\2\uffff\1\20\22\uffff\1\20",
			"",
			"\2\20\2\uffff\1\20\22\uffff\1\20",
			"",
			"",
			"\1\12\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\2\20\2\uffff\1\20\22\uffff\1\20",
			"\1\12\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__26 | T__27 | T__28 | PLUS | MINUS | MULT | DIV | MOD | NUM | VAR | LT | FUNC | REF | NEWLINE | WS );";
		}
	}

}
