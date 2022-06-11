grammar PseudoCodeCompiler;

@header { import java.util.*;import java.util.ArrayList; import java.util.Scanner;}
@members {
	Print x = new Print();
	VarArray v = new VarArray();
	Scanner s = new Scanner(System.in);
	int scope = 3;
}


start: 	
		'inicio' {x.printStart();} 
		command
		'fim' {x.printEnd();};
		
command:  
		(atribution | declare | conditional | whileLoop | forLoop | read | write | aritOperation)*;
		
whileLoop:
		'enquanto' {x.printData("while");} condition '{' {x.printData("{\n\t");scope++;}
		command
		'}'{x.printData("}\n");scope--;};
		
forLoop: 
		'para' {x.printData("for("+$ID.text+$ATRIB.text);}
		'('
		ID ATRIB (ID{x.printData($ID.text);}|NUM{x.printData($NUM.text);}) SC{x.printData(";");}
		condition SC{x.printData(";");}
		ID {x.printData($ID.text);}(OP_ALG NUM{x.printData($OP_ALG.text+NUM+"){");scope++;})|OP_UNIT{x.printData($OP_UNIT+"){\n\t");scope++;}
		')''{'
		command
		{x.printData("}\n");scope--;}'}';
		
conditional:
		if {x.printData("if");} condition (OP_AD {x.printData($OP_AD.text);} condition)* {x.printData("{\n\t");scope++;}'{'
		command
		{x.printData("}\n");scope--;}'}' (else {x.printData(" else");}(if {x.printData(" if");}condition (OP_AD{x.printData($OP_AD.text);} condition)*)? {x.printData("{\n\t");scope++;}'{'
		command
		{x.printData("}\n");scope--;}'}')?;

atribution:
		ID
		ATRIB
		data {
				if(true){
					/*v.atribVar($ID.text,$data.text);*/
					x.printAttribution($ID.text,$data.text);
				}else{
					throw new RuntimeException("Tipo invalido");
				}
			}
		SC{x.printSC(scope);}; 
		
declare:
		type ID 
		ATRIB data {
						v.addVar(new Variable($type.text,$data.text,scope, $ID.text));
						x.printDeclare($type.text, $ID.text, $data.text); 
					}
		SC{ x.printSC(scope); };
		
data:
		read|
		aritOperation|
		bool|
		NUM|
		ID|
		STRING;
		
condition:
		'(' 
		ID
		OP_COMP data {x.printCondition($ID.text,$OP_COMP.text,$data.text);}
		')';
		
aritOperation:
		ID|NUM 
		(OP_ALG ID|NUM) | 
		OP_UNIT SC {x.printAritOp();};

read:
		'ler' '(' 
		type{
				switch($type.text){
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
			}
		')' 
		SC {x.printSC(scope);};

write: 
		'imprimir' '(' {System.out.print("System.out.print(");}
		(ID {x.printData(v.getVar($ID.text).content);} | STRING {x.printData($STRING.text);})
		('+' {x.printData("+");} ID {x.printData(v.getVar($ID.text).content);} | STRING {x.printData($STRING.text);})* 
		')' SC{x.printData(")");x.printSC(scope);};
		
type: 
		'boleano'|'texto'|'real';
		
bool: 	
		'verdadeiro'|'falso'|'0'|'1';
if: 
		'Se'|'se';
else:  	
		('senao'|'senão'|'Senao'|'Senão');

STRING: '"' ([a-z]|[A-Z]|NUM|WS|OP_ALG|OP_UNIT|OP_COMP|ATRIB|SC|OP_AD)* '"'; 
ID: ([a-z]|[A-Z]|[0-9])+;
NUM: [0-9]+ (',' [0-9]*)?;
OP_ALG: '+'|'-'|'/'|'*'|'**'|'^';
OP_UNIT: '++'|'--';
OP_COMP: '<'|'>'|'=='|'<='|'>='|'!=';
OP_AD: '&&'|'||';
ATRIB: '=';
SC: ';';
WS: [ \t\r\n]+ -> skip;