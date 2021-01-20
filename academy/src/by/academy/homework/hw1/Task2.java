package by.academy.homework.hw1;

import java.io.IOException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных");
		String type = scan.nextLine();
		switch (type) {
		case "int":
			System.out.println("Введите целое число");
			System.out.println("Остаток от деления на 2 составляет " + scan.nextInt() % 2);
			break;
		case "double":
			System.out.println("Введите число");
			System.out.println("70% от числа составляет " + scan.nextDouble() * 0.7);
			break;
		case "float":
			System.out.println("Введите число");
			System.out.println("Квадрат числа состовляет составляет " + Math.pow(scan.nextFloat(), 2));
			break;
		case "char":
			System.out.println("Введите символ");
			String c = scan.nextLine();
			System.out.println("Код символа " + (int) c.charAt(0));
			break;
		case "String":
			System.out.println("Введите имя");
			System.out.println("Hello " + scan.nextLine());
			break;
		default:
			System.out.println("Unsupported type");
		}
		scan.close();
	}
}
