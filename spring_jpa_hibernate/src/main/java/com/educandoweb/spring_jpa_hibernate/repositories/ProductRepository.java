package com.educandoweb.spring_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring_jpa_hibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
