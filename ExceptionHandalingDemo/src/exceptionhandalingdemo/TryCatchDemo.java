package exceptionhandalingdemo;

public class TryCatchDemo {

    void demo() {
        int x, y, a = 10, b = 5, c = 5;
        try {
            x = a / (b - c);
            System.out.println("X = " + x);
        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
        y = a / (b + c);
        System.out.println("Y = " + y);
    }

    void demo3() {
        try {
            int x = 10, y = 0, result;
            result = x / y;
            System.out.println("Result : " + result);
//       int a[]= new int [4];
//       a[4]=12;
        } 
        catch (Exception e) {
            System.out.println("Exception : " + e);
        } 

        finally {
            System.out.println("Finally Test");
            System.out.println("Last Line Of This Method.");
        }
    }
}
