package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<FoodModel,Long> {
}
