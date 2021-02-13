package by.academy.classwork.lesson10;

public class Box<T> {

	private T item;
	
	public Box(T item) {
		this.item = item;
	}

	public T getItems() {
		return item;
	}

	public void setItems(T item) {
		this.item = item;
	}
}