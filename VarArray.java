import java.util.ArrayList;

public class VarArray{
	
	ArrayList<Variable> v;

	public VarArray(){
		this.v = new ArrayList<Variable>();
	}
	
	public void addVar(Variable nv){
		this.v.add(nv);
	}
	
	public Variable getVar(String id){
		try{
			return v.get(getVarIndexByName(id));
		}
		catch(Exception e){
			throw new RuntimeException("Variavel não existente");
		}
	}
	
	public Boolean checkScope(String id, int scope){
		if(v.get(getVarIndexByName(id)).scope == scope) return true;
		return false;
	}
	
	public Boolean checkType(String id, String type){
		if(v.get(getVarIndexByName(id)).type == type) return true;
		return false;
	}
	
	public void atribVar(String id, String content){
		v.get(getVarIndexByName(id)).content = content;
	}
	
	public int getVarIndexByName(String id){
		for(int i = 0;i<v.size(); i++)if(v.get(i).id == id) return i;
		printArray();
		throw new RuntimeException("Variavel não existente");	
	}
	
	public void printArray(){
	    for (Variable i : v) {
			System.out.println(i.id);
		}
    }
}