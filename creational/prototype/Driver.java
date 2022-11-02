package designpatterns.creational.prototype;

public class Driver {
	
	public static void main(String[] args) {
		Shape quadrato = new Shape("Quadrato", 2, 8);
		quadrato.info();
		
		Shape copia_quadrato = (Shape) quadrato.getClone();
		copia_quadrato.info();
		
		Shape cerchio = new Shape("Cerchio", 1, 5); 
		cerchio.info(); 
		Shape copia_cerchio = (Shape) cerchio.getClone();
		copia_cerchio.info();

	}

}
