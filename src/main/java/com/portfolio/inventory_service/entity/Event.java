package com.portfolio.inventory_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
@Table(name = "event")
public class Event {
	

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "total_capacity")
	private Long total_capacity;
	
	@Column(name = "left_capacity")
	private Long leftCapacity;
	
	@ManyToOne
	@JoinColumn(name = "venue_id", referencedColumnName = "id")
	private Venue venue;

	@Column(name = "ticket_price")
	private BigDecimal ticketPrice;

}