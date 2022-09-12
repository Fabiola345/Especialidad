package com.example.backUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class BackUnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackUnoApplication.class, args);
	}

}
