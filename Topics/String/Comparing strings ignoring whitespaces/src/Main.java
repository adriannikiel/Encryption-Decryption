import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        if (firstLine.replace(" ", "").equals(secondLine.replace(" ", ""))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}