package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.RoomReservedModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomReservedRepo extends JpaRepository<RoomReservedModel,Long> {
    List<RoomReservedModel> findByEmailAndNameAndHemail(String email, String name,String hemail);
}
