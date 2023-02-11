package Inheriting_private_member;
import java.util.Scanner;

public class Teacher extends Person {

    private String qualification;
    Scanner input1 = new Scanner(System.in);

    public String getQualification() {
        return qualification;
    }

    public void setQualification() {
        // this.qualification = qualification;
        qualification = input1.nextLine();
    }

    public void displayInformation() {
        System.out.println("\t\t.. WelCOme ..\n");
        System.out.println("\tEnter your Name , Age & Qualification respectively.\n");
        setName();
        setAge();
        setQualification();
        System.out.println("\nName : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Qualification : " + getQualification());
    }
}
