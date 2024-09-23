package com.hotel.Hotel.Service.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Hotel.Service.entities.Hotel;
import com.hotel.Hotel.Service.exceptions.ResourceNotFoundException;
import com.hotel.Hotel.Service.repositories.HotelRepository;
import com.hotel.Hotel.Service.services.HotelService;


@Service
public class HotelServiceImpl  implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        
      String randomId  =  UUID.randomUUID().toString();
      hotel.setId(randomId);
      return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String id) {
        
        Hotel hotel =  hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel is not present with given id"));
        return hotel;
        // Hotel hotel =  hotelRepository.findById(id).orElseThrow(() -> "hotel with given id does not exist");
    }

    @Override
    public List<Hotel> getAllHotels() {
        
        return hotelRepository.findAll();

    }

    @Override
    public void deleteHotel(String id) {
        
        hotelRepository.deleteById(id);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return null;
    }
    
}
