package javaapplication2;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][3];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }     
    }
}
