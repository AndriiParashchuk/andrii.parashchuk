package com.java.class18;

import java.util.Scanner;

//Palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int t = num;

        while (t != 0) {
            rev = rev * 10 + t % 10;
            t /= 10;
        }
        if (num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
