package com.celal.aygar.repo;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.celal.aygar.model.Ticket;
 

@Component
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
