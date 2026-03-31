package com.example.hotelmanagement.controller;

import com.example.hotelmanagement.model.UserCustM;
import com.example.hotelmanagement.repository.RepoCust;
import com.example.hotelmanagement.service.ServiceCust;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserCust {
    @Autowired
    private RepoCust repoCust;
    @Autowired
    private ServiceCust serviceCust;
@PostMapping("/creg")
    public ResponseEntity<?>cregister(@RequestBody UserCustM userCustM){
    return ResponseEntity.ok(serviceCust.cregis(userCustM));
}
}
