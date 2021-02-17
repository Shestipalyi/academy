package by.academy.classwork.lesson11;

public class Matrix<T> {

	private T[] ar;
	
	public Matrix(T[] ar) {
		this.ar = ar.clone();
	}	

	public T[] getArray() {
		return ar;
	}

	public void setArray(T[] ar) {
		this.ar = ar;
	}
	
	


}