package com.helloworld.springboot.hello_world_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Hey theree!!!!!");
		System.out.println("-------------------------------");
		SpringApplication.run(HelloWorldSpringBootApplication.class, args);
		System.out.println("-------------------------------");
	}

}
