package by.academy.tasks.strings;

import java.util.Arrays;
import java.util.Scanner;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) 
//средней, а также длину.

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scan.nextInt();
		int l = 0;
		String[] ar = new String[n];
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextLine();
			l = l + ar[i].length();
		}
		System.out.println("строки, длина которых меньше cредней длины");
		for (int i = 0; i < n; i++) {
			if (ar[i].length() < l / n) {
				System.out.println(ar[i] + " - " + ar[i].length());
			}
		}
		scan.close();
	}
}
