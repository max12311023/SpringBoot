package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example"})
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.repositories")
public class Imb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Imb2Application.class, args);
	}
}
