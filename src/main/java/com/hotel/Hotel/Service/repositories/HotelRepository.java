package com.hotel.Hotel.Service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.Hotel.Service.entities.Hotel;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, String>{
    
}
