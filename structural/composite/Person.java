package designpatterns.structural.composite;
import java.util.List; 
import java.util.ArrayList; 

public class Person {
	private String name; 
	private String position; 
	private int salary; 
	private List<Person> subordinates; 
	
	
	public Person(String name, String position, int salary) {
		this.name = name; 
		this.position = position; 
		this.salary = salary;
		subordinates = new ArrayList<Person>(); 
	}
	
	public void add(Person p) {
		subordinates.add(p);
	}
	
	public void remove(Person p) {
		subordinates.remove(p); 
	}
	
	public List<Person> getSubordinates(){
		System.out.println(subordinates.toString());
		return subordinates; 
	}
	
	public String toString() {
		return ("Person name: " + name + ", position " + position + ", salary " + salary + "\n"); 
	} 
}
