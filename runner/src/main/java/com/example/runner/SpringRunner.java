package com.example.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.adapters.persistence")
@EntityScan(basePackages = "com.example.adapters.persistence")
@ComponentScan(basePackages = "com.example")
@EnableJpaAuditing
public class SpringRunner {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringRunner.class, args);
  }

  @Bean
  public Logger logger() {
    return LoggerFactory.getLogger(this.getClass());
  }
}
