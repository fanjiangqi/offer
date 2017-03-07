package fan.test;

/**
 * Created by fanjiangqi on 2017/2/7.
 * 测试自定义 异常
 */
public class ExceptionTest {
    public static void doException() throws FanException {
        System.out.println("this will throw a exception");
        throw new FanException("sorry, this is a FanException");
    }
    public static void main(String[] args) {
        try {
            ExceptionTest.doException();
        } catch (FanException e) {
            e.printStackTrace();
            System.out.println("I catch the exception");
        }
        finally {
            System.out.println("ok, this is finally statement");
        }

    }
}
class FanException extends Exception{
    public FanException(String string){
        System.out.println(string);
    }
}