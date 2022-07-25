package com.example.accounts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accounts.entity.Accounts;
import com.example.accounts.repository.AccountsRepository;

@Service
public class AccountsService {
	
	@Autowired
	private AccountsRepository accountsRepository;

	public Accounts findByCustomerId(int customerId) {
		
		 Optional<Accounts> findById = Optional.ofNullable(accountsRepository.findByCustomerId(customerId));
		if(findById.isPresent())
		{
			return findById.get();
		}
		return new Accounts();
	}

}
