package designpatterns.creational.factorymethod;
import java.util.Scanner; 

public class AnimalCreator {
	
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory(); 
		Scanner in = new Scanner(System.in); 
		String s; 
		
		System.out.println("Che animale vuoi generare dalla figa di cristo ?");
		System.out.println("\n Dog / Cat");
		
		s = in.next(); 	
		
		Animal a = animalFactory.createAnimal(s); 
		
		System.out.println("Hai creato un " + s + ", detto in modo difficile: " + a);
		in.close();
		
		System.out.println("Il tuo " + s + " può fare tante cose, tipo: ");
		
		a.bite();
		a.eat(); 
		
		
	}
	

}
