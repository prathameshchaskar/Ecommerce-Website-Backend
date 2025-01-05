package com.prathamesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.prathamesh.controller"})
public class ECommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBackendApplication.class, args);
	}

}
	