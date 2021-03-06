package fan;

/**
 * Created by fanjiangqi on 2017/1/3.
 * StackTraceTest code form Core Java
 */
public class StackTraceTest {
    public static int factorial(int n){
        System.out.println("factorial(" +  n +"):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f : frames)
            System.out.println(f);
        int r;
        if(n <=1) r=1;
        else r = n * factorial(n -1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        factorial(10);
    }
}
