package by.academy.classwork.lesson10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate Year = LocalDate.of(1970, 1, 1);
		Year = Year.plusYears(30);
		Year = Year.minusMonths(7);
		Year = Year.minusDays(3);
		System.out.println(Year);
	}

}
