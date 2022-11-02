package designpatterns.creational.singleton;

public class Singleton {
	
	private static Singleton singleinstance = null; //static var reference of type singleton 
	
	public String s;
	
	private Singleton() { //costruttore 
		
		s = "hi im a string part of a singleton";
		
	}
	
	public static Singleton getInstance() {
		if(singleinstance==null)
			singleinstance = new Singleton();
		return singleinstance; 
	}
	
	

}
