package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine eng;

	public Car() {
		System.out.println("Car :: Constructor Executed");
	}

	public void drive() {
		int start = eng.start();
		if (start >= 1) {
			System.out.println("Journey Started....");
		}
	}
}
