package com.Numetry.RatingService.Service;

import com.Numetry.RatingService.Repository.RatingRepository;
import com.Numetry.RatingService.entities.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public Rating create(Rating rating){
        return ratingRepository.save(rating);

    }
    public List<Rating> getRating(){
        return ratingRepository.findAll();

    }
    public List<Rating>getRatingByUserId(String userId){
        return ratingRepository.findByUserId(userId);

    }
    public List<Rating>getRatingByHotelId(String hotelId){
        return ratingRepository.findByHotelId(hotelId);
    }
}
