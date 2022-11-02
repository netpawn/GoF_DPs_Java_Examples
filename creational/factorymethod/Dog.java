package designpatterns.creational.factorymethod;

public class Dog implements Animal{

	@Override
	public void bite() {
		System.out.println("Dog bites");
		
	}

	@Override
	public void walk() {
		System.out.println("Dog walks");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eats");
		
	}

}
