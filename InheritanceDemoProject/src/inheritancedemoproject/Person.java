package inheritancedemoproject;

public class Person {

    public String name;
    public int age;

    void describePerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name + ". I am " + age + " years old.");

    }

    void displayDailyActivity() {
        System.out.println("My activities as a person : woking up, taking breakfast. doing exercise, sleeeping and so on.");
    }
}
