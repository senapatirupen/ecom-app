package com.example.ecom.restaurant.domain.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedRate = 1000)
    public void send() {
        String message = "Next order received at " +
                Calendar.getInstance().getTime();
        this.rabbitTemplate.convertAndSend("orders_exchange", "orders",
                message);
        System.out.println("RabbitMQ Message sent : {}"+ message);
    }
}
