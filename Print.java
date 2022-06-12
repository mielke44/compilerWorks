public class Print{

	

	public Print(){}
	
	public void printStart(){
		System.out.print("public class Saida{ \n\tpublic static void main(String args[]){\n");
	}
	
	public void printEnd(){
		System.out.print("\n\t}\n}");
	}
	
	public void printDeclare(String type, String id, String content){
		System.out.print(parseType(type)+" "+id+" = "+content);
	}
	
	public String parseType(String type){
		 switch(type){
			case "texto": return "String";
			case "boleano": return "Boolean";
			default: return "float";
		}
	}
	
	public void printAttribution(String id, String content){
		System.out.print(id+" = "+content);
	}
	
	public void printData(String x){
		System.out.print(x);
	}
	
	public void printAritOp(){
		System.out.print("ARIT_OP");
	}
	
	public void printSC(){
		System.out.print(";\n");
	}
	
	public void printScopeTabs(int scope){
		for(int i=1;i<scope;i++)System.out.print("\t");
	}
	
	public void printBool(String x){
		if(x.equals("verdadeiro")||x.equals("1")){
			System.out.print("teste");
		}else{
			System.out.print(false);
		}
	}
	
	public void printCondition(String ID, String OP, String SP){
		System.out.print("( "+ID+" "+OP+" "+SP+" )");
	}
}