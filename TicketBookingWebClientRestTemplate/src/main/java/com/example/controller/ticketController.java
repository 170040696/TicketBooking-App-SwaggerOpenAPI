package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Passenger;
import com.example.model.Ticket;
import com.example.service.ITicketService;

@Controller
public class ticketController {
	
	@Autowired
	private ITicketService service;
	
	@GetMapping("/registration")
	public String registerForm(@ModelAttribute Passenger passenger,Model model) {
		model.addAttribute("passenger", passenger);
		return "index";
	}
	
	@PostMapping("/book-ticket")
	public String TicketBooking(@ModelAttribute Passenger passenger, Model model) {
		
		Integer ticketnumber=service.GetTicketNumber(passenger);
		model.addAttribute("ticketnumber", ticketnumber);
		return "index";
	}
    
	@GetMapping("/GetTicket-form")
	public String GetTicketform(Model model) {
	//	model.addAttribute(null, model);
		return "ticket-form";
	}
	
	@GetMapping("/GetTicketInfo")
	public String GetTicketInfo(@RequestParam("ticketNumber") Integer ticketNumber, Model model) {
		
		Ticket t=service.GetFullTicket(ticketNumber);
		model.addAttribute("ticket", t);
		return "ticket-info";
	}
	
}
