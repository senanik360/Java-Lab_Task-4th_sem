
package javaapplication2;

import java.util.Scanner;


public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,temp,sum=0;
        System.out.println("Enter any Number : ");
        num = input.nextInt();
        temp = num;
        
        while(temp!=0)
        {
            r = temp % 10;
            sum = sum*10 + r;
            temp = temp / 10;
        }
        System.out.println("Reverse of the Number is : "+sum);
}
