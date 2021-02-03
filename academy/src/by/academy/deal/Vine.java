package by.academy.deal;

public class Vine extends Product {
	double volume;
	
	public Vine() {
		super();
	}
	public Vine (String name, Double price, String manufacture, Integer quantity, double volume) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity; 
		this.volume = volume;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
}