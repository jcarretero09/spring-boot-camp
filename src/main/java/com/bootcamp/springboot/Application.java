package com.bootcamp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ConfigurationProperties(prefix = "com.bootcamp.springboot")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
