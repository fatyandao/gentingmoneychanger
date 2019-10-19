package com.genting.moneychanger.api.model;



import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;



@Entity 
public class Transaction {

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", depositCurrency=" + depositCurrency
				+ ", depositAmount=" + depositAmount + ", dispenseCurrency=" + dispenseCurrency + ", dispenseAmount="
				+ dispenseAmount + ", changeCurrency=" + changeCurrency + ", changeAmount=" + changeAmount
				+ ", createdOn=" + createdOn + "]";
	}
	public Transaction() {
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long transactionId;
	
	@NotEmpty(message = "Please enter the Deposit Currency.")
	private String depositCurrency;
//	@NotEmpty(message = "Please enter the Deposit Amount.")
	private BigDecimal depositAmount;
	
	@NotEmpty(message = "Please enter the Dispense Currency.")
	private String dispenseCurrency;
//	@DecimalMax("30.00",(message = "Please enter the Dispense Amount.")
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
