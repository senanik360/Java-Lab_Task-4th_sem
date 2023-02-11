
package javaapplication2;

import java.util.Scanner;


public class EvenOddDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer : ");
        num = input.nextInt();
        if(num%2==0){
            System.out.println("Its Even");
        }
        else
        {
            System.out.println("Its Odd");
        }
    }
    
}
