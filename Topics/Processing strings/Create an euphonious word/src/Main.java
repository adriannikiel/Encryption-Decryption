import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        //final String ADDITIONAL_VOWEL = "a";
        //final String ADDITIONAL_CONSONANT = "b";

        boolean isPrevVowel = isVowel(word.substring(0, 1));
        int count = 1;
        int result = 0;

        for (int i = 1; i < word.length(); i++) {

            boolean isVowel = isVowel(word.substring(i, i + 1));

            if (isPrevVowel == isVowel) {
                count++;
            } else {
                count = 1;
            }

            if (count == 3) {
                count = 0;
                result++;
                i--;
            }

            isPrevVowel = isVowel;

        }

        System.out.println(result);
    }

    private static boolean isVowel(String letter) {
        final String[] vowels = {"A", "E", "I", "O", "U", "Y"};

        boolean result = false;

        for (String vowel : vowels) {
            if (vowel.equalsIgnoreCase(letter)) {
                result = true;
                break;
            }
        }
        return result;
    }
}