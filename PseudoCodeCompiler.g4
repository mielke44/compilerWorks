grammar PseudoCodeCompiler;

@header { import java.util.*; }
@members {
	Print x = new Print();
}


start: 	
		'inicio' {x.printStart();} 
		command
		'fim' {x.printEnd();};
		
command:  
		(atribution | declare | conditional | whileLoop | forLoop | read | write | aritOperation)*;
		
whileLoop:
		'enquanto' condition '{'
		WS? command SC
		'}';
		
forLoop: 
		'para' '('ID ATRIB ID|NUM SC conditional SC ID (OP_ALG NUM|OP_UNIT)')' '{'
		WS? command SC
		'}';
		
conditional:
		IF condition (OP_AD condition)* '{'
		WS command SC
		'}' (ELSE (IF condition (OP_AD condition)*)? '{')?
		(WS? command SC)?
		'}'?;

atribution:
		ID {x.validateVar($ID.text);}
		ATRIB {x.printAttribution($ATRIB.text);}
		data SC{x.printSC();}; 
		
declare:
		TYPE WS ID (ATRIB data)? SC;
		
data:
		ID {x.printData($ID.text);} | NUM {x.printData($NUM.text);} | read | aritOperation | BOOL {x.printData($BOOL.text);};
		
condition:
		'(' (ID | NUM) OP_COMP ( ID | NUM | BOOL) ')';
		
aritOperation:
		ID|NUM 
		(OP_ALG ID|NUM) | 
		OP_UNIT SC {x.printAritOp();};

read:
		'ler' '(' TYPE | ID')' SC {x.printReadData();};

write: 
		'imprimir' '(' ID | STRING ('+' ID | STRING)* ')' SC;

ID: ([a-z]|[A-Z]|[0-9])+;
STRING: '"' ([a-z]|[A-Z]|NUM|WS|OP_ALG|OP_UNIT|OP_COMP|ATRIB|SC|OP_AD)* '"'; 
TYPE: 'boleano'|'string'|'real';
BOOL: 'verdadeiro'|'falso'|'0'|'1';
NUM: [0-9]+ (',' [0-9]*)?;
IF: 'Se'|'se';
ELSE:  ('senao'|'senão'|'Senao'|'Senão');
OP_ALG: '+'|'-'|'/'|'*'|'**'|'^';
OP_UNIT: '++'|'--';
OP_COMP: '<'|'>'|'=='|'<='|'>='|'!=';
OP_AD: '&&'|'||';
ATRIB: '=';
SC: ';';
WS: [ \t\r\n]+ -> skip;