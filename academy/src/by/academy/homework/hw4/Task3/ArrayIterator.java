package by.academy.homework.hw4.Task3;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

	private T[][] array;
	private int cursorX = 0;
	private int cursorY = 0;

	public ArrayIterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || cursorX + 1 >= array.length) {
			return cursorY < array[cursorX].length;
		}
		return cursorX < array.length;
	}

	@Override
	public T next() {
		if (cursorY == array[cursorX].length) {
			cursorY = 0;
			cursorX++;
		}
		return array[cursorX][cursorY++];
	}
}
