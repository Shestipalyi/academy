package by.academy.deal;

import java.util.Scanner;
import java.text.ParseException;

public class Application {

	public static void main(String[] args) throws ParseException{
        Application application = new Application();
        application.runDeal();
    }		
		private void runDeal() throws ParseException {
		Scanner scan = new Scanner(System.in);
		Deal deal = new Deal();
		System.out.println("Заполните данные о продавце");
		Person person1 = new Person();
		person1.readNewPerson();
		System.out.println("Заполните данные о покупателе");
		Person person2 = new Person();
		person2.readNewPerson();
		deal.setSeller(person1);
		deal.setBuyer(person2);
		deal.dealMenu(scan);
		if (deal.getProducts() != null && deal.getProducts()[0] != null) {
			System.out.println("Сделка прошла успешно");
			System.out.println();
		} else {
			System.out.println("Сделка не состоялась");
		}
		scan.close();
	}
}
