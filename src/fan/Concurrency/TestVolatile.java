package fan.Concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by fanjiangqi on 2017/3/8.
 */
public class TestVolatile {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();
        while (true){
            if (td.isFlag()){
                System.out.println("--------------main thread");
                break;
            }

        }
    }
}
class ThreadDemo implements Runnable{
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private boolean flag = false;
    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setFlag(true);
        System.out.println("flag= " + isFlag());
    }
}
