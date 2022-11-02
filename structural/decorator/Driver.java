package designpatterns.structural.decorator;

public class Driver {
	
	public static void main(String[] args) {
		Shape circle = new Circle(); 
		Shape rectangle = new Rectangle(); 
		
		Shape redCircle = new RedShapeDecorator(new Circle()); 
		Shape redRectangle = new RedShapeDecorator(new Rectangle()); 
		
		System.out.println("Circle with normal border");
		circle.draw(); 
		
		System.out.println("Circle with red borders");
		redCircle.draw();
		
		System.out.println("Rectangle with normal border");
		rectangle.draw(); 
		
		System.out.println("Rectangle with red borders");
		redRectangle.draw();
		
		
	}

}
