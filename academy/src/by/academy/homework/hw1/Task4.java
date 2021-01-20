package by.academy.homework.hw1;

public class Task4 {

	public static void main(String[] args) {
		int i = 1;
		int n = 2;
		while (n < 1_000_000) {
			System.out.println(i);
//			System.out.println(n);
			i++;
			n = (int) Math.pow(2, i);
		}

	}

}
