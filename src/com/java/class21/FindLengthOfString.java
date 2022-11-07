package com.java.class21;

import java.util.Scanner;

public class FindLengthOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println(s.lastIndexOf(""));
        System.out.println(count);
    }
}

