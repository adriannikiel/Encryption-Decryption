package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String target = scanner.nextLine();
        final String text = scanner.nextLine();
        final int key = scanner.nextInt();

        switch (target) {
            case "enc":
                System.out.println(encryptText(text, key));
                break;
            case "dec":
                System.out.println(decryptText(text, key));
                break;
        }

    }

    public static String encryptText(String message, int key) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            char c = (char) (message.charAt(i) + key);
            result.append(c);
        }

        return result.toString();
    }

    public static String decryptText(String cyphertext, int key) {
        return encryptText(cyphertext, -key);
    }

}