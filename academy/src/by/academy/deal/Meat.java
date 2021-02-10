package by.academy.deal;

public class Meat extends Product {
	private Integer age;
	private Double weight;

	public Meat(String name, Double price, String manufacture, Integer quantity, Integer age, Double weight) {
		super(name, price, manufacture, quantity);
		this.age = age;
		this.weight = weight;
	}

	public Double discount() {
		if (quantity > 20) {
			return 0.9;
		}
		return 1.0;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int ageInDays) {
		this.age = ageInDays;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
