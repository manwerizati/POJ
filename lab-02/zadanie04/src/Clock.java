public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    Clock() {
        setHours(12);
        setMinutes(0);
        setSeconds(0);;
    }

    Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    Clock(int secondsFromMidnight) {
        setHours(secondsFromMidnight / 3600);
        setMinutes((secondsFromMidnight % 3600) / 60);
        setSeconds(secondsFromMidnight % 60);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void tick() {
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;

            if (minutes == 60) {
                minutes = 0;
                hours++;

                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    void tickDown() {
        seconds--;

        if (seconds == (-1)) {
            seconds = 59;
            minutes--;

            if (minutes == (-1)) {
                minutes = 59;
                hours--;

                if (hours == (-1)) {
                    hours = 23;
                }
            }
        }
    }

    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
