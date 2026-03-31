package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.UserCustM;
import com.example.hotelmanagement.repository.RepoCust;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceCust {
    @Autowired
    private RepoCust repoCust;
    public String cregis(UserCustM userCustM) {
        UserCustM exist=repoCust.findByEmail(userCustM.getEmail());
        if(exist!=null){
            return "User Already Exist";
        }
        else{
            repoCust.save(userCustM);
            return "User Saved Successfully";
        }
    }
}
