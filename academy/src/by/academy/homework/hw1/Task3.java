package by.academy.homework.hw1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите число от 1 до 10");
		int n = scan.nextInt();
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(n + " * " + i + " = " + i * n);
		}
		scan.close();
	}
}
