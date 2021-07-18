package com.example.ecom.restaurant.domain.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @RabbitListener(queues = "orders")
    public void receiveMessage(String message) {
        System.out.println("RabbitMQ Received :: {}"+ message);
    }
}
