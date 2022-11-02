package designpatterns.creational.abstractfactory;

public class ClassicFactory implements FurnitureFactory{

	@Override
	public Table createTable() {
		return new ClassicTable();
		
	}

	@Override
	public Chair createChair() {
		return new ClassicChair(); 
		
	}

}
