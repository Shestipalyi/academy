package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.println("Введите сумму вклада");
		double s = scan.nextInt();		
		System.out.println("На сколько лет вклад?");
		int n = scan.nextInt();	
		for (int i = 1; i < n; i++) {;
		s = s * 1.03;		
		}
		System.out.println(s);
	}

}
