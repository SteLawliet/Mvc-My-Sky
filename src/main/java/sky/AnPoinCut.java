package sky;

import org.springframework.stereotype.Component;

/**
 * Created by Stelawliet on 18/3/22.
 */
@Component("AnPot")
public class AnPoinCut {

    public void login() throws Exception {
        int i=1;
        i=1/0;
        System.out.println("user login......");
    }
    public void lgout(){
        System.out.println("out ///////");
        int i=  1/0;
    }
}
