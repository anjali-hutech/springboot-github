package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubApplication.class, args);
	}
	
	
	@GetMapping("/data")
	public String data()
	{
		return "Hello";
	}

}
