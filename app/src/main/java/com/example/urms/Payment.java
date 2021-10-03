package com.example.urms;

public class Payment {
    String date;
    String payment;


    public Payment(String date, String payment) {
        this.date = date;
        this.payment = payment;
    }

    public String getDate() {
        return date;
    }

    public String getPayment() {
        return payment;
    }
}