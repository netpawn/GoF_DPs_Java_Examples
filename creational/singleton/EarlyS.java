package designpatterns.creational.singleton;

public class EarlyS {
	
	private static EarlyS obj = new EarlyS(); 
	
	private EarlyS() {
		
	}
	
	public static EarlyS getEarlyS() {
		return obj; 
	}
	
	public void doSomething() {
		System.out.println("Doing something");
	}
	

}
