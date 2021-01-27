package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

//	1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
//	Вывести найденные строки и их длину.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество строк");
		int n = scan.nextInt();
		String[] ar = new String[n];
		scan.nextLine();
		for (int i = 0;  i < n; i++) {
			ar [i] = scan.nextLine();			
		}		
		int min = ar[0].length();
		int max = ar[0].length();
		String minString =ar[0];
		String maxString =ar[0];
		
		System.out.println(Arrays.toString(ar));
		for (int i = 1;  i < n; i++) {
			if (ar[i].length() < min) {
				min = ar[i].length();
				minString =ar[i];					
			} else if (ar[i].length() > max) {
				max = ar[i].length();
				maxString =ar[i];				
			}
			
		}
		System.out.println("Min: " + min);
		System.out.println("MinString: " + minString);
		System.out.println("Max: " + max);
		System.out.println("MaxString: " + maxString);
		
		
		
		scan.close();
		
		
		

	}

}
