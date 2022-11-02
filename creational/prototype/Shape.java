package designpatterns.creational.prototype;

public class Shape implements Prototype{
	
	private String name; 
	private int sides; 
	private int area; 
	
	public Shape(String name, int sides, int area) {
		this.name = name; 
		this.sides = sides;
		this.area = area; 
	}
	
	public String getName() {
		return name; 
	}
	public int getSides() {
		return sides; 
	}
	public void setSides(int nuovisidea) {
		sides = nuovisidea; 
	}
	public int getArea() {
		return area; 
	}
	
	public void info() {
		System.out.println("This is a " + name + " that has " + sides + " sides and has a " + area + "cm^2 area");
	}
	
	@Override 
	public Prototype getClone() {
		return new Shape(name, sides, area); 
	}

}
