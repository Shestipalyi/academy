package by.academy.classwork.lesson5;

import java.util.Scanner;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 
//значений их длины.

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scan.nextInt();
		String[] ar = new String[n];
		int[] arnum = new int[n];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextLine();
		}

		scan.close();
	}

}
