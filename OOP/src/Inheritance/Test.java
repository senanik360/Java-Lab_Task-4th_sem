
package Inheritance;


public class Test {
    public static void main(String[] args) {
       
        Teacher obj1 = new Teacher ();
        obj1.name = "Anik Sen";
        obj1.age = 20;
        obj1.qualification = "BSc in CSE";
        
        obj1.displayInformation2();
        
         Teacher obj2 = new Teacher ();
        obj2.name = "Alok Sen";
        obj2.age = 17;
        obj2.qualification = "HSC";
        
        obj2.displayInformation2();
    }
}
