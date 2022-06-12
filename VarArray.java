import java.util.ArrayList;
import java.util.Iterator;

public class VarArray{
	
	ArrayList<Variable> v;

	public VarArray(){
		this.v = new ArrayList<Variable>();
	}
	
	public void addVar(Variable nv){
		if(varExists(nv.id, nv.scope)) throw new RuntimeException("Variavel ja foi declarada nesse escopo");
		else this.v.add(nv);
		//printArray();
	}
	
	public Boolean varExists(String id, int scope){
		for (Variable va : v)
			if(va.scope <= scope && va.id.equals(id)) 
				return true;
		return false;
	}
	
	public Variable getVarById(String id){
		for (Variable va : v){
			if(va.id.equals(id))
				return va;
		}
		throw new RuntimeException("Variavel com id nao existente");
	}
	
	public Boolean checkScope(String id, int scope){
		return getVarById(id).scope <= scope;
	}
	
	public Boolean checkContentTypebyId(String id, String content){
		return getVarById(id).type.equals(parseData(content));
	}
	
	public String parseData(String type){
		if(type.equals("verdadeiro") || type.equals("falso")){
			return "boleano";
		}else try{
			Float.parseFloat(type);
			return "real";
		}catch (NumberFormatException ex){
			if(type.contains("ler")){
				if(type.contains("boleano")) return "boleano";
				else if(type.contains("real")) return "real";
				else return "texto";
			}else try{
				getVarById(type);
				return getVarById(type).type;
			}catch (Exception e){
				if(type.contains("+")||type.contains("-")||type.contains("*")||type.contains("/")) return "real";
				return "texto";
			}
		}
	}
	
	public void atribVar(String id, String content, int scope){
		if(!checkContentTypebyId(id,content)){
			throw new RuntimeException("Atribuicao invalida! Motivo: Tipo do conteudo invalido");
		}else if(!checkScope(id, scope)){
			throw new RuntimeException("Atribuicao invalida! Motivo: Variavel nao encontrada neste escopo");
		}else {
			getVarById(id).content = content;
			printArray();
		}
	}
	
	public void printArray(){
		System.out.println("Tamanho do array: "+v.size());
	    for (Variable i : v) {
			System.out.println("id:"+i.id+" scope:"+i.scope+" content:"+i.content+" type:"+i.type);
		}
    }
	
	public void removeScope(int scope){
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			Variable va = (Variable)itr.next();
			if(va.scope == scope) itr.remove();
		}
	}
}