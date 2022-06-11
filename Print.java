public class Print{

	

	public Print(){}
	
	public void printStart(){
		System.out.print("public class Saida{ \n\tpublic static void main(String args[]){\n\t\t");
	}
	
	public void printEnd(){
		System.out.print("\n\t}\n}");
	}
	
	public void validateVar(String x){
		System.out.print(x);
	}
	
	public void printAttribution(String x){
		System.out.print("=");
	}
	
	public void printData(String x){
		System.out.print(x);
	}
	
	public void printReadData(){
		System.out.print("LER");
	}
	
	public void printAritOp(){
		System.out.print("ARIT_OP");
	}
	
	public void printSC(){
		System.out.print(";\t");
	}
}