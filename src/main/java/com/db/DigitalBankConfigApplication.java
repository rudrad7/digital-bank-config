package com.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DigitalBankConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBankConfigApplication.class, args);
		System.out.println("Config service started : 8085");
	}

}
