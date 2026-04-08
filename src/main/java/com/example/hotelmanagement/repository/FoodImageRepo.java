package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.FoodImageModel;
import com.example.hotelmanagement.model.HotelRoomsImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodImageRepo extends JpaRepository<FoodImageModel,Long> {
    List<FoodImageModel>findByFoodId(Long foodId);
}
