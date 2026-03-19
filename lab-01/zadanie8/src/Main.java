import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n <= 0) {
            n = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int z = 0; z <= i; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int y = 0; y < n - i; y++) {
                System.out.print(' ');
            }
            for (int z = 0; z < i; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int y = 0; y < i - 1; y++) {
                System.out.print(' ');
            }
            for (int z = 0; z < n - i + 1; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}