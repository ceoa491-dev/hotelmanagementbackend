package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.FoodImageModel;
import com.example.hotelmanagement.model.FoodModel;
import com.example.hotelmanagement.repository.FoodImageRepo;
import com.example.hotelmanagement.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class FoodService {
    @Autowired
    private FoodRepo foodRepo;
    @Autowired
    private FoodImageRepo foodImageRepo;
    public Map<String,String>savingfood(String dis, String disprice, List<MultipartFile> images){
        try{
            FoodModel foodModel=new FoodModel();
            foodModel.setDis(dis);
            foodModel.setDisprice(disprice);
            FoodModel foodsaved=foodRepo.save(foodModel);
            for(MultipartFile file :images){
                FoodImageModel foodImageModel=new FoodImageModel();
                foodImageModel.setFoodId(foodsaved.getId());
                foodImageModel.setImage(file.getBytes());
                foodImageRepo.save(foodImageModel);
            }
            return Map.of("status","success");
        }
        catch(Exception e){
            e.printStackTrace();
            return Map.of("status","Error");
        }
    }
}
