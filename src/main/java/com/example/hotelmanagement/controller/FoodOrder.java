package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.FoodOrderModel;
import com.example.hotelmanagement.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class FoodOrder {
    @Autowired
    private FoodOrderService foodOrderService;
    @PostMapping("/order")
    public ResponseEntity<?>getuserorder(@RequestBody FoodOrderModel foodOrderModel){
        return ResponseEntity.ok(foodOrderService.saveorder(foodOrderModel));
    }
}
