package com.Numetry.HotelService.Controller;

import com.Numetry.HotelService.Service.HotelService;
import com.Numetry.HotelService.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class hotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel>getId(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(id));
    }
    @GetMapping
    public ResponseEntity<List<Hotel>>getAll(){
        return ResponseEntity.ok(hotelService.getAll());
    }

    @Deletemapping("/delete{id}){
        return ResponcesEntity.status(HttpStatus.Ok).body(hotelService.deleteById(id);
    }
    

}
