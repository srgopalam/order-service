package com.example.orderservice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LineChargesItem{

	private String chargeType;

	private BigDecimal chargeAmount;

	@JsonProperty("ChargeType")
	public String getChargeType(){
		return chargeType;
	}

	@JsonProperty("ChargeAmount")
	public BigDecimal getChargeAmount(){
		return chargeAmount;
	}

	@Override
	public String toString() {
		return String.format("LineChargesItem [chargeType=%s, chargeAmount=%s]", chargeType, chargeAmount);
	}

	
}
