package fan.AOP;

/**
 * Created by fanjiagnqi on 2017/1/14.
 * Aspect类，表明需要切入的功能
 */
public class AspectClass {
    public void beforeHello(){
        System.out.println("Before say hello...");
    }
    public void afterHello(){
        System.out.println("After say hello...");
    }
}
