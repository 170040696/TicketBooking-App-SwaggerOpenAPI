package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.model.Passenger;
import com.example.model.Ticket;

@Service
public class ticketService implements ITicketService {

	private String PostUrl="http://localhost:8080/TicketBookingApp/get_ticketNumber";
	private String GetUrl="http://localhost:8080/TicketBookingApp/get_ticket/{id}";
	
	@Override
	public Integer GetTicketNumber(Passenger passenger) {
		
		//RestTemplate
//		RestTemplate restTamplet= new RestTemplate();
//		ResponseEntity<Integer>response=restTamplet.postForEntity(PostUrl, passenger, Integer.class);
//		Integer TicketNumber=response.getBody();
//		return TicketNumber;
		
		//web Client
		WebClient webClient=WebClient.create();	
		Integer ticketnumber=webClient.post().uri(PostUrl).bodyValue(passenger).retrieve().bodyToMono(Integer.class).block();
		return ticketnumber;
	}

	@Override
	public Ticket GetFullTicket(Integer id) {
		// TODO Auto-generated method stub
		//RestTemplate
//		RestTemplate restTamplet= new RestTemplate();
//		ResponseEntity<Ticket>response=restTamplet.getForEntity(GetUrl, Ticket.class,id);
//		Ticket ticket=response.getBody();
//		return ticket;
		
		//WebClient
		WebClient webclient=WebClient.create();
		Ticket ticket=webclient.get().uri(GetUrl,id).retrieve().bodyToMono(Ticket.class).block();
		return ticket;
	}

}
