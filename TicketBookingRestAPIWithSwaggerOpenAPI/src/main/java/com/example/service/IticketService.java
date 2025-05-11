package com.example.service;

import java.util.Optional;

import com.example.model.Passenger;

public interface IticketService {

	
	Passenger registerPassenger(Passenger passenger);
	Passenger GetTicketbyPassID(Integer id);
	
}
