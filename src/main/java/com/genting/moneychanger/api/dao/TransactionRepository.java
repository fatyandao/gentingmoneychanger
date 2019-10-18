package com.genting.moneychanger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genting.moneychanger.api.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}