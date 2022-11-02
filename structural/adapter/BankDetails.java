package designpatterns.structural.adapter;

public class BankDetails {

	private String bankName; 
	private String accHolderName; 
	private int accNumber; 
	
	public String getBankName() {
		return bankName; 
	}
	public String getHolderName() {
		return accHolderName; 
	}
	public int getAccNumber() {
		return accNumber; 
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName; 
	}
	public void setHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber; 
	}

	
}
