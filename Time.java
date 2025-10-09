public class Time {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Constructors
    public Time() {
        setTime(0, 0, 0);
    }

    public Time(int h) {
        setTime(h, 0, 0);
    }

    public Time(int h, int m) {
        setTime(h, m, 0);
    }

    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    // Set methods
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        hour = (h >= 0 && h < 24) ? h : 0;
    }

    public void setMinute(int m) {
        minute = (m >= 0 && m < 60) ? m : 0;
    }

    public void setSecond(int s) {
        second = (s >= 0 && s < 60) ? s : 0;
    }

    // Get methods
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    // Military time format: HH:MM
    public String toMilitaryString() {
        return String.format("%02d:%02d", hour, minute);
    }

    // Standard time format: H:MM:SS AM/PM
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12,
                minute,
                second,
                (hour < 12) ? "AM" : "PM");
    }

    // Tick one second forward
    public void tick() {
        setSecond(second + 1);
        if (second == 0) {
            incrementMinute();
        }
    }

    public void incrementMinute() {
        setMinute(minute + 1);
        if (minute == 0) {
            incrementHour();
        }
    }

    public void incrementHour() {
        setHour(hour + 1);
    }
}