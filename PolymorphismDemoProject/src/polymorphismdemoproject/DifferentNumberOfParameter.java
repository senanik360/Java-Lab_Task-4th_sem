
package polymorphismdemoproject;


public class DifferentNumberOfParameter {
    static void add(int a) {
        System.out.print("\t"+(a+a));
    }
    static void add(int a, int b) {
        System.out.print("\t"+(a+a));
    }
    static void add(int a, int b, int c) {
        System.out.print("\t"+(a+b+c));
    }
    static void add(int a, int b, int c, int d) {
        System.out.print("\t"+(a+b+c+d));
    }
    static void add(int a, int b, int c, int d, int e) {
        System.out.println("\t"+(a+b+c+d+e));
    }
   
}
