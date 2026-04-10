package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.RoomReservedModel;
import com.example.hotelmanagement.service.RoomReservedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RoomReserve {
@Autowired
    private RoomReservedService roomReservedService;
@PostMapping("/reserved")
public ResponseEntity<?>reservroom(@RequestBody RoomReservedModel roomReservedModel){
    return ResponseEntity.ok(roomReservedService.resroom(roomReservedModel));
}
}
