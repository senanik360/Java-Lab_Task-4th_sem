
package javaapplication2;

import java.util.Scanner;


public class MathClass {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);
        int x,y,A;
                System.out.print("Enter Two integer : ");
                x = input.nextInt();
        y = input.nextInt();
        System.out.println("Maximum Number is : "+Math.max(x, y));
        int min;
        min = Math.min(x, y);
        System.out.println("Minimum Number is : "+min);
        A = -50;
        System.out.println("Absolute value of A is : "+ Math.abs(A));
        float B = (float) 8.8;
        System.out.println(Math.round(B));
        System.out.println(Math.PI);
        
    }
              
}