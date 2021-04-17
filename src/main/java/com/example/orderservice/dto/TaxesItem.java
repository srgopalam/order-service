package com.example.orderservice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxesItem{

	private String taxType;

	private BigDecimal taxAmount;

	@JsonProperty("TaxType")
	public String getTaxType(){
		return taxType;
	}

	@JsonProperty("TaxAmount")
	public BigDecimal getTaxAmount(){
		return taxAmount;
	}

	@Override
	public String toString() {
		return String.format("TaxesItem [taxType=%s, taxAmount=%s]", taxType, taxAmount);
	}

	
}
