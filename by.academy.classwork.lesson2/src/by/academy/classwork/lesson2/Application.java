package by.academy.classwork.lesson2;

public class Application {
	
	public static void main (String ...args) {
		Cat noname = new Cat();
		Cat named = new Cat ("Вася");
		
		named.eat();
		named.sleep();
		named.walk();
		
		noname.grow();
		noname.grow();
		noname.grow();
		System.out.println(noname.Age);
	}
}
