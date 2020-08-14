package com.grt.controllers;

import com.grt.models.Merchant;
import com.grt.models.Transaction;
import com.grt.models.User;
import com.grt.repos.MerchantRepo;
import com.grt.repos.TransactionRepo;
import com.grt.repos.UserRepo;
import com.grt.utils.RequestAddMoney;
import com.grt.utils.RequestInitTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TransactionController {

    @Autowired
    private TransactionRepo transactionRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private MerchantRepo merchantRepo;


    @RequestMapping(method = RequestMethod.POST,value = "/user/add/money")
    public String addMoney(@RequestBody RequestAddMoney request){

        User user=userRepo.findOne(request.getId());
        user.setBalance(user.getBalance()+request.getAmount());
        userRepo.save(user);

        Transaction transaction= new Transaction();
        transaction.setFrom("BANK");
        transaction.setTo(user.getMobile());
        transaction.setAmount(request.getAmount());
        transaction.setStatus("SUCCESS");

        transactionRepo.save(transaction);

        return  "Added Succesfully";
    }


    @RequestMapping("/transactions")
    public List<Transaction> getAllTransactions(){
        List<Transaction> list = new ArrayList<>();
        transactionRepo.findAll().forEach(t-> list.add(t));
        return list;
    }

    @RequestMapping("/transaction/status/{id}")
    public String getStatus(@PathVariable int id){
        Transaction t=transactionRepo.findOne(id);
        return t.getStatus();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/transaction/initiate")
    public String initTransaction(@RequestBody RequestInitTransaction request){


        User from=userRepo.findOne(request.getFrom());
        Merchant to=merchantRepo.findOne(request.getTo());


        Transaction t=new Transaction();
        t.setAmount(request.getAmount());
        t.setFrom(from.getName());
        t.setTo(to.getName());


        if(from.getBalance()<request.getAmount()){
            t.setStatus("FAILURE");
            transactionRepo.save(t);
            return "FAILURE";
        }
        else{
            from.setBalance(from.getBalance()-request.getAmount());
            to.setBalance(to.getBalance()+request.getAmount());
            t.setStatus("SUCCESS");
            transactionRepo.save(t);
            return "SUCCESS";
        }


    }



}
