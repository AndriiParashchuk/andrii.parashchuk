package com.java.class20;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
                vowelCount++;
            else if (c == ' ') {
                spaceCount++;
            } else {
                consonantCount++;
            }

        }
        System.out.println("Total vowels - " + vowelCount + ", Total consonants - " + consonantCount);

    }
}
