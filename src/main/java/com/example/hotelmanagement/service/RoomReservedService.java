package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.RoomReservedModel;
import com.example.hotelmanagement.repository.RoomReservedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoomReservedService {
    @Autowired
    private RoomReservedRepo roomReservedRepo;
    public Map<String,Object> resroom(RoomReservedModel reservedModel){
        RoomReservedModel rvs=roomReservedRepo.save(reservedModel);
        return Map.of("status","success",
                "message","room reserved successfully",
                "room",rvs.getRoom(),
                    "roomprice",rvs.getRoomprice(),
                "name",rvs.getName(),
                "email",rvs.getEmail());
    }
    public Map<String,Object>getallrooms(String email,String name,String hemail){
        List<RoomReservedModel>rooms=roomReservedRepo.findByEmailAndNameAndHemail(email,name,hemail);
        if(!rooms.isEmpty()){
            return Map.of("status","success",
                    "data",rooms);
        }
        else {
            return Map.of("Status","Failed",
                    "message","no data found");
        }
    }

}
