package designpatterns.creational.factorymethod;

public class AnimalFactory extends AnimalCreator{
	 
	
	public Animal createAnimal(String animal) {
		
		if(animal==null)
			return null; 
		
		if(animal.equalsIgnoreCase("Cat"))
			return new Cat(); 
		
		else if(animal.equalsIgnoreCase("Dog"))
			return new Dog(); 
		
		return null; 
		
	}

}
