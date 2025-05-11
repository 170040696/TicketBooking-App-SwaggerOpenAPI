package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
		title="TicketBooking API",
		version="v1.0",
		description="This API will book ticket and generate ticket"),
		servers=@Server(
				url="http://localhost:8080/TicketBookingApp",
				description="This API is deployed in above server"))
public class TicketBookingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingRestApiApplication.class, args);
	}

}
