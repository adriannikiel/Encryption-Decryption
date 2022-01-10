package encryptdecrypt;

public class Main {
    public static void main(String[] args) {

        final char min = 'a';  //97
        final char max = 'z';  //122
        String message = "we found a treasure!";

        for (int i = 0; i < message.length(); i++) {

            char token = message.charAt(i);

            if (token >= min && token <= max) {
                char c = (char) (max - token + min);
                System.out.print(c);

            } else {
                System.out.print(token);
            }
        }

    }
}