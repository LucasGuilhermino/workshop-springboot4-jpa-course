package com.myprojects.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.coursespringboot.entities.OrderItem;
import com.myprojects.coursespringboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
