package com.example.ecom.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SecurityApp {

  @RequestMapping({"/user", "/me"})
  public Principal user(Principal user) {
    // You can customized what part of Principal you want to expose.
    return user;
  }

  public static void main(String[] args) {
    SpringApplication.run(SecurityApp.class, args);
  }

}

