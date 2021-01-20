package by.academy.classwork.lesson1;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Tom");
		Cat cat2 = new Cat();
		cat1.eat();
		cat1.sleep();
		cat1.walk();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		System.out.println(cat2.age);

//		cat1.setMoney(10);
//		cat1.getMoney();
//		
//		cat1.setInitials("Барсик");
//		cat1.getInitials();
//		
//		cat1.setIsHomeAnimal(true);
//		cat1.getIsHomeAnimal();
	}

}
