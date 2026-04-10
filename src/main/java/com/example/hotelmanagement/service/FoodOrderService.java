package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.FoodOrderModel;
import com.example.hotelmanagement.repository.FoodOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FoodOrderService {
    @Autowired
    private FoodOrderRepo foodOrderRepo;
    public Map<String,Object> saveorder(FoodOrderModel foodOrderModel){
        foodOrderRepo.save(foodOrderModel);
        return Map.of("status","success",
                "message","Order Placed Successfully");
    }
}
