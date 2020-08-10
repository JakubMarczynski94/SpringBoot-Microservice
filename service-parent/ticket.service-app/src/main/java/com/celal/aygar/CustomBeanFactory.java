package com.celal.aygar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;


@Configuration
@EnableElasticsearchRepositories
@EnableJpaRepositories("com.celal") 
@ComponentScan("com.celal")
public class CustomBeanFactory {
	@Bean
	public ModelMapper getModelMapper() { return new ModelMapper(); }

}
