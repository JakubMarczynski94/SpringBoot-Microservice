package com.celal.messaging;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketNotification implements Serializable{

	
	private String ticketId;
	private String accountId;
	private String ticketDescription;
	
	
	
}
