package com.grt.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "mobile")
    private  String mobile;
    @Column(name = "balance")
    private  double balance;

    public User(){
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User(int id , String name, String mobile, double balance){
        super();
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



}
