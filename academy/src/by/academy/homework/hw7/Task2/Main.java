package by.academy.homework.hw7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		User user = new User("Иван", "Иванов", 21, "29.02.1937", "Username", "qwerty123",
				"Ivanov1937@mail.ru");
		
		Class<User> userClass = User.class;
		Class<? super User> personClass = userClass.getSuperclass();
		try {
			System.out.println("----------");
			Method userMethod = userClass.getMethod("getAge");
			System.out.println("Method name: " + userMethod.getName());
			System.out.println();

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("----------------");
		Method[] userMethods = userClass.getMethods();
		for (Method method : userMethods) {
			System.out.println(method);
		}
		System.out.println();

		System.out.println("----------------");
		try {
			Field userField = userClass.getField("password");
			System.out.println(userField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("----------------");
		Field[] userFields = userClass.getFields();
		for (Field field : userFields) {
			System.out.println(field);
		}
		System.out.println();

		try {
			System.out.println("----------------");
			Method userDeclaredMethod = userClass.getDeclaredMethod("printUserInfo");
			System.out.println("Method name: " + userDeclaredMethod.getName());
			System.out.println();

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("----------------");
		Method[] userDeclaredMethods = userClass.getDeclaredMethods();
		for (Method declaredMethod : userDeclaredMethods) {
			System.out.println(declaredMethod);
		}
		System.out.println();

		System.out.println("----------------");
		try {
			Field userDeclaredField = userClass.getDeclaredField("login");
			System.out.println(userDeclaredField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("----------------");
		Field[] userDeclaredFields = userClass.getDeclaredFields();
		for (Field declaredField : userDeclaredFields) {
			System.out.println(declaredField);
		}
		System.out.println();

		try {

			Field fieldFirstName = personClass.getDeclaredField("firstName");
			fieldFirstName.setAccessible(true);
			fieldFirstName.set(user, "Петр");

			Field fieldLastName = personClass.getDeclaredField("lastName");
			fieldLastName.setAccessible(true);
			fieldLastName.set(user, "Петров");

			Field fieldLastAge = personClass.getDeclaredField("age");
			fieldLastAge.setAccessible(true);
			fieldLastAge.set(user, 25);

			Field fieldDateOfBirth = personClass.getDeclaredField("dateOfBirth");
			fieldDateOfBirth.setAccessible(true);
			fieldDateOfBirth.set(user, "12.12.2012");

			Field fieldLogin = userClass.getDeclaredField("login");
			fieldLogin.setAccessible(true);
			fieldLogin.set(user, "Username2");

			Field fieldPassword = userClass.getDeclaredField("password");
			fieldPassword.setAccessible(true);
			fieldPassword.set(user, "zxcvbn987");

			Field fieldEmail = userClass.getDeclaredField("email");
			fieldEmail.setAccessible(true);
			fieldEmail.set(user, "Petrov2012@mail.ru");

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Method getMethod = userClass.getDeclaredMethod("printUserInfo");
			getMethod.setAccessible(true);
			getMethod.invoke(user);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}