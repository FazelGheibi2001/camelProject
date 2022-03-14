package com.camel.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelApplication.class, args);

		FirstRoute instance = new FirstRoute();
		try {
			instance.configure();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
