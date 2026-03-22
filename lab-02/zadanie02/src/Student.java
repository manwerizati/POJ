public class Student {
    private String name;
    private String surname;
    private String index;
    private double presence;
    private int grade;

    Student(String name, String surname, String index, double presence, int grade) {
        setName(name);
        setSurname(surname);
        setIndex(index);
        setGrade(grade);
        setPresence(presence);
    }

    Student(String index, double presence, int grade) {
        this.name = "Unknown";
        this.surname = "Unknown";
        setIndex(index);
        setGrade(grade);
        setPresence(presence);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getPresence() {
        return presence;
    }

    public void setPresence(double presence) {
        this.presence = presence;
        if (presence < 50) {
            this.grade = 2;
        }
    }
}