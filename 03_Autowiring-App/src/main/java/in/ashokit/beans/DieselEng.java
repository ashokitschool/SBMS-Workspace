package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEng implements IEngine {

    public DieselEng(){
        System.out.println("DieselEng :: Constructor");
    }

    @Override
    public int start() {
        System.out.println("Diesel Engine Started....!!");
        return 1;
    }
}
