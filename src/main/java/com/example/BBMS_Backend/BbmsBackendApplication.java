package com.example.BBMS_Backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BbmsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbmsBackendApplication.class, args);
	}

	@Bean
	public ModelMapper modelmapper(){
		return new ModelMapper();
	}

}
