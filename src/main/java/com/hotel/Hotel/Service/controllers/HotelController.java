package com.hotel.Hotel.Service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.Service.entities.Hotel;
import com.hotel.Hotel.Service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {


    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = hotelService.createHotel(hotel);
        return new ResponseEntity<Hotel>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String id)
    {
        Hotel hotel1 = hotelService.getHotel(id);
        return new ResponseEntity<Hotel>(hotel1, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel()
    {
        List<Hotel> hotels = hotelService.getAllHotels();
        return new ResponseEntity<List<Hotel>>(hotels, HttpStatus.OK);
    }


    @DeleteMapping("id/{id}")
    public ResponseEntity<Object> deleteHotel(@PathVariable String id)
    {
        hotelService.deleteHotel(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
