package fan.ThreadPool2;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by fanjiangqi on 2017/2/22.
 */
public class TestFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(50);
        for(int i=0; i<1000; i++){
            int finalI = i;
            exec.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                        System.out.println("Thread num :" + finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
        exec.shutdown();
    }

}
