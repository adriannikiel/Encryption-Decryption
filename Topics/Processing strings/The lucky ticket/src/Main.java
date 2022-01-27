import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split("");

        int sum1 = Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + Integer.parseInt(s[2]);
        int sum2 = Integer.parseInt(s[3]) + Integer.parseInt(s[4]) + Integer.parseInt(s[5]);

        System.out.println((sum1 == sum2) ? "Lucky" : "Regular");


    }
}