package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mode = setFinalMode(args);
        int key = setFinalKey(args);
        String algorithm = setFinalAlgorithm(args);
        String data = setFinalInput(args);
        PrintStream stream = setFinalOutput(args);

        if (algorithm.equals("unicode")) {
            switch (mode) {
                case "enc":
                    stream.println(encryptTextUnicode(data, key));
                    break;
                case "dec":
                    stream.println(decryptTextUnicode(data, key));
                    break;
            }
        } else if (algorithm.equals("shift")) {
            switch (mode) {
                case "enc":
                    stream.println(encryptTextShift(data, key));
                    break;
                case "dec":
                    stream.println(decryptTextShift(data, key));
                    break;
            }
        }

        if (stream != null) {
            stream.close();
        }

    }

    private static String setFinalAlgorithm(String[] args) {
        String alg = findParam(args, "-alg");

        return alg.isEmpty() ? "shift" : alg;
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

    public static String encryptTextUnicode(String message, int key) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = (char) (message.charAt(i) + key);
            result.append(c);
        }

        return result.toString();
    }

    public static String decryptTextUnicode(String ciphertext, int key) {
        return encryptTextUnicode(ciphertext, -key);
    }

    public static String encryptTextShift(String message, int key) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char token = message.charAt(i);
            char c = encryptCharShift(token, key);
            result.append(c);
        }

        return result.toString();
    }

    public static String decryptTextShift(String ciphertext, int key) {
        return encryptTextShift(ciphertext, -key);
    }

    private static char encryptCharShift(char token, int key) {

        final char minSmall = 'a';  //97
        final char maxSmall = 'z';  //122
        final char minBig = 'A';    //65
        final char maxBig = 'Z';    //90

        char c;

        if (token >= minSmall && token <= maxSmall) {
            c = charShiftParam(token, key, minSmall, maxSmall);
        } else if (token >= minBig && token <= maxBig) {
            c = charShiftParam(token, key, minBig, maxBig);
        } else {
            c = token;
        }

        return c;
    }

    private static char charShiftParam(char token, int key, char minChar, char maxChar) {

        char c = (char) (token + key);

        if (c > maxChar) {
            c = (char) ((token + key - maxChar) + minChar - 1);
        }

        if (c < minChar) {
            c = (char) (maxChar - (minChar - (token + key)) + 1);
        }

        return c;
    }

}