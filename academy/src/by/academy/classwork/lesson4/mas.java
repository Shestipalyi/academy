package by.academy.classwork.lesson4;

// отсортировать произвольный массив

import java.util.Random;

public class mas {

	public static void main(String[] args) {
		int[] ar = new int[10];
		Random rand = new Random();
		int temp;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(10);
			System.out.print((ar[i]) + " ");
		}
		for (int i = ar.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ar[j]>ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;					
				}
			}
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print((ar[i]) + " ");
		}

		// TODO Auto-generated method stub

	}

}
