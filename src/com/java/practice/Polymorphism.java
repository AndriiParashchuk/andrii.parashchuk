package com.java.practice;

class Bank{
    public void displayInterestRate(){
        System.out.println("Rate 4.0");
    }
}
class BOFA extends Bank{
    @Override
    public void displayInterestRate(){
        System.out.println("Rate 5.0");
    }
}

class Chase extends Bank{
    @Override
    public void displayInterestRate(){
        System.out.println("Rate 6.0");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Chase chase = new Chase();
        chase.displayInterestRate();
        BOFA BofA = new BOFA();
        BofA.displayInterestRate();
    }
}
