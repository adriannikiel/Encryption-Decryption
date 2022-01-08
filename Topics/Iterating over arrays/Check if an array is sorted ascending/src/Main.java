import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        boolean isAscending = true;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
                break;
            }
        }

        System.out.println(isAscending);
    }
}