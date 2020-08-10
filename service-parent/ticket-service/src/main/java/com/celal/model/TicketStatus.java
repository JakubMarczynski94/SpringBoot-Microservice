package com.celal.model;

import lombok.Getter;

@Getter
public enum TicketStatus {


	OPEN("Açık"),
	IN_PROGRESS("İşlemde"),
	RESOLVED("Çözüldü"),
	CLOSED("Kapalı");
	
	private String label;
	
	private TicketStatus(String label) {
		this.label=label;
	}
}
