package com.java.practice.Interface;

interface Bank {
    int ROUTING_NUMBER = 454324;

    void deposit(int amount);

    void withdraw(int amount);

}

interface PSUBank extends Bank {
    void virtualCallToManager();

    void quickSupport();

}

class ChaseBank implements PSUBank {

    int balance = 300;

    @Override
    public void deposit(int amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(int amount) {
        balance = balance - amount;
    }

    @Override
    public void virtualCallToManager() {
        System.out.println("Video call to manager");
    }

    @Override
    public void quickSupport() {
        System.out.println("Issue has been forwarded to quick support");
    }

}

public class MainClass {
    public static void main(String[] args) {
        ChaseBank chaseBank = new ChaseBank();
        chaseBank.deposit(1000);
        chaseBank.withdraw(100);
        chaseBank.virtualCallToManager();
        chaseBank.quickSupport();
        System.out.println(chaseBank.balance);
    }
}