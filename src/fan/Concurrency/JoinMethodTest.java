package fan.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by fanjiangqi on 2017/1/7.
 */
class Eat implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("进入eat 线程");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("eat线程结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class JoinMethodTest {
    public static void main(String[] args) {
       // ExecutorService excu = Executors.newCachedThreadPool();
        ///excu.execute(new Eat());
        Thread t = new Thread(new Eat());
        t.start();
        System.out.println("调用join()方法");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main结束");
    }


}
