package com.java.class21;

import java.util.Scanner;

public class FIndReversOfGivenString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";


        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(s.length() - 1 - i));
        }


//        for (int i = s.length()-1; i >=0; i--) {
//            rev = rev + s.charAt(i);
//        }
        //System.out.println(rev);
    }
}
//another approach


//for (int i = s.length()-1; i >=0; i--) {
//        System.out.print(s.charAt(i));
//        }


// Another approach


//        for(int i=0; i < name.length(); i++){
//        System.out.print(name.charAt(name.length()- 1 - i));
//        }
//