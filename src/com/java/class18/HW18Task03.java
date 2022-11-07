package com.java.class18;

import java.util.Scanner;

public class HW18Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = num; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println("==============================================");

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i * 2 - 1; x++)
                System.out.print(x);
            System.out.println();
        }
        System.out.println("===============================================");

        for (int i = 1; i <= num; i++) {
            for (int sp = 1; sp <= num - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
