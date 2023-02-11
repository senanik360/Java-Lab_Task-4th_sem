package javaapplication2;

import java.util.Scanner;

public class For_each_loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = {"Anik", "Alok", "Anushree", "Prokrity"};
        /*  for (int i = 0; i <name.length; i++) {
            System.out.println(name[i]);
        }*/

 /* for(String x : name)
      {
          System.out.println(x);     //That is call for each loop
      }*/
        int[] num = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum of the Array is : " + sum);
     int[] n = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int s = 0;
    for(int x : n)
    {
       s += x;
    }
    System.out.println ("The sum of Array is : "+s); //By using for each loop;
    }   
}
