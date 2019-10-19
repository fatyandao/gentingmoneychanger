package com.genting.moneychanger.api.model;



import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeRate {

	
	@Id
	private String isoName;
	@Column (precision = 23, scale = 16)
	private BigDecimal buyRate;
	@Column (precision = 23, scale = 16)
	private BigDecimal sellRate;

	public ExchangeRate() {
		
	}

	public BigDecimal getBuyRate() {
		return buyRate;
	}

	public String getIsoName() {
		return isoName;
	}

	public BigDecimal getSellRate() {
		return sellRate;
	}
	
	public void setBuyRate(BigDecimal buyRate) {
		this.buyRate = buyRate;
	}

	public void setIsoName(String isoName) {
		this.isoName = isoName;
	}

	public void setSellRate(BigDecimal sellRate) {
		this.sellRate = sellRate;
	}

}
