package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Ticket;
import in.ashokit.request.Passenger;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNum);
	
	public List<Ticket> getAllTickets();

}
