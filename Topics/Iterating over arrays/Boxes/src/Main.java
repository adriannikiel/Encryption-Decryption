import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");

        int[] numbersFromFirstLine = new int[3];
        int[] numbersFromSecondLine = new int[3];

        for (int i = 0; i < 3; i++) {
            numbersFromFirstLine[i] = Integer.parseInt(firstLine[i]);
            numbersFromSecondLine[i] = Integer.parseInt(secondLine[i]);
        }

        Arrays.sort(numbersFromFirstLine);
        Arrays.sort(numbersFromSecondLine);


        if (numbersFromFirstLine[0] > numbersFromSecondLine[0] &&
                numbersFromFirstLine[1] > numbersFromSecondLine[1] &&
                numbersFromFirstLine[2] > numbersFromSecondLine[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (numbersFromFirstLine[0] < numbersFromSecondLine[0] &&
                numbersFromFirstLine[1] < numbersFromSecondLine[1] &&
                numbersFromFirstLine[2] < numbersFromSecondLine[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }


    }
}