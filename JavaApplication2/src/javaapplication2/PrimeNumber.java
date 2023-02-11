
package javaapplication2;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any Positive integer number : ");
        n = input.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                count++;
                break;
            }
        }
            if(count==0)
            {
                System.out.println("Its Prime number.");
            }
            else
            {
                System.out.println("Its Not Prime number.");
            }
        
    }
}
