package by.academy.homework.hw4.Task3;

public class CustomIntegerDemo {

	public static void main(String[] args) {
		Integer[][] array = { { 1, 8, 2, 6, 7, 3, }, { 6, 5, 4 } };
		Integer[][] array1 = { { 6, null, null }, { null, null, 6 } };
		ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);

		while (arrayIterator.hasNext()) {
			Integer i = arrayIterator.next();
			System.out.println(i);
		}
	}
}
