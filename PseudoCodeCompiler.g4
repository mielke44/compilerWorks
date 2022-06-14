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
		x.printData("\n");
		x.printScopeTabs(scope);
		x.printData("}\n ");
	}
	
	public void startStruct(){
		scope++;
		x.printData("{ \n");
	}
	
	public void throwError(String message, int line){
		throw new RuntimeException(" "+message+" na linha: "+line);
	}
	
	public void checkSC(String sc, int line){
		if(sc.contains("missing"))throwError("Falta ';' linha:",line);
		else x.printSC();
	}
}


start: 	
		'inicio' {x.printStart();}
		command
		'fim' {x.printEnd();};
		
command:  
		({x.printScopeTabs(scope);} atribution {x.printData("\n");} | {x.printScopeTabs(scope);} declaration {x.printData("\n");}| conditional | whileLoop | forLoop | write)*;
		
whileLoop:
		'enquanto''(' {x.printScopeTabs(scope);x.printData("while(");}  condition ')'{x.printData(")");} '{' {startStruct();}
		command 
		'}'{finishStruct();};
		
forLoop: 
		'para''('{x.printScopeTabs(scope);x.printData("for(");scope++;}
		declaration
		condition SC{checkSC($SC.text,$SC.line);}
		op {x.printData($op.text);}
		')''{' {x.printData("){\n");}
		command
		'}'{finishStruct();};
		
conditional:
		if {x.printScopeTabs(scope);x.printData("if(");} '(' condition ')'{x.printData(")");} {startStruct();}'{'?
		command
		'}'?
		(else {scope--;x.printScopeTabs(scope);x.printData("}else ");}(if{x.printData("if(");} '(' condition ')'{x.printData("(");} )? {startStruct();}'{'?
		command
		'}'?)? {finishStruct();};

atribution:
		ID
		ATRIB
		(data{
				v.atribVar($ID.text,$data.text, scope, $data.start.getLine());
				x.printAttribution($ID.text,$data.text);
			}
		| {x.printAttribution($ID.text,"");} read{
				v.atribVar($ID.text,$read.text, scope, $read.start.getLine());
		})
		SC{checkSC($SC.text,$SC.line);}; 
		
declaration:
		type ID 
		ATRIB data {
						if(v.parseData($data.text).equals($type.text)){
							v.addVar(new Variable($type.text,$data.text,scope, $ID.text), $data.start.getLine());
							x.printDeclare($type.text, $ID.text, $data.text); 
						}else{
							throwError("Valor declarado nao corresponde ao tipo da variavel", $data.start.getLine());
						}
					}
		SC{checkSC($SC.text,$SC.line);};
		
data:
		bool|
		| (('(')? op (')')? basicOp?)
		|STRING;
		
condition:
		ID {if(!v.varExists($ID.text,scope))throwError("Variavel nao existente nesse escopo", $ID.getLine());}
		OP_COMP data {
						if(($OP_COMP.text.contains("<") || $OP_COMP.text.contains(">")) && v.parseData($data.text).equals("texto")){
							throwError("Texto nao pode ser comparado com '<' ou '>'", $data.start.getLine());
						}else if(v.parseData($data.text).equals(v.getVarById($ID.text).type)){
							x.printCondition($ID.text,$OP_COMP.text,$data.text);
						}else{
							throwError($data.text+" nao pode ser comparado com "+v.getVarById($ID.text).type, $data.start.getLine());
						}						
					}
		(OP_AD {x.printData($OP_AD.text);} condition)*;
		
op:
		NUM
		| ID{
			if(!v.varExists($ID.text,scope))
				throwError("Variavel"+$ID.text+" nao existente no escopo que foi chamada", $ID.getLine());
			}
		(basicOp {
			if(!v.getVarById($ID.text).type.contains("real")) 
				throwError("variavel "+$ID.text+" nao corresponde a numero", $ID.getLine());
		} )?;

basicOp:
		('/'|'*') (op|data)
		| ('+'|'-') (op|data)
		| ('++'|'--') SC?;

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
		(ID {x.printData(v.getVarById($ID.text).id);} | STRING {x.printData($STRING.text);})
		('+' {x.printData("+");} (ID {x.printData(v.getVarById($ID.text).id);} | STRING {x.printData($STRING.text);}))* 
		')' SC{x.printData(")");checkSC($SC.text,$SC.line);};
		
type: 
		'boleano'|'texto'|'real';
		
bool: 	
		'verdadeiro'|'falso';
if: 
		'Se'|'se';
else:  	
		'senao'|'Senao';

STRING
	:'"' ([a-z]|[A-Z]|NUM|WS|OP_COMP|ATRIB|SC|OP_AD)* '"'; 
ID
	:[a-z]([a-z]|[A-Z]|[0-9]|'_')*;
NUM
	:[0-9]+ ('.' [0-9]*)?;
OP_COMP 
	:'<'|'>'|'=='|'<='|'>='|'!=';
OP_AD
	:'&&'|'||';
ATRIB 
	:'=';
SC
	:';';
WS: [ \t\r\n]+ -> skip;