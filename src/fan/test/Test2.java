package fan.test;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class Test2 extends Date{
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        //new Test2().test();
        String a = "abc";
        String b = "ab" + "c";
        System.out.println(a == b);
        char[] ab = {'f','j'};
       // ConcurrentHashMap
    }
}
