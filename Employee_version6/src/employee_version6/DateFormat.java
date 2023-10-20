package employee_version6;

import java.util.Date;

public class DateFormat {
    private int day;
    private int month;
    private int year;

    public DateFormat(){
        day = 0;
        month = 0;
        year = 0;
    }

    public DateFormat(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(day + "-" + month + "-" + year);
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}