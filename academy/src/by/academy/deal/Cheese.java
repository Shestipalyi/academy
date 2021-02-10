package by.academy.deal;

public class Cheese extends Product {
	private Integer age;
	private Double weight;

	public Cheese(String name, Double price, String manufacture, Integer quantity, Integer age, Double weight) {
		super(name, price, manufacture, quantity);
		this.age = age;
		this.weight = weight;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}