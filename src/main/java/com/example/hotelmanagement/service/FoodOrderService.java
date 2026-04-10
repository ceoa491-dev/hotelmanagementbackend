package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.FoodOrderModel;
import com.example.hotelmanagement.repository.FoodOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoodOrderService {
    @Autowired
    private FoodOrderRepo foodOrderRepo;

    public Map<String, Object> saveorder(FoodOrderModel foodOrderModel) {
        FoodOrderModel fo = foodOrderRepo.save(foodOrderModel);
        return Map.of("status", "success",
                "message", "Order Placed Successfully",
                "dish", fo.getDisname(),
                "disprice", fo.getDisprice(),
                "email", fo.getEmail(),
                "hemail",fo.getHemail());
    }

    public Map<String, Object> getfoods(String email, String name,String hemail) {
        List<FoodOrderModel> food = foodOrderRepo.findByEmailAndNameAndHemail(email, name,hemail);
        if (!food.isEmpty()) {
            return Map.of("status", "success",
                    "data", food);
        } else {
            return Map.of("status", "failed",
                    "message", "no food orders found");
        }

    }
    public Map<String, Object> getfoodshh(String hemail) {
        List<FoodOrderModel> food = foodOrderRepo.findByHemail(hemail);
        if (!food.isEmpty()) {
            return Map.of("status", "success",
                    "data", food);
        } else {
            return Map.of("status", "failed",
                    "message", "no food orders found");
        }

    }
}
