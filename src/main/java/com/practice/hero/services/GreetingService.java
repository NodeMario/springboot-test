package com.practice.hero.services;
import org.springframework.stereotype.Service;
import org.springframework.cloud.netflix.hystrix.HystrixCommand;

import com.practice.hero.models.Todo;
import org.springframework.web.client.RestTemplate;

@Service 
public class GreetingService {
  @HystrixCommand(fallbackMethod = "defaultGreeting")
  public String getGreeting(String username) {
    return new RestTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todo.class)
  }

  private String defaultGreeting() {
    return "Default Greeting";
  }

}
