package com.celal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableFeignClients
public class FeignConfig {
	   public static void main(String[] args) {
	      SpringApplication.run(FeignConfig.class, args);
	   }
}
