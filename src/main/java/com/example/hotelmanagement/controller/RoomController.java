package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.HotelRooms;
import com.example.hotelmanagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
                                     @RequestParam("images") List<MultipartFile> images){
return ResponseEntity.ok(roomService.saveroom(txtno,txtprice,images));
    }
}
