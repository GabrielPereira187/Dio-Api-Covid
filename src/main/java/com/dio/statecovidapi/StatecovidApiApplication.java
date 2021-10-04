package com.dio.statecovidapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.dio.statecovidapi.Service.StateService;
import com.dio.statecovidapi.Service.impl.StateImpl;

@SpringBootApplication
@EnableFeignClients
public class StatecovidApiApplication {
	
	@Bean
	public StateService transactionService() {
	    return new StateImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(StatecovidApiApplication.class, args);
	}

}
