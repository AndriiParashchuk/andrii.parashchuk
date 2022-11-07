package com.java.class06;

import java.util.Scanner;

public class HomeWork06Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favorite number please!");
        int a = sc.nextInt(); {

//        System.out.println(a +"  "+ a +"  "+ a+"  "+a);
//        System.out.println(a +" "+ "  " +"  "+ " "+"  "+a);
//        System.out.println(a +" "+ "  " +"  "+ " "+"  "+a);
//        System.out.println(a +"  "+ a +"  "+ a+"  "+a);

            for (int x  = 1; x<=4; x++){
                for (int y=1; y<=4; y++){
                     System.out.print(" "+a+" ");
                }
                System.out.println();
            }
        }



    }
}
