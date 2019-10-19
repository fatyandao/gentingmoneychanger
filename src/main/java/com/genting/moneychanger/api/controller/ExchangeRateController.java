package com.genting.moneychanger.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.genting.moneychanger.api.dao.ExchangeRateRepository;
import com.genting.moneychanger.api.model.Currency;
import com.genting.moneychanger.api.model.ExchangeRate;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
public class ExchangeRateController {
	
	@Autowired
	final ExchangeRateRepository repository;

	ExchangeRateController(ExchangeRateRepository repository) {
		this.repository = repository;
	}


//	@RequestMapping("/error")
//	@ResponseStatus(HttpStatus.NOT_FOUND)
//	public String index() {
//		return "Sorry, this link is not assessible.";
//	}


	@RequestMapping(value = "/exchangerate", method = RequestMethod.GET)
	@ResponseBody
	List<ExchangeRate> getExchangeRates() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/exchangerate/{isoName}", method = RequestMethod.GET)
	@ResponseBody
	Optional<ExchangeRate> getExchangeRatesByISOName(@PathVariable("isoName") String isoName) {
		return repository.findById(isoName);
	}

}