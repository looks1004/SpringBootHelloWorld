package com.javacampus.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@SpringBootApplication
public class SpringboothelloworldApplication {


	@GetMapping("/")
	public String index(){
		return "hello world....java index 우선";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringboothelloworldApplication.class, args);
	}

}
