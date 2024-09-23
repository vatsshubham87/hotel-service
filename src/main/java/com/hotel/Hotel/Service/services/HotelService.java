package com.hotel.Hotel.Service.services;

import com.hotel.Hotel.Service.entities.Hotel;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface HotelService {
    

    public Hotel createHotel(Hotel hotel);

    public Hotel getHotel(String id);

    public List<Hotel> getAllHotels();

    public void deleteHotel(String id);

    public Hotel updateHotel(Hotel hotel);


}
