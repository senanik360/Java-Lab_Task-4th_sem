package javaapplication2;

import java.util.Scanner;

public class PrimeNumber_M_to_N {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, count = 0,total_prime=0;
        System.out.print("Enter initial Number : ");
        n = input.nextInt();
        System.out.print("Enter ending Number : ");
        m = input.nextInt();
        for (int i = n; i <= m; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
              total_prime++;
            }
            count = 0;
        }
        System.out.println("Ttoal Prime Number is "+total_prime);
    }

}
