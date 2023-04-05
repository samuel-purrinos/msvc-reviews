package com.uichesoh.reviewsservice.service;

import com.uichesoh.reviewsservice.entities.Review;
import com.uichesoh.reviewsservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewsServiceImpl implements ReviewsService{

    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public Review create(Review review) {
        String reviewId = UUID.randomUUID().toString();
        review.setReviewId(reviewId);
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> findALL() {
        return reviewRepository.findAll();
    }

    @Override
    public List<Review> getReviewByUserId(String userId) {
        return reviewRepository.findByUserId(userId);
    }

    @Override
    public List<Review> getReviewByHotelId(String hotelId) {
        return reviewRepository.findByHotelId(hotelId);
    }
}
