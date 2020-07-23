package org.ticket.service.api;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("ticket")
@RequiredArgsConstructor
public class TicketServiceApi {
    private final ModelMapper modelMapper;

	
    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok("hello");
    }
}
