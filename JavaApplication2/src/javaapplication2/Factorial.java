
package javaapplication2;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,fact=1;
        n = input.nextInt();
        for (int i = n; i>=1; i--) 
        {
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }
    
}
