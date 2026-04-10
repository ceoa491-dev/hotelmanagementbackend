package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.RoomReservedModel;
import com.example.hotelmanagement.service.RoomReservedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RoomReserve {
@Autowired
    private RoomReservedService roomReservedService;
@PostMapping("/reserved")
public ResponseEntity<?>reservroom(@RequestBody RoomReservedModel roomReservedModel){
    return ResponseEntity.ok(roomReservedService.resroom(roomReservedModel));
}
@GetMapping("/getresroom")
    public ResponseEntity<?>getresrooms(@RequestParam String email,@RequestParam String name){
    return ResponseEntity.ok(roomReservedService.getallrooms(email,name));
    }
}
