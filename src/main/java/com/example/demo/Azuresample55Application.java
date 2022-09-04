package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Azuresample55Application {

	@GetMapping("/ussee")
	public String print() 
	{return "hahahhello";}
	
	public static void main(String[] args) {
		SpringApplication.run(Azuresample55Application.class, args);
	}

}
