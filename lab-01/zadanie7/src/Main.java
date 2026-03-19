import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int elementsN = scan.nextInt();
        int elementsM = scan.nextInt();

        if (elementsN == elementsM && elementsN > 0 && elementsM > 0) {
            int[] N = new int[elementsN];
            int i = 0;
            while (i < N.length) {
                N[i] = scan.nextInt();
                i++;
            }

            int[] M = new int[elementsM];
            int j = 0;
            while (j < M.length) {
                M[j] = scan.nextInt();
                j++;
            }

            int sum = 0;
            for (int z = 0; z < elementsN; z++) {
                sum = sum + N[z] * M[z];
            }

            System.out.println(sum);
        } else {
            System.out.println("BŁĄD");
        }
    }
}