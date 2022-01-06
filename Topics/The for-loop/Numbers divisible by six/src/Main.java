import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int sum = 0;
        int numberOfElements = scanner.nextInt();

        for (int i = 0; i < numberOfElements; i++) {
            int number = scanner.nextInt();

            if (number % 6 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}