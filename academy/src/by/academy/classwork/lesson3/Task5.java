package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите 2 числа");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		if (n1 > n2) {
			System.out.println("Первое число больше");
		} else if  (n2 > n1) {
			System.out.println("Второе число больше");
		} else {
			System.out.println("Числа равны");
		} 
		System.out.println("Среднее арифметическое равно " + (double) (n1 + n2) / 2);
	}

}
