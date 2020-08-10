package com.celal.aygar.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.celal.aygar.model.TicketModel;


public interface TicketElasticRepository  extends ElasticsearchRepository<TicketModel, Long>{

}
