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
	
	public Person(String name, String phone, String email, Double money) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}
