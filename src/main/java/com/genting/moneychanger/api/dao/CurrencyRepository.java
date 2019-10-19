package com.genting.moneychanger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.genting.moneychanger.api.model.Currency;
@Component
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}