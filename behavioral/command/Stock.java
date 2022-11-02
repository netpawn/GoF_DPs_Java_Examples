package designpatterns.behavioral.command;

public class Stock {
	private String name = "ABC";
	private int quantity = 10; 
	
	
	
	public void buy() {
		System.out.println("Bought " + quantity + " of " + name); 
	}
	public void sell() {
		System.out.println("Sold " + quantity + " of " + name); 
	}
}
