package com.java.class35;

public class DisablePatient extends Patient {
    @Override
    public void takeTylanol() {

        System.out.println("Your recommended dosage is 200 mg");
    }

    @Override
    public void takePayment() {
        System.out.println("20% off");
    }

    @Override
    public double calculatePayment(double originalBalance, double amountReceived) {
        double discount = 0.2;
        return (originalBalance-(originalBalance* discount))- amountReceived;
    }
}
