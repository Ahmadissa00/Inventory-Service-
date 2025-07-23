package com.portfolio.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.inventory_service.entity.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
	// Additional query methods can be defined here if needed

}
