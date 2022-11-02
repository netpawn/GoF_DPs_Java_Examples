package designpatterns.structural.adapter;

public class Driver {
	
	public static void main(String[] args) {
		CreditCard targetInterface = new BankCustomer(); 
		
		targetInterface.details();
		targetInterface.getCardNumber();
	}
}
