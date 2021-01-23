package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task15 {

//	15. Написать программу, 
//	которая по заданным значениям чисел a и b находит a в степени b. 
//	В запросе укажите допустимые значения этих переменных
//	( Например если а - дробное, то b не может быть отрицательным).	
	
	public static void main(String[] args) {
		System.out.println("Введите 2 числа");
		Scanner scan = new Scanner (System.in);
		double a = scan.nextDouble();
		int b = scan.nextInt();
		double n = a;
		for (int i = 1; i < b; i++) {
			n = n * a;
		}
		System.out.println(a + " в степени " + b +  " равно " + n);


	}

}
