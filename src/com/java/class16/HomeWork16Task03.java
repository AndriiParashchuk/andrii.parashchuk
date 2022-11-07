package com.java.class16;

public class HomeWork16Task03 {
    public static void main(String[] args) {
        double sum = 0;

        for (int a = 1, b = 2; a <= 10; a++, b++) {
            System.out.print(a + "/" + b);
            System.out.print("+");
            double ad = a;
            sum = sum + (ad / b);
        }
        System.out.println();
        System.out.println("Result is: " + sum);


    }
}
