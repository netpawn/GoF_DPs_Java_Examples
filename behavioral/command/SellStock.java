package designpatterns.behavioral.command;

public class SellStock implements Order {

	public Stock abcStock; 
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock; 
	}
	
	@Override
	public void execute() {
		abcStock.sell();
	}

}
