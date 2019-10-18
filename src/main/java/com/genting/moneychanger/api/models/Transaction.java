package com.genting.moneychanger.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class Transaction {

	public Transaction() {
		
	}
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String currencyId;
	
	private String isoName;
	private String longName;
	
	public String getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	public String getIsoName() {
		return isoName;
	}
	public void setIsoName(String isoName) {
		this.isoName = isoName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	@Override
	public String toString() {
		return 
				"currencyId: "+ currencyId
				+"isoName:" + isoName 
				+"longName:" + longName;
	}

}
