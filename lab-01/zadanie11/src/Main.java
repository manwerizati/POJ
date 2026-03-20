import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        System.out.println(isPangram(sentence));
    }

    static boolean isPangram(String sentence) {
        String lowerSentence = sentence.toLowerCase();
        boolean[] alphabet = new boolean[26];

        int letters = lowerSentence.length();
        for (int i = 0; i < letters; i++) {
            char c = lowerSentence.charAt(i);
            if (Character.isLetter(c)) {
                alphabet[c - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (int j = 0; j < 26; j++) {
            if (alphabet[j] == false) {
                isPangram = false;
            }
        }

        return isPangram;
    }
}