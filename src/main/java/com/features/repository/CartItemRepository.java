package com.features.repository;

import com.features.model.Cart;
import com.features.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
