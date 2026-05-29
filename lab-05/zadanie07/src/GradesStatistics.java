import java.util.Arrays;

public class GradesStatistics {
    private int[] grades;

    public GradesStatistics(int[] grades) {
        this.grades = grades;
    }

    public double getAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public double getMedian() {
        int[] sortedGrades = Arrays.copyOf(grades, grades.length);
        Arrays.sort(sortedGrades);
        int n = sortedGrades.length;

        if (n % 2 == 0) {
            return (sortedGrades[n / 2 - 1] + sortedGrades[n / 2]) / 2.0;
        } else {
            return sortedGrades[n / 2];
        }
    }

    public int getMinimum() {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public int getMaximum() {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public double getStdDev() {
        double sumSq = 0;
        for (int grade : grades) {
            sumSq += (grade * grade);
        }
        double average = getAverage();
        double variance = (sumSq / grades.length) - (average * average);
        return Math.sqrt(variance);
    }

    public String toString() {
        return Arrays.toString(grades);
    }
}