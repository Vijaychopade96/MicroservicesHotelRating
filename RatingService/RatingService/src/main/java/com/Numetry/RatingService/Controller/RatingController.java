package com.Numetry.RatingService.Controller;

import com.Numetry.RatingService.Service.RatingService;
import com.Numetry.RatingService.entities.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public Rating createRating(@RequestBody Rating rating){
//        return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.save(rating));
        return ratingService.create(rating);

    }
    @GetMapping
    public ResponseEntity<List<Rating>>getRating(){
        return ResponseEntity.ok(ratingService.getRating());
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>>getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>>getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

}
