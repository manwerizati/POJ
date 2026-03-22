class Main {
    public static void main(String[] args) {
        Student student = new Student("marek", "kowalski", "s34534", 70, 4);
        System.out.println(student.getName() + " " + student.getSurname() + " " + student.getIndex() + " " + student.getPresence() + " " + student.getGrade());

        Student student1 = new Student("jan", "kowalski", "s37832", 40, 4);
        System.out.println(student1.getName() + " " + student1.getSurname() + " " + student1.getIndex() + " " + student1.getPresence() + " " + student1.getGrade());

        Student student2 = new Student("s43435", 54, 3);
        System.out.println(student2.getName() + " " + student2.getSurname() + " " + student2.getIndex() + " " + student2.getPresence() + " " + student2.getGrade());
    }
}
