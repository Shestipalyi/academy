package by.academy.homework1;

import java.io.IOException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� ������");
		String type = scan.nextLine();
		switch (type) {
		case "int":
			System.out.println("������� ����� �����");
			System.out.println("������� �� ������� �� 2 ���������� " + scan.nextInt() % 2);
			break;
		case "double":
			System.out.println("������� �����");
			System.out.println("70% �� ����� ���������� " + scan.nextDouble() * 0.7);
			break;
		case "float":
			System.out.println("������� �����");
			System.out.println("������� ����� ���������� ���������� " + Math.pow(scan.nextFloat(), 2));
			break;
		case "char":
			System.out.println("������� ������");
			int x = System.in.read();
			System.out.println("��� ������� " + x);
			break;
		case "String":
			System.out.println("������� ���");
			System.out.println("Hello " + scan.nextLine());
			break;
		default:
			System.out.println("Unsupported type");
		}
		scan.close();
	}
}
