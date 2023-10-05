package headfirst.designpatterns.decorator.starbuzz;

/**
 * 无咖啡因咖啡
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

