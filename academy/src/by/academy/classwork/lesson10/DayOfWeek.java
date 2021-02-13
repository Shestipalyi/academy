package by.academy.classwork.lesson10;

public enum DayOfWeek {
	MONDAY("1", "понедельник"), TUESDAY("2", "вторник"), WENSDAY("3", "среда"), THURSDAY("4", "четверг"),
	FRIDAY("5", "пятница"), SATURDAY("6", "суббота"), SUNDAY("7", "воскресение");

	private String num;
	private String rusName;

	DayOfWeek(String num, String rusName) {
		this.num = num;
		this.rusName = rusName;
	}

	public String getNum() {
		return num;
	}

	public String getRusName() {
		return rusName;
	}
}
