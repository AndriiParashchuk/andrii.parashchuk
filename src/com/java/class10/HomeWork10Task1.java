package com.java.class10;

import java.util.Scanner;

public class HomeWork10Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number (100 - 999)");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999){
            int n1 = num / 100;
            int n2 = num % 100 / 10;
            int n3 = num % 100 % 10;


            System.out.print(n3);
            System.out.print(n2);
            System.out.print(n1);
            //System.out.println(""+n3+n2+n1);
        }
        else {
            System.out.println("Wrong number");
        }

    }
}
