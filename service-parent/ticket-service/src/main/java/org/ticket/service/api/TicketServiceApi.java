package org.ticket.service.api;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ticket.service.dto.TicketDto;
import org.ticket.service.service.TicketService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketServiceApi {
    private final ModelMapper modelMapper;
    private final TicketService ticketService;
    
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") Long id) {
    	return "hello world : "+id;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TicketDto> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ticketService.getById(id));
    }
    @PostMapping
    public ResponseEntity<TicketDto> post(@RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketService.save(ticketDto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<TicketDto> put(@PathVariable("id") Long id,@RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketService.update(id, ticketDto));
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<String> get(@PathVariable("id") Long id) {
//        return ResponseEntity.ok("hello");
//    }
    
}
