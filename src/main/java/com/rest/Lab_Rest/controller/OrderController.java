package com.rest.Lab_Rest.controller;

import com.rest.Lab_Rest.model.Order;
import com.rest.Lab_Rest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("")
    public List<Order> list() {
        return orderService.listAllOrder();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> get(@PathVariable Integer idorder) {
        try {
            Order order = orderService.getOrder(idorder);
            return new ResponseEntity<Order>(order, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer idorder) {
        try {
            Order existOrder = orderService.getOrder(idorder);
            order.setIdorder(idorder);
            orderService.saveOrder(order);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer idorder) {

        orderService.deleteOrder(idorder);
    }
}