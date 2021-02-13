package by.academy.classwork.lesson10;

public class WhatDayIsToday {

	public static void main(String[] args) {
		DayOfWeek day = DayOfWeek.SATURDAY;
		switch (day) {
		case MONDAY:
			System.out.println("Сегодня понедельник");
			break;
		case TUESDAY:
			System.out.println("Сегодня вторник");
			break;
		case WENSDAY:
			System.out.println("Сегодня среда");
			break;
		case THURSDAY:
			System.out.println("Сегодня четверг");
			break;
		case FRIDAY:
			System.out.println("Сегодня пятница");
			break;
		case SATURDAY:
			System.out.println("Сегодня суббота");
			break;
		case SUNDAY:
			System.out.println("Сегодня воскресение");
			break;
		default:
			System.out.println("День не указан");
		}
	} 
}
