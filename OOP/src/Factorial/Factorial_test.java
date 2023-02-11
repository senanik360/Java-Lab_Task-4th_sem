package Factorial;

import java.util.Scanner;

public class Factorial_test {

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number for make it Factorial :");
        x = input.nextInt();
        System.out.print("Enter 2nd number for make it Factorial :");
        y = input.nextInt();
        int result = obj.fact(x);
        System.out.println("Factorial of " + x + " is : " + result);
        result = obj.fact(y);
        System.out.println("Factorial of " + y + " is : " + result);
    }
}
