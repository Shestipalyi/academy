package by.academy.deal;

public class Person {
	String name;
	String phone;
	String email;
	Double money;
	
	public Person() {
		name = "name";
		phone = "+375 XX XXX XX XX" ;
		email = "xxxxxx@xxxx.xxx";
		money = 500.0; 
	}
	
	public Product(String name, String phone, String email, Double money) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.money = money;
	}
}
