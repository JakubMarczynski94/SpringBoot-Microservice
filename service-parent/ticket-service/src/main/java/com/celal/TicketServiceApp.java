package com.celal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.celal","org.service","org.ticket"})
//@ComponentScan("com.celal")
public class TicketServiceApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(TicketServiceApp.class, args);
    }
}
