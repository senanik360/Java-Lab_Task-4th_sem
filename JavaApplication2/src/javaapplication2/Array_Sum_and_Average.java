package javaapplication2;

import java.util.Scanner;

public class Array_Sum_and_Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double[] number = new double[5];
        /* System.out.print("Enter Five numbers : ");
        number[0]= input.nextDouble();
        number[1]= input.nextDouble();
        number[2]= input.nextDouble();
        number[3]= input.nextDouble();
        number[4]= input.nextDouble();
        sum = number[0] + number[1] + number[2] + number[3] + number[4] ;
        System.out.println("The sum is :"+sum); */

        //Let's try to do it in short way.
        System.out.print("Enter Five numbers : ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
            sum += number[i];
        }
        double avg = sum / (number.length);
        System.out.println("The average is : " + avg);
        System.out.println("The sum is :" + sum);
    }

}
