package javaapplication2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {45, 33, 28, 10, 60, 38};
        Arrays.sort(arr);
        
        System.out.print("Ascending Order of this Array is : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.print("Descending Order of this Array is : ");
        for (int i = 5; i >=0; i--) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        
        String[] name = {"anik","alok","anushree"};
        Arrays.sort(name);
        for (int i = 0; i < 3; i++) {
            System.out.print(name[i]+"\t");
        }
        System.out.println();
                }
}
