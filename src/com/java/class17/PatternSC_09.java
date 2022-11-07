package com.java.class17;

import java.util.Scanner;

//        *                                                        *
//        *      *                                          *      *
//        *      *      *                            *      *      *
//        *      *      *      *              *      *      *      *
//        *      *      *      *      *       *      *      *      *
//        *      *      *      *              *      *      *      *
//        *      *      *                            *      *      *
//        *      *                                          *      *
//        *                                                        *
public class PatternSC_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i * 2; j <= n * 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 1; i <= n - 1; i++) {
//            System.out.print("*");
//        }for (int j = 1; j <= i * 2; j++) {
//
//        }

    }
}
