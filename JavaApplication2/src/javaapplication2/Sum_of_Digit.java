package javaapplication2;

import java.util.Scanner;


public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,sum=0,temp,r;
        System.out.println("Enter any integer : ");
        n = input.nextInt();
        temp = n;
        while(temp!=0){
            r = temp%10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("Sum of all the integer number is : "+sum);
    }
    
}
