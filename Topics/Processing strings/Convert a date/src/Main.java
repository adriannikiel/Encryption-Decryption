import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split("-");

        String year = date[0];
        String month = date[1];
        String day = date[2];

        String dateFormatted =  month + "/" + day + "/" + year;
        System.out.println(dateFormatted);

    }
}