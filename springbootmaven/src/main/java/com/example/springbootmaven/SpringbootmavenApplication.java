package com.example.springbootmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// restcontroller 추가
@RestController
@SpringBootApplication
public class SpringbootmavenApplication {

	// requestmapping 추가
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootmavenApplication.class, args);
	}

}
