package com.java.class13;

import java.util.Scanner;

public class HomeWork10Task01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        lineCel();
        System.out.println("Enter Temperature in celsius: ");
        lineCel();
        double tc = in.nextDouble();
        double tf = getCelToFahr(tc);
        lineFahr();
        System.out.println("Temperature in Fahrenheit = " + tf);
        lineFahr();
    }

    static double getCelToFahr (double a){
        a = a * 9/5 + 32;
        return a;
    }
    static void lineCel (){
        System.out.println("<***...C..e..l..s..i..u..S...***>");
    }
    static void lineFahr(){
        System.out.println("<***...F..a..h..r..e..n..h..e..i..T...***>");
    }


}
