
package javaapplication2;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
     int n1,n2,large;
     System.out.print("Enter Two integer : ");
     n1 = input.nextInt();
     n2 = input.nextInt();
     large = (n1>n2)? n1 : n2;
     System.out.println("The large number is : " +large);
     
    }
}
