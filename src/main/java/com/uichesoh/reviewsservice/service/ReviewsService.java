package com.uichesoh.reviewsservice.service;

import com.uichesoh.reviewsservice.entities.Review;

import java.util.List;

public interface ReviewsService {

    Review create(Review review);
    List<Review> findALL();

    List<Review> getReviewByUserId(String userId);

    List<Review> getReviewByHotelId(String hotelId);
}
