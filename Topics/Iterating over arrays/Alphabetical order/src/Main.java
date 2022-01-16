import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        boolean isAlphabetic = true;

        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].compareTo(strings[i + 1]) > 0) {
                isAlphabetic = false;
                break;
            }
        }

        System.out.println(isAlphabetic);
    }

}