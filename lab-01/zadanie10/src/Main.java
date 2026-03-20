import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        int[][] array;
        array = new int[10][10];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}