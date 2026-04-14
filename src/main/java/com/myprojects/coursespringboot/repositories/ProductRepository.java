package com.myprojects.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.coursespringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
