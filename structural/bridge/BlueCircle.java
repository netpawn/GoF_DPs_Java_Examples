package designpatterns.structural.bridge;

public class BlueCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing a BLUE circle: radius "+ radius + ", x= " + x + ", y= " + y);
		
	}

}
