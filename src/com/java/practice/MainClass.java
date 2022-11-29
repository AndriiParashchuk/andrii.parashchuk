package com.java.practice;

class BasicCalculator{

    public void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
    public void sub(int num1, int num2){
        System.out.println(num1-num2);
    }
}

class AdvanceCalculator extends BasicCalculator{
    public void mul(int num1, int num2){
        System.out.println(num1*num2);
    }
    public void div(int num1, int num2){
        System.out.println(num1/num2);
    }
}

public class MainClass {
    public static void main(String[] args) {
        AdvanceCalculator ac = new AdvanceCalculator();
        ac.sum(12, 22);
        ac.sub(33, 33);
        ac.mul(987652674,34);
        ac.div(234,3);

    }
}
