package com.rea.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author CRR
 */
@SpringBootApplication
@EnableCaching
public class SpringPracticeApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringPracticeApplication.class, args);
  }
}
