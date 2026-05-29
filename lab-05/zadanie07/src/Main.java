import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        int[] inputGrades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            inputGrades[i] = scanner.nextInt();
        }

        GradesStatistics stats = new GradesStatistics(inputGrades);

        System.out.println("The grades are: " + stats);
        System.out.printf("The average is: %.2f\n", stats.getAverage());
        System.out.printf("The median is: %.2f\n", stats.getMedian());
        System.out.println("The minimum is: " + stats.getMinimum());
        System.out.println("The maximum is: " + stats.getMaximum());
        System.out.printf("The standard deviation is: %.2f\n", stats.getStdDev());

        scanner.close();
    }
}