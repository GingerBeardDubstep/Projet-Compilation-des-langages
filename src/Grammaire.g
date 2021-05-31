grammar Grammaire;

options {language = Java; output = AST; k=1; backtrack = false;}
		
tokens {ROOT; AS;INSTANCIATION;FORMALPARAM;AFFECT;METHODEPARAM;
LOCALVARIABLE;VARIABLECLASSE;VARIABLECLASSEINIT;METHODE;SELECTION;RETURN;CLASS;CLASSBLOCK;CONSTRUCTOR;MESSAGE;IF;BLOCK;
ATOMID;EXPR;INSTEXPR;INSTRUCTION;WHILE;SIGNEDINTEGER;THEN;ELSE;LOCALVARIABLEINIT;}
		
program : declaration -> ^(ROOT declaration);

declaration : (classe)* block -> classe* block
	;

classe : 'class' name=CLASSID '(' (formalParam (',' formalParam)* )? ')' ('extends' superc=CLASSID)? 'is' classBlock 
-> ^(CLASS $name formalParam* $superc? classBlock)
	;

classBlock : '{' variableClasse* affect* constructor methode* '}' -> ^(CLASSBLOCK constructor variableClasse* methode* affect*)
	;

constructor : 'def' name=CLASSID '(' (formalParam (',' formalParam)* )? ')' (':' superc=CLASSID '('(condExpr (',' condExpr)* )?')')? 'is' block
	-> ^(CONSTRUCTOR $name $superc? formalParam* condExpr* block)
	;
			
variableClasse : 'var' 'static'? ID ':' CLASSID (':=' expr ';' -> ^(VARIABLECLASSEINIT ID CLASSID 'var'? 'static'? expr)
	|';' -> ^(VARIABLECLASSE ID CLASSID 'var'? 'static'?) )
	 ;

localVariable : ID ':' CLASSID (':=' condExpr ';' -> ^(LOCALVARIABLEINIT ID CLASSID condExpr)|
	';' -> ^(LOCALVARIABLE ID CLASSID))
	 ;

methode : 'def' 'static'? 'override'? ID '(' (methodeParam (',' methodeParam)* )? ')' 
('is' block -> ^(METHODE ID 'static'? 'override'? methodeParam* block)|
 ':' CLASSID 
 (':=' condExpr -> ^(METHODE ID 'static'? 'override'? methodeParam* CLASSID condExpr)| 
'is' block -> ^(METHODE ID 'static'? 'override'? methodeParam* CLASSID block)))
	;

methodeParam : ID ':' CLASSID -> ^(METHODEPARAM ID CLASSID)
	;

selection : '.' ID (-> ^(SELECTION ID)|'(' ( condExpr (',' condExpr)* )? ')' -> ^(MESSAGE ID condExpr*)) 
	;
			
formalParam : 'var'? ID ':' CLASSID -> ^(FORMALPARAM 'var'? ID CLASSID)
	;

block : 	'{' (atomID (affectID  instruction* -> ^(BLOCK ^(AFFECT atomID affectID) instruction*)|
exprID ';' instruction* -> ^(BLOCK ^(INSTEXPR atomID exprID?) instruction*)|

 ':' CLASSID (':=' condExpr ';' localVariable* 'is' instruction+ -> ^(BLOCK ^(LOCALVARIABLEINIT atomID CLASSID condExpr) 
 localVariable* instruction+) |
 ';' localVariable* 'is' instruction+ -> ^(BLOCK ^(LOCALVARIABLE atomID CLASSID) localVariable* instruction+)))|
 
  instructionNoID instruction* -> ^(BLOCK instructionNoID instruction*)|
  -> ^(BLOCK)) '}';

localVariableID : ':' CLASSID (':=' condExpr)? ';' -> CLASSID condExpr?
	 ;

affect : atomID ':=' expr ';' -> ^(AFFECT atomID expr)
	| atomNoID ':=' expr ';' -> ^(AFFECT atomNoID expr)
	 ;
	 
affectNoID : ':=' expr ';' -> expr;


expr : condExpr;
	
exprID :  condExprID;
	
exprNoID : condExprNoID;

condExpr : expr1 ( ('='^ | '>'^|'<'^|'<='^|'>='^|'<>'^) expr1 )? ;

condExprID : expr1ID(('='^ | '>'^|'<'^|'<='^|'>='^|'<>'^) expr1)?;

condExprNoID : expr1NoID(('='^ | '>'^|'<'^|'<='^|'>='^|'<>'^) expr1)?;

expr1NoID : expr2NoID ('+'^ expr2)*;

expr2NoID : expr3NoID ('-'^ expr3)*;

expr3NoID : expr4NoID ('*'^ expr4)*;

expr4NoID : expr5NoID ('/'^ expr5)*;

expr5NoID : ('&'^ atom)*;

expr1ID : expr2ID ('+'^ expr2)*;

expr2ID : expr3ID ('-'^ expr3)*;

expr3ID : expr4ID ('*'^ expr4)*;

expr4ID : expr5ID ('/'^ expr5)*;

expr5ID : ('&'^ atom)*;
	
instanciation : 'new' CLASSID '(' (expr (',' expr)* )? ')' -> ^(INSTANCIATION CLASSID expr*)
	;
	
expr1 : expr2 ('+'^ expr2)* ;

expr2 : expr3 ('-'^ expr3)* ;

expr3 : expr4 ('*'^ expr4)* ;

expr4 : expr5 ('/'^ expr5)* ;

expr5 : atom ('&'^ atom)* ; //Seulement pour les String

atom : atomID 
	| ('+'|'-') INTEGER (-> ^(SIGNEDINTEGER '+'? '-'? INTEGER)|selection+ -> ^(ATOMID ^(SIGNEDINTEGER '+'? '-'? INTEGER) selection+))
	| INTEGER (-> INTEGER|selection+ -> ^(ATOMID INTEGER selection+))
	| STRING (-> STRING|selection+ -> ^(ATOMID STRING selection+))
	| '(' (expr ')' (-> expr| selection+ -> ^(ATOMID expr selection+) ) | 'as' CLASSID ':' expr ')' (-> ^(AS CLASSID expr) | selection+ -> ^(ATOMID ^(AS CLASSID expr) selection+)))
	| instanciation
	;
	
atomNoID : ('+'|'-') INTEGER (->^(SIGNEDINTEGER '+'? '-'? INTEGER)|selection+ -> ^(ATOMID ^(SIGNEDINTEGER '+'? '-'? INTEGER) selection+))
	|INTEGER (-> INTEGER|selection+ -> ^(ATOMID INTEGER selection+))
	|STRING (-> STRING|selection+ -> ^(ATOMID STRING selection+))
	| '(' (expr ')' (-> expr| selection+ -> ^(ATOMID expr selection+) ) | 'as' CLASSID ':' expr ')' (-> ^(AS CLASSID expr) | selection+ -> ^(ATOMID ^(AS CLASSID expr) selection+)))
	| instanciation
	;
	
instruction : block
	|'return' ';' -> 'return'
	| ifstmt -> ifstmt
	| whilestmt -> whilestmt
	| atomID (':=' expr ';' -> ^(AFFECT atomID expr) | exprID ';' -> ^(INSTEXPR atomID exprID?))
	| atomNoID (exprNoID ';' -> ^(INSTEXPR atomNoID exprNoID?) | affectNoID -> ^(AFFECT atomNoID affectNoID))
	;

instructionNoID : block
	|ifstmt -> ifstmt
	| whilestmt -> whilestmt
	| 'return' ';' -> 'return'
	| atomNoID (exprNoID ';' -> ^(INSTEXPR atomNoID exprNoID?) | affectNoID -> ^(AFFECT atomNoID affectNoID))
	;
	

ifstmt : 'if' expr 'then' thenif=instruction 'else' elseif=instruction -> ^(IF expr ^(THEN $thenif) ^(ELSE $elseif))
	;

whilestmt : 'while' expr 'do' instruction -> ^(WHILE expr instruction)
	;
	
affectID : ':=' expr ';' -> expr
	;
	
atomID : (ID|CLASSID) (-> ID? CLASSID?|selection+ -> ^(ATOMID ID? CLASSID? selection+))  
	; //On refactorise pour que ca ne soit pas ambigu
	

ID : ('a'..'z')('a'..'z' | 'A'..'Z' | '0'..'9')*;

CLASSID : ('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;

STRING : '"' ('a'..'z'|'A'..'Z'|'0'..'9'|'\t'|'\r'|' '|'-'|'.'|':'|'#'|'('|')'|'='|'<'|'>'|'\\'|'/'|'`'|','|';'|'\'')* '"' ;
INTEGER : ('0'..'9')+ ;

NORMALCOMMENT : '/' '/' .* '\n' {$channel = HIDDEN;} ;

MULTICOMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;

WS : (' '| '\t' | '\n' | '\r')+ {$channel = HIDDEN;} ;
