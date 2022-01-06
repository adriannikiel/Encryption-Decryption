import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();

        int numberOfStudentsWithA = 0;
        int numberOfStudentsWithB = 0;
        int numberOfStudentsWithC = 0;
        int numberOfStudentsWithD = 0;


        for (int i = 0; i < numberOfStudents; i++) {

            int nextNumber = scanner.nextInt();

            if (nextNumber == 5) {
                numberOfStudentsWithA++;
            }

            if (nextNumber == 4) {
                numberOfStudentsWithB++;
            }

            if (nextNumber == 3) {
                numberOfStudentsWithC++;
            }

            if (nextNumber == 2) {
                numberOfStudentsWithD++;
            }
        }

        System.out.print(numberOfStudentsWithD + " " +
                numberOfStudentsWithC + " " +
                numberOfStudentsWithB + " " +
                numberOfStudentsWithA
        );
    }
}