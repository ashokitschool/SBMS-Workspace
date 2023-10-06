package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
import reactor.core.publisher.Mono;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Mono<Ticket> bookTicket(Passenger passenger) {

		String apiUrl = "http://localhost:8080/ticket";

		WebClient webClient = WebClient.create();
		
		Mono<Ticket> bodyToMono = webClient.post()
								 .uri(apiUrl)
								 .body(BodyInserters.fromValue(passenger))
								 .retrieve()
								 .bodyToMono(Ticket.class);
		return bodyToMono;
	}

	@Override
	public Mono<Ticket[]> getTickets() {
		
		String apiUrl = "http://localhost:8080/tickets";

		WebClient webClient = WebClient.create();
								   
	    Mono<Ticket[]> bodyToMono = webClient.get()
				 							.uri(apiUrl)
				 							.retrieve()
				 							.bodyToMono(Ticket[].class);
		
		return bodyToMono;
	}

	@Override
	public Mono<Ticket> getTicket(Integer ticketNum) {
		
		String apiUrl = "http://localhost:8080/ticket/{ticketNum}";
		
		WebClient webClient = WebClient.create();
		
		 Mono<Ticket> bodyToMono = webClient.get()
											.uri(apiUrl, ticketNum)
											.retrieve()
											.bodyToMono(Ticket.class);
		return bodyToMono;
	}

}
