package designpatterns.creational.factorymethod;

public class Cat implements Animal {

	@Override
	public void bite() {
		System.out.println("Cat bites");
		
	}

	@Override
	public void walk() {
		System.out.println("Cat walks");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats");
		
	}

}
