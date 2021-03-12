package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {

		ArrayList<Integer> grades = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 20; i++) {
			grades.add(rand.nextInt(10) + 1);
		}

		Iterator<Integer> iterator = grades.iterator();
		Integer max = 0;
		while (iterator.hasNext()) {
			Integer n = iterator.next();
			if (max < n) {
				max = n;
			}
		}
		System.out.println("Максимальная оценка в калссе: " + max);
	}
}
