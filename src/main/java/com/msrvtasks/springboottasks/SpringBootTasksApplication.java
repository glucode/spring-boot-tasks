package com.msrvtasks.springboottasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTasksApplication.class, args);
		sayHello();
	}

	@RequestMapping(value = "/")
	public static String sayHello() {
		return "Hello World";
	}
}
