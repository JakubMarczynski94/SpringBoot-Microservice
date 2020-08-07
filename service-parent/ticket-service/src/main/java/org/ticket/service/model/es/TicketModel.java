package org.ticket.service.model.es;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.ticket.service.model.PriorityType;
import org.ticket.service.model.TicketStatus;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Builder
@EqualsAndHashCode(of = {"ticketid"})
@Document(indexName = "ticket" )
public class TicketModel  implements Serializable{ 
	
	@Id
	private Long ticketid;
 
    private String description;
 
    private String note;
 
    private String assignee;
     
    private Date ticketDate;
     
    private String priorityType;
     
    private String ticketStatus;
}
