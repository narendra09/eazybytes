package com.example.accounts.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.accounts.entity.Cards;



@FeignClient("cards")
public interface CardsFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "/myCard/{customerId}", consumes = "application/json")
	public ResponseEntity<List<Cards>> getAccountDetails(@PathVariable int customerId);
}
