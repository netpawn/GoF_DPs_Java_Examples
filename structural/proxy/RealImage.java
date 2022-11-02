package designpatterns.structural.proxy;

public class RealImage implements Image{

	
	private String fileName; 
	
	public RealImage(String fileName) {
		this.fileName = fileName; 
	}
	@Override
	public void display() {
		System.out.println("Displaying " + fileName);		
	}
	
	@Override
	public void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}


}
