package com.features.service;

import com.features.exception.ReviewNotFoundException;
import com.features.model.Product;
import com.features.model.Review;
import com.features.model.User;
import com.features.request.CreateReviewRequest;

import javax.naming.AuthenticationException;
import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        User user,
                        Product product);

    List<Review> getReviewsByProductId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws ReviewNotFoundException, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws ReviewNotFoundException, AuthenticationException;

}
