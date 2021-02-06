package by.academy.deal;

public class Cheese extends Product {
	int age;
	
	public Cheese() {
		super();
	}
	public Cheese (String name, Double price, String manufacture, Integer quantity, int age) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity; 
		this.age = age;
	}
	@Override
	public Double discount() {
		if (age > 20) {
			return 0.8;
		}
		return 1.0;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}