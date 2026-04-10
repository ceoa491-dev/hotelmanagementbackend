package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.HotelRooms;
import com.example.hotelmanagement.model.HotelRoomsImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRoomsRepo extends JpaRepository<HotelRooms,Long> {
    List<HotelRooms> findByEmail(String email);
}
