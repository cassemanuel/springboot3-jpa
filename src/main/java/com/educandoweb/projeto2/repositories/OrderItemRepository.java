package com.educandoweb.projeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto2.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
