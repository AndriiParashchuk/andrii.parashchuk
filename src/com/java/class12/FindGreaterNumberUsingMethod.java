package com.java.class12;

import java.util.Scanner;

public class FindGreaterNumberUsingMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

//        if (num1>num2 && num1 > num3) {
//            System.out.println(num1 +" is the greater number");
//
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 +" is the greater number");
//
//        }else {
//            System.out.println(num3 +" is the greater number");
//        }
        printGreatestNumberFromThreeNumbers(num1, num2, num3);


    }
    static void printGreatestNumberFromThreeNumbers(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a +" is the greater number");

        } else if (b > a && b > c) {
            System.out.println(b +" is the greater number");

        }else {
            System.out.println(c + " is the greater number");

        }
    }
}

