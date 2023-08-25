package com.Numetry.HotelService.Service;

import com.Numetry.HotelService.Repository.HotelRepository;
import com.Numetry.HotelService.entities.Hotel;
import com.Numetry.HotelService.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepsoitory;
    public Hotel createHotel(Hotel hotel){
//        String hotelId=UUID.randomUUID().toString();
//        hotel.setId(hotelId);
        return hotelRepsoitory.save(hotel);

    }
    public List<Hotel>getAll(){
        return hotelRepsoitory.findAll();
    }
    public Hotel get(String id){
        return hotelRepsoitory.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel not found!!"));

    }

}
