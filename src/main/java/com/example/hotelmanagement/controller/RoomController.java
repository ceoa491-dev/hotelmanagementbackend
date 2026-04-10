package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.HotelRooms;
import com.example.hotelmanagement.service.RoomService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @PostMapping("/addroom")
    public ResponseEntity<?> addRoom(@RequestParam("txtno") String txtno,
                                     @RequestParam("txtprice") String txtprice,
                                     @RequestParam("email") String email,
                                     @RequestParam("images") List<MultipartFile> images){
return ResponseEntity.ok(roomService.saveroom(txtno,txtprice,email,images));
    }
    @GetMapping("/getroom")
    public ResponseEntity<?>getrooms(@RequestParam("email") String email){
        return ResponseEntity.ok(roomService.getAllrooms(email));
    }
}
