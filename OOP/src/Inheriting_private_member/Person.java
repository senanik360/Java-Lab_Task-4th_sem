
package Inheriting_private_member;

import java.util.Scanner;


public class Person {
    private String name ;
    private int age ;
    Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName() {
        //this.name = name;
        name = input.nextLine(); 
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
       // this.age = age;
       age = input.nextInt();
    }
    
    
}
