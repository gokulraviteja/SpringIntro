package com.grt.utils;

public class RequestAddMoney {

    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    RequestAddMoney(){}

    RequestAddMoney(int id, double amount){
        this.id=id;
        this.amount=amount;
    }




}
