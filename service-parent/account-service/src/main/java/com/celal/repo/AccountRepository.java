package com.celal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.celal.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
}