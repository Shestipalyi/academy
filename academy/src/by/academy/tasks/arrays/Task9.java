package by.academy.tasks.arrays;

//Задача 9. 
//Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. 
//Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива
//с i-ым индексом. 
//Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		double[] ar3 = new double[10];
		int n = 0;
		for (int i = 0; i < 10; i++) {
			ar1[i] = rand.nextInt(9) + 1;
			ar2[i] = rand.nextInt(9) + 1;
			ar3[i] = (double) ar1[i] / (double) ar2[i];
			if (ar3[i] % 1 == 0) {
				n++;
			}
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i] + " ");
		}
		System.out.println("\n" + n + " чисел в 3м массиве");

	}

}
