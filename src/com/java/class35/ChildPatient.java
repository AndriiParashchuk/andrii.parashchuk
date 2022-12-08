package com.java.class35;

public class ChildPatient extends Patient {
    @Override
    public void takeTylanol() {
        System.out.println("Your recommended dosage is 5 ml");
    }

    @Override
    public void takePayment() {
        System.out.println("10% off");
    }

    @Override
    public double calculatePayment(double originalBalance, double amountReceived) {
        double discount = 0.1;
        return (originalBalance-(originalBalance* discount))- amountReceived;
    }
}
