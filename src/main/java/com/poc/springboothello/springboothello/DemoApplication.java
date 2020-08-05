package com.poc.springboothello.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("oracle.net.tns_admin",
			"<Path of tnsnames.ora>");

		SpringApplication.run(DemoApplication.class, args);
	}

}
