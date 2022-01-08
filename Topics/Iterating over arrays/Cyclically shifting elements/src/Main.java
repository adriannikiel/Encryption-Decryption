import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            elements[i] = scanner.nextInt();
        }

        int last = elements[elements.length - 1];

        for (int i = numberOfElements - 1; i > 0; i--) {
            elements[i] = elements[i - 1];
        }

        elements[0] = last;

        for (int element : elements) {
            System.out.print(element + " ");
        }
    }
}