package by.academy.deal;

public class Wine extends Product {
	String country;

	public Wine() {
		super();
	}

	public Wine(String name, Double price, String manufacture, Integer quantity, String country) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
		this.country = country;
	}

	@Override
	public Double discount() {
		if (country.equals("GE")) {
			return 0.83;
		}
		return 1.0;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}