
package javaapplication2;

import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int[][] A = new int[3][3];
     int sumOfDiagonalElements = 0;
     int sumOfUpperElements = 0;
     int sumOfLowerlElements = 0;

     //getting input of A Matrix;  
        for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        
        for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++) {
              if(row==col)
              {
                  sumOfDiagonalElements += A[row][col];
              }
             if(row<col)
             {
                 sumOfUpperElements += A[row][col];

             }
             if(row>col)
             {
                 sumOfLowerlElements += A[row][col];

             }
            }
        }
        System.out.println("Sum Of Diagonal Elements : "+sumOfDiagonalElements);
        System.out.println("Sum Of Upper Elements : "+sumOfUpperElements);
        System.out.println("Sum Of Lower Elements : "+sumOfLowerlElements);
    }
}
