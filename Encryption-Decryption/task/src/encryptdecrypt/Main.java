package encryptdecrypt;

public class Main {
    public static void main(String[] args) {

        String mode = findParam(args, "-mode");
        String data = findParam(args, "-data");
        int key = Integer.parseInt(findParam(args, "-key"));

        switch (mode) {
            case "enc":
                System.out.println(encryptText(data, key));
                break;
            case "dec":
                System.out.println(decryptText(data, key));
                break;
        }

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