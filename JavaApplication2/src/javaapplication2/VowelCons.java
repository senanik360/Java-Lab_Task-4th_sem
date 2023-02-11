
package javaapplication2;

import java.util.Scanner;

public class VowelCons {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any character : ");
        ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Capital letter");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("Small letter");
        }
        
    }
    
}
