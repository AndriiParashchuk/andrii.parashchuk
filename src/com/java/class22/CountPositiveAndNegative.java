package com.java.class22;

public class CountPositiveAndNegative {
    public static void main(String[] args) {

        int data[] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int countPositive = 0, countNegative = 0, countZeros = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                countPositive++;
            } else if (data[i] < 0) {
                countNegative++;
            } else {
                countZeros++;
            }
        }
        System.out.println("Positive is " + countPositive);
        System.out.println("Negative is " + countNegative);
        System.out.println("Zeros is " + countZeros);

    }

}
