package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @PostMapping("/addfood")
    public ResponseEntity<?>savef(@RequestParam("dis") String dis,
                                  @RequestParam("disprice") String disprice,
                                  @RequestParam("images")List<MultipartFile>images){
        return ResponseEntity.ok(foodService.savingfood(dis,disprice,images));
    }
}
