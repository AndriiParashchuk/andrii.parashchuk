package com.java.class16;

import java.util.Scanner;

public class FindMaxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num % 10;//max is the last digit

        while (num != 0) {
            int lastD = num % 10;
            if (lastD > max) {
                max = lastD;
            }

            num = num / 10;//remove last digit

        }
        System.out.println(max);


    }
}
