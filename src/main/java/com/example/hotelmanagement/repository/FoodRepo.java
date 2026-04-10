package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepo extends JpaRepository<FoodModel,Long> {
    List<FoodModel> findByEmail(String email);
}
