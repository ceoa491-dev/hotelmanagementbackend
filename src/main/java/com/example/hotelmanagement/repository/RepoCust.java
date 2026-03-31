package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.controller.UserCust;
import com.example.hotelmanagement.model.UserCustM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCust extends JpaRepository<UserCustM,Long> {
    UserCustM findByEmail(String email);
    UserCustM findByEmailandPass(String email,String pass);
}
