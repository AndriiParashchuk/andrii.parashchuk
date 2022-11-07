package com.java.class13;

import java.util.Scanner;

public class HomeWork10Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Four Number please: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        //int numG = findGreatNumOFFour(num1, num2, num3, num4);
        //findGreatNumOFFour(num1, num2, num3, num4);

        System.out.println(findGreatNumOFFour(num1, num2, num3, num4) +" is the greatest number");

    }
    static int findGreatNumOFFour (int a, int b, int c, int d){
        //int numG = 0;
        if (a > b && a > c && a > d){
            return a;
            //System.out.println(a + " is the greatest number");
        }else if (b > c && b > d){
            return b;
            //System.out.println(b + " is the greatest number");
        }else if (c > d) {
            return c;
            //System.out.println(c + " is the greatest number");
        }else {
            return d;
            //System.out.println(d + " is the greatest number");
        }

    }

}
