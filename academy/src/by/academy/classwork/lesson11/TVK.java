package by.academy.classwork.lesson11;

import java.io.Serializable;

public class TVK<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {

	private T x;
	private V y;
	private K z;

	public TVK(T x, V y, K z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void PrintVTKClass() {
		System.out.println(x.getClass());
		System.out.println(y.getClass());
		System.out.println(z.getClass());
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public V getY() {
		return y;
	}

	public void setY(V y) {
		this.y = y;
	}

	public K getZ() {
		return z;
	}

	public void setZ(K z) {
		this.z = z;
	}

}
