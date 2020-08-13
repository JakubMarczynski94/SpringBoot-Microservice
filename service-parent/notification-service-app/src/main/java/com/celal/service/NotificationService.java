package com.celal.service;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

import com.celal.messaging.TicketNotification;

@EnableBinding(Sink.class)
public class NotificationService {

	
	@StreamListener(Sink.INPUT)
	public void onNotification(TicketNotification notification) {
		System.out.println("----------------------------------------------------");
		System.out.println("Notification is received. and being sent");
		System.out.println("Notification --> "+notification.toString());
		
	}
}
