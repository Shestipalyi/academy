package by.academy.classwork.lesson2;

public class Cat {
	int Age;
	String nickname;
	double money;
	
	public Cat() {
	}
	
	public Cat(String nickname) {
		this.nickname = nickname;
	}
	
	public void grow() {
		this.Age += 1;
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
	public void setMoney(double money) {
		this.money = money;
	}
	
	public int getAge() {
		return Age;
	}
	
	public double getMoney() {
		return money;
	}
}