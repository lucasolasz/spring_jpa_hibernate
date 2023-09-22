package com.educandoweb.spring_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring_jpa_hibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
