package fan;

/**
 * Created by fanjiangqi on 2017/1/2.
 */
public class MutilTreadAction {
    public static void main(String[] args) {
        Thread test = new Thread(new MutilThread01("开始1..."));
        test.start();
        System.out.println("结束1...");
        Thread test1 = new Thread(new MutilThread02("开始2..."));
        test1.start();
        System.out.println("结束2...");
    }
}
