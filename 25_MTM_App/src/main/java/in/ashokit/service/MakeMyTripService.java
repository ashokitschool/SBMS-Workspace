package in.ashokit.service;

import java.util.List;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);

	public List<Ticket> getTickets();

	public Ticket getTicket(Integer ticketNum);
}