package org.account.service.service;


import java.util.Date;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

import org.account.service.dto.AccountDto;
import org.account.service.model.Account;
import org.account.service.repo.AccountRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;


    public AccountDto get(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());
        return modelMapper.map(account, AccountDto.class);
    }

    @Transactional
    public AccountDto save(AccountDto accountDto) {
    	accountDto.setStatus(1);
    	
        Account account = modelMapper.map(accountDto, Account.class);
        account.setCreatedAt(new Date());
        account = accountRepository.save(account);
        accountDto.setId(account.getId());
        return accountDto;
    }

    @Transactional
    public AccountDto update(Long id, AccountDto accountDto) {
        Optional<Account> optAccount = accountRepository.findById(id);
        if(optAccount.isPresent()) {
            Account accountToUpdate = optAccount.map(it -> {
                it.setBirthDate(accountDto.getBirthDate());
                it.setName(accountDto.getName());
                it.setSurname(accountDto.getSurname());
                it.setEmail(accountDto.getEmail());
                return it;
            }).orElseThrow(IllegalArgumentException::new);
            return modelMapper.map(accountRepository.save(accountToUpdate), AccountDto.class);
        	
        }else {
        	throw new IllegalArgumentException("There is no such a account with "+id);
        }
    }

    @Transactional
    public void delete(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());
        accountRepository.delete(account);
    }

//    public Slice<AccountDto> findAll(Pageable pageable) {
//        Slice<Account> accounts = accountRepository.findAll(pageable);
//        return null;
//    }
}
