package com.bl.Logical;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive Number: ");
        int n = scanner.nextInt();

        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
