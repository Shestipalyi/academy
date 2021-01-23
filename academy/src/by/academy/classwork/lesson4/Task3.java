package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Введите число");
		Scanner scan = new Scanner(System.in);
		long factorial = 1;
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;			
		}
		System.out.println(factorial);
	}

}
