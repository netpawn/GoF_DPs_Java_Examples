package designpatterns.creational.abstractfactory;
import java.util.Scanner; 

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		
		ClassicFactory cf = new ClassicFactory(); 
		ModernFactory mf = new ModernFactory(); 
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Cosa vuoi creare?"); 
		System.out.println("Modern chair?"); 
		System.out.println("Modern table?"); 
		System.out.println("Classic chair?"); 
		System.out.println("Classic table?"); 
		
		int s; 
		s = in.nextInt(); 
		
		if(s==1) {
			Chair c = mf.createChair();
			c.sit();
		}
		else if (s==2) {
			Table t = mf.createTable();
			t.use();
		}
		else if (s==3) {
			Chair c = cf.createChair();
			c.sit();
		}
		else if (s==4) {
			Table t = cf.createTable();
			t.use();
		}
		else if (s==5) {
			throw new InterruptedException();
		}
			
		
		Table untavolo = mf.createTable();
		
		System.out.println("Il tuo tavolo " + untavolo + " può fare tante cose!");
		
		
		untavolo.use();
		

		 
		

			
	}
}
