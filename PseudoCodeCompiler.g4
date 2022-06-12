grammar PseudoCodeCompiler;

@header { import java.util.*;import java.util.ArrayList; import java.util.Scanner;}
@members {
	Print x = new Print();
	VarArray v = new VarArray();
	Scanner s = new Scanner(System.in);
	int scope = 3;
	
	public void finishStruct(){
		v.removeScope(scope);
		scope--;
		x.printScopeTabs(scope);
		x.printData("} scope:"+scope+"\n");
	}
	
	public void startStruct(){
		scope++;
		x.printData("{ scope:"+scope+"\n");
	}
	
	public void throwError(String message){
		throw new RuntimeException(" "+message);
	}
}


start: 	
		'inicio' {x.printStart();}
		command
		'fim' {x.printEnd();};
		
command:  
		(op | atribution | declaration | conditional | whileLoop | forLoop | write)*;
		
whileLoop:
		'enquanto' {x.printScopeTabs(scope);x.printData("while");} condition '{' {startStruct();}
		command 
		'}'{finishStruct();};
		
forLoop: 
		'para' {x.printScopeTabs(scope);x.printData("for(");scope++;}
		'('
		declaration SC{x.printData(";");}
		condition SC{x.printData(";");}
		op
		')''{'
		command
		'}'{finishStruct();};
		
conditional:
		if {x.printScopeTabs(scope);x.printData("if");} condition (OP_AD {x.printData($OP_AD.text);} condition)* {startStruct();}'{'
		command
		'}' {v.removeScope(scope);scope--;x.printScopeTabs(scope);}
		(else {x.printData("}else");}(if {x.printData(" if");} condition (OP_AD{x.printData($OP_AD.text);} condition)*)? {startStruct();}'{'
		command
		'}')?{finishStruct();};

atribution:
		{x.printScopeTabs(scope);}
		ID
		ATRIB
		data{
				v.atribVar($ID.text,$data.text, scope);
				x.printAttribution($ID.text,$data.text);
			}
		SC{x.printSC();}; 
		
declaration:
		{x.printScopeTabs(scope);}
		type ID 
		ATRIB data {
						if(v.parseData($data.text).equals($type.text)){
							v.addVar(new Variable($type.text,$data.text,scope, $ID.text));
							x.printDeclare($type.text, $ID.text, $data.text); 
						}else{
							throwError("Valor declarado nao corresponde ao tipo da variavel");
						}
					}
		SC{ x.printSC(); };
		
data:
		read|
		bool|
		op| 
		| ('('{x.printData("(");} op ')'{x.printData(")");}) basicOp?
		|STRING;
		
condition:
		'(' 
		ID {if(!v.varExists($ID.text,scope))throwError("Variavel nao existente nesse escopo");}
		OP_COMP data {
						if(v.parseData($data.text).equals(v.getVarById($ID.text).type)){
							x.printCondition($ID.text,$OP_COMP.text,$data.text);
						}else{
							throwError($data.text+" nao pode ser comparado com "+v.getVarById($ID.text).type);
						}						
					}
		')';
		
op:
		{x.printScopeTabs(scope);}
		NUM
		| ID{
			if(!v.varExists($ID.text,scope))
				throwError("Variavel:"+$ID.text+" nao existente nesse escopo: "+scope);
			}
		basicOp?;

basicOp:
		('/'|'*') op
		| ('+'|'-') op
		| ('++'|'--');

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
		')';

write: 
		{x.printScopeTabs(scope);} 
		'imprimir' '(' {System.out.print("System.out.print(");}
		(ID {x.printData(v.getVarById($ID.text).content);} | STRING {x.printData($STRING.text);})
		('+' {x.printData("+");} ID {x.printData(v.getVarById($ID.text).content);} | STRING {x.printData($STRING.text);})* 
		')' SC{x.printData(")");x.printSC();};
		
type: 
		'boleano'|'texto'|'real';
		
bool: 	
		'verdadeiro'|'falso';
if: 
		'Se'|'se';
else:  	
		'senao'|'Senao';

STRING: '"' ([a-z]|[A-Z]|NUM|WS|OP_COMP|ATRIB|SC|OP_AD)* '"'; 
ID: [a-z]([a-z]|[A-Z]|[0-9])+;
NUM: [0-9]+ ('.' [0-9]*)?;
OP_COMP: '<'|'>'|'=='|'<='|'>='|'!=';
OP_AD: '&&'|'||';
ATRIB: '=';
SC: ';';
WS: [ \t\r\n]+ -> skip;