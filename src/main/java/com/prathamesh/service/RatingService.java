package com.prathamesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prathamesh.exception.ProductException;
import com.prathamesh.model.Rating;
import com.prathamesh.model.User;
import com.prathamesh.request.RatingRequest;

public interface RatingService {
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
}
