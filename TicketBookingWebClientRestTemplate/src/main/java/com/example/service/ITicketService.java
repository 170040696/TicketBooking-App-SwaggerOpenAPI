package com.example.service;

import com.example.model.Passenger;
import com.example.model.Ticket;

public interface ITicketService {

	public Integer GetTicketNumber(Passenger passenger);
	
	public Ticket GetFullTicket(Integer TcketNumber);
	
}
