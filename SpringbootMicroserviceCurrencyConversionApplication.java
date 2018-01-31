package com.gulsah.project.microservice.currencyconversion.springbootmicroservicecurrencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.gulsah.project.microservice.currencyconversion.springbootmicroservicecurrencyconversion")
public class SpringbootMicroserviceCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceCurrencyConversionApplication.class, args);
	}
}
