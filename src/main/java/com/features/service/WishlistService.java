package com.features.service;


import com.features.exception.WishlistNotFoundException;
import com.features.model.Product;
import com.features.model.User;
import com.features.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

