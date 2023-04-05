package com.uichesoh.reviewsservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("reviews")
public class Review {
    @Id
    private String reviewId;
    private String userId;
    private String hotelId;
    private int review;
    private String observations;
}
