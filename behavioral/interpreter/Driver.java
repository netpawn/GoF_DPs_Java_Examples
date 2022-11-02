package designpatterns.behavioral.interpreter;

public class Driver {
	
	public static Expression getMaleExpression() {
		Expression tom = new TerminalExpression("Tom"); 
		Expression lol = new TerminalExpression("lol"); 
		
		return new OrExpression(tom, lol); 
	}
	
	public static Expression getMarriedExpression() {
		Expression julie = new TerminalExpression("julie"); 
		Expression married = new TerminalExpression("married"); 
		
		return new AndExpression(julie, married); 
	}
	
	
	public static void main(String[] args) {
		
		Expression isMale = getMaleExpression(); 
		Expression isMarried = getMarriedExpression(); 

		System.out.println("John is male? " + isMale.interpret("Tom")); 
		System.out.println("Julie is married? " + isMarried.interpret("married julie"));
		
		
		
	}

}
