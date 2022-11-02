package designpatterns.structural.proxy;

public class Driver {

	public static void main(String[] args) {
		Image image = new ProxyImage("tette.png"); 
		Image image2 = new RealImage("bocce.png");
		
		image.display(); 
		
		System.out.println("");
		
		image2.loadFromDisk();


	}
	
}
