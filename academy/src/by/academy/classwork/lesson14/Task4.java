package by.academy.classwork.lesson14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//4.Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке и вывести результат на экран.

public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> hashSet = new HashSet<>();		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(5);
		
		for (Integer b : hashSet) {
			System.out.println(b);
		}		
		scan.close();
	}
}
