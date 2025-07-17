package com.fnkcode.sec02.lec01;

public class Demo {

    public static void main(String[] args) {
        processPayment(new Cash());
        processPayment(new CashRewards());
    }

    private static void processPayment(Payment payment) {
        payment.process(80);
    }
}
