package com.practice.hero.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.practice.hero.services.GreetingService;

@RestController
public class HelloWorldController {
  @Autowired
  private GreetingService greetingService;

  @RequestMapping("/hello/{username}")
  public String getGreeting(
    Model model, @PathVariable("username") String username
  ) {

  }

}