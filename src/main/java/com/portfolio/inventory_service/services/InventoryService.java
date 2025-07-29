package com.portfolio.inventory_service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.portfolio.inventory_service.entity.Event;
import com.portfolio.inventory_service.repository.EventRepository;
import com.portfolio.inventory_service.repository.VenueRepository;
import com.portfolio.inventory_service.response.EventInventoryResponse;
import com.portfolio.inventory_service.response.VenueInventoryResponse;

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
	    		.map(event -> EventInventoryResponse.builder()
	    				.event(event.getName())
	    				.venue(event.getVenue())
	    				.capacity(event.getLeftCapacity())
	    				.build()).collect(Collectors.toList());
}

	public VenueInventoryResponse getVenueInformation(Long venueId) {
		final var venue = venueRepository.findById(venueId);
		return VenueInventoryResponse.builder()
				.venueId(venue.get().getId())
				.venueName(venue.get().getName())
				.capacity(venue.get().getTotal_capacity())
				.build();
	}


	public EventInventoryResponse EventInvetoryResponse(final Long eventId) {
			final var event = eventRepository.findById(eventId);
	if (event.isEmpty()) {
		throw new RuntimeException("Event not found with ID: " + eventId);
	}

	return EventInventoryResponse.builder()
			.event(event.get().getName())
			.venue(event.get().getVenue())
			.capacity(event.get().getLeftCapacity())
			.eventId(event.get().getId())
			.ticketPrice(event.get().getTicketPrice())
			.build();
	}
}
