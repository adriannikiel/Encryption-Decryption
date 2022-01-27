import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        System.out.println(isPalindrome(line) ? "yes" : "no");
    }

    private static boolean isPalindrome(String line) {

        for (int i = 0; i < line.length() / 2; i++) {

            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}