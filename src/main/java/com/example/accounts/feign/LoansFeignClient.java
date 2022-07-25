package com.example.accounts.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.accounts.entity.Loans;



@FeignClient("loans")
public interface LoansFeignClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/myLoan/{customerId}", consumes = "application/json")
	public ResponseEntity<List<Loans>> getAccountDetails(@PathVariable int customerId);

}
