package com.bl.Logical;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive Number: ");
        int n = scanner.nextInt();

        int sumOfDivisors = 0;

        // find the sum of the divisors of n
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        // check if n is a perfect number or not
        if (sumOfDivisors == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}