package designpatterns.behavioral.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
