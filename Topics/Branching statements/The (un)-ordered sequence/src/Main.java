import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOrdered = true;
        boolean isAscendingDefined = false;
        boolean isAscending = true;

        int number = scanner.nextInt();
        int prevNumber = number;

        do  {
            if (!isAscendingDefined) {
                if (number > prevNumber) {
                    isAscending = true;
                    isAscendingDefined = true;
                } else if (number < prevNumber) {
                    isAscending = false;
                    isAscendingDefined = true;
                }

            } else {
                if (((number > prevNumber) && !isAscending) ||
                        ((number < prevNumber) && isAscending)) {
                    isOrdered = false;
                    break;
                }
            }

            prevNumber = number;
            number = scanner.nextInt();
        } while (number != 0);

        System.out.println(isOrdered);
    }
}