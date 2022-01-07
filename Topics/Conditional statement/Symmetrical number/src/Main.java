import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstDigit = number / 1000;
        int secondDigit = (number % 1000) / 100 ;
        int thirdDigit = ((number % 1000) % 100) / 10;
        int fourthDigit = ((number % 1000) % 100) % 10;

        /*
        int firstDigit = number / 1000;
        int secondDigit = (number % 1000) / 100;
        int thirdDigit = (number % 100) / 10;
        int fourthDigit = number % 10;
        */

        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }


    }
}