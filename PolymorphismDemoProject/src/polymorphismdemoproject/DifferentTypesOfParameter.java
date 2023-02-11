
package polymorphismdemoproject;

public class DifferentTypesOfParameter {
   static void display(char c) {
        System.out.print("\t"+c);
    }
    static void display(int i) {
        System.out.print("\t"+i);
    }
    static void display(boolean b) {
        System.out.print("\t"+b);
    }
    static void display(double d) {
        System.out.print("\t"+d);
    }
    static void display(float f) {
        System.out.print("\t"+f);
    }  
    static void display(String msg) {
        System.out.println("\t"+msg);
    }
}
