package com.genting.moneychanger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genting.moneychanger.api.models.ExchangeRate;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
}