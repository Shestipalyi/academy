package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scan.nextInt();
		String S = n % 2 == 0 ? "четное" : "не четное";
		System.out.println("число " + S);
		scan.close();
	}

}
