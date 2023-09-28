package in.ashokit.service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
import reactor.core.publisher.Mono;

public interface MakeMyTripService {

	public Mono<Ticket> bookTicket(Passenger passenger);

	public Mono<Ticket[]> getTickets();

	public Mono<Ticket> getTicket(Integer ticketNum);
}