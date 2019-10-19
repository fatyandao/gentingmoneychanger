package com.genting.moneychanger.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.genting.moneychanger.api.dao.TransactionRepository;
import com.genting.moneychanger.api.model.Currency;
import com.genting.moneychanger.api.model.ExchangeRate;
import com.genting.moneychanger.api.model.Transaction;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Api(value="Transactions Recorder")
public class TransactionController {
	
	@Autowired
	private final TransactionRepository repository;

	TransactionController(TransactionRepository repository) {
		this.repository = repository;
	}



	@ApiOperation(value = "Submits a Transaction", response = Transaction.class)
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Successfully submitted Transaction"),
//		    @ApiResponse(code = 401, message = "You are not authorized to view the exchange rate"),
//		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//		    @ApiResponse(code = 404, message = "The exchange rate you were trying to reach is not found")
		})
	@RequestMapping(value = "/transaction", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody

	Transaction addTransaction(@RequestBody Transaction transaction) {
//		Transaction trn = new Transaction();
		transaction.setCreatedOn(new Date());
		return repository.save(transaction);
	}
	
	

}
