
package javaapplication2;

import java.util.Scanner;


public class LoopApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       /* int n,m,sum=0;
        n=input.nextInt();
        m=input.nextInt();
        for (int i = n; i <=m; i++) {
            
            sum+=i;
        }
        System.out.println("Sum among "+ n +" to "+ m +" is : "+sum);*/
    int a,b,c;
    a = input.nextInt();
    b = input.nextInt();
        for (int i = a; i<=b; i++) {
            System.out.println(i+" ^ 2 = "+Math.pow(i, 2));
        }
    }
}
