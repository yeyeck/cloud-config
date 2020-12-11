package org.yeyeck.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@Value("${name}")
	private String name;

	@GetMapping("/name")
	public String name() {
		return name;
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
