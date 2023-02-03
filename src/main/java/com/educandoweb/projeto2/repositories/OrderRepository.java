package com.educandoweb.projeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto2.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}