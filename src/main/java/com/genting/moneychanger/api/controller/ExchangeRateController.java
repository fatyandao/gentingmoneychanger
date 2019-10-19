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

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.genting.moneychanger.api.ResourceNotFoundException;
import com.genting.moneychanger.api.dao.ExchangeRateRepository;
import com.genting.moneychanger.api.model.Currency;
import com.genting.moneychanger.api.model.ExchangeRate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Api(value="Exchange Rates Retriever" )
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

	@ApiOperation(value = "View a list of available exchange rates", response = List.class)
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Successfully retrieved list"),
//		    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
		})
	@RequestMapping(value = "/exchangerate", method = RequestMethod.GET)
	@ResponseBody
	List<ExchangeRate> getExchangeRates() {
		return repository.findAll();
	}
	
	@ApiOperation(value = "View the available exchange rate", response = ExchangeRate.class)
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Successfully retrieved exchange rate"),
//		    @ApiResponse(code = 401, message = "You are not authorized to view the exchange rate"),
//		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(code = 404, message = "The exchange rate you were trying to reach is not found")
		})
	@RequestMapping(value = "/exchangerate/{isoName}", method = RequestMethod.GET)
	@ResponseBody
	ExchangeRate getExchangeRatesByISOName(@PathVariable("isoName") String isoName) throws ResourceNotFoundException {
		ExchangeRate exchangeRate = repository.findById(isoName).orElseThrow(() -> new ResourceNotFoundException(""));
		return exchangeRate;
	}

}