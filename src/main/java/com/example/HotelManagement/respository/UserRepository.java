package com.example.HotelManagement.respository;

import com.example.HotelManagement.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
