import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        List<String> inputStrings = List.of(scanner.nextLine().split(" "));

        ArrayList<Object> evenList = new ArrayList<>();

        for (int i = 1; i < inputStrings.size(); i = i + 2) {
            evenList.add(inputStrings.get(i));
        }

        Collections.reverse(evenList);

        evenList.forEach(s -> System.out.print(s + " "));

    }
}