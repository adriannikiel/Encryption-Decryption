import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        char[] textArray = scanner.next().toCharArray();
        StringBuilder encryptedText = new StringBuilder();

        int count = 1;
        encryptedText.append(textArray[0]);

        for (int i = 1; i < textArray.length; i++) {
            if (textArray[i] == textArray[i - 1]) {
                count++;
            } else {
                encryptedText.append(count).append(textArray[i]);
                count = 1;
            }
        }

        encryptedText.append(count);

        System.out.println(encryptedText.toString());

    }
}