package fan.ThreadPool;

/**
 * Created by fanji on 2017/1/5.
 */
class SimpleTask extends Task {

    private int i;
    public SimpleTask(int i) {
        super();
        this.i = i;
    }

    @Override
    public void deal() {
        System.out.println(Thread.currentThread().getName()+"-----"+"我是SimpleTask : " + i);
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolService service=new ThreadPoolService();
        service.start();
        for(int i=0;i<20;i++){
            service.runTask(new SimpleTask(i));
        }
        Thread.sleep(5000);
        service.stop();
    }
}
