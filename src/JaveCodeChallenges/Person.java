package JaveCodeChallenges;

//Implementation of the Person class
public class Person {
    // Data fields/Attributes
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("My name is " + this.firstName + " " + this.lastName + ", and I'm " + this.age + " years old.");
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("\n" + newAge + " is an invalid age. Age must be a number >= 0.");
        } else {
            this.age = newAge;
        }
    }
}





