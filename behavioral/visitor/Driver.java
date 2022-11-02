package designpatterns.behavioral.visitor;

public class Driver {
	
	public static void main(String[] args) {

	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }

}
