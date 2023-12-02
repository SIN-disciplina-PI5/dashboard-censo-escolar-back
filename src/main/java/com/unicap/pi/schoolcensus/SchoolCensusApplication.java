package com.unicap.pi.schoolcensus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SchoolCensusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolCensusApplication.class, args);
	}

}
