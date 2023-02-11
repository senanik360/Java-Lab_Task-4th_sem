
package javaapplication2;

import java.util.Scanner;


public class Introduction_to_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        int[] number2 = new int[10];
        
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The Sum of the Array is : "+sum);
        
        int len = number.length;
        System.out.println("Array size of number is : "+len);
    }
   
}
