package org.ticket.service.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.ticket.service.model.Ticket;

@Component
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
