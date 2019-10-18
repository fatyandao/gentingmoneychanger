package com.genting.moneychanger.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.genting.moneychanger.api.dao.ExchangeRateRepository;
import com.genting.moneychanger.api.models.ExchangeRate;

@RestController
public class ExchangeRateController {
	
	@Autowired
	private final ExchangeRateRepository repository;

	ExchangeRateController(ExchangeRateRepository repository) {
		this.repository = repository;
	}

	
	
	
	@RequestMapping(value = "/exchangerates", method = RequestMethod.GET)
	public @ResponseBody Iterable<ExchangeRate> getAllExchangeRates() {
		return repository.findAll();
	}
	
}
