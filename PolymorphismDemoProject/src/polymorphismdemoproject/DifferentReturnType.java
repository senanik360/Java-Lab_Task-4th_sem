package polymorphismdemoproject;

public class DifferentReturnType {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static void sum() {
        System.out.println("The Sum of those Three return Types of method is : " + ( (add(5, 5)) + (add(5, 5, 5)) + (add(5, 5))));
    }
}
