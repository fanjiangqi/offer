package fan;

/**
 * Created by fanjiangqi on 2017/1/2.
 * Thinking in Java --The Thread class --Exercise1
 */
public class MutilThread01 implements Runnable {
    public MutilThread01(String mess){
        System.out.println(mess);
    }
    @Override
    public void run() {
        System.out.println("我是范江棋");
        Thread.yield();
        System.out.println("我是璐璐");
        Thread.yield();
        System.out.println("我是江棋璐璐");
        Thread.yield();
        return;
    }

    public static void main(String[] args) {
        Thread test = new Thread(new MutilThread01("开始..."));
        test.start();

    }
}
