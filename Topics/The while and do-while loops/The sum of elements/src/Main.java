import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            number = scanner.nextInt();
        }

        System.out.println(sum);

    }
}