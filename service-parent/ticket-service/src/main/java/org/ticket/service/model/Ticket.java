package org.ticket.service.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntityModel {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator = "UUID")
	@GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column( name = "ticket_id", updatable = false, nullable = false)
	private Long ticketid;

    @Column(name  = "description", length = 600)
    private String description;

    @Column(name  = "note",length = 600)
    private String note;

    @Column(name  = "ticketDate")
    private Date ticketDate;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name  = "priority_type")
    private PriorityType priorityType;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name  = "ticket_status")
    private TicketStatus ticketStatus;
}
