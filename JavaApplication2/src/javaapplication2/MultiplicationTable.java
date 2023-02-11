
package javaapplication2;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        for (int i =n; i <=m; i++) {
           // m=n*i;
            for (int j =1; j <=10; j++) {
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("");
        }
    }
    
}
