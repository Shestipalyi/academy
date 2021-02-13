package by.academy.classwork.lesson10;

public class WhatDayIsTodayNum {

	public static void main(String[] args) {
		for (DayOfWeek day : DayOfWeek.values()) {
			System.out.println(day + " " + (day.ordinal() + 1));
		}
	}
}
