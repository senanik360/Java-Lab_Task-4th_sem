
package javaapplication2;

import java.util.Scanner;


public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp,num,r,sum=0;
        System.out.print("Enter any Number : ");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
            r = temp % 10;
            sum = (int) (sum + Math.pow(r, 3));
            temp = temp / 10;
        }
        if(sum==num){
        System.out.println("It's an Armstrong Number..");
        }
        else
        {
            System.out.println("It's not an Armstrong Number..");
        }
    }
}
