package com.celal.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.celal.AccountServiceClient;
import com.celal.dto.AccountDto;
import com.celal.dto.TicketDto;
import com.celal.model.PriorityType;
import com.celal.model.Ticket;
import com.celal.model.TicketStatus;
import com.celal.model.es.TicketModel;
import com.celal.repository.TicketRepository;
import com.celal.repository.es.TicketElasticRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TicketServiceImp implements TicketService {
 
    private final TicketRepository ticketRepository; 
    private final TicketElasticRepository ticketElasticRepository;
    private final ModelMapper mapper;
    private final AccountServiceClient accountServiceClient; 
    
    
    @Override
    @Transactional
    public TicketDto save(TicketDto ticketDto) {
    	ticketDto.setCreatedAt(new Date());
    	ResponseEntity<AccountDto> entity = accountServiceClient.get(Long.parseLong(ticketDto.getAssignee()));
    	
    	
    	
        // Ticket Entity
        if (ticketDto.getDescription() == null)
            throw new IllegalArgumentException("Description bos olamaz");

        Ticket ticket = new Ticket();
        ticket.setDescription(ticketDto.getDescription());
        ticket.setNote(ticketDto.getNote());
        ticket.setTicketDate(ticketDto.getTicketDate());
        ticket.setTicketStatus(TicketStatus.valueOf(ticketDto.getTicketStatus()));
        ticket.setPriorityType(PriorityType.valueOf(ticketDto.getPriorityType()));
        ticket.setCreatedAt(new Date());
        ticket.setAssignee(ticketDto.getAssignee());
        // mysql kaydet
        ticket = ticketRepository.save(ticket);


        // TicketModel nesnesi yarat
        TicketModel model = TicketModel.builder()
                .description(ticket.getDescription())
                .note(ticket.getNote())
                .ticketid(ticket.getTicketid())
                .assignee(entity.getBody().getFullName())
                .priorityType(ticket.getPriorityType().getLabel())
                .ticketStatus(ticket.getTicketStatus().getLabel())
                .ticketDate(ticket.getTicketDate()).build();

        // elastic kaydet
        ticketElasticRepository.save(model);

        // olusan nesneyi döndür
        ticketDto.setTicketid(ticket.getTicketid());;
//
//        // Kuyruga notification yaz
//        ticketNotificationService.sendToQueue(ticket);
        return ticketDto;
    }

    public TicketDto update(Long id, TicketDto ticketDto) {
        return null;
    }

    public TicketDto getById(Long ticketId) {
        return null;
    }


	@Override
	public Page<TicketDto> getPagination(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
