package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Ticket bookTicket(Passenger passenger) {

		String apiUrl = "http://13.233.120.18:8080/ticket";

		RestTemplate rt = new RestTemplate();
		
		// Sending Post Request (apiUrl , reqBodyData, responseBodyType)
		ResponseEntity<Ticket> responseEntity = 
				rt.postForEntity(apiUrl, passenger, Ticket.class);
		
		Ticket responseBody = responseEntity.getBody();

		return responseBody;
	}

	@Override
	public List<Ticket> getTickets() {
		
		String apiUrl = "http://13.233.120.18:8080/tickets";

		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);
		
		Ticket[] body = forEntity.getBody();
		
		List<Ticket> tickets = Arrays.asList(body);
		
		return tickets;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {
		
		String apiUrl = "http://13.233.120.18:8080/ticket/{ticketNum}";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> forEntity =
				rt.getForEntity(apiUrl, Ticket.class, ticketNum);
		
		Ticket body = forEntity.getBody();
		
		return body;
	}

}
