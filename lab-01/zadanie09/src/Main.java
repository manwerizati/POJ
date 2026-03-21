import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char[] array = new char[100];

        int letters = word.length();
        for (int i = 0; i < letters; i++) {
            array[i] = word.charAt(i);
        }

        if (isPalindrome(array, letters)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    static boolean isPalindrome(char[] array, int letters) {
        boolean isPalindrome = true;
        for (int j = 0; j < letters / 2; j++) {
            if (array[j] != array[letters - 1 - j]) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}