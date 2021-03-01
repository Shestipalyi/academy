package by.academy.homework.hw4.Task1;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static DayOfWeek fromValue(int value) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.ordinal() == value - 1) {
                return day;
            }
        }
        throw new RuntimeException("Unknown value" + value);
    }
}
