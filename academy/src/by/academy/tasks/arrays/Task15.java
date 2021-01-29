package by.academy.tasks.arrays;

//Задача 15.
//Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. 
//Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения). 

import java.util.Random;
import java.util.Arrays;

public class Task15 {

	public static void main(String[] args) {
		int max = -99;
		Random rand = new Random();
		int[][] ar = new int[5][8];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				ar[i][j] = -99 + rand.nextInt(199);
				if (ar[i][j] > max) {
					max = ar[i][j];
				}
			}
		}

		System.out.println(max);

	}
}
