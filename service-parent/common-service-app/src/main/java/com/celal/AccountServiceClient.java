package com.celal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.celal.aygar.dto.AccountDto;

@FeignClient("account-service")
public interface AccountServiceClient {

    @GetMapping("/account/{id}")
    ResponseEntity<AccountDto> get(@PathVariable("id") Long id) ;
    
    

}
