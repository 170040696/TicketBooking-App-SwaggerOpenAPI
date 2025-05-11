package com.example.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Passenger;
import com.example.model.Ticket;
import com.example.service.IticketService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name="TicketBokking App", description="This has two controller methods i to generate the ticket number and 2nd to generate the Ticket")
public class TicketCotroller {
	
	 @Autowired
     private IticketService service;
	
	@PostMapping("/get_ticketNumber")
	@Operation(summary="Post operation",description="This API will take Passenger INfo and generate Ticket")
	public ResponseEntity<Integer> RegisterPassenger(@RequestBody Passenger passenger) {
		Passenger pass=service.registerPassenger(passenger);
		Integer passId=pass.getPid();
		//return new ResponseEntity<Integer> (passId,HttpStatus.OK);
		return ResponseEntity.ok(pass.getPid());
	}
	
	@GetMapping("/get_ticket/{id}")
	@Operation(summary="Get operation",description="This API will take Ticket Number and generate Ticket Object")
	public ResponseEntity<Ticket> GetTicket(@PathVariable("id")Integer id) {
		Passenger pass=service.GetTicketbyPassID(id);
		Ticket t=new Ticket();
		t.setTicketNumber(pass.getPid());
		t.setName(pass.getName());
		t.setDeparture(pass.getDeparture());
		t.setArrival(pass.getArrival());
		t.setDateOfJourney(pass.getDateOfJourney());
		t.setStatus("confirmer");
		t.setTicketprice(400.0);
		return new ResponseEntity<Ticket>(t,HttpStatus.OK);
	}
	
}
