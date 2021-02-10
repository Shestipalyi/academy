package by.academy.deal;

public class Wine extends Product {
	private String country;
	private String grapes;	

	public Wine (String name, Double price, String manufacture, Integer quantity, String country, String grapes) {
		super(name, price, manufacture, quantity);
		this.country = country;
		this.grapes = grapes;
	}

	@Override
	public Double discount() {
		if (country.equals("Украина")) {
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


	public String getGrapes() {
		return grapes;
	}


	public void setGrapes(String grapes) {
		this.grapes = grapes;
	}

}