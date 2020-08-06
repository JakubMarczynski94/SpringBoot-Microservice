package org.ticket.service.dto;
 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.ticket.service.model.PriorityType;
import org.ticket.service.model.TicketStatus;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TicketDto {
	
	private Long ticketid;
 
    private String description;
 
    private String note;
 
    private Date ticketDate;
     
    private String priorityType;
     
    private String ticketStatus;
    
	private Date createdAt; 
	
	private Date updatedAt;
	
}
