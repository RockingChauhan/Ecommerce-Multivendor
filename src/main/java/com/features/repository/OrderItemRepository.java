package com.features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.features.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
