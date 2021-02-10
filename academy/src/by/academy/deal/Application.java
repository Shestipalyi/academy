package by.academy.deal;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person();
		Person buyer = new Person();
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите имя покупателя");
		buyer.setName(sc.next());
		System.out.print("Введите количество денег у покупателя");
		buyer.setMoney(sc.nextDouble());
		System.out.print("Введите имя продовца");
		seller.setName(sc.next());
		System.out.print("Введите количество денег у продовца");
		seller.setMoney(sc.nextDouble());


		Deal deal = new Deal("10-02-2021", seller, buyer);

		deal.addProduct(new Cheese("пармезан", 15.0, "Веселый молочник", 5, 21, 0.5));
		deal.addProduct(new Wine("масандра", 13.0, "Инкерман", 1, "Украина", "Мускат"));
		deal.addProduct(new Meat("говядина", 18.5, "Слонимский мясокомбинат", 21, 3, 1.0));

		deal.deal();
		sc.close();
	}
}