package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.UserM;
import com.example.hotelmanagement.repository.Repo;
import com.example.hotelmanagement.service.UserS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class User {
@Autowired
    private Repo repo;
@Autowired
    private UserS userS;
@PostMapping("/hreg")
public ResponseEntity<?>register(@RequestBody UserM userM){
    return ResponseEntity.ok(userS.reg_Create(userM));
}
@PostMapping("/hlog")
    public ResponseEntity<?>logg(@RequestBody UserM userM){
    return ResponseEntity.ok((userS.log(userM)));
}
}
