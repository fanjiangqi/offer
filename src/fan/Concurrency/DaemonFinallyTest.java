package fan.Concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by fanjiangqi on 2017/1/15.
 * 守护线程中的finally语句可能不被执行
 */
class DaemonClient implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("start Daemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exiting via Interrupted");
        }
        finally {
            System.out.println("This should always run");
        }
    }
}
public class DaemonFinallyTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new DaemonClient());
        t.setDaemon(true);
        t.start();
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
