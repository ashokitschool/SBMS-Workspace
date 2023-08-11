package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
@Primary
public class PetrolEng implements IEngine{

    public PetrolEng(){
        System.out.println("PetrolEngine :: Constructor");
    }

    public int start(){
        System.out.println("PetrolEngine Started...!!");
        return 1;
    }
}
