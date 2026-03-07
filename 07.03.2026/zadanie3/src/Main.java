import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();

        System.out.println("\"%" + second + " " + first + "%\"" );
    }
}