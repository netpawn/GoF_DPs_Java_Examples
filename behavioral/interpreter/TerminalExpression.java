package designpatterns.behavioral.interpreter;

public class TerminalExpression implements Expression{
	
	private String data; 
	
	public TerminalExpression(String data) {
		this.setData(data); 
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data))
			return true; 
		else return false; 
			
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
