package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.HotelRooms;
import com.example.hotelmanagement.model.HotelRoomsImage;
import com.example.hotelmanagement.repository.HotelRoomsRepo;
import com.example.hotelmanagement.repository.RoomImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class RoomService {
    @Autowired
    private HotelRoomsRepo hotelRoomsRepo;
    @Autowired
    private RoomImageRepo roomImageRepo;
    public Map<String,String>saveroom(String txtno, String txtprice, List<MultipartFile>images){
        try {
            HotelRooms hotelRooms=new HotelRooms();
            hotelRooms.setTxtno(txtno);
            hotelRooms.setTxtprice(txtprice);
            HotelRooms hotelRoomssaved=hotelRoomsRepo.save(hotelRooms);
            for(MultipartFile file:images){
                HotelRoomsImage hotelRoomsImage=new HotelRoomsImage();
                hotelRoomsImage.setRoomId(hotelRoomssaved.getId());
                hotelRoomsImage.setImage(file.getBytes());
                roomImageRepo.save(hotelRoomsImage);
            }
            return Map.of("status","success");
        }catch (Exception e){
            e.printStackTrace();
            return Map.of("status","error");
        }


    }

}
