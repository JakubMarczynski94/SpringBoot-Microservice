package org.ticket.service.repository.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.ticket.service.model.es.TicketModel;

public interface TicketElasticRepository  extends ElasticsearchRepository<TicketModel, Long>{

}
