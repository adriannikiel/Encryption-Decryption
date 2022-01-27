import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");

        String longest = "";

        for (String word : text) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);

    }
}