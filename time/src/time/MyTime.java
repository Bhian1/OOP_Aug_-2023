package time;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhian
 */

    public class MyTime {
    private int hour;
    private int minute;
    private int second;
    private boolean isAM;

    public MyTime(int hour, int minute, int second, boolean isAM) {
        if (hour < 0 || hour > 12 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time values");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.isAM = isAM;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public boolean isAM() {
        return isAM;
    }

    public String toString() {
        String meridian = isAM ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hour, minute, second, meridian);
    }
    
     public void advanceSeconds(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Number of seconds must be non-negative");
        }

        int totalSeconds = hour * 3600 + minute * 60 + second + seconds;
        
        int newHour = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int newMinute = remainingSeconds / 60;
        int newSecond = remainingSeconds % 60;
        
        hour = newHour % 12;
        minute = newMinute;
        second = newSecond;
    }
   
}
