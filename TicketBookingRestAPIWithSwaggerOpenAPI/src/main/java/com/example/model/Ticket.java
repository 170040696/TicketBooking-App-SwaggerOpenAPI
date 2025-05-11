package com.example.model;

public class Ticket {
	
	private Integer ticketNumber;
	private String status;
	private Double ticketprice;
	private String Name;
	private String Departure;
	private String arrival;
	private String DateOfJourney;
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", ticketprice=" + ticketprice
				+ ", Name=" + Name + ", Departure=" + Departure + ", arrival=" + arrival + ", DateOfJourney="
				+ DateOfJourney + "]";
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(Integer ticketNumber, String status, Double ticketprice, String name, String departure,
			String arrival, String dateOfJourney) {
		super();
		this.ticketNumber = ticketNumber;
		this.status = status;
		this.ticketprice = ticketprice;
		Name = name;
		Departure = departure;
		this.arrival = arrival;
		DateOfJourney = dateOfJourney;
	}
	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDeparture() {
		return Departure;
	}
	public void setDeparture(String departure) {
		Departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDateOfJourney() {
		return DateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		DateOfJourney = dateOfJourney;
	}
	
	

}
