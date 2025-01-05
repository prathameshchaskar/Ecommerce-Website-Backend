package com.prathamesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.prathamesh.config,"+"com.prathamesh.controller,"+"com.prathamesh.exception,"+
"com.prathamesh.model,"+"com.prathamesh.repository,"+"com.prathamesh.request,"+"com.prathamesh.response,"+"com.prathamesh.service")
public class ECommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBackendApplication.class, args);
	}

}
	