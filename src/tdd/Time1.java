package tdd;

public class Time1 {
    private int hour;
    private int minute;
    private int second;


    public Time1(int hour, int minute, int second){
        validate(hour, minute, second);
        this. hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time1(int hour){
        this(hour, 0);
    }

    private Time1(int hour,int minute){
        this(hour, minute, 0);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


    public static void validate(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }
    public static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 23;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is invalid.");
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second < 0 || second > 60;
        if (secondIsInvalid) throw new IllegalArgumentException("Second is invalid.");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute > 60;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute is invalid.");
    }
}
