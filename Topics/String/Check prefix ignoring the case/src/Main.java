import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text = scanner.next().toUpperCase();

        if (text.startsWith("J")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}