package com.portfolio.inventory_service.response;

import com.portfolio.inventory_service.entity.Venue;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class EventInventoryResponse {
	
	private String event;
	private int capacity;
	private Venue venue;

}
