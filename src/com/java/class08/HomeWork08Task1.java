package com.java.class08;

import java.util.Scanner;

public class HomeWork08Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = in.nextInt();

        if (a % 5 == 0) {
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible");
        }

    }
}
