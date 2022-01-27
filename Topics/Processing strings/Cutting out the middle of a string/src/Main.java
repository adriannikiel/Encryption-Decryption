import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        int textLength = text.length();

        if (textLength % 2 == 0) {
            text = text.substring(0, textLength / 2 - 1) + text.substring(textLength / 2 + 1, textLength);
        } else {
            text = text.substring(0, textLength / 2) + text.substring(textLength / 2 + 1, textLength);
        }

        System.out.println(text);

    }
}