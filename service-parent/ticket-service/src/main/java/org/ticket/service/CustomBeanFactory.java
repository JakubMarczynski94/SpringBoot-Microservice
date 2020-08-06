package org.ticket.service;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableElasticsearchRepositories
@Configuration
public class CustomBeanFactory {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
