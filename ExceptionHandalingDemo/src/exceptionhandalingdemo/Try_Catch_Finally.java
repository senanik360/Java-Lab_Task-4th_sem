package exceptionhandalingdemo;

import java.util.Scanner;

public class Try_Catch_Finally {

    int number1, number2, k;

    void demo() {
        k = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter First Number : ");
                number1 = input.nextInt();
                System.out.print("Enter Second Number : ");
                number2 = input.nextInt();
                k = 1;
            } catch (Exception e) {
                System.out.println("Exception : " + e);
            } finally {
                if (k == 1) {
                    System.out.println("Task Completed Successfully. Thank You.");
                } else {
                    System.out.println("Invalid Input. Try Again.");
                }
            }
        } while (k == 0);
    }
}
