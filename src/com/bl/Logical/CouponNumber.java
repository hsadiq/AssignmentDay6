package com.bl.Logical;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Three Digit Coupon Number: ");

        int n = scanner.nextInt();

        int coupon = (int)(Math.random()*1000) % 999;
        if (coupon==n){
            System.out.println("Coupon Matched: "+n);
            System.out.println("You Won!!");
        }else{
            System.out.println("Coupon Not Matched");
            System.out.println("Lucky Coupon is: "+coupon);
        }
    }
}
//Added on git