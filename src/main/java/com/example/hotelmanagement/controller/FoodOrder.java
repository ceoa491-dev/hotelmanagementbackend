package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.FoodOrderModel;
import com.example.hotelmanagement.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class FoodOrder {
    @Autowired
    private FoodOrderService foodOrderService;
    @PostMapping("/order")
    public ResponseEntity<?>getuserorder(@RequestBody FoodOrderModel foodOrderModel){
        return ResponseEntity.ok(foodOrderService.saveorder(foodOrderModel));
    }
    @GetMapping("/getfoods")
    public ResponseEntity<?>getorfoods(@RequestParam String email,@RequestParam String name,@RequestParam String hname){
    return ResponseEntity.ok(foodOrderService.getfoods(email,name,hname));
    }
    @GetMapping("/getfoodsh")
    public ResponseEntity<?>getorfoodshh(@RequestParam String hname){
        return ResponseEntity.ok(foodOrderService.getfoodshh(hname));
    }
}
