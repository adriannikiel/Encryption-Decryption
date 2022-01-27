import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();

        String[] parameters = url.substring(url.indexOf("?") + 1, url.length()).split("&");
        String pass = "";

        for (String parameter : parameters) {
            String[] pair = parameter.split("=");
            String key = pair[0];
            String value = "";

            if (pair.length > 1) {
                value = pair[1];
            } else {
                value = "not found";
            }

            System.out.println(key + " : " + value);

            if ("pass".equals(key)) {
                pass = value;
            }
        }

        if (pass.length() > 0) {
            System.out.println("password : " + pass);
        }
    }
}