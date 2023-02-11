package Package_A;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        do {
            try {
                System.out.print("Enter Any Number : ");
                int n = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + n * i);
                }
            } catch (Exception e) {
                count = 2;
                System.out.println("Exception : "+e);
                System.out.println("Please Enter an Integer !");
            }
        } while (count == 2);
    }
}
