package JaveCodeChallenges;

public class ModelAPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Ron", "Freeman", 37);
        Person p2 = new Person("Taylor", "Warren", 29);
        Person p3 = new Person("Sarah", "Ford", 52);

        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();

        //Tests getters
        System.out.println("\n" + p3.getLastName() + ", " + p3.getFirstName() + " is " + p3.getAge() + ".");
        System.out.println(p2.getLastName() + ", " + p2.getFirstName() + " is " + p2.getAge() + ".");
        System.out.println(p1.getLastName() + ", " + p1.getFirstName() + " is " + p1.getAge() + ".");

        //Tests setters
        p3.setLastName("Jones");
        p3.setFirstName("Mary");
        p3.setAge(36);

        p2.setLastName("Williams");
        p2.setFirstName("Alex");
        p2.setAge(-30);
        p2.introduceYourself();
        p2.setAge(30);

        p1.setLastName("North");
        p1.setFirstName("Kat");
        p1.setAge(5);

        System.out.println();

        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();


    }

}
