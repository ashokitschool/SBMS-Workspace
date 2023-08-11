package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private IEngine eng;


    public Car(IEngine eng){
        this.eng = eng;
    }

    public void drive(){
        int status = eng.start();
        if(status >=1 ){
            System.out.println("Journey Started...!!");
        }
    }
}
