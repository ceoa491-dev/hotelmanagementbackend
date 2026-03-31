package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.UserM;
import com.example.hotelmanagement.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserS {
    @Autowired
    private Repo repo;

    public String reg_Create(UserM userM) {
        UserM exist = repo.findByEmail(userM.getEmail());
        if (exist != null) {
            return "User Already Exist";
        } else {
            repo.save(userM);
            return "User Saved Successfully";
        }
    }
    public Map<String,Object> log(UserM userM){
        UserM exist=repo.findByEmailandPass(userM.getEmail(),userM.getPass());
        if(exist!=null){
            return Map.of("status","success");
        }
        else{
            return Map.of("status","failed");
        }
    }
}
