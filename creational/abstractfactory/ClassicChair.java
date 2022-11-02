package designpatterns.creational.abstractfactory;

public class ClassicChair implements Chair{

	@Override
	public boolean hasLegs() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sit() {
		System.out.println("GAMBEE");
		
	}

}
