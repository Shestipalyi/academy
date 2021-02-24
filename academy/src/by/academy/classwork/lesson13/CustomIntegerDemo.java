package by.academy.classwork.lesson13;

public class CustomIntegerDemo {

	public static void main(String[] args) {
		Integer[] array = { 1, 5, 9, 7, 3, 2, 4, 6, 2, 8, 1, 2, 4, 7 };
		Integer[] array1 = { null, null, null };
		ArrayIterator<Integer> arrIterator = new ArrayIterator<Integer>(array);

		while (arrIterator.hasNext()) {
			Integer i = arrIterator.next();
			System.out.println(i);
		}
	}
}
