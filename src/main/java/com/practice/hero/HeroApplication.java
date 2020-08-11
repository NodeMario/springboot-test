package com.practice.hero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class HeroApplication {
  public static void main( String[] args) {
    SpringApplication.run(HeroApplication.class, args);
  }
}