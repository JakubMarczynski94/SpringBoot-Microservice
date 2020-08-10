package com.celal.aygar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient  
public class TicketServiceApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(TicketServiceApp.class, args);
    }
}
