package designpatterns.creational.singleton;

public class LazyS {
	
	private static LazyS obj; 
	private LazyS() {
		
	}
	
	public static LazyS getLazyS() {
		if(obj==null) {
	//		synchronized(Singleton.class) {
				if(obj==null) {
					//obj = new Singleton(); 
				}
			}
			return obj; 
		}
		
	//}
	public void doSomething() {
		
	}

}
