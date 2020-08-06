package org.ticket.service.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.ticket.service.dto.TicketDto;
import org.ticket.service.model.PriorityType;
import org.ticket.service.model.Ticket;
import org.ticket.service.model.TicketStatus;
import org.ticket.service.repository.TicketRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TicketServiceImp implements TicketService {
 
    private final TicketRepository ticketRepository; 

    @Transactional
    public TicketDto save(TicketDto ticketDto) {
        // Ticket Entity
        if (ticketDto.getDescription() == null)
            throw new IllegalArgumentException("Description bos olamaz");

        Ticket ticket = new Ticket();
        ticket.setDescription(ticketDto.getDescription());
        ticket.setNote(ticketDto.getNote());
        ticket.setTicketDate(ticketDto.getTicketDate());
        ticket.setTicketStatus(TicketStatus.valueOf(ticketDto.getTicketStatus()));
        ticket.setPriorityType(PriorityType.valueOf(ticketDto.getPriorityType()));

        // mysql kaydet
        ticket = ticketRepository.save(ticket);


        // TicketModel nesnesi yarat
//        TicketModel model = TicketModel.builder()
//                .description(ticket.getDescription())
//                .notes(ticket.getNote())
//                .id(ticket.getId())
//                .assignee(accountDtoResponseEntity.getBody().getNameSurname())
//                .priorityType(ticket.getPriorityType().getLabel())
//                .ticketStatus(ticket.getTicketStatus().getLabel())
//                .ticketDate(ticket.getTicketDate()).build();
//
//        // elastic kaydet
//        ticketElasticRepository.save(model);
//
//        // olusan nesneyi döndür
//        ticketDto.setId(ticket.getId());
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
