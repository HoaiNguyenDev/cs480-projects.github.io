package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class SpringtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}
	//Duc Thanh Nguyen
	 @GetMapping("/hi")
	 public String hi(@RequestParam(value = "name", defaultValue = "a good day!!!") String name) {
	 	return String.format("Haveeeeee %s!", name);
	 }
}