import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (String value : values) {
            numbers.add(Integer.parseInt(value));
        }

        int value = scanner.nextInt();

        int nearestDistance = findNearestDistance(numbers, value);

        ArrayList<Integer> nearestNumbers = findNearestNumbers(numbers, nearestDistance, value);

        Collections.sort(nearestNumbers);

        for (Integer number : nearestNumbers) {
            System.out.format("%d ", number);
        }

    }

    private static ArrayList<Integer> findNearestNumbers(ArrayList<Integer> numbers, int nearestDistance, int value) {

        ArrayList<Integer> nearestNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (Math.abs(number - value) == nearestDistance) {
                nearestNumbers.add(number);
            }
        }

        return nearestNumbers;
    }

    private static int findNearestDistance(ArrayList<Integer> numbers, int value) {
        int nearestDistance = Math.abs(numbers.get(0) - value); // nearest distance

        for (Integer number : numbers) {
            int n = Math.abs(number - value);

            if (n < nearestDistance) {
                nearestDistance = n;
            }
        }

        return nearestDistance;
    }
}