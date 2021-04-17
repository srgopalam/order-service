package com.example.orderservice.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesItem{

	private String orderLineNumber;

	private int lineTotalWithoutTax;

	private List<LineChargesItem> lineCharges;

	private List<TaxesItem> taxes;

	private String lineStatus;
	
	@JsonProperty("OrderLineNumber")
	public String getOrderLineNumber(){
		return orderLineNumber;
	}
	
	@JsonProperty("LineTotalWithoutTax")
	public int getLineTotalWithoutTax(){
		return lineTotalWithoutTax;
	}
	
	@JsonProperty("LineCharges")
	public List<LineChargesItem> getLineCharges(){
		return lineCharges;
	}
	
	@JsonProperty("Taxes")
	public List<TaxesItem> getTaxes(){
		return taxes;
	}
	@JsonProperty("LineStatus")
	
	public String getLineStatus(){
		return lineStatus;
	}

	
}
