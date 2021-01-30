package by.academy.tasks.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. Написать regexp для email.

public class Task6 {
	static Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");

	public static void main(String[] args) {
		String s = " _123test@test.com";

		System.out.println(validate(s));
	}

	private static boolean validate(String s) {
		s = s.trim();

		return p.matcher(s).matches();

	}

}
