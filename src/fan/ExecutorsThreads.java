package fan;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by fanjiangqi on 2017/1/2.
 */
public class ExecutorsThreads {
    public static void main(String[] args) {
        ExecutorService exec =  Executors.newCachedThreadPool();
        exec.execute(new MutilThread01("fan"));
        exec.execute(new MutilThread02("lu"));
        exec.shutdown();
      // exec.execute(new MutilThread01("fan1"));
        //ArrayList<ArrayList<String>> dd = new ArrayList<>();
    }
}
