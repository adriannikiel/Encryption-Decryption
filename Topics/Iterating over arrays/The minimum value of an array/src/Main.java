import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();

        int min = scanner.nextInt();

        for (int i = 0; i < sizeOfArray - 1; i++) {
            int value = scanner.nextInt();

            if (value < min) {
                min = value;
            }
        }

        System.out.println(min);
    }
}