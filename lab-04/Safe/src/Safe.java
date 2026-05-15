public class Safe {
    private int correctPin;
    private Alarm alarm;

    Safe(int correctPin, Alarm alarm) {
        this.correctPin = correctPin;
        this.alarm = alarm;
    }

    void unlock(int pin) {
        if (pin == correctPin) {
            return;
        } else {
            alarm.react();
        }
    }
}
