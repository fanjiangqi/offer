package fan.AOP;

import java.lang.reflect.Proxy;

/**
 * Created by fanjiangqi on 2017/1/14.
 */
public class AopTest {
    public static void main(String[] args) {
        //被代理对象
        Student graduStu = new GraduateStudent("fanjiangqi");
        //Aspect类
        AspectClass aspectClass = new AspectClass();
        MyInvocationHandler handler = new MyInvocationHandler(graduStu,aspectClass);
        //新建proxy类
        Student graduStuProxy = (Student)Proxy.newProxyInstance(graduStu.getClass().getClassLoader(),graduStu.getClass().getInterfaces()
        ,handler);
        graduStuProxy.sayHello();
        System.out.println(graduStuProxy.returnName());

    }


}
