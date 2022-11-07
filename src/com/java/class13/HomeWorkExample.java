package com.java.class13;

import java.util.Scanner;

public class HomeWorkExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Four Number please: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        int max1 = findMax(num1, num2);
        int max2 = findMax(num3, num4);

        System.out.println("Greatest number " + findMax(max1 , max2));

    }

    static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

}
