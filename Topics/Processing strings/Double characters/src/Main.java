import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();

        StringBuilder builder = new StringBuilder();

        for (char letter : text) {
            builder.append(letter);
            builder.append(letter);
        }

        System.out.println(builder.toString());

    }
}