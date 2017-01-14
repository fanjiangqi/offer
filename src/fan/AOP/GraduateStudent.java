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
}
