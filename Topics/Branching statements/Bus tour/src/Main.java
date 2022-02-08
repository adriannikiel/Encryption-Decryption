import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String[] firstLine = scanner.nextLine().split(" ");
        int busHeight = Integer.parseInt(firstLine[0]);
        int nrBridges = Integer.parseInt(firstLine[1]);

        int[] bridgeHeights = new int[nrBridges];

        for (int i = 0; i < nrBridges; i++) {
            bridgeHeights[i] = scanner.nextInt();
        }

        int countCrash = 0;

        for (int i = 0; i < nrBridges; i++) {
            if (bridgeHeights[i] <= busHeight) {
                countCrash++;
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
        }

        if (countCrash == 0) {
            System.out.println("Will not crash");
        }

    }
}