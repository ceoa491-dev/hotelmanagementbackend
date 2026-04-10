package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
                                  @RequestParam("email") String email,
                                  @RequestParam("images")List<MultipartFile>images){
        return ResponseEntity.ok(foodService.savingfood(dis,disprice,email,images));
    }
    @GetMapping("/getfood")
    public ResponseEntity<?>getfood(@RequestParam("email") String email){
        return ResponseEntity.ok(foodService.getfoods(email));
    }
}
