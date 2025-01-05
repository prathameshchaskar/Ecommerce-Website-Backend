package com.prathamesh.service;

import com.prathamesh.exception.CartItemException;
import com.prathamesh.exception.UserException;
import com.prathamesh.model.Cart;
import com.prathamesh.model.CartItem;
import com.prathamesh.model.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	  
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
