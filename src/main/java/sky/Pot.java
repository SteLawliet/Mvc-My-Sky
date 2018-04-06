package sky;

import org.springframework.stereotype.Component;

/**
 * Created by Stelawliet on 18/3/22.
 */
@Component("pot")
public class Pot {
    public void login() throws Exception {
        try {
            int i=1;
            i=1/0;
        }catch (Exception e){

        }
        System.out.println("user login......");
    }
    public void lgout() throws Exception{
        System.out.println("out ///////");
        int i=  1/0;
    }
}
