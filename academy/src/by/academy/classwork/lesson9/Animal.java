package by.academy.classwork.lesson9;

public abstract class Animal {
	public Integer age;

	public Animal() {
		super();
	}	
	public abstract String food();

	public void Eating() {
		System.out.println("I can eat " + food());
	}

}

