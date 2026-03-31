package com.example.hotelmanagement.repository;
import com.example.hotelmanagement.model.UserM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<UserM,Long> {
UserM findByEmail(String email);
UserM findByEmailAndPass(String email,String pass);
}
