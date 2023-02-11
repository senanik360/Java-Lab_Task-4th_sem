
package week4.exeercises;

import java.util.Scanner;


public class ScannerDemonstration {
    public void readInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = input.nextInt();
        System.out.print("Enter number 2 : ");
        int b = input.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println("Sum : "+sum );
        System.out.println("Product : "+product);
    }
   
    
    public void describeYourself(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Name :");
        String name = input.nextLine();
        System.out.print("Enter Field of interest :");
        String interest = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Enter height : ");
        double height = input.nextDouble();
        
        System.out.println("Hey, my name is "+name+". I am "+age+" years of old. I am "+height+" feet long. My field of interest are "+interest);
        
    }    
}
