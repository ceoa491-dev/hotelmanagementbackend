package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.RoomReservedModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomReservedRepo extends JpaRepository<RoomReservedModel,Long> {
}
