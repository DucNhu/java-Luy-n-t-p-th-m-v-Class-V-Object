package java_lssion7;

public class TimeInput {
    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second) {
        if (second >= 0 && second <= 99) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("error: invalid second");
        }
    }

    public void setMinute(int minute) {
        if (hour >= 0 && hour <= 59) {
            this.minute = minute;
        } else {
            this.hour = 0;
            System.out.println("error: invalid hour");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("error: invalid hour");
        }
    }

    //
    public void setTime(int second, int minute, int hour) {
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    public TimeInput() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }

    public String toString() {
        return String.format("%0d : %02d : %02d", hour, minute, second);
    }

    public TimeInput netSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;

            if (minute >= 60) {
                minute = 0;
                ++hour;

                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;

    }
}

