package by.academy.homework.hw7.Task2;

public class User extends Person {

	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
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

	void printUserInfo() {
		System.out.println("Firstname - " + getFirstName());
		System.out.println("Lastname - " + getLastName());
		System.out.println("Age - " + getAge());
		System.out.println("Date Of Birthday - " + getDateOfBirth());
		System.out.println("Login - " + getLogin());
		System.out.println("Email - " + getEmail());
	}

}
