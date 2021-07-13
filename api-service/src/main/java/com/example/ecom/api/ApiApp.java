package com.example.ecom.api;

import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.HttpsURLConnection;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@Configuration
@ComponentScan({"com.example.ecom.api.service", "com.example.ecom.common"})
public class ApiApp {

  private static final Logger LOG = LoggerFactory.getLogger(ApiApp.class);

  static {
    // for localhost testing only
    LOG.warn("Will now disable hostname check in SSL, only to be used during development");
    HttpsURLConnection.setDefaultHostnameVerifier((hostname, sslSession) -> true);
  }

  @Value("${app.rabbitmq.host:localhost}")
  String rabbitMqHost;

  @Bean
  public ConnectionFactory connectionFactory() {
    LOG.info("Create RabbitMqCF for host: {}", rabbitMqHost);
    CachingConnectionFactory connectionFactory = new CachingConnectionFactory(rabbitMqHost);
    return connectionFactory.getRabbitConnectionFactory();
  }

  public static void main(String[] args) {
    LOG.info("Register MDCHystrixConcurrencyStrategy");
    SpringApplication.run(ApiApp.class, args);
  }
}
