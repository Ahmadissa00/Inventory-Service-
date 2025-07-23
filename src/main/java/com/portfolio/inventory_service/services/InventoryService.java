package com.portfolio.inventory_service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.portfolio.inventory_service.entity.Event;
import com.portfolio.inventory_service.repository.EventRepository;
import com.portfolio.inventory_service.repository.VenueRepository;
import com.portfolio.inventory_service.response.EventInventoryResponse;

@Service
public class InventoryService {
	
	private final EventRepository eventRepository;
	private final VenueRepository venueRepository;
	
	public InventoryService(EventRepository eventRepository, VenueRepository venueRepository) {
		this.eventRepository = eventRepository;
		this.venueRepository = venueRepository;
	}

	public List<EventInventoryResponse> getAllEvents() {
		final List<Event> events = eventRepository.findAll();
   
	    return events.stream()
	    		.map(event -> EventInventoryResponse.)
}


}
