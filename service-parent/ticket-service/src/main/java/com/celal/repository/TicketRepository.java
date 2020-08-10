package com.celal.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.celal.model.Ticket;

@Component
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
