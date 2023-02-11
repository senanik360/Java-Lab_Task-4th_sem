package javaapplication2;

import java.util.Scanner;

public class Array_Maximum_Minimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Digit do you want to take : ");
        int m = input.nextInt();
        double[] number = new double[m];
        System.out.print("Please Enter those digits : ");
        for (int i = 0; i < m; i++) {
            number[i] = input.nextDouble();
        }
        double max = number[0];
        for (int i = 1; i < m; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println("Maximum Number is : " + max);
        
        
        double min = number[0];
        for (int i = 1; i < m; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum Number is : " + min);
    }
}
