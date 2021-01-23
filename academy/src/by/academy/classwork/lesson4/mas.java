package by.academy.classwork.lesson4;

import java.util.Random;

public class mas {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(10);
			System.out.print((array1[i]) + " ");
		}
		for (int i = 0; i < array1.length; i++) {
			int temp;
			for (int n = 0; n < array1.length; n++) {
				temp = array1[i];
				array1[i] = array1[n];
				array1[n] = temp;

			}
		}
		System.out.println(array1 + " ");
		// TODO Auto-generated method stub

	}

}
