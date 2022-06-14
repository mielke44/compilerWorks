public class Print{

	

	public Print(){}
	
	public void printStart(){
		System.out.print("public class Saida{ \n\tpublic static void main(String args[]){\n");
	}
	
	public void printEnd(){
		System.out.print("\t}\n}");
	}
	
	public void printDeclare(String type, String id, String content){
		if(content.equals("verdadeiro") || content.equals("falso"))
			System.out.print(parseType(type)+" "+id+" = "+parseBool(content));
		else 
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
		if(content.equals("verdadeiro") || content.equals("falso"))
			System.out.print(id+" = "+parseBool(content));
		else
			System.out.print(id+" = "+content);
	}
	
	public void printData(String x){
		System.out.print(x);
	}
	
	public void printAritOp(){
		System.out.print("ARIT_OP");
	}
	
	public void printSC(){
		System.out.print(";");
	}
	
	public void printScopeTabs(int scope){
		//System.out.print("Scope:"+scope);
		for(int i=1;i<scope;i++)System.out.print("\t");
	}
	
	public Boolean parseBool(String x){
		return x.equals("verdadeiro");
	}
	
	public void printCondition(String ID, String OP, String SP){
		if(SP.equals("verdadeiro") || SP.equals("falso"))
			System.out.print(ID+" "+OP+" "+parseBool(SP));
		else 
			System.out.print(ID+" "+OP+" "+SP);
	}
}