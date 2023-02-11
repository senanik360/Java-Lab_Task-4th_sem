
package Polymorphism;


public class Test {
    public static void main(String[] args) {
        MangoSquad[] m = new MangoSquad[3];
        m[0] = new MangoSquad();
        m[1] = new Teacher();
        m[2] = new Student();
         
        for (int i = 0; i < 3; i++) {
                    m[i].display();
        }
        
        /* m.display();
         
         m = new Teacher();
         m.display();
         
         m = new Student();
         m.display(); */
    }
}
