package com.bl.Logical;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive Number: ");
        int n = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
