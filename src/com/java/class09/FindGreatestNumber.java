package com.java.class09;

import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Nested if else

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2){
            if (num1 > num3){
                System.out.println(num1 + " is greater");
            } else {
                System.out.println(num3 + " is greater");
            }
        } else {
            if (num2 > num3){
                System.out.println(num2 + " is greater");
            }else {
                System.out.println(num3 + " is greater");
            }
        }

    }
}
