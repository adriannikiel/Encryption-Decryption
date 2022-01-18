import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();
        int[] numbers = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = 0;

        for (int i = 0; i < numberOfElements - 1; i++) {
            int product = numbers[i] * numbers[i + 1];

            if (product > max) {
                max = product;
            }
        }

        System.out.println(max);
    }
}