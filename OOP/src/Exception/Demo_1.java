package Exception;

public class Demo_1 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result : " + result);
        } catch (Exception obj) {                 //catch(ArithmeticException obj) it can be use for specific case
            System.out.println("Exception : " + obj);
        }
        System.out.println("Thank You.!");

    }

}
