package by.academy.classwork.lesson12;

public class User {
//	1.	Создать класс User,содержащий private переменные login, password.
//	Создать внутренний	класс Query	в классе User.
//	Класс Query	содержит метод	printToLog(), который распечатывает на консоль сообщение о том
//	что пользователь с таким то логином и паролем отправил запрос. 
//	Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog(). 
//	В методе main(): создать экземпляр класса User и вызватьметод createQuery();
//	создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
//	создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public static class Query {	
		User user;
		public Query (User user) {
			this.user = user;
		}
		public void printToLog() {
			System.out.println("User - " + user.login);
		}
	}

	public void createQuery() {
		Query q = new Query(this);
		q.printToLog();
	}
}
