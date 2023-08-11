package in.ashokit.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserService(){
        System.out.println("UserService :: Constructor");
    }
}
