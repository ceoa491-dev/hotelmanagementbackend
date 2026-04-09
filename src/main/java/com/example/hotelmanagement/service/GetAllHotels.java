package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.UserM;
import com.example.hotelmanagement.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GetAllHotels {
    @Autowired
    private Repo repo;
    public List<Map<String,Object>> getallh(){
        List<Map<String,Object>>SetArr=new ArrayList<>();
        List<UserM>allh=repo.findAll();
        for(UserM all:allh){
            Map<String,Object>HotelData=new HashMap<>();
            HotelData.put("hname",all.getHname());
            HotelData.put("name",all.getName());
            HotelData.put("phone",all.getPhone());
            HotelData.put("email",all.getEmail());
            SetArr.add(HotelData);
        }
        return SetArr;
    }

}
