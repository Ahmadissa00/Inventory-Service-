package com.portfolio.inventory_service.resources
;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.inventory_service.response.EventInventoryResponse;
import com.portfolio.inventory_service.response.VenueInventoryResponse;
import com.portfolio.inventory_service.services.InventoryService;

@RestController
@RequestMapping("/api/v1")
public class InventoryResources {
	
	private final InventoryService inventoryService;
	
	public InventoryResources(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@GetMapping("/inventory/events")
	public @ResponseBody List<EventInventoryResponse> inventoryGetAllEvents() {
		return inventoryService.getAllEvents();
	}
	
	@GetMapping("/inventory/venue/{venueId}")
	public @ResponseBody VenueInventoryResponse inventoryGetVenueById(@PathVariable Long venueId) {
	    return inventoryService.getVenueInformation(venueId);
	}

	@GetMapping("/inventory/event/{eventId}")
	public @ResponseBody EventInventoryResponse inventoryGetEventById(@PathVariable("eventId") Long eventId) {

		return inventoryService.EventInvetoryResponse(eventId);
	}


}
