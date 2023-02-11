
package javaapplication2;

import java.util.Scanner;


public class Array_Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int [4] [5];
        int k = 0;
        //assigning the value to the 2D array;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                arr[row][col] = k;
                k++;
            }
        }
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }
        
    }
    
}
