
package javaapplication2;

import java.util.Scanner;


public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.print("Enter line Number : ");
       n = input.nextInt();
        
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    // System.out.println();
             
        for (int row = n; row >=1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
