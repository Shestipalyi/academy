package by.academy.homework.hw7.Task2;

public class User extends Person {
	
	private String login;
	private String password;
	private String email;
	
	
	public User (String firstName, String lastName, int age, String dateOfBirth, String login, String password, String email) {
		super (firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private void printUserInfo () {
		System.out.println("Имя: " + getFirstName () + "\nФамилия: " + getLastName() + "\nВозраст: " + getAge() +
				"\nДата рождения: " + getDateOfBirth() + "\nЛогин: " + getLogin() + "\nПароль: " + getPassword() +
				"\nEmail: " + getEmail());
	}
}
