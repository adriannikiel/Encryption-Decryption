import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();
        int[] numbers = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] = scanner.nextInt();
        }

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        boolean result = true;

        for (int i = 0; i < sizeOfArray - 1; i++) {

            if ((numbers[i] == number1 && numbers[i + 1] == number2)
                    || (numbers[i] == number2 && numbers[i + 1] == number1)) {
                result = false;
                break;
            }

        }

        System.out.println(result);
    }
}