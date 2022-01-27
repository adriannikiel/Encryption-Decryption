import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        double result = (count(string, "G") + count(string, "C")) / string.length() * 100;

        System.out.println(result);
    }

    private static double count(String string, String letter) {

        int result = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.toUpperCase().charAt(i) == letter.toUpperCase().charAt(0)) {
                result++;
            }
        }

        return result;

    }
}