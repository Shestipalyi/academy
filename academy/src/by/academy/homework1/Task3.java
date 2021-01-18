package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите число от 1 до 10");
		int i = 1;
		int n = scan.nextInt();
		while (i < 10) {
			System.out.println(n + " * " + i + " = " + i * n);
			i++;
		}
		scan.close();
	}
}
