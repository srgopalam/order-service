package com.example.orderservice.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPayload {

	private String orderType;

	private List<OrderLinesItem> orderLines;

	private String orderNumber;

	private String orderDate;
	private BigDecimal orderTotal;

	@JsonProperty("OrderType")
	public String getOrderType() {
		return orderType;
	}

	@JsonProperty("OrderLines")
	public List<OrderLinesItem> getOrderLines() {
		return orderLines;
	}

	@JsonProperty("OrderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("OrderDate")
	public String getOrderDate() {
		return orderDate;
	}

	@Override
	public String toString() {
		return String.format("RequestBody [orderType=%s, orderLines=%s, orderNumber=%s, orderDate=%s]", orderType,
				orderLines, orderNumber, orderDate);
	}

	@JsonProperty("OrderTotal")
	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

}
