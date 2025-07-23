package com.portfolio.inventory_service.response;

import com.portfolio.inventory_service.entity.Venue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class EventInventoryResponse {
	
	private String event;
	private int capacity;
	private Venue venue;

}
