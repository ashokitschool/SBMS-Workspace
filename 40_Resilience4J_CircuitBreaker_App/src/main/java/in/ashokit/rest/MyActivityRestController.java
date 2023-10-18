package in.ashokit.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.ashokit.model.Activity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyActivityRestController {

	@GetMapping("/")
	@CircuitBreaker(name = "boredapi", fallbackMethod = "doWork")
	public String invokeBoredApi() {
		System.out.println("main-logic method executed...");
		String url = "https://www.boredapi.com/api/activity";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Activity> forEntity = rt.getForEntity(url, Activity.class);
		Activity body = forEntity.getBody();
		String activity = body.getActivity();
		return activity;
	}

	public String doWork(Throwable t) {
		
		System.out.println("fallback-logic method executed...");
		
		return "Watch Video in Ashok IT - Youtube channel";
	}
}
