package com.celal.repository.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.celal.model.es.TicketModel;

public interface TicketElasticRepository  extends ElasticsearchRepository<TicketModel, Long>{

}
