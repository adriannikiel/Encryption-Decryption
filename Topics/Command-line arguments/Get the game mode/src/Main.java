class Problem {
    public static void main(String[] args) {

        boolean found = false;

        for (int i = 0; i < args.length; i++) {

            if (i % 2 == 0 && args[i].equals("mode")) {
                System.out.println(args[i + 1]);
                return;
            }

        }

        System.out.println("default");

    }
}