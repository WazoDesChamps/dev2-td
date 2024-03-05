package Bisextille;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLenient() {
        if (year%100 == 0) {
            return year%400 == 0;
        }
        return year%4 == 0;
    }
}
