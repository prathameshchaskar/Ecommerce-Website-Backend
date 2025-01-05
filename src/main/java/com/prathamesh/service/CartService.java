package com.prathamesh.service;

import com.prathamesh.exception.ProductException;
import com.prathamesh.model.Cart;
import com.prathamesh.model.CartItem;
import com.prathamesh.model.User;
import com.prathamesh.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
