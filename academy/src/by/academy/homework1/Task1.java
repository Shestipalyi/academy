package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� �������");
		double sum = scan.nextDouble();
		System.out.println("������� ������� ����������");
		int age = scan.nextInt();
		scan.close();

		int x = 3;

		if (sum < 100) {
			x = 5;
		} else if (sum >= 100 && sum < 200) {
			x = 7;
		} else if (sum >= 200 && sum < 300) {
			x = 12;
			if (age >= 18) {
				x += 4;
			} else {
				x -= 3;
			}
		} else if (sum >= 300 && sum < 400) {
			x = 15;
		} else {
			x = 20;
		}
//		System.out.println("����� �������: " + sum);
//		System.out.println("������� ����������: " + age);
//		System.out.println("������ ���������: " + x + "%");		
		System.out.println("�������� ��������� � ������ ������ ���������: " + sum * (100 - x) / 100);

	}

}
