package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mode = setFinalMode(args);
        int key = setFinalKey(args);
        String data = setFinalInput(args);
        PrintStream stream = setFinalOutput(args);

        switch (mode) {
            case "enc":
                stream.println(encryptText(data, key));
                break;
            case "dec":
                stream.println(decryptText(data, key));
                break;
        }

        if (stream != null) {
            stream.close();
        }

    }

    private static String setFinalMode(String[] args) {
        String mode = findParam(args, "-mode");

        return mode.isEmpty() ? "enc" : mode;
    }

    private static int setFinalKey(String[] args) {
        String key = findParam(args, "-key");

        return key.isEmpty() ? 0 : Integer.parseInt(key);
    }

    private static String setFinalInput(String[] args) {

        String data = findParam(args, "-data");
        String inFilePath = findParam(args, "-in");

        if (data.isEmpty()) {
            if (!inFilePath.isEmpty()) {

                File file = new File(inFilePath);

                try (Scanner scanner = new Scanner(file)) {
                    data = scanner.nextLine();
                } catch (FileNotFoundException e) {
                    System.out.println("Error: file " + file.getName() + " doesn't exist!");
                    System.exit(-1);
                }

            }
        }

        return data.isEmpty() ? "" : data;

    }

    private static PrintStream setFinalOutput(String[] args) {

        String outFilePath = findParam(args, "-out");
        PrintStream printStream = null;

        if (!outFilePath.isEmpty()) {

            File file = new File(outFilePath);

            try {
                printStream = new PrintStream(file);
            } catch (FileNotFoundException e) {
                System.out.println("Error: file " + file.getName() + " doesn't exist!");
                System.exit(-1);
            }

        } else {
            printStream = new PrintStream(System.out);
        }

        return printStream;
    }

    private static String findParam(String[] args, String param) {

        for (int i = 0; i < args.length; i += 2) {
            if (param.equals(args[i])) {
                return args[i + 1];
            }
        }

        return "";
    }

    public static String encryptText(String message, int key) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            char c = (char) (message.charAt(i) + key);
            result.append(c);
        }

        return result.toString();
    }

    public static String decryptText(String cyphertext, int key) {
        return encryptText(cyphertext, -key);
    }

}