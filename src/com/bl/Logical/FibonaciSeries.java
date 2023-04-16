package com.bl.Logical;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
