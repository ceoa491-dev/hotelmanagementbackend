package com.example.hotelmanagement.service;

import com.example.hotelmanagement.model.HotelRooms;
import com.example.hotelmanagement.model.HotelRoomsImage;
import com.example.hotelmanagement.repository.HotelRoomsRepo;
import com.example.hotelmanagement.repository.RoomImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class RoomService {
    @Autowired
    private HotelRoomsRepo hotelRoomsRepo;
    @Autowired
    private RoomImageRepo roomImageRepo;

    public Map<String, String> saveroom(String txtno, String txtprice, String email, List<MultipartFile> images) {
        try {
            HotelRooms hotelRooms = new HotelRooms();
            hotelRooms.setTxtno(txtno);
            hotelRooms.setTxtprice(txtprice);
            hotelRooms.setEmail(email);
            HotelRooms hotelRoomssaved = hotelRoomsRepo.save(hotelRooms);
            for (MultipartFile file : images) {
                HotelRoomsImage hotelRoomsImage = new HotelRoomsImage();
                hotelRoomsImage.setRoomId(hotelRoomssaved.getId());
                hotelRoomsImage.setImage(file.getBytes());
                roomImageRepo.save(hotelRoomsImage);
            }
            return Map.of("status", "success");
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("status", "error");
        }


    }

    public List<Map<String, Object>> getAllrooms(String email) {
        List<Map<String, Object>> result = new ArrayList<>();
        List<HotelRooms> rooms = hotelRoomsRepo.findByEmail(email);
        if (!rooms.isEmpty()) {
            for (HotelRooms room : rooms) {
                List<HotelRoomsImage> images = roomImageRepo.findByRoomId(room.getId());
                List<String> imageList = new ArrayList<>();
                for (HotelRoomsImage imgs : images) {
                    String base64 = Base64.getEncoder().encodeToString(imgs.getImage());
                    imageList.add(base64);
                }
                Map<String, Object> roomData = new HashMap<>();
                roomData.put("txtno", room.getTxtno());
                roomData.put("txtprice", room.getTxtprice());
                roomData.put("email", room.getEmail());
                roomData.put("images", imageList);
                result.add(roomData);

            }
            return result;
        }else {
            return result;
        }

        }
    }
