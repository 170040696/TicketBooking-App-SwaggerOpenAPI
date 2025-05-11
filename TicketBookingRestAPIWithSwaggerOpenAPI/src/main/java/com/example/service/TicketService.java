package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IticketRepo;
import com.example.model.Passenger;

@Service
public class TicketService implements IticketService {

	@Autowired
	private IticketRepo repo;
	
	@Override
	public Passenger registerPassenger(Passenger passenger) {
		return repo.save(passenger);
	}

	@Override
	public Passenger GetTicketbyPassID(Integer id) {
		Optional<Passenger> pass=repo.findById(id);
		return pass.get();
	}

}
