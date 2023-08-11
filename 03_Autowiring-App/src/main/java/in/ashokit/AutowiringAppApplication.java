package in.ashokit;

import in.ashokit.beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiringAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(AutowiringAppApplication.class, args);

		Car car = context.getBean(Car.class);
		car.drive();
	}

}
