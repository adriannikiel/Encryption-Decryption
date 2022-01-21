import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <T> T getElementByIndex(List<T> lst, int index) {
        // write your code here

        int lengthOfLst = lst.size();

        if (index < -lengthOfLst || index > lengthOfLst - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            int properIndex = index >= 0 ? index : index + lengthOfLst;
            return lst.get(properIndex);
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}