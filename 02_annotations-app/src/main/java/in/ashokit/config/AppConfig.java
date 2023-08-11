package in.ashokit.config;

import in.ashokit.utils.PwdUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig :: Constructor");
    }
    @Bean
    public PwdUtils createPwdUtil(){
        System.out.println("createPwdUtil() method called...");
        PwdUtils pw = new PwdUtils();
        //logic;
        return pw;
    }
}
