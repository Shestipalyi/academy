package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9));
		System.out.println(removeDuplicate(list));
	}

	public static <T> Collection<T> removeDuplicate(Collection<T> collection) {
		return new HashSet<T>(collection);
	}
}
