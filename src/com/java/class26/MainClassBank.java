package com.java.class26;

public class MainClassBank {

    public static void main(String[] args) {

        Bank acc1 = new Bank("Andrii ", 1000000);
        Bank acc2 = new Bank("Nataliya ", 1000000);
        Bank acc3 = new Bank("Matei ", 1000000);

        System.out.println(acc1.accNumber);
        System.out.println(acc2.accNumber);
        System.out.println(acc3.accNumber);
    }
}
