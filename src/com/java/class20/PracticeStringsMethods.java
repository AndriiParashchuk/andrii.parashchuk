package com.java.class20;

public class PracticeStringsMethods {
    public static void main(String[] args) {

        String s = "A wonderful day for a neighbor.";
        int len = s.length();
        System.out.println(len);

        String s1 = "Oompa Loompa";
        String s2 = s1.toLowerCase();
        System.out.println(s2);

        String st = "   Oompa Loompa   ";
        String s3 = s1.trim();
        System.out.println(st);

        String s4 = "Baseball";
        String b = s4.substring(4);
        System.out.println(b);
        String c = s4.substring(2, 6);
        System.out.println(c);




    }
}
