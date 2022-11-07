package com.java.class08;

import java.util.Scanner;

public class HomeWork08Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your character");
        char CH = in.next().charAt(0);

        if (CH == 'a' || CH == 'e' || CH == 'i' || CH == 'o' || CH == 'u') {
            System.out.println("Vowel");
//        } else if (CH != 'a' || CH != 'e' || CH != 'i' || CH != 'o' || CH != 'u'){
//            System.out.println("Not Vowel");
        } else {
            System.out.println("Not Vowel");
        }


    }
}
