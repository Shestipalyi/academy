package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		Random rand = new Random();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(rand.nextInt());
			arrayList.add(rand.nextInt());
		}

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(rand.nextInt(100000));
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1 - startTime1);

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.get(rand.nextInt(100000));
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2 - startTime2);
	}
}
