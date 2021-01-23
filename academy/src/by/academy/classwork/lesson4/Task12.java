package by.academy.classwork.lesson4;

public class Task12 {
	
//Найти произведение двузначных нечетных чисел кратных 13.
	
	public static void main(String[] args) {
		long result = 1;
		for (int i = 13; i < 100; i = i + 13) {
			if (i % 2 == 0) {
				result = result * i;
			}
		}
		System.out.println(result);
	}

}
