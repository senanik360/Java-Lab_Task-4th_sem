package javaapplication2;

import java.util.Scanner;

public class Array_Output_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[4][];
        int k = 0;
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row + 1; col++) {
                arr[row][col] = k;
                k++;
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(arr[row][col]+" ");
            }
                    System.out.println();

        }
    }

}
