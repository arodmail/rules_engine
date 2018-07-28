/** 
 * Recognizes and builds trees for the Rule Language. 
 * Results in RuleLangParser.java, RuleLangLexer.java,
 * and the token definition file RuleLang.tokens used by
 * the tree grammar to ensure token types are the same.
*/
grammar RuleLang;

options {
	language=Java;
	output=AST;
	backtrack=true;
}

@header {
	package org.cep.rulesengine.parser;
}

@lexer::header{ package org.cep.rulesengine.parser; }

@members {

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		List stack = getRuleInvocationStack(e, this.getClass().getName());
		String msg = null;
		if ( e instanceof NoViableAltException ) {
			NoViableAltException nvae = (NoViableAltException)e;
			msg = " no viable alt; token="+e.token+
			" (decision="+nvae.decisionNumber+
			" state "+nvae.stateNumber+")"+
			" decision=<<"+nvae.grammarDecisionDescription+">>";
		} else {
			msg = super.getErrorMessage(e, tokenNames);
		}
		return stack+" "+msg;
	}
	
public String getTokenErrorDisplay(Token t) {
		return t.toString();
	}

}


rule 
	:
		(statement)+ -> ^(ROOT statement)+
	;
// GRAMMAR Structure
statement
	:
		(IF condition '{' action '}')+
		    -> ^(IF condition ^(THEN action))*
		|
		(IF predicate '{' action '}')+
		    -> ^(IF predicate ^(THEN action))*
	;

predicate options { backtrack = true; }
	:
        LPAREN condition (OR condition)+ predicate? RPAREN 
            -> ^(OR condition+ predicate?)
        |		
        LPAREN condition (AND condition)+ predicate? RPAREN 
            -> ^(AND condition+ predicate?)
        |
        (OR predicate* condition)+ 
            -> ^(OR predicate? condition+) 
		|
		(AND predicate* condition)+ 
		    -> ^(AND predicate? condition+) 
	;

forstatement 
    :
        'for' '(' (varDecl=variableDeclarator) ';' 
                  (operandExpression) ';' 
                  (counter=operandExpression) 
              ')' statement
        -> ^('for' $varDecl operandExpression $counter statement*)
    ;

variableDeclarator 
    :   ID
        ('=' (operand | ruleExpression)
        )?
        -> ^(EQL ID operand* ruleExpression*)
    ;

// w/o a rewrite rule, this gives natural precedence to multiple anded conds like this: 
// ((((1 & 2) & 3) & 4) & 5) where subsequent conds become parents
//andPredicate
//	:
//		condition (AND^ condition)+ predicate?
//	;

condition options { backtrack = true; }
	:	
		equalityCondition 
		| inequalityCondition 
		| greaterThanCondition 
		| lessThanCondition
		| greaterThanOrEqualCondition 
		| lessThanOrEqualCondition
	; 

equalityCondition
	:
		LPAREN (operand | ruleExpression) EQ (operand | ruleExpression) RPAREN 
			-> ^(EQ operand* ruleExpression*)
	;
	
inequalityCondition
	:
		LPAREN (operand | ruleExpression) BANGEQ (operand | ruleExpression) RPAREN 
			-> ^(BANGEQ operand* ruleExpression*)
	;

greaterThanCondition
	:
		LPAREN (operand | ruleExpression) GT (operand | ruleExpression) RPAREN 
			-> ^(GT operand* ruleExpression*)
	;
	
lessThanCondition
	:
		LPAREN (operand | ruleExpression) LT (operand | ruleExpression) RPAREN 
			-> ^(LT operand* ruleExpression*)
	;

lessThanOrEqualCondition
	:
		LPAREN (operand | ruleExpression) LTEQ (operand | ruleExpression) RPAREN 
			-> ^(LTEQ operand* ruleExpression*)
	;
	
greaterThanOrEqualCondition
	:
		LPAREN (operand | ruleExpression) GTEQ (operand | ruleExpression) RPAREN 
			-> ^(GTEQ operand* ruleExpression*)
	;
	
operand
	:
		(valueLiteral | thisDotValue | ID | INT)
	;

// todo: precedence and new AST node
operandExpression
	:
		LPAREN (thisDotValue | ID)* (PLUS ID)+ operandExpression* RPAREN
			-> ^(PLUS thisDotValue* ID* operandExpression*)
		|
		LPAREN (thisDotValue | ID)* (SLASH ID)+ operandExpression* RPAREN
			-> ^(SLASH thisDotValue* ID* operandExpression*)
		|
		LPAREN (thisDotValue | ID)* (STAR ID)+ operandExpression* RPAREN
			-> ^(STAR thisDotValue* ID* operandExpression*)
		|
		LPAREN (thisDotValue | ID)* (MINUS ID)+ operandExpression* RPAREN
			-> ^(MINUS thisDotValue* ID* operandExpression*)
	;	

ruleExpression
	:
		 (lookupExpression | timeRollExpressionPlus | timeRollExpressionMinus | operandExpression)
	;
			
timeRollExpressionPlus
	:
		(thisDotValue | ID) PLUS ID
			-> ^(TIMEROLL ^(PLUS thisDotValue* ID*) )
	;

timeRollExpressionMinus
	:
		(thisDotValue | ID) MINUS ID 
			-> ^(TIMEROLL ^(MINUS thisDotValue* ID*) )
	;
	
lookupExpression
	:
		LOOKUP dotValue dotPropertyValuePair* dotValue?
			-> ^(LOOKUP ^(CTD dotValue) dotPropertyValuePair* ^(LEAF dotValue)? )
	;
	
dotPropertyValuePair
	:
		dotValue (LPAREN (ID | INT | valueLiteral) RPAREN) 
			-> ^(NAMEVAL ^(NAME dotValue) ^(VAL ID? INT? valueLiteral?))+
	;

thisDotValue	
	:
		THIS! dotValue 
	;

dotValue
	:
		DOT! ID
	;
	
valueLiteral
	:
		'\'' (ID (DOT ID)*) '\''
		 -> ^(LITERAL ID (DOT ID)*)
	;	
		
action
	:
		ID LPAREN actionParameters RPAREN 
			-> ^(ACTION ID ^(ARGS actionParameters))
	;
	
actionParameters
	:
		valueLiteral (',' valueLiteral)* 
			-> valueLiteral*
	;

// TOKENS

IF
	:
		'if'
	;
	
THEN
	:
		'then'
	;

LOOKUP
	:
		'lookup'
	;
	
THIS
	:
		'this'
	;
	
CTD
	:
		'ctd'
	;
		
CRITERIA
	:
		'criteria'
	;
	
NAMEVAL
	:
		'nameval'
	;
	
NAME
	:
		'name'
	;	
	
VAL
	:
		'val'
	;

LEAF
	:
		'leaf'
	;

TIMEROLL
	:
		'timeroll'
	;
	
LITERAL
	:
		'literal'
	;

ROOT
	:
		'root'
	;
	
SEC
	:
		's'
	;
	
MIN
	:
		'm'
	;

HR
	:	
		'h'
	;

ACTION
	:
		'action'
	;

ARGS
	:
		'args'
	;

ARG
	:
		'arg'
	;

INT
	:
		('0'..'9')+
	;

ID
	:	
		('a'..'z' | 'A'..'Z' | '0'..'9' | '@' | ':' | '_')+
    ;
    
DOT
	:
		'.'
	;
	
SEMI
    :   
    	';'
    ;

COMMA
    :   ','
    ;

AND :	
		'&&'
	;
	
OR	:
		'||'
	;

PLUS
    :   
    	'+'
    ;
    
MINUS
	:
		'-'
	;
	
STAR
	:
		'*'
	;
    
SLASH
	:
		'/'
	;

LPAREN	
	:	
		'('
	;
	
RPAREN	
	:	
		')'
	;

EQL
	:
		'='
	;	
EQ 	
	:	
		'=='
	;

BANGEQ
	: 
		'!='
	;

LT
	:	
		'<'
	;
	
GT
	:	
		'>'
	;

LTEQ
	:	
		'<='
	;
	
GTEQ
	:	
		'>='
	;
	
WS
	:   
		( ' ' | '\t' | '\r' | '\n') {skip();}
    ;    