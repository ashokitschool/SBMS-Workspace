package in.ashokit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine - Constructor Executed");
	}

	public int start() {
		System.out.println("Engine Starting....!!");
		return 1;
	}
}
