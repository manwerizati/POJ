import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a>0) && (b>0) && (c>0)) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        } else {
            System.out.println("BŁĄD");
        }
    }
}