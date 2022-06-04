package com.idat.demo.ecf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JosePalominoOfApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosePalominoOfApplication.class, args);
	}

}
