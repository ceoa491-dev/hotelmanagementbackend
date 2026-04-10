package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.FoodImageModel;
import com.example.hotelmanagement.model.FoodOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FoodOrderRepo extends JpaRepository<FoodOrderModel,Long> {
List<FoodOrderModel>findByEmailAndNameAndHemail(String email,String name,String hemail);
}
