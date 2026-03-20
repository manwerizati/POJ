import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int elements = scan.nextInt();
        int[] array = new int[elements];

        for (int i = 0; i < elements; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(max(array, 0));
    }

    static int max(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }

        return Math.max(array[index], max(array, index + 1));
    }
}