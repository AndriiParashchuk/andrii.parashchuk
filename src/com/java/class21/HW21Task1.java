package com.java.class21;

import java.util.Scanner;

public class HW21Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        //int elseCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
                vowelCount++;
            else if (c >= 'a' && c <= 'z') {
                consonantCount++;
            }

        }
        System.out.println("Total Vowels - " + vowelCount + ", Total Consonants - " + consonantCount);
    }
}
