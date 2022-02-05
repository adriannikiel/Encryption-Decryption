import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Tests {

    public static void main(String[] args) {
        //testWorldPopulation();
        //testSumFromFile();
        //testCountNumbers();
        //testGreatestNumber();
        testCountEvenNumbers();
    }

    private static void testCountEvenNumbers() {
        File file = new File("./Topics/Files/Theory/resource/dataset_91065.txt");

        try (Scanner scanner = new Scanner(file)) {

            int counter = 0;

            while (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();

                if (nextInt == 0) {
                    break;
                }

                if (nextInt % 2 == 0) {
                    counter++;
                }
            }

            System.out.println(counter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void testGreatestNumber() {
        File file = new File("./Topics/Files/Theory/resource/dataset_91007.txt");

        try (Scanner scanner = new Scanner(file)) {
            int max = 0;

            while (scanner.hasNext()) {
                int value = scanner.nextInt();

                if (value > max) {
                    max  = value;
                }
            }

            System.out.println(max);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testCountNumbers() {

        File file = new File("./Topics/Files/Theory/resource/dataset_91022.txt");

        try (Scanner scanner = new Scanner(file)) {
            int counter = 0;

            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();

                if (value >= 9999) {
                    counter++;
                }
            }

            System.out.println(counter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void testSumFromFile() {

        File file = new File("./Topics/Files/Theory/resource/dataset_91033.txt");

        try (Scanner scanner = new Scanner(file)) {
            int sum = 0;

            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void testWorldPopulation() {

        File file = new File("./Topics/Files/Theory/resource/dataset_91069.txt");

        // 1 Scanner
        try (Scanner scanner = new Scanner(file)) {

            scanner.nextLine();

            int yearLargestPopulationIncrease = 1900;

            long maxIncrease = 0;
            long prevPopulation = 2557628654L;

            while (scanner.hasNextLine()) {

                String[] line = scanner.nextLine().split("\t");

                int year = Integer.parseInt(line[0]);

                String unformattedPopulation = line[1].replace(",", "");
                long population = Long.parseLong(unformattedPopulation);

                long currentIncrease = population - prevPopulation;

                if (currentIncrease > maxIncrease) {
                    yearLargestPopulationIncrease = year;
                    maxIncrease = currentIncrease;
                }

                prevPopulation = population;

            }

            System.out.println(yearLargestPopulationIncrease);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        // 2 Files Paths
        try {
            String fileContent = readFileAsString(file.getAbsolutePath());
            Stream<String> lines = fileContent.lines();

            // TODO


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
