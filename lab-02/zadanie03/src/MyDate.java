public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(int day, int month, int year) {
        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year >= 1990 && year <= 2050) {
            setDay(day);
            setMonth(month);
            setYear(year);
        } else {
            System.out.println("Niepoprawne dane");
        }
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    void displayDate() {
        System.out.printf("%02d/%02d/%04d", day, month, year);
    }
}