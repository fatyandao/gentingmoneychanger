package com.genting.moneychanger.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {

	@Id
	private String isoName;
	private String longName;
	
	public Currency() {
		
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
}
