package com.example.ecom.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Sourabh Sharma
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApp {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(RegistryApp.class, args);
  }
}
