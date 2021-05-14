package com.rest.Lab_Rest.service;

import com.rest.Lab_Rest.model.Order;
import com.rest.Lab_Rest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> listAllOrder() {
        return orderRepository.findAll();
    }

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    public Order getOrder(Integer idorder) {
        return orderRepository.findById(idorder).get();
    }

    public void deleteOrder(Integer idorder) {
        orderRepository.deleteById(idorder);
    }
}