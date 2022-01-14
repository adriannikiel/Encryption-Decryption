class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here

        String tempP1Name = p1.name;
        int tempP1Age = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = tempP1Name;
        p2.age = tempP1Age;

    }
}