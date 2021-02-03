package by.academy.deal;

public class Cheese extends Product {
	double weight;
	
	public Cheese() {
		super();
	}
	public Cheese (String name, Double price, String manufacture, Integer quantity, double weight) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity; 
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}