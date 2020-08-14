package com.grt.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Merchant {

    @Id
    @GeneratedValue
    @Column(name = "mId")
    private  int id;
    @Column(name = "mName")
    private  String name;
    @Column(name = "mMobile")
    private  String mobile;
    @Column(name = "mBalance")
    private  double balance;

    public Merchant(){
    }
    public Merchant(int id , String name, String mobile, double balance){
        super();
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
