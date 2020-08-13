package com.celal.aygar.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import com.celal.aygar.model.Ticket;
import com.celal.messaging.TicketNotification;

import lombok.RequiredArgsConstructor;



@Service
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class TicketNotificationServiceImp implements TicketNotificationService {

	private final Source source;
	
	@Override
	public void sendToQueue(Ticket ticket) {

		TicketNotification notification = new TicketNotification();
		notification.setTicketId(ticket.getTicketid().toString());
		notification.setAccountId(ticket.getAssignee());
		notification.setTicketDescription(ticket.getDescription());
		source.output().send(MessageBuilder.withPayload(notification).build());
		System.out.println("----------------------------------------------------");
		System.out.println("Notification is deleveried.");
		System.out.println("Notification --> "+notification.toString());
	}

}
