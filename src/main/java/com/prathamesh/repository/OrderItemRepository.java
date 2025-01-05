package com.prathamesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prathamesh.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
