package com.features.service;

import com.features.exception.ProductException;
import com.features.model.Cart;
import com.features.model.CartItem;
import com.features.model.Product;
import com.features.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
