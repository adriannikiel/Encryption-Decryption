import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        long factorial = 1;
        int result = 1;

        do {
            result++;
            factorial *= result;
        } while (factorial <= m);

        System.out.println(result);

    }
}