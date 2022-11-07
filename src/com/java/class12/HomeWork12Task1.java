package com.java.class12;

import java.util.Scanner;

public class HomeWork12Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        printDollarLine();
        System.out.println("Please enter first 3 digit number: ");
        printDollarLine();
        int num1 = sc.nextInt();
        System.out.println("Please enter second 3 digit number: ");
        printDollarLine();
        int num2 = sc.nextInt();
        System.out.println("Please enter third 3 digit number: ");
        printDollarLine();
        int num3 = sc.nextInt();
        printDollarLine();
        printDollarLine();
        //System.out.println("Reverse of the greater number is " );
        getGreaterReverseNumber(num1, num2, num3);
        printDollarLine();
        printDollarLine();

    }
    static void getGreaterReverseNumber(int num1, int num2, int num3){
        int rev = 0;

        if (num1 > num2 && num1 > num3){
            int c = num1 % 10;
            rev = rev * 10 + c;
            num1 = num1 / 10;

            c = num1 % 10;
            rev = rev * 10 + c;
            num1 = num1 / 10;

            c = num1 % 10;
            rev = rev * 10 + c;
            num1 = num1 / 10;
            System.out.println("Reverse of the greater number is " + rev);

        } else if (num2 > num1 && num2 > num3) {
            int c = num2 % 10;
            rev = rev * 10 + c;
            num2 = num2 / 10;

            c = num2 % 10;
            rev = rev * 10 + c;
            num2 = num2 / 10;

            c = num2 % 10;
            rev = rev * 10 + c;
            num2 = num2 / 10;
            System.out.println("Reverse of the greater number is " + rev);

        }else {
            int c = num3 % 10;
            rev = rev * 10 + c;
            num3 = num3 / 10;

            c = num3 % 10;
            rev = rev * 10 + c;
            num3 = num3 / 10;

            c = num3 % 10;
            rev = rev * 10 + c;
            num3 = num3 / 10;
            System.out.println("Reverse of the greater number is " + rev);
        }

        //return rev;

    }
    static void printDollarLine(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
