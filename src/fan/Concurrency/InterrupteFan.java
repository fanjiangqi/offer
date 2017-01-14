package fan.Concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by fanjiangqi on 2017/1/6.
 * 关于终止线程的代码
 */
class IOBlockedInterrupt implements Runnable{
   protected static InputStream in;
   // private Scanner scanner = new Scanner(in);
    public IOBlockedInterrupt(InputStream is){
        in = is;
    }
    //public
    @Override
    public void run() {
        try {
            System.out.println("等待输入:");
            //in.close();
            in.read();
           // scanner.next();
            System.out.println("say hello");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常");
        }
    }
}
public class InterrupteFan {
    public static void main(String[] args) throws InterruptedException, IOException {
        ExecutorService exec = Executors.newCachedThreadPool();
        IOBlockedInterrupt ioblock = new IOBlockedInterrupt(System.in);
        Future<?> fu = exec.submit(ioblock);
        exec.shutdown();
        TimeUnit.SECONDS.sleep(3);
        fu.cancel(true);
        System.out.println(fu.isCancelled());
        exec.shutdownNow();
        ioblock.in.close();
       // IOBlockedInterrupt.in.close();
       // System.in.close();
        System.exit(0);
    }



}
