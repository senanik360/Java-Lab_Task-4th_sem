
package Inheritance;


public class Teacher extends Person{
    String qualification ;
    void displayInformation2(){
       // System.out.println("Name : "+name);
        // System.out.println("Age : "+age);
        displayInformation();
        System.out.println("Qualification : "+qualification);
    }
}
