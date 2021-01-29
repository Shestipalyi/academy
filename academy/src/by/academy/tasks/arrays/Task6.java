package by.academy.tasks.arrays;

//Задача 6.
//Создайте массив из 4 случайных целых чисел из отрезка [10;99], 
//выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ar = new int[4];
		int n = 0;
		boolean cond = true;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(90) + 10;
			System.out.print(ar[i] + " ");
		}
//		ar[0] = 15;
//		ar[1] = 16;
//		ar[2] = 17;
//		ar[3] = 18;
		for (int i = 0; i < (ar.length - 1); i++) {
			if (ar[i] >= ar[i + 1]) {
				cond = false;
			}
		}		
		
		if (cond) {
			System.out.println("Массив является строго возрастающей последовательностью");
		} else {
			System.out.println("Массив не является строго возрастающей последовательностью");
		}

	}
}
