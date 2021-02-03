package by.academy.homework.hw2;

//Задание 2. 
//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
//Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int countWord = scan.nextInt();
		scan.nextLine();
		String[] ar = new String[countWord];
		int[] countSymbol = new int[countWord];
		int res = 0;
		System.out.println("Введите слова");
		for (int i = 0; i < countWord; i++) {
			ar[i] = scan.nextLine();
			int[] n = new int[256];
			for (int j = 0; j < ar[i].length(); j++) {
				n[ar[i].charAt(j)]++;
			}
			for (int j = 0; j < n.length; j++) {
				if (n[j] >= 1) {
					countSymbol[i]++;
				}
			}
		}
		res = 0;
		for (int i = 1; i < countSymbol.length; i++) {
			if (countSymbol[i] < countSymbol[res])
				res = i;
		}
		System.out.println("Слово с минимальным количеством уникальных символов: " + ar[res]);
		scan.close();
	}
}
