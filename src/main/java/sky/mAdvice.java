package sky;

/**
 * Created by Stelawliet on 18/3/22.
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("advice")
public class mAdvice {
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before...");

        point.proceed();

        System.out.println("around after...");
    }

    public void after(){
        System.out.println("ad after...");
    }
}
