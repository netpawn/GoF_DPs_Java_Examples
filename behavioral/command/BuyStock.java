package designpatterns.behavioral.command;

public class BuyStock implements Order {

	public Stock abcStock; 
	
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock; 
	}
	
	@Override
	public void execute() {
		abcStock.buy();
	}

}
