import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int n = scanner.nextInt();

        if (n <= s.length()) {
            s = s.substring(n) + s.substring(0, n);
        }

        System.out.println(s);
    }
}