package Method_Overriding;

public class Teacher extends Student {

    String name;
    int age;
    String qualification;

    @Override
    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Qualification : " + qualification);

    }
}
