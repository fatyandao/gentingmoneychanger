package com.genting.moneychanger.api.models;



import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeRate {
	public ExchangeRate() {
		
	}
	
	public long getCurrencyPairId() {
		return currencyPairId;
	}
	public void setCurrencyPairId(long currencyPairId) {
		this.currencyPairId = currencyPairId;
	}
	public BigDecimal getBuyRate() {
		return buyRate;
	}
	public void setBuyRate(BigDecimal buyRate) {
		this.buyRate = buyRate;
	}
	public BigDecimal getSellRate() {
		return sellRate;
	}
	public void setSellRate(BigDecimal sellRate) {
		this.sellRate = sellRate;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long currencyPairId;
	private BigDecimal buyRate;
	private BigDecimal sellRate;
	
	
	@Override
	public String toString() {
		return 
				"currencyPairId: "+ currencyPairId
				+"buyRate:" + buyRate 
				+"sellRate:" + sellRate;
	}
}
