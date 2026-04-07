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
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;
}
