package com.celal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class AccountServiceApp 
{
    public static void main( String[] args )
    {
		SpringApplication.run(AccountServiceApp.class, args);

    }
}
