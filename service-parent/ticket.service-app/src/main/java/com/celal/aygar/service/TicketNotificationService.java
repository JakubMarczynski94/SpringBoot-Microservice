package com.celal.aygar.service;

import com.celal.aygar.model.Ticket;
import com.celal.messaging.TicketNotification;

public interface TicketNotificationService {

	public void sendToQueue(Ticket ticket);
}
