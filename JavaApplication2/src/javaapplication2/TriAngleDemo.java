
package javaapplication2;

import java.util.Scanner;


public class TriAngleDemo {
public static void main(String[] args)    
{
    Scanner input = new Scanner(System.in);
    double base,height,area;
    System.out.print("Enter base: ");
    base=input.nextDouble();
    System.out.print("Enter Height: ");
    height=input.nextDouble();
    area= .5*base*height;
    System.out.println("Area of Triangle is : "+area);

}
