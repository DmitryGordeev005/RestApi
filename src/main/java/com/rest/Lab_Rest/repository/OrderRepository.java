package com.rest.Lab_Rest.repository;

import com.rest.Lab_Rest.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}


