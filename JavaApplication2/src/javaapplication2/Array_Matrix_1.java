package javaapplication2;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

public class Array_Matrix_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        System.out.println("Enter element for A Matrix ");
        //for getting input for A matrix;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
                
            }
        }
        System.out.println("Enter element for B Matrix ");
           //for getting input for B matrix;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
                
            }
        }
        System.out.println("A Matrix is : ");
        //printing A matrix;
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+A[row][col]);                
            }
            System.out.println();
        }
         
        System.out.println("B matrix is : ");
        //printing B matrix;
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+B[row][col]);                
            }
            System.out.println();
        }
         
         //adding A & B Matrix;
         System.out.println("The Sum of A & B Matrix is :");
         for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 System.out.print(" "+(A[row][col]+B[row][col]));
             }
             System.out.println();
        }
    }
    
}
