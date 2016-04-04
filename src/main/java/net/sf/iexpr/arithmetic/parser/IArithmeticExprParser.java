// $ANTLR 3.5.1 F:\\Framework\\antlr\\IArithmeticExpr.g 2016-04-04 18:25:53
package net.sf.iexpr.arithmetic.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class IArithmeticExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "DIGIT", "DIV", "DoubleStringCharacter", 
		"EscapeSequence", "FUNC", "LT", "MINUS", "MOD", "MULT", "NEGATE", "NEWLINE", 
		"NUM", "NUMBER", "PLUS", "PROG", "REF", "STAT", "SingleStringCharacter", 
		"VAR", "VARIABLE", "WS", "'('", "')'", "','"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public IArithmeticExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public IArithmeticExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return IArithmeticExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "F:\\Framework\\antlr\\IArithmeticExpr.g"; }


	    @Override
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	        String header = getErrorHeader(e);
	        String message = getErrorMessage(e, tokenNames);
	        throw new RuntimeException(header + ":" + message);
	    }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:34:1: prog : stat -> ^( PROG stat ) ;
	public final IArithmeticExprParser.prog_return prog() throws RecognitionException {
		IArithmeticExprParser.prog_return retval = new IArithmeticExprParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:34:6: ( stat -> ^( PROG stat ) )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:34:8: stat
			{
			pushFollow(FOLLOW_stat_in_prog108);
			stat1=stat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_stat.add(stat1.getTree());
			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 34:13: -> ^( PROG stat )
			{
				// F:\\Framework\\antlr\\IArithmeticExpr.g:34:16: ^( PROG stat )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
				adaptor.addChild(root_1, stream_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:37:1: stat : expr EOF -> ^( STAT expr ) ;
	public final IArithmeticExprParser.stat_return stat() throws RecognitionException {
		IArithmeticExprParser.stat_return retval = new IArithmeticExprParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope expr2 =null;

		CommonTree EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:37:6: ( expr EOF -> ^( STAT expr ) )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:37:8: expr EOF
			{
			pushFollow(FOLLOW_expr_in_stat125);
			expr2=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_stat127); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:17: -> ^( STAT expr )
			{
				// F:\\Framework\\antlr\\IArithmeticExpr.g:37:20: ^( STAT expr )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STAT, "STAT"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:40:1: expr options {backtrack=true; } : multExpr ( ( PLUS | MINUS ) ^ multExpr )* ;
	public final IArithmeticExprParser.expr_return expr() throws RecognitionException {
		IArithmeticExprParser.expr_return retval = new IArithmeticExprParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set5=null;
		ParserRuleReturnScope multExpr4 =null;
		ParserRuleReturnScope multExpr6 =null;

		CommonTree set5_tree=null;

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:44:3: ( multExpr ( ( PLUS | MINUS ) ^ multExpr )* )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:44:3: multExpr ( ( PLUS | MINUS ) ^ multExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr159);
			multExpr4=multExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr4.getTree());

			// F:\\Framework\\antlr\\IArithmeticExpr.g:44:12: ( ( PLUS | MINUS ) ^ multExpr )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MINUS||LA1_0==PLUS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:44:13: ( PLUS | MINUS ) ^ multExpr
					{
					set5=input.LT(1);
					set5=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set5), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr171);
					multExpr6=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr6.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:48:1: multExpr : negationExpr ( ( MULT | DIV | MOD ) ^ negationExpr )* ;
	public final IArithmeticExprParser.multExpr_return multExpr() throws RecognitionException {
		IArithmeticExprParser.multExpr_return retval = new IArithmeticExprParser.multExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set8=null;
		ParserRuleReturnScope negationExpr7 =null;
		ParserRuleReturnScope negationExpr9 =null;

		CommonTree set8_tree=null;

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:49:3: ( negationExpr ( ( MULT | DIV | MOD ) ^ negationExpr )* )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:49:3: negationExpr ( ( MULT | DIV | MOD ) ^ negationExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_negationExpr_in_multExpr184);
			negationExpr7=negationExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, negationExpr7.getTree());

			// F:\\Framework\\antlr\\IArithmeticExpr.g:49:16: ( ( MULT | DIV | MOD ) ^ negationExpr )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DIV||(LA2_0 >= MOD && LA2_0 <= MULT)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:49:17: ( MULT | DIV | MOD ) ^ negationExpr
					{
					set8=input.LT(1);
					set8=input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set8), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_negationExpr_in_multExpr200);
					negationExpr9=negationExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, negationExpr9.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class negationExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negationExpr"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:52:1: negationExpr : (op= '-' )? primary -> {$op != null}? ^( NEGATE primary ) -> primary ;
	public final IArithmeticExprParser.negationExpr_return negationExpr() throws RecognitionException {
		IArithmeticExprParser.negationExpr_return retval = new IArithmeticExprParser.negationExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token op=null;
		ParserRuleReturnScope primary10 =null;

		CommonTree op_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:53:3: ( (op= '-' )? primary -> {$op != null}? ^( NEGATE primary ) -> primary )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:53:3: (op= '-' )? primary
			{
			// F:\\Framework\\antlr\\IArithmeticExpr.g:53:3: (op= '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MINUS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:53:4: op= '-'
					{
					op=(Token)match(input,MINUS,FOLLOW_MINUS_in_negationExpr215); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(op);

					}
					break;

			}

			pushFollow(FOLLOW_primary_in_negationExpr219);
			primary10=primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primary.add(primary10.getTree());
			// AST REWRITE
			// elements: primary, primary
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 53:21: -> {$op != null}? ^( NEGATE primary )
			if (op != null) {
				// F:\\Framework\\antlr\\IArithmeticExpr.g:53:39: ^( NEGATE primary )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEGATE, "NEGATE"), root_1);
				adaptor.addChild(root_1, stream_primary.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 53:57: -> primary
			{
				adaptor.addChild(root_0, stream_primary.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negationExpr"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:55:1: primary : ( atom | '(' expr ')' -> expr );
	public final IArithmeticExprParser.primary_return primary() throws RecognitionException {
		IArithmeticExprParser.primary_return retval = new IArithmeticExprParser.primary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		Token char_literal14=null;
		ParserRuleReturnScope atom11 =null;
		ParserRuleReturnScope expr13 =null;

		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:56:3: ( atom | '(' expr ')' -> expr )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==FUNC||LA4_0==NUM||LA4_0==VAR) ) {
				alt4=1;
			}
			else if ( (LA4_0==26) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:56:3: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary242);
					atom11=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom11.getTree());

					}
					break;
				case 2 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:56:10: '(' expr ')'
					{
					char_literal12=(Token)match(input,26,FOLLOW_26_in_primary246); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_26.add(char_literal12);

					pushFollow(FOLLOW_expr_in_primary248);
					expr13=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr13.getTree());
					char_literal14=(Token)match(input,27,FOLLOW_27_in_primary250); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_27.add(char_literal14);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 56:23: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:58:1: atom options {backtrack=true; } : ( NUM -> ^( NUMBER NUM ) | FUNC '(' exprList ')' -> ^( CALL ^( FUNC exprList ) ) | VAR -> ^( VARIABLE VAR ) );
	public final IArithmeticExprParser.atom_return atom() throws RecognitionException {
		IArithmeticExprParser.atom_return retval = new IArithmeticExprParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUM15=null;
		Token FUNC16=null;
		Token char_literal17=null;
		Token char_literal19=null;
		Token VAR20=null;
		ParserRuleReturnScope exprList18 =null;

		CommonTree NUM15_tree=null;
		CommonTree FUNC16_tree=null;
		CommonTree char_literal17_tree=null;
		CommonTree char_literal19_tree=null;
		CommonTree VAR20_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_FUNC=new RewriteRuleTokenStream(adaptor,"token FUNC");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:62:3: ( NUM -> ^( NUMBER NUM ) | FUNC '(' exprList ')' -> ^( CALL ^( FUNC exprList ) ) | VAR -> ^( VARIABLE VAR ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt5=1;
				}
				break;
			case FUNC:
				{
				alt5=2;
				}
				break;
			case VAR:
				{
				alt5=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:62:3: NUM
					{
					NUM15=(Token)match(input,NUM,FOLLOW_NUM_in_atom277); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUM.add(NUM15);

					// AST REWRITE
					// elements: NUM
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 62:7: -> ^( NUMBER NUM )
					{
						// F:\\Framework\\antlr\\IArithmeticExpr.g:62:10: ^( NUMBER NUM )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMBER, "NUMBER"), root_1);
						adaptor.addChild(root_1, stream_NUM.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:63:3: FUNC '(' exprList ')'
					{
					FUNC16=(Token)match(input,FUNC,FOLLOW_FUNC_in_atom289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FUNC.add(FUNC16);

					char_literal17=(Token)match(input,26,FOLLOW_26_in_atom291); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_26.add(char_literal17);

					pushFollow(FOLLOW_exprList_in_atom293);
					exprList18=exprList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprList.add(exprList18.getTree());
					char_literal19=(Token)match(input,27,FOLLOW_27_in_atom295); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_27.add(char_literal19);

					// AST REWRITE
					// elements: FUNC, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 63:25: -> ^( CALL ^( FUNC exprList ) )
					{
						// F:\\Framework\\antlr\\IArithmeticExpr.g:63:28: ^( CALL ^( FUNC exprList ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
						// F:\\Framework\\antlr\\IArithmeticExpr.g:63:35: ^( FUNC exprList )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_FUNC.nextNode(), root_2);
						adaptor.addChild(root_2, stream_exprList.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:64:3: VAR
					{
					VAR20=(Token)match(input,VAR,FOLLOW_VAR_in_atom311); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR20);

					// AST REWRITE
					// elements: VAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 64:8: -> ^( VARIABLE VAR )
					{
						// F:\\Framework\\antlr\\IArithmeticExpr.g:64:11: ^( VARIABLE VAR )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);
						adaptor.addChild(root_1, stream_VAR.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class exprList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// F:\\Framework\\antlr\\IArithmeticExpr.g:67:1: exprList : ( expr ( ',' expr )* )? -> ( expr )* ;
	public final IArithmeticExprParser.exprList_return exprList() throws RecognitionException {
		IArithmeticExprParser.exprList_return retval = new IArithmeticExprParser.exprList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal22=null;
		ParserRuleReturnScope expr21 =null;
		ParserRuleReturnScope expr23 =null;

		CommonTree char_literal22_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// F:\\Framework\\antlr\\IArithmeticExpr.g:68:3: ( ( expr ( ',' expr )* )? -> ( expr )* )
			// F:\\Framework\\antlr\\IArithmeticExpr.g:68:3: ( expr ( ',' expr )* )?
			{
			// F:\\Framework\\antlr\\IArithmeticExpr.g:68:3: ( expr ( ',' expr )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==FUNC||LA7_0==MINUS||LA7_0==NUM||LA7_0==VAR||LA7_0==26) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// F:\\Framework\\antlr\\IArithmeticExpr.g:68:4: expr ( ',' expr )*
					{
					pushFollow(FOLLOW_expr_in_exprList331);
					expr21=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr21.getTree());
					// F:\\Framework\\antlr\\IArithmeticExpr.g:68:9: ( ',' expr )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==28) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// F:\\Framework\\antlr\\IArithmeticExpr.g:68:10: ',' expr
							{
							char_literal22=(Token)match(input,28,FOLLOW_28_in_exprList334); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_28.add(char_literal22);

							pushFollow(FOLLOW_expr_in_exprList336);
							expr23=expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr.add(expr23.getTree());
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 68:23: -> ( expr )*
			{
				// F:\\Framework\\antlr\\IArithmeticExpr.g:68:26: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprList"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat125 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_stat127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr159 = new BitSet(new long[]{0x0000000000040802L});
	public static final BitSet FOLLOW_set_in_expr162 = new BitSet(new long[]{0x0000000004810A00L});
	public static final BitSet FOLLOW_multExpr_in_expr171 = new BitSet(new long[]{0x0000000000040802L});
	public static final BitSet FOLLOW_negationExpr_in_multExpr184 = new BitSet(new long[]{0x0000000000003042L});
	public static final BitSet FOLLOW_set_in_multExpr187 = new BitSet(new long[]{0x0000000004810A00L});
	public static final BitSet FOLLOW_negationExpr_in_multExpr200 = new BitSet(new long[]{0x0000000000003042L});
	public static final BitSet FOLLOW_MINUS_in_negationExpr215 = new BitSet(new long[]{0x0000000004810200L});
	public static final BitSet FOLLOW_primary_in_negationExpr219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_primary246 = new BitSet(new long[]{0x0000000004810A00L});
	public static final BitSet FOLLOW_expr_in_primary248 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_primary250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_in_atom289 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_atom291 = new BitSet(new long[]{0x000000000C810A00L});
	public static final BitSet FOLLOW_exprList_in_atom293 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_atom295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList331 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_exprList334 = new BitSet(new long[]{0x0000000004810A00L});
	public static final BitSet FOLLOW_expr_in_exprList336 = new BitSet(new long[]{0x0000000010000002L});
}
