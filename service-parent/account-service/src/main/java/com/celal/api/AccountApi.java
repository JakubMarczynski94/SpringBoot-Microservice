package com.celal.api;



import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celal.aygar.dto.AccountDto;
import com.celal.service.AccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountApi {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accountService.get(id));
    }
    @GetMapping("/data/{id}")
    public ResponseEntity<Long> getid(@PathVariable("id") Long id) {
        return ResponseEntity.ok(id);
    }
    @GetMapping(path = "/dataa", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AccountDto> getid() {
    	AccountDto dto = new AccountDto();
    	dto.setEmail("cecee");
    	dto.setName("fatih");
        return ResponseEntity.ok(dto);
    }
    @PostMapping
    public ResponseEntity<AccountDto> save(@RequestBody AccountDto account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<AccountDto> update(@PathVariable("id") Long id, @RequestBody AccountDto account) {
        return ResponseEntity.ok(accountService.update(id, account));
    }

    @DeleteMapping
    public void delete(Long id) {
        accountService.delete(id);
    }

//    @GetMapping
//    public ResponseEntity<Slice<AccountDto>> getAll(Pageable pageable) {
//        return ResponseEntity.ok(accountService.findAll(pageable));
//    }
}
