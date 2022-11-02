package designpatterns.creational.abstractfactory;

public class ModernFactory implements FurnitureFactory {

	@Override
	public Table createTable() {
		return new ModernTable(); 
		
	}

	@Override
	public Chair createChair() {
		return new ModernChair();
		
	}

}
