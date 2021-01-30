package by.academy.classwork.lesson6;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String s = " _123test@test.com";

		System.out.println(validate(s));
	}

	private static boolean validate(String s) {
		s = s.trim();
		String template = "[a-zA-Z0-9_]+\\.[a-z]{3}";
		Pattern pattern = Pattern.compile(template);
		
		return true;
	}
}
