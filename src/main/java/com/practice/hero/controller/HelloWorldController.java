package com.practice.hero.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hello World Spring Boot!";
  }
}