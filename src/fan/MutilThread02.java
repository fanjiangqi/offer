package fan;

/**
 * Created by fanjiangqi on 2017/1/2.
 * Thinking in Java --The Thread class --Exercise1
 */
public class MutilThread02 implements Runnable {
    public MutilThread02(String mess){
        System.out.println(mess);
    }
    @Override
    public void run() {
        System.out.println("我是范江棋1");
        Thread.yield();
        System.out.println("我是璐璐1");
        Thread.yield();
        System.out.println("我是江棋璐璐1");
        Thread.yield();
        return;
    }


}
