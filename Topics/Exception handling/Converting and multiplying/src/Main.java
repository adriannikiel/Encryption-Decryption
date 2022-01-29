import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();

        String nextString = "";
        int nextInt = 0;

        do {
            try {
                nextString = scanner.nextLine();
                nextInt = Integer.parseInt(nextString);

                if (nextInt == 0) {
                    break;
                }

                builder.append(nextInt * 10).append("\n");
            } catch (Exception e) {
                builder.append("Invalid user input: " + nextString).append("\n");
            }

        } while (true);

        System.out.println(builder.toString());
    }
}