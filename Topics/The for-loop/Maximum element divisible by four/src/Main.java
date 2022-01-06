import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();
        int maxDivisibleByFour = 0;

        for (int i = 0; i < numberOfElements; i++) {
            int nextNumber = scanner.nextInt();

            if ((nextNumber % 4 == 0) && (nextNumber > maxDivisibleByFour)) {
                maxDivisibleByFour = nextNumber;
            }

        }

        System.out.println(maxDivisibleByFour);
    }
}