class Problem {
    public static void main(String[] args) {

        int index = 0;
        boolean found = false;

        for (String arg : args) {
            if ("test".equals(arg)) {
                System.out.println(index);
                found = true;
                break;
            }

            index++;
        }

        if (!found) {
            System.out.println(-1);
        }

    }
}