package com.java.class35;

public class SeniorPatient extends Patient{
    @Override
    public void takeTylanol() {
        System.out.println("Your recommended dosage is 500 mg");
    }

    @Override
    public void takePayment() {
        System.out.println("40% off");
    }

    @Override
    public double calculatePayment(double originalBalance, double amountReceived) {
        double discount = 0.4;
        return (originalBalance-(originalBalance* discount))- amountReceived;
    }

}
