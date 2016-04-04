grammar IArithmeticExpr;

options{
    language = Java;
    output = AST;
    ASTLabelType = CommonTree;
}

tokens{
    PROG; STAT; NUMBER; VARIABLE; CALL; NEGATE;
}

@header {package net.sf.iexpr.arithmetic.parser;}
@lexer::header {package net.sf.iexpr.arithmetic.parser;}

@lexer::members {
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        String header = getErrorHeader(e);
        String message = getErrorMessage(e, tokenNames);
        throw new RuntimeException(header + ":" + message);
    }
}

@parser::members {
    @Override
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        String header = getErrorHeader(e);
        String message = getErrorMessage(e, tokenNames);
        throw new RuntimeException(header + ":" + message);
    }
}

//PROG as root node
prog : stat -> ^(PROG stat);

//STAT as root node
stat : expr EOF -> ^(STAT expr);

//plus/minus opt as root node
expr
options {
    backtrack = true;
}
: multExpr ((PLUS | MINUS)^ multExpr)*
;

// mult/div/mode as root node
multExpr 
: negationExpr ((MULT | DIV | MOD)^ negationExpr)*;

// nagative opt
negationExpr 
: (op='-')? primary -> {$op != null}? ^(NEGATE primary) ->primary;	

primary 
: atom | '(' expr ')' -> expr;

atom
options {
    backtrack = true;
}
: NUM -> ^(NUMBER NUM)
| FUNC '(' exprList ')' -> ^(CALL ^(FUNC exprList))
|	VAR  -> ^(VARIABLE VAR)
;

exprList 
: (expr (',' expr)*)? -> expr*
;

PLUS 	:	'+';
MINUS	:	'-';
MULT	:	'*';
DIV	:	'/';		
MOD	:	'%';

NUM
: DIGIT+ '.' DIGIT*
| '.'? DIGIT
;

fragment DIGIT
: ('0'..'9')
;

VAR 
: '"' DoubleStringCharacter* '"'
| '\'' SingleStringCharacter* '\''
| REF '."' DoubleStringCharacter* '"'
| REF '.\'' SingleStringCharacter '.\''
;

fragment DoubleStringCharacter
: ~('"' | '\\' | LT)
| '\\' EscapeSequence
;

fragment SingleStringCharacter
: ~('\'' | '\\' | LT)
| '\\' EscapeSequence
;

fragment EscapeSequence
: '\'' | '"' | '\\'
;

LT
: '\n'      //Line feed
| '\r'	    //Carriage return
| '\u2028'  //Line separator
| '\u2029'  //Paragraph separator
;

FUNC 	:	('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
REF	:	'$' ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
NEWLINE	:	'\r' ? '\n';
WS	:	(' ' | '\t' | '\n' | '\r')+ {skip();};