package org.ticket.service.model;

import lombok.Getter;

@Getter
public enum PriorityType {
	
	
	URGENT("Acil"),
	LOW("Önemsiz"),
	HIGH("Yüksek Öncelikli");
	
	private String label;
	
	private PriorityType(String label) {
		this.label=label;
	}
}
