package javaapplication2;

import java.util.Scanner;


public class UnaryOperator {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x,y,result;
        x=(int) input.nextDouble();
        y=(int) input.nextDouble();
       result=x+y;
       System.out.println(-result);
    }
    
}
