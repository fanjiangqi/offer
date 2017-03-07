package fan.AOP;

/**
 * Created by fanji on 2017/1/14.
 */
public class GraduateStudent implements Student {
    private String name;
    public GraduateStudent(String name){
        this.name = name;
    }
    @Override
    public void sayHello() {
        System.out.println("hello, everyone! My name is"+ name);
    }
    //此方法用于测试 jdk有返回值的动态代理，待完成
    //2017.2.10 fan
    public String returnName() {
        return name;
    }
}
