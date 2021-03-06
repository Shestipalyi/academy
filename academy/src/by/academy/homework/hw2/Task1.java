package by.academy.homework.hw2;

//Задание 1. 
//Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки.
//Учитываем регистр. Не использовать сортировку :) 
//Например: 
//1.	“hello” и “hlleo” -> true
//2.	“hello” и “art” -> false
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите 2 строки");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		int[] n = new int[256];
		boolean res = true;

		if (str1.length() != str2.length()) {
			res = false;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				n[str1.charAt(i)]++;
				n[str2.charAt(i)]--;
			}
			for (int i = 0; i < n.length; i++) {
				if (n[i] != 0) {
					res = false;					
				}
			}
		}
		if (res) {
			System.out.println("Строки являются анаграммами");
		} else {
			System.out.println("Строки не являются анаграммами");
		}
		scan.close();
	}
}
