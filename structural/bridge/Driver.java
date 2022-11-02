package designpatterns.structural.bridge;

public class Driver {
	public static void main(String[] args) {
		Shape BlueCircle = new Circle(100, 100, 10, new BlueCircle()); 
		Shape RedCircle = new Circle(100, 100, 10, new RedCircle());
		
		RedCircle.draw(); 
		BlueCircle.draw(); 
		
		
	}
}
