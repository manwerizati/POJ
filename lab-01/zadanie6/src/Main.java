import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[3];
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = scan.nextDouble();
            i++;
        }

        for (int z = 0; z < 3; z++) {
            for (int j = 0; j < 2; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.printf("%.6f ", numbers[0]);
        System.out.printf("%.6f ", numbers[1]);
        System.out.printf("%.6f \n", numbers[2]);

        for (int z = 0; z < 3; z++) {
            for (int j = 0; j < 2; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.printf("%.6f ", numbers[0]);
        System.out.printf("%.6f ", numbers[1]);
        System.out.printf("%.6f ", numbers[2]);
    }
}