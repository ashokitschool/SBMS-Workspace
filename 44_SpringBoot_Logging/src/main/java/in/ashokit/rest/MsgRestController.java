package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private Logger logger = LoggerFactory.getLogger(MsgRestController.class);

	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.debug("welcome method execution - start");

		String msg = "Welcome to Ashok IT..!!";

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception occured", e);
		}

		logger.debug("welcome method execution - end");

		logger.info("welcome method execution completed..");

		return msg;
	}
}
