import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();

        int result = 0;
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < sizeOfArray - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                result++;
            }
        }

        System.out.println(result);

    }
}