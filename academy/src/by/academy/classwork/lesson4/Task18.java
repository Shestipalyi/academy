package by.academy.classwork.lesson4;

public class Task18 {
	
//18. Задано натуральное число N. Найти количество натуральных чисел, не превосходящих N и не делящихся ни на одно из чисел 2,3,5.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 56				;
		int a = 0;
		for (int i = 1; i <= n; i++ ) {
			if (((i % 2) != 0) && ((i % 3) != 0) && ((i % 5) != 0)){
				a++;
			}
			
		}
		System.out.println(a);
	

	}

}
