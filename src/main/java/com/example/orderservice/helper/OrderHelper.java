package com.example.orderservice.helper;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.example.orderservice.dto.LineChargesItem;
import com.example.orderservice.dto.OrderLinesItem;
import com.example.orderservice.dto.OrderPayload;
import com.example.orderservice.dto.TaxesItem;
import com.example.orderservice.util.LineStatus;

@Component
public class OrderHelper {
	public OrderPayload processOrder(OrderPayload orderPayload) {
		BigDecimal createdLineTotal = BigDecimal.ZERO;
		for (OrderLinesItem orderLine : orderPayload.getOrderLines()) {
			if (LineStatus.CREATED.name().equals(orderLine.getLineStatus())) {
				createdLineTotal = createdLineTotal.add(BigDecimal.valueOf(orderLine.getLineTotalWithoutTax()));
				for (TaxesItem taxes : orderLine.getTaxes()) {
					createdLineTotal = createdLineTotal.add(taxes.getTaxAmount());
				}
				for (LineChargesItem lineCharges : orderLine.getLineCharges()) {
					createdLineTotal = createdLineTotal.add(lineCharges.getChargeAmount());
				}

			} else {

				createdLineTotal = createdLineTotal.subtract(BigDecimal.valueOf(orderLine.getLineTotalWithoutTax()));
				for (TaxesItem taxes : orderLine.getTaxes()) {
					createdLineTotal = createdLineTotal.subtract(taxes.getTaxAmount());
				}
				for (LineChargesItem lineCharges : orderLine.getLineCharges()) {
					createdLineTotal = createdLineTotal.subtract(lineCharges.getChargeAmount());
				}

			}
		}
		orderPayload.setOrderTotal(createdLineTotal);

		return orderPayload;
	}

}
