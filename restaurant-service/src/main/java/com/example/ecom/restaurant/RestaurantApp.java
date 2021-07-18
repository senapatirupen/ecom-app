package com.example.ecom.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Rupen Senapati
 */
@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class RestaurantApp {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(RestaurantApp.class, args);
  }
}
