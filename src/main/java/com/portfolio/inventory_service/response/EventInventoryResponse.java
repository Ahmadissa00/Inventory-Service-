package com.portfolio.inventory_service.response;

import com.portfolio.inventory_service.entity.Venue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class EventInventoryResponse {
	private Long eventId;
	private String event;
	private Long capacity;
	private Venue venue;
	private BigDecimal ticketPrice;

}
