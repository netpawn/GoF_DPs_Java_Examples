package designpatterns.structural.adapter;
import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {
	
	@Override
	public void details() {
		
		try {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter accName");
		String accNa = in.nextLine();
		System.out.println("Enter accNumber");
		int accNo = in.nextInt();
		System.out.println("Enter bankName");
		String bankN = in.nextLine();
		
		setAccNumber(accNo);
		setHolderName(accNa);
		setBankName(bankN);
		in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	
	@Override
	public String getCardNumber() {
		int accno = getAccNumber(); 
		String accna = getHolderName(); 
		String bankn = getBankName(); 
		
		return("The number is " + accno + ", the name is " + accna + ", the bank is " + bankn);
	}
}
