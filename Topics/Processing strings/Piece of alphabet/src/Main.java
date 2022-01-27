import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean isAlphabetSubstring = true;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) + 1 != text.charAt(i + 1)) {
                isAlphabetSubstring = false;
                break;
            }
        }


        System.out.println(isAlphabetSubstring);
    }
}