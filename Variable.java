public class Variable{

	public String type, content, id;
	public int scope;
	
	public Variable(String type, String content, int scope, String id){
		this.id = id;
		this.type = type;
		this.content = content;
		this.scope = scope;
	}
}