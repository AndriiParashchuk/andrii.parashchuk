package com.java.class15;

import java.util.Scanner;

public class HW15Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = in.nextInt();
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}


