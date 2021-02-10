package by.academy.deal;

public class Product {
	private String name;
	private Double price;
	private String manufacture;
	private Integer quantity;
	
    public Product() {
        super();
    }

	public Product(String name, Double price, String manufacture, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}

	public Double discount() {
		if (quantity > 20) {
			return 0.9;
		}
		return 1.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
