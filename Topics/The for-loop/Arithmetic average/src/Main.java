import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        int quantity = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                quantity++;
                sum += i;
            }
        }

        System.out.println((sum * 1.0) / quantity);
    }
}