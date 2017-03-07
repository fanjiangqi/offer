package fan.test;
import java.util.Date;
 public class Test2 extends Date{
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        new Test2().test();
    }
}
