package com.features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
