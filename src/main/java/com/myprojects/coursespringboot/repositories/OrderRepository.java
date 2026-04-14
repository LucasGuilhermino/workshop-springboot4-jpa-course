package com.myprojects.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
