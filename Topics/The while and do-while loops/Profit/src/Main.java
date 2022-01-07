import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double M = scanner.nextDouble();
        final double P = scanner.nextDouble();
        final double K = scanner.nextDouble();

        int count = 0;
        double money = M;

        while (money < K) {
            money = money + money * P / 100.0;
            count++;
        }

        System.out.println(count);
    }
}