package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController  {
  @GetMapping("/")
   public String msg() {
     return "<button>Click</button><h1>Hi</h1>";
   }
  @GetMapping("/endpoint")
    public String hello() {
     return "Hello, World!";
 }
 @GetMapping("/number")
  public double num() {
   return Math.ceil(Math.random() * 1) * 1000000;
 }
}
  
