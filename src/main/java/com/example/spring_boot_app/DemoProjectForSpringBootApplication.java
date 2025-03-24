package com.example.spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoProjectForSpringBootApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Kubernetes! Github to Docker...please..please\n";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectForSpringBootApplication.class, args);
	}

}
