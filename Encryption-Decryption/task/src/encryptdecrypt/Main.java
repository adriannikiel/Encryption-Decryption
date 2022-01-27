package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        final int key = scanner.nextInt();

        System.out.println(encryptText(message, key));

    }

    public static String encryptText(String message, int key) {

        final char min = 'a';  //97
        final char max = 'z';  //122

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            char token = message.charAt(i);

            if (token >= min && token <= max) {
                char c = (char) (token + key);

                if (c > max) {
                    c = (char) (min + token + key - max - 1);
                }

                result.append(c);

            } else {
                result.append(token);
            }
        }

        return result.toString();
    }


}