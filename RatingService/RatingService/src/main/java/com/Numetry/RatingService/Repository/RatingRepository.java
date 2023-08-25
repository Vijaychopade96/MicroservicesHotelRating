package com.Numetry.RatingService.Repository;

import com.Numetry.RatingService.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,String> {
    //custom
    List<Rating> findByUserId(String userId);
    List<Rating>findByHotelId(String hotelId);
}
