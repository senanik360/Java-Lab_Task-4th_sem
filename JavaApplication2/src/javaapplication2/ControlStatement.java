
package javaapplication2;

import java.util.Scanner;


public class ControlStatement {
    public static void main(String[]  args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer: ");
        number = input.nextInt();
        if(number>0){
            System.out.println("Positive");
        }
        else
        {
        
        System.out.println("Negative");
    }
    
}
