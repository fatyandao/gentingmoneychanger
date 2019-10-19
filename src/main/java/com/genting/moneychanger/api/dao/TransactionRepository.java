 package com.genting.moneychanger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.genting.moneychanger.api.model.Currency;
import com.genting.moneychanger.api.model.Transaction;
@Component
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}