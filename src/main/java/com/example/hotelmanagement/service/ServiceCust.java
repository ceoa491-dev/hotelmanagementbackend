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
    public Map<String,Object>log(UserCustM userCustM){
        UserCustM exist=repoCust.findByEmailAndPass(userCustM.getEmail(),userCustM.getPass());
        if(exist!=null){
            return Map.of("status","success",
                    "email",exist.getEmail(),
                    "name",exist.getName(),
                    "phone",exist.getPhone());
        }
        else {
            return Map.of("status","failes");
        }
    }
}
