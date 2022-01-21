class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method

        int presenceInList1 = 0;
        int presenceInList2 = 0;

        for (Integer e : list1) {
            if (e == elem) {
                presenceInList1++;
            }
        }

        for (Integer e : list2) {
            if (e == elem) {
                presenceInList2++;
            }
        }

        return presenceInList1 == presenceInList2;
    }
}