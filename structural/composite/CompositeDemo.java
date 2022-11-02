package designpatterns.structural.composite;

public class CompositeDemo {
	
	public static void main(String[] args) {
		Person CEO = new Person ("John", "CE(na)O", 25000); 
		Person GayLord = new Person ("Adam", "Succhiapeni", 56); 
		Person Secretary = new Person ("Muramasa", "Secretary", 34); 
		
		Person HeadSales = new Person ("Brubru", "HEAD SALES ", 56); 
		Person Sales1 = new Person ("Nanna", "Sales", 34); 
		Person Sales2 = new Person ("Fanna", "Sales", 56); 
		Person Sales3 = new Person ("Lanna", "Sales", 34); 
		
		Person HeadIt = new Person ("Brobro", "HEAD IT ", 56); 
		Person It1 = new Person ("Loppo", "ITboy", 34); 
		Person It2 = new Person ("Noppo", "ITboy", 34); 
		Person It3 = new Person ("Soppo", "ITboy", 34); 
		
		
		CEO.add(Secretary);
		CEO.add(GayLord);
		CEO.add(HeadSales);
		CEO.add(HeadIt);
		
		HeadIt.add(It1);
		HeadIt.add(It2);
		HeadIt.add(It3);
		
		HeadSales.add(Sales1);
		HeadSales.add(Sales2);
		HeadSales.add(Sales3);
		
		CEO.getSubordinates(); 
		HeadIt.getSubordinates(); 
		HeadSales.getSubordinates(); 
		
		
		
		
		
		
	}

}
