package by.academy.classwork.lesson1;

import java.io.*;

public class Cat {
	int age;
	String nickname;
	int money;
	String initials;
	boolean isHomeAnimal;

	public Cat() {
		super();
	}
	
	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}
	
	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public void setMoney(int x) {
		money = x;
	}

	public int getMoney() {
		System.out.println(money);
		return money;
	}

	public void setInitials(String y) {
		initials = y.substring(0, 1);
	}

	public String getInitials() {
		System.out.println(initials);
		return initials; 
	}

	public void setIsHomeAnimal(boolean z) {
		isHomeAnimal = z;
	}

	public boolean getIsHomeAnimal() {
		System.out.println(isHomeAnimal);
		return isHomeAnimal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}