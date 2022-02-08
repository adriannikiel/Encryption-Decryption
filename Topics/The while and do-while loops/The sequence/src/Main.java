import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();

        int max = 0;

        while (n > 0) {

            int value = scanner.nextInt();

            if (value > max && value % 4 == 0) {
                max = value;
            }
            n--;
        }

        System.out.println(max);
    }
}