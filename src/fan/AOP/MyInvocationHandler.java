package fan.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by fanjiangqi on 2017/1/14.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    private AspectClass aspectClass;

    public MyInvocationHandler(Object target, AspectClass aspectClass) {
        this.target = target;
        this.aspectClass = aspectClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        aspectClass.afterHello();
        method.invoke(target);
        aspectClass.beforeHello();
        return null;
    }
}
