import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        int result = 0;
        StringBuilder builder = new StringBuilder(firstLine);

        while (builder.indexOf(secondLine) > -1) {
            result++;
            builder.delete(0, builder.indexOf(secondLine) + secondLine.length());

        }

        System.out.println(result);
    }
}