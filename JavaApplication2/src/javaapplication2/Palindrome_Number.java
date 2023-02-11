package javaapplication2;

import java.util.Scanner;

public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, reverse = 0, temp, r;
        System.out.println("Enter any Number : ");
        num = input.nextInt();
        temp = num;

        while (temp != 0) {
            r = temp % 10;
            reverse = reverse * 10 + r;
            temp = temp / 10;
        }
        if (num == reverse) {
            System.out.println("It'a a Palindrone Number..");
        } else {
            System.out.println("It's not a Palindrone Number..");
        }

    }
