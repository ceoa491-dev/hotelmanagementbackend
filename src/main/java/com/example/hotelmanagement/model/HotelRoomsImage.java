package com.example.hotelmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class HotelRoomsImage {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long roomId;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;
}
