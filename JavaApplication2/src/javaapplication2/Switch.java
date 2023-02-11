
package javaapplication2;

import java.util.Scanner;


public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int digit;
         digit = input.nextInt();
         switch(digit){
             case 0:
                 System.out.println("Zero");                 break;

                 case 1:
                 System.out.println("One");                 break;

                 case 2:
                 System.out.println("Two");                 break;

                 case 3:
                 System.out.println("Three");
                 break;
                 default:
                     System.out.println("Default");
         }
        
    }
    
}
