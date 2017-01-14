package fan.ThreadPool;


import java.util.concurrent.*;

public class ExecutorTest {
    /**
 * @param args
 * @throws ExecutionException
 * @throws InterruptedException
 */
public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO Auto-generated method stub
        ExecutorService es= Executors.newCachedThreadPool();
        //提交任务
        Future fr=es.submit(new RunnableTest());
        //提交任务
        Future fc=es.submit(new CallableTest());
        //取得返回值并输出
        System.out.println(fc.get());

        //检查任务是否执行完毕
        if(fr.isDone()){
        System.out.println("执行完毕-RunnableTest.run()");
        }else{
        System.out.println("未执行完毕-RunnableTest.run()");
        }
        //检查任务是否执行完毕
        if(fc.isDone()){
        System.out.println("执行完毕-CallableTest.run()");
        }else{
        System.out.println("未执行完毕-CallableTest.run()");
        }
        //停止线程池服务
        es.shutdown();
        }
        }

class RunnableTest implements Runnable{
    public void run() {
        System.out.println("已经执行-RunnableTest.run()");
    }
}
class CallableTest implements Callable {

    public Object call() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("已经执行-CallableTest.call()");
        return "返回值-CallableTest.call()";
    }
}
