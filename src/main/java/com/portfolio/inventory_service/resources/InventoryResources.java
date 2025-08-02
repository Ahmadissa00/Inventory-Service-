package com.portfolio.inventory_service.resources
;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.portfolio.inventory_service.response.EventInventoryResponse;
import com.portfolio.inventory_service.response.VenueInventoryResponse;
import com.portfolio.inventory_service.services.InventoryService;

@Slf4j
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

	@PutMapping("/inventory/event/{eventId}/capacity/{capacity}")
	public ResponseEntity<Void> updateEventCapacity(
			@PathVariable("eventId") Long eventId,
			@PathVariable("capacity") Long ticketBooked) {

		inventoryService.updateEventCapacity(eventId, ticketBooked);
		log.info("Updated capacity for event ID: {}, Ticket Count: {}", eventId, ticketBooked);
		return ResponseEntity.ok().build();
	}


}
