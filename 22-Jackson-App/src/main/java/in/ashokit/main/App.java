package in.ashokit.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.User;

public class App {

	public static void main(String[] args) throws Exception {
		App app = new App();
		// app.convertObjToJson();
		app.convertJsonToObj();
	}

	public void convertJsonToObj() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(new File("user.json"), User.class);
		System.out.println(user);
	}

	public void convertObjToJson() throws Exception {

		User u = new User(101, "Ashok", "Male", 123456l);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("user.json"), u);

		System.out.println("Java Object converted to Json...!!");

	}

}
