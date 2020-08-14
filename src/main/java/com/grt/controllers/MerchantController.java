package com.grt.controllers;

import com.grt.models.Merchant;
import com.grt.repos.MerchantRepo;
import com.grt.repos.UserRepo;
import com.grt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MerchantController {


    @Autowired
    private MerchantRepo merchantRepo;


    @RequestMapping("/merchants")
    public List<Merchant> getAllMerchants(){
        List<Merchant> list = new ArrayList<>();
        merchantRepo.findAll().forEach(t-> list.add(t));
        return list;
    }

    @RequestMapping("/merchant/{id}")
    public  Merchant getMerchant(@PathVariable int id){
        return merchantRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/merchant/register")
    public  String  registerMerchant(@RequestBody Merchant merchant){
        merchantRepo.save(merchant);
        return  "Merchant Created";
    }


}
