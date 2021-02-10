package by.academy.deal;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 2;

	private Person seller;
	private Person buyer;
	private Product[] products;
	private String date;
	private int productCounter;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(int index) {
		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Bill " + date);
		System.out.println();
		for (Product product : products) {
			if (product != null) {
				double totalProductPrice = product.getPrice() * product.getQuantity();
				summ += totalProductPrice;
				System.out.println(product.getName() + " " + product.getPrice() * product.discount() + " X "
						+ product.getQuantity() + " = " + totalProductPrice + "(Скидка "
						+ (1 - product.discount()) * 100 + "%)");
			}
		}
		System.out.println();
		System.out.println("Total " + summ);
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
	}

	public void deal() {
		double sum = 0;
		for (Product product : products) {
			if (product != null) {
				sum += product.getPrice() * product.getQuantity();
			}
		}
		if (sum > buyer.getMoney()) {
			System.out.println("Not enought money! ");
		} else {
			printBill();
		}
	}
}
