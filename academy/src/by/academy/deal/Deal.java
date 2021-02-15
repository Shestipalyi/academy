package by.academy.deal;

import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 2;

	Scanner scan = new Scanner(System.in);
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCounter;
	public static final String MENU_DEAL = "\nМеню сделки:" + "\nВведите:" + "\n1.Добавить продукт в сделку"
			+ "\n2.Удалить продукт из сделки" + "\n3.Вывести текущий чек" + "\n0.Выход";
	public static final String MENU_PRODUCT = "Меню продуктов:" + "\nВведите:" + "\n1.Добавить мясо"
			+ "\n2.Добавить вино" + "\n3.Добавить сыр" + "\n0.Выход";
    private static final LocalDate date = LocalDate.now();
    private static final LocalDate deadLine = LocalDate.now().plusDays(10);

	public Deal() {
		super();
	}

	public Deal(Person seller, Person buyer) {
		super();
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
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter - 1] = null;
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
				double totalProductPrice = product.getPrice() * product.getQuantity() * product.discount();
				summ += totalProductPrice;
				System.out.println(product.getName() + " " + product.getPrice() * product.discount() + " X "
						+ product.getQuantity() + " = " + totalProductPrice + "(Скидка "
						+ (1 - product.discount()) * 100 + "%)");
			}
		}
		System.out.println();
		System.out.println("Итого " + summ);
		System.out.println("дедлайн: " + deadLine);
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
			System.out.println("Не хватает денег ");
		} else {
			printBill();
		}
	}

	public void dealMenu(Scanner scan) {
		boolean repeat = true;
		do {
			System.out.println(MENU_DEAL);
			String tmp = scan.nextLine();
			switch (tmp) {
			case "1":
				menuProduct();
				break;
			case "2":
				System.out.println("Какой продукт исключить?");
				String del = scan.next();
				if (products != null) {
					for (int i = 0; i < products.length; i++) {
						if (products[i] != null) {
							if (products[i].getName().equals(del)) {
								deleteProduct(i);
							}
						}
					}
				} else {
					System.out.println("Нет такого продукта");
				}
				break;
			case "3":
				printBill();
				break;
			case "0":
				repeat = false;
				break;
			default:
				break;
			}
		} while (repeat);
	}

	void menuProduct() {
		boolean repeat = true;
		do {
			System.out.println(MENU_PRODUCT);
			String tmp = scan.nextLine();
			switch (tmp) {
			case "1":
				System.out.println("Введите количество");
				int n = scan.nextInt();
				addProduct(new Meat("говядина", 18.5, "Слонимский мясокомбинат", n, 3, 1.0));
				break;
			case "2":
				System.out.println("Введите количество");
				n = scan.nextInt();
				addProduct(new Cheese("пармезан", 15.0, "Веселый молочник", n, 21, 0.5));
				break;
			case "3":
				System.out.println("Введите количество");
				n = scan.nextInt();
				addProduct(new Wine("масандра", 13.0, "Инкерман", n, "Украина", "Мускат"));
				break;
			case "0":
				repeat = false;
				break;
			default:
				break;
			}
		} while (repeat);
	}
}
