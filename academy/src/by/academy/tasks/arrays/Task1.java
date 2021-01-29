package by.academy.tasks.arrays;

//Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
//отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 
//Перед созданием массива подумайте, какого он будет размера.
//2 4 6 … 18 20
//2
//4
//6
//…
//20

public class Task1 {

	public static void main(String[] args) {
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (i + 1) * 2;
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {			
			System.out.println(ar[i]);
		}

	}

}
