package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
