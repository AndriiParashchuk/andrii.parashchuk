package com.java.class21;

import java.util.Scanner;

public class HW21Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine().toLowerCase().replace(" ", "");
        String p = "";

        for (int i = 0; i < s.length(); i++) {
            p = p + (s.charAt(s.length()-1-i));
        }
        if (s.equals(p)){
            System.out.print("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }
}
//        System.out.print(name.charAt(name.length()- 1 - i));