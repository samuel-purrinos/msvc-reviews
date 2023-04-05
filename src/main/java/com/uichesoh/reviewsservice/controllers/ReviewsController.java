package com.uichesoh.reviewsservice.controllers;

import com.uichesoh.reviewsservice.entities.Review;
import com.uichesoh.reviewsservice.service.ReviewsService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {

    @Autowired
    ReviewsService reviewsService;

    @PostMapping
    public ResponseEntity<Review> saveReview(@RequestBody Review review){
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewsService.create(review));
    }

    @GetMapping
    public ResponseEntity<List<Review>> findAll(){
        return ResponseEntity.ok(reviewsService.findALL());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Review>> getByUserId(@PathVariable String userId){
        return ResponseEntity.ok(reviewsService.getReviewByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Review>> getByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(reviewsService.getReviewByHotelId(hotelId));
    }
}
