package com.celal.aygar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.celal.aygar.dto.TicketDto;
 
public interface TicketService {
    TicketDto save(TicketDto ticketDto);

    TicketDto update(Long id, TicketDto ticketDto);

    TicketDto getById(Long ticketId);

    Page<TicketDto> getPagination(Pageable pageable);
}
