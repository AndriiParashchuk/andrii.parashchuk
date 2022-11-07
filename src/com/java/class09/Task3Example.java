package com.java.class09;

import java.util.Scanner;

public class Task3Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter amount: ");
        int amount = sc.nextInt();

        if (amount / 1000 > 0) {
            if (amount / 1000 == 1) {
                System.out.println((amount / 1000) + " note of 1000");
            }else if (amount / 1000 > 1){
                System.out.println((amount / 1000) + " notes of 1000");
            }
            amount = amount % 1000;

        }

        if (amount > 0) {
            if (amount / 500 == 1) {
                System.out.println((amount / 500) + " note of 500");
            }else if (amount / 500 > 1){
                System.out.println((amount / 500) + " notes of 500");
            }
            amount = amount % 500;

        }
        if (amount > 0) {
            if (amount / 100 == 1) {
                System.out.println((amount / 100) + " note of 100");
            }else if (amount / 100 > 1){
                System.out.println((amount / 100) + " notes of 100");
            }
            amount = amount % 100;

        }
        if (amount > 0) {
            if (amount / 50 == 1) {
                System.out.println((amount / 50) + " note of 50");
            }else if (amount / 50 >=2){
                System.out.println((amount / 50) + " notes of 50");
            }
            amount = amount % 50;

        }
        if (amount > 0) {
            if (amount / 20 == 1) {
                System.out.println((amount / 20) + " note of 20");
            }else if (amount / 20 > 1){
                System.out.println((amount / 20) + " notes of 20");
            }
            amount = amount % 20;

        }
        if (amount > 0) {
            if (amount / 10 == 1) {
                System.out.println((amount / 10) + " note of 10");
            }else if (amount / 10 > 1){
                System.out.println((amount / 10) + " notes of 10");
            }
            amount = amount % 10;

        }
        if (amount > 0) {
            if (amount / 5 == 1) {
                System.out.println((amount / 5) + " note of 5");
            }else if (amount / 5 > 1){
                System.out.println((amount / 5) + " notes of 5");
            }
            amount = amount % 5;

        }
        if (amount > 0) {
            if (amount / 2 == 1) {
                System.out.println((amount / 2) + " note of 2");
            }else if (amount / 2 > 1){
                System.out.println((amount / 2) + " notes of 2");
            }
            amount = amount % 2;
        }
        if (amount > 0) {
                System.out.println(amount + " note of 1");

        }

    }
}
