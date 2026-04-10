package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.FoodImageModel;
import com.example.hotelmanagement.model.FoodOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderRepo extends JpaRepository<FoodOrderModel,Long> {

}
