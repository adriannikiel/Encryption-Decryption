import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); // uppercase letters
        int B = scanner.nextInt(); // lowercase letters
        int C = scanner.nextInt(); // digits
        int N = scanner.nextInt(); // exact number of symbols

        final char minBigLetter = 'A';      //65
        final char maxBigLetter = 'Z';      //90
        final char minSmallLetter = 'a';    //97
        final char maxSmallLetter = 'z';    //122
        final char minDigit = '0';          //48
        final char maxDigit = '9';          //57

        char nextBiglLetter = minBigLetter;
        char nextSmallLetter = minSmallLetter;
        char nextDigit = minDigit;
        char prevChar = ' ';

        for (int i = 0; i < A; i++) {
            System.out.print(nextBiglLetter);
            prevChar = nextBiglLetter;

            if (nextBiglLetter + 1 <= maxBigLetter) {
                nextBiglLetter++;
            } else {
                nextBiglLetter = minBigLetter;
            }

        }

        for (int i = 0; i < B; i++) {
            System.out.print(nextSmallLetter);
            prevChar = nextBiglLetter;

            if (nextSmallLetter + 1 <= maxSmallLetter) {
                nextSmallLetter++;
            } else {
                nextSmallLetter = minSmallLetter;
            }
        }

        for (int i = 0; i < C; i++) {
            System.out.print(nextDigit);
            prevChar = nextBiglLetter;

            if (nextDigit + 1 <= maxDigit) {
                nextDigit++;
            } else {
                nextDigit = minDigit;
            }
        }

        int sumSymbols = A + B + C;

        if (prevChar != minBigLetter) {
            nextBiglLetter = minBigLetter;
        } else {
            nextBiglLetter = maxBigLetter;
        }

        while (sumSymbols < N) {
            System.out.print(nextBiglLetter);

            if (nextBiglLetter + 1 <= maxBigLetter) {
                nextBiglLetter++;
            } else {
                nextBiglLetter = minBigLetter;
            }

            sumSymbols++;
        }
    }
}