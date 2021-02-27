package by.academy.classwork.lesson14;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<HeavyBox> treeSet = new TreeSet<>();

		treeSet.add(new HeavyBox(6, 5, 2, 1));
		treeSet.add(new HeavyBox(2, 5, 1, 5));
		treeSet.add(new HeavyBox(3, 4, 5, 7));
		treeSet.add(new HeavyBox(4, 1, 8, 9));
		treeSet.add(new HeavyBox(8, 9, 7, 1));
		
		for (HeavyBox b : treeSet) {
			System.out.println(b);
		}
	}
}