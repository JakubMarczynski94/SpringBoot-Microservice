package org.ticket.service;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableElasticsearchRepositories
@Configuration
@EnableJpaRepositories
public class CustomBeanFactory {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
