import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        double a, b, c, r, area;

        switch (scanner.next()) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();

                double S = (a + b + c) / 2;
                area = Math.sqrt(S * (S - a) * (S - b) * (S - c));

                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();

                area = a * b;

                break;
            case "circle":
                r = scanner.nextDouble();

                area = 3.14 * r * r;

                break;
            default:

                area = 0;

        }

        System.out.println(area);
    }
}