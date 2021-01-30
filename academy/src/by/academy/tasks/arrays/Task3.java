package by.academy.tasks.arrays;

//Задача 3.
//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
//Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ar = new int[15];
		int n = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(10);
			System.out.print(ar[i] + " ");
			if (ar[i] % 2 == 0) {
				n++;
			}
		}
		System.out.println("\nВ случайном массиве " + n + " четных чисел");

	}

}
