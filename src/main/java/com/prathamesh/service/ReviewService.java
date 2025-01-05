package com.prathamesh.service;

import java.util.List;

import com.prathamesh.exception.ProductException;
import com.prathamesh.model.Review;
import com.prathamesh.model.User;
import com.prathamesh.request.ReviewRequest;

public interface ReviewService {
	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
