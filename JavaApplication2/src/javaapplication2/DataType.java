package javaapplication2;

import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b = 20, sum;
        System.out.print("Enter 1st number: ");
        a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        b = input.nextInt();
        sum = a + b;
        System.out.println("Sum = " + sum);
    }

}
