package This_keyWord;

public class Person {

    String name;
    int age;
    String hairColor;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor) {
        // this.name = name;
        //this.age = age;
        this(name, age);
        this.hairColor = hairColor;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        //System.out.println("Hair Color : " + hairColor);
    }
  
   
    void display_2() {
       // System.out.println("Name : " + name);
        //System.out.println("Age : " + age);
        this.display(); //this keyword optional in here.. 
        System.out.println("Hair Color : " + hairColor);
    }
}
