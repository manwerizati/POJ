import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();
        String planet = scan.next();

        System.out.printf("%.2f", age(seconds, planet));
    }

    static double age(int seconds, String planet) {
        double orbitalPeriod = 0;
        switch (planet) {
            case "Merkury":
                orbitalPeriod = 0.2408467;
                break;
            case "Wenus":
                orbitalPeriod = 0.61519726;
                break;
            case "Mars":
                orbitalPeriod = 1.8808158;
                break;
            case "Jowisz":
                orbitalPeriod = 11.862615;
                break;
            case "Saturn":
                orbitalPeriod = 29.447498;
                break;
            case "Uran":
                orbitalPeriod = 84.016846;
                break;
            case "Neptun":
                orbitalPeriod = 164.79132;
                break;
            case "Ziemia":
                orbitalPeriod = 1.0;
                break;
        }
        double age = (seconds / (31557600 * orbitalPeriod));
        return age;
    }
}