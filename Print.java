public class Print{

	

	public Print(){}
	
	public void printStart(){
		System.out.print("public class Saida{ \n\tpublic static void main(String args[]){\n");
	}
	
	public void printEnd(){
		System.out.print("\n\t}\n}");
	}
	
	public void printDeclare(String type, String id, String content){
		System.out.print(type+" "+id+" = "+content);
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
	
	public void printSC(int scope){
		System.out.print(";\n");
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