package com.example.hotelmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.jpa.event.internal.ListenerCallback;

@Entity
@Data
public class FoodImageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long foodId;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;
}
