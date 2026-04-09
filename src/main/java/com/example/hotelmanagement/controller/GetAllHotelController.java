package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.service.GetAllHotels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GetAllHotelController {
    @Autowired
    private GetAllHotels getAllHotels;
    @GetMapping("/userhome")
    public ResponseEntity<?>getallhh(){
        return ResponseEntity.ok(getAllHotels.getallh());
    }
}
