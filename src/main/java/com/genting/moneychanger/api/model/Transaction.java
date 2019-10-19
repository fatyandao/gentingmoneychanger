package com.genting.moneychanger.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class Transaction {

	public Transaction() {
		
	}

	@Id
	private long transactionId;
	private String depositCurrency;
	private BigDecimal depositAmount;
	private String dispenseCurrency;
	private BigDecimal dispenseAmount;
	private String changeCurrency;
	private BigDecimal changeAmount;
	private Date createdOn;
	
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public String getDepositCurrency() {
		return depositCurrency;
	}
	public void setDepositCurrency(String depositCurrency) {
		this.depositCurrency = depositCurrency;
	}
	public BigDecimal getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDispenseCurrency() {
		return dispenseCurrency;
	}
	public void setDispenseCurrency(String dispenseCurrency) {
		this.dispenseCurrency = dispenseCurrency;
	}
	public BigDecimal getDispenseAmount() {
		return dispenseAmount;
	}
	public void setDispenseAmount(BigDecimal dispenseAmount) {
		this.dispenseAmount = dispenseAmount;
	}
	public String getChangeCurrency() {
		return changeCurrency;
	}
	public void setChangeCurrency(String changeCurrency) {
		this.changeCurrency = changeCurrency;
	}
	public BigDecimal getChangeAmount() {
		return changeAmount;
	}
	public void setChangeAmount(BigDecimal changeAmount) {
		this.changeAmount = changeAmount;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	

}
