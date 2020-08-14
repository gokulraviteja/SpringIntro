package com.grt.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private  int id;

    @Column(name = "from_")
    private  String from;

    @Column(name = "to_")
    private  String to;

    @Column(name = "amount")
    private  double amount;

    @Column(name = "status")
    private  String status;


    public Transaction(){
    }
    public Transaction(int id , String from, String to, double amount, String status){
        super();
        this.id=id;
        this.from=from;
        this.to=to;
        this.amount=amount;
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
