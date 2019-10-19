package com.genting.moneychanger.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.genting.moneychanger.api.dao.TransactionRepository;
import com.genting.moneychanger.api.model.Currency;
import com.genting.moneychanger.api.model.Transaction;

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

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TransactionController {
	
	@Autowired
	private final TransactionRepository repository;

	TransactionController(TransactionRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/")
	public String test() {
		return "Sorryasd, this link is not assessible.";
	}




	@RequestMapping(value = "/transaction", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	Transaction addTransaction(@RequestBody Transaction transaction) {
//		Transaction trn = new Transaction();
		transaction.setCreatedOn(new Date());
		return repository.save(transaction);
	}
	
	

}
